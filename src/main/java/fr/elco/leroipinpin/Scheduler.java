package fr.elco.leroipinpin;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import fr.elco.leroipinpin.dto.StoreDto;
import fr.elco.leroipinpin.service.StoreService;

@Component
public class Scheduler
{
	private static final Logger logger = LoggerFactory.getLogger(Scheduler.class);

	private final StoreService storeService;

	@Autowired
	public Scheduler(final StoreService storeService)
	{
		this.storeService = storeService;
	}

	@Scheduled(fixedDelay = 20000)
	public void run()
	{
		logger.info("--------- GOGOGO ---------");
		List<StoreDto> stores = storeService.getStores();
		logger.info(stores.get(0).getName());
	}
}