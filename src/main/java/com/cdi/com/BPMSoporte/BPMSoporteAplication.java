package com.cdi.com.BPMSoporte;

import com.cdi.com.BPMSoporte.Comun.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
@EnableConfigurationProperties({
    FileStorageProperties.class
})
@Configuration
@PropertySource("dev.properties")
@Profile("dev")
public class BPMSoporteAplication {

	public static void main(String[] args) {
		SpringApplication.run(BPMSoporteAplication.class, args);
	}

}
