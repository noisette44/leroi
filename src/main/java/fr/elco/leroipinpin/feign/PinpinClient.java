package fr.elco.leroipinpin.feign;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(url = "${feign.mail.url:}")
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,
                consumes = MediaType.APPLICATION_JSON_VALUE)
public interface PinpinClient
{
	@RequestMapping(method = GET,
	                value = "/fake")
	void sendMailFake();
}
