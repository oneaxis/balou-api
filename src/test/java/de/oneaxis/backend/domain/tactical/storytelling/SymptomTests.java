package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.MockState;
import de.oneaxis.backend.SerializationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SymptomTests extends SerializationTests {

    private final String SYMPTOMS_API_INDEX_FORMAT = "http://localhost:%d/symptoms/%s";

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Override
    public Object generateTestInstance() {
        return StoryTellingMockFactory.getInstance().apply(Symptom.class, MockState.FULL_MOCK);
    }

    @Test
    void ShouldCreateAndGetByIdSymptom() {

        String symptomsAPICreateEndpoint = String.format(SYMPTOMS_API_INDEX_FORMAT, port, "");
        var newInstance = (Symptom) StoryTellingMockFactory.getInstance().apply(Symptom.class, MockState.STATELESS);

        String symptomsAPIGetByIDEndpoint = String.format(SYMPTOMS_API_INDEX_FORMAT, port, newInstance.getSymptomId().getValue());
        var symptomResponse = this.restTemplate.postForEntity(symptomsAPICreateEndpoint, newInstance, Symptom.class).getBody();
        assertThat(this.restTemplate.getForObject(symptomsAPIGetByIDEndpoint, Symptom.class, symptomResponse.getSymptomId().getValue()))
                .isEqualTo(symptomResponse);
    }
}
