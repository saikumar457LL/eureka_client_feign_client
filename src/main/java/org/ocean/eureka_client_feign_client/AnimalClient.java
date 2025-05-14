package org.ocean.eureka_client_feign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("${animal.service}")
public interface AnimalClient {

    @GetMapping
    List<Object> getAnimals();
}
