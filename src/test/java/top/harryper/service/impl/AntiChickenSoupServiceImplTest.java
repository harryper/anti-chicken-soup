package top.harryper.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import top.harryper.exception.AntiChickenSoupException;
import top.harryper.service.AntiChickenSoupService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AntiChickenSoupServiceImplTest {
	
	@Resource(name = "antiChickenSoupService")
	private AntiChickenSoupService antiChickenSoupService;

	@Test
	public void testFindById() {
		
		try {
			System.out.println(antiChickenSoupService.findRandomContent().toString());
		} catch (AntiChickenSoupException e) {
			e.printStackTrace();
		}
	}

}
