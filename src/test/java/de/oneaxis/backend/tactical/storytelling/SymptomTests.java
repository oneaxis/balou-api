//package de.oneaxis.backend.tactical.storytelling;
//
//import de.oneaxis.backend.JacksonTests;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class SymptomTests extends JacksonTests<Symptom> {
//
//    private final String SYMPTOMS_API_INDEX_FORMAT = "http://localhost:%d/symptoms";
//
//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    private Symptom mockSymptom;
//
//    @Test
//    void ShouldCreateSymptom() {
//
//        String symptomsAPIEndpoint = String.format(SYMPTOMS_API_INDEX_FORMAT, port);
//
//        var symptomResponse = this.restTemplate.postForEntity(symptomsAPIEndpoint, mockSymptom, Symptom.class).getBody();
//        assertThat(symptomResponse).isEqualToComparingOnlyGivenFields(mockSymptom);
//        assertThat(symptomResponse.symptomId.value).isNotEmpty();
//    }
//
//    @Test
//    void ShouldGetSymptom() {
//
//        String symptomsAPIEndpoint = String.format(SYMPTOMS_API_INDEX_FORMAT, port);
//
//        var symptomResponse = this.restTemplate.postForEntity(symptomsAPIEndpoint, mockSymptom, Symptom.class).getBody();
//        assertThat(this.restTemplate.getForObject(symptomsAPIEndpoint, Symptom.class, symptomResponse.symptomId.value).symptomId)
//                .isEqualTo(symptomResponse.symptomId);
//    }
//
//}
