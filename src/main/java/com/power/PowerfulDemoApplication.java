package com.power;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

/**
 * @author jinzhimin
 * @description:
*/

@SpringBootApplication
public class PowerfulDemoApplication {

	public static void main(String[] args) {
		testStartUp2(args);
	}

    /**
     * 测试启动方式1
     * @param args
     */
	public static void testStartUp1(String[] args){
        SpringApplication.run(PowerfulDemoApplication.class, args);
    }

    /**
     * 测试启动方式2
     * @param args
     */
    public static void testStartUp2(String[] args){
	    SpringApplication application = new SpringApplication(PowerfulDemoApplication.class);
        application.addListeners(new ApplicationPidFileWriter("./application.pid"));
        application.setBannerMode(Banner.Mode.OFF);
	    application.run();
    }

}
