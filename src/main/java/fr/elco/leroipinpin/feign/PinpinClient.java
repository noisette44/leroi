package fr.elco.leroipinpin.feign;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.elco.leroipinpin.dto.StoresDto;



@FeignClient(name = "pinpin",
             url = "https://jsonplaceholder.typicode.com/")
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                consumes = MediaType.APPLICATION_JSON_VALUE)
public interface PinpinClient
{
	@RequestMapping(method = GET,
	                value = "/posts/1")
	StoresDto getStores(
		@RequestParam("limit")
		final int limit);
}
