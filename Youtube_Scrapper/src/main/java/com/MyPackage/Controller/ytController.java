package com.MyPackage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.MyPackage.Services.ytService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class ytController {

    @Autowired
    private ytService youtubService;

    @Autowired
    private ObjectMapper objectMapper; 

    @GetMapping("/")
    public String getHome() {
        return "index";
    }

    @PostMapping("/processing")
    public String getData(@RequestParam String videolink, Model model) {
        String videoId = youtubService.extractVideoId(videolink);
        
        if (videoId != null) {
            try {
                JsonNode videDetail = youtubService.getVideoDetails(videoId);

                String title = videDetail.path("title").asText();
                String description = videDetail.path("description").asText();
                String thumbUrl = videDetail.path("thumbnails").path("standard").path("url").asText();
                
                String[] tags = null;
                JsonNode tagsNode = videDetail.path("tags");
                if (tagsNode.isArray() && tagsNode.size() > 0) {
                    tags = objectMapper.treeToValue(tagsNode, String[].class);
                }
                
                model.addAttribute("vtitle", title);
                model.addAttribute("vdesc", description);
                model.addAttribute("vthumb", thumbUrl);
                model.addAttribute("vtags", tags != null ? tags : new String[0]); 

                return "details";

            } catch (Exception e) {
                e.printStackTrace(); 
                return "error";
            }
        }

       
        return "error"; 
    }
}
