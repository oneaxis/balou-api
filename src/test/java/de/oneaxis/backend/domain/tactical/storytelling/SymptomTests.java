package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.JacksonTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SymptomTests extends JacksonTests<Symptom> {

    private final String SYMPTOMS_API_INDEX_FORMAT = "http://localhost:%d/symptoms";

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void ShouldCreateSymptom() {

        String symptomsAPIEndpoint = String.format(SYMPTOMS_API_INDEX_FORMAT, port);

        var symptomResponse = this.restTemplate.postForEntity(symptomsAPIEndpoint, this.mockInstance, Symptom.class).getBody();
        assertThat(symptomResponse).isEqualToComparingOnlyGivenFields(this.mockInstance);
        assertThat(symptomResponse.getSymptomId().getValue()).isNotEmpty();
    }

    @Test
    void ShouldGetSymptom() {

        String symptomsAPIEndpoint = String.format(SYMPTOMS_API_INDEX_FORMAT, port);

        var symptomResponse = this.restTemplate.postForEntity(symptomsAPIEndpoint, this.mockInstance, Symptom.class).getBody();
        assertThat(this.restTemplate.getForObject(symptomsAPIEndpoint, Symptom.class, symptomResponse.getSymptomId().getValue()))
                .isEqualTo(symptomResponse.getSymptomId().getValue());
    }

    /**
     * Should create a mock instance of T to be used for inherited tests. E.g.:
     * <code>
     * protected void createMockInstance() {
     * this.mockInstance = someMockedInstance;
     * }
     * </code>
     */
    @Override
    protected void createMockInstance() {
        this.mockInstance = StoryTellingMockFactory.getSymptomMock(StoryTellingMockFactory.State.NEW);
    }
}
