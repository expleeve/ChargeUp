package com.expleeve;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Starter
 *
 */
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages={"com.expleeve.chargeup"})
public class Chargeup 
{
    public static void main( String[] args )
    {
    	System.setProperty("spring.devtools.restart.enabled", "true");
    	SpringApplication app = new SpringApplication(Chargeup.class);
    	//disable banner
    	app.setBannerMode(Banner.Mode.OFF);
    	app.run(args);
    }
}
