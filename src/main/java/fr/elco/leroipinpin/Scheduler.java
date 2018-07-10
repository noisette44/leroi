package fr.elco.leroipinpin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler
{
	private static final Logger logger = LoggerFactory.getLogger(Scheduler.class);

	@Scheduled(fixedDelay = 30000)
	public void run()
	{
		logger.info("Scheduler is running");
	}
}