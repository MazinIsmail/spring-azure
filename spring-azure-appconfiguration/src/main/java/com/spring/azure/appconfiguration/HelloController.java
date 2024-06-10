package com.spring.azure.appconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.spring.cloud.feature.management.FeatureManager;

@RestController
public class HelloController {

	@Autowired
	private MyProperties properties;

	@Autowired
	private FeatureManager featureManager;

	@GetMapping
	public String getMessage() {
		return "Message: " + properties.getMessage();
	}

	@GetMapping(path = "featureB")
	public String getFeature() {
		Boolean checkBeta = featureManager.isEnabledAsync("featureB").block();
		return "featureB: " + checkBeta;
	}
}