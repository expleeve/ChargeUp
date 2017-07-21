package com.expleeve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */
@EnableTransactionManagement
@SpringBootApplication
public class Chargeup 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Chargeup.class, args);
    }
}
