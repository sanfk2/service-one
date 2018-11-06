package com.blkydpease.serviceone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private DemoBO demoBO;

	@Test
	public void contextLoads() {
		assert(4 == demoBO.testMethod(4));
	}

}
