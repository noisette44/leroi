package fr.elco.leroipinpin.feign;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import feign.Headers;
import fr.elco.leroipinpin.dto.StoresDto;

@FeignClient(url = "https://api.leroymerlin.fr/}")
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                consumes = MediaType.APPLICATION_JSON_VALUE)
@Headers({ "x-clientapikey : r7sansZEN9v159teb2NMUJeEA9dnRRaZ" })
public interface PinpinClient
{
	@RequestMapping(method = GET,
	                value = "/backend-amgp-lmfr/v2/stores")
	StoresDto getStores(
		@RequestParam
		final int limit);
}
