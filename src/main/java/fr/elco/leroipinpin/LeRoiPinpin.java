package fr.elco.leroipinpin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableFeignClients
@EnableScheduling
public class LeRoiPinpin
{
	public static void main(String[] args)
	{
		SpringApplication.run(LeRoiPinpin.class);
	}
}
