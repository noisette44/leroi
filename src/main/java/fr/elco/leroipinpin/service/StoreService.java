package fr.elco.leroipinpin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.elco.leroipinpin.dto.StoreDto;
import fr.elco.leroipinpin.dto.StoresDto;
import fr.elco.leroipinpin.feign.PinpinClient;

@Service
public class StoreService
{
	private final PinpinClient client;

	@Autowired
	public StoreService(final PinpinClient client)
	{
		this.client = client;
	}

	public List<StoreDto> getStores()
	{
		StoresDto stores = client.getStores(1000);
		return stores.getStores();
	}
}
