package de.oneaxis.backend.symptom;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SymptomTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void ShouldCreateSymptom() {

        String symptomsAPIEndpoint = String.format("http://localhost:%d", port);

        var species = new Species("Dog");
        var race = new Race("Akita");
        var animalCharacteristics = new AnimalCharacteristics(species, race);
        var animal = new Animal(animalCharacteristics);
        var symptomToCreate = new Symptom(animal);

        var symptom = this.restTemplate.postForEntity(symptomsAPIEndpoint,
                symptomToCreate, Symptom.class);
    }
}
