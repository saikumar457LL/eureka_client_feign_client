package org.ocean.eureka_client_feign_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    AnimalClient animalClient;

    @GetMapping
    public ResponseEntity<Object> getAnimal() {
        return ResponseEntity.ok(animalClient.getAnimals());
    }
}
