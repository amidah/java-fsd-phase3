package com.simplilearn.junitexample;

import org.apache.logging.log4j.*;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Spring Boot Application Test Class")
class JunitExampleApplicationTests {

	static Logger log = LogManager.getLogger();

	@BeforeAll
	static void testConfig() {
		log.info("@BeforeAll - It executes only once before all test methods inside the class...");
	}

	@BeforeEach
	void testInit() {
		log.info("@BeforeEach - It executes before each test method inside the class...");
	}

	@DisplayName("Method 1 Test")
	@Test
	void testMethod1() {
		log.info("inside test method 1....");
		log.info(new Object() {
		}.getClass().getEnclosingMethod().getName());
	}

	@DisplayName("Method 2 Test")
	@Test
	void testMethod2() {
		log.info("inside test method 2....");
	}

	@DisplayName("Method 3 Test")
	@Test
	void testMethod3() {
		log.info("inside test method 3....");
	}

	@DisplayName("Method 4 Test")
	@Disabled("Method 4 is not implemented")
	@Test
	void testMethod4() {
		log.info("inside test method 4....");
	}
	
	@AfterEach
	@Test
	void tearDown() {
		log.info("@AfterEach -- it is executed after each test method...");
	}
	
	@AfterAll
	@Test
	static void done() {
		log.info("@AfterAll -- it is executed after all test methods...");
	}

}
