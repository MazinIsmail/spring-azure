package com.spring.azure.appconfiguration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/*
Disable Azure App Configuration, or it will try to load from the service when running unit tests
*/
@SpringBootTest(properties = "spring.cloud.azure.appconfiguration.enabled=false")
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
