package com.MyPackage.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
public class ytConfig {

	@Value("${youtube.api.key}")
	private String apikey;
	
	@Value("${youtube.api.url}")
	private String apiurl;
}
