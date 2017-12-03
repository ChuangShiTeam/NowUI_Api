package io.chuangshi.app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import io.chuangshi.Application;
import io.chuangshi.app.entity.App;
import io.chuangshi.common.util.Timor;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(Application.class)
public class AppServiceTest {
	
	@Autowired
	private AppService appService;
	
	//@Test
	public void insert() throws Exception {
		Timor timor = new Timor("insert app");
		App app = new App();
		app.setAppName("创石");
		app.setAppDescription("");
		appService.insert(app);
		timor.timeEnd("insert app");
	}
	
	//@Test
	public void updateById() throws Exception {
		Timor timor = new Timor("update app");
		App app = new App();
		app.setAppId("4c57bbfc43324da095f87160db19aa68");
		app.setAppName("创石");
		app.setAppDescription("测试2");
		app.setSystemVersion(1);
		appService.updateById(app);
		timor.timeEnd("update app");
	}
	
	@Test
	public void deleteById() throws Exception {
		Timor timor = new Timor("delete app");
		appService.deleteById("4c57bbfc43324da095f87160db19aa68");
		timor.timeEnd("delete app");
	}
	
	

}
