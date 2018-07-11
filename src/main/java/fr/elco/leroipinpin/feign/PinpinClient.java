package fr.elco.leroipinpin.feign;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.elco.leroipinpin.dto.StoresDto;

@FeignClient(name = "pinpin",
             url = "https://api.leroymerlin.fr")
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                consumes = MediaType.APPLICATION_JSON_VALUE)
public interface PinpinClient
{
	@RequestMapping(method = GET,
	                value = "/backend-amgp-lmfr/v2/stores",
	                headers = "X-ClientApiKey=r7sansZEN9v159teb2NMUJeEA9dnRRaZ")
	StoresDto getStores(
		@RequestParam("limit")
		final int limit);
}
