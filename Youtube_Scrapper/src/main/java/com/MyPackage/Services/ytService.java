package com.MyPackage.Services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.MyPackage.Config.ytConfig;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ytService {
	
	@Autowired
	private ytConfig ytConfig;

	public String extractVideoId(String videolink) {
		Pattern urlpattern1 = Pattern.compile(
				"(?:https?://)?(?:www\\.)?(?:youtube\\.com/(?:[^\\n\\r]*\\/|(?:v|e(?:mbed)?)\\/|.*[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})",
				Pattern.CASE_INSENSITIVE);

		Matcher matcher = urlpattern1.matcher(videolink);

		if (matcher.find()) {
			return matcher.group(1);
		}

		return null;
	}

	public JsonNode getVideoDetails(String videoId) throws Exception{
		String apiurl = ytConfig.getApiurl();
		String apikey = "key="+ytConfig.getApikey();
		String idparam = "id="+videoId;
		String partparam = "part=snippet";
		
		String url = apiurl + "?" + apikey + "&" + partparam + "&" + idparam;
		
		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject(url, String.class);
		
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readTree(response).path("items").get(0).path("snippet");
		
	}
}

