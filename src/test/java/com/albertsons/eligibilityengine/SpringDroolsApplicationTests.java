package com.albertsons.eligibilityengine;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@ContextConfiguration(classes = SpringDroolsApplication.class, loader = AnnotationConfigContextLoader.class)
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDroolsApplicationTests {

	@Test
	void contextLoads() {
	}

}
