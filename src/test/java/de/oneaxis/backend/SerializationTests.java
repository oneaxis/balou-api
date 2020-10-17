package de.oneaxis.backend;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public abstract class SerializationTests {

    private ObjectMapper objectMapper;
    protected Object testInstance;

    @BeforeEach
    void createPrerequisites() {
        this.objectMapper = new ObjectMapper();
        this.testInstance = generateTestInstance();
    }

    @Test
    void ShouldParseAndProof() throws JsonProcessingException {
        var parsedObjectJson = this.objectMapper.writeValueAsString(testInstance);
        System.out.println("Parsed object JSON result:");
        System.out.println(parsedObjectJson);

        var proofObject = this.objectMapper.readValue(parsedObjectJson, testInstance.getClass());
        System.out.println("Proof object result:");
        System.out.println(proofObject.toString());
        assertThat(proofObject).isEqualToComparingFieldByField(testInstance);
    }

    public abstract Object generateTestInstance();
}
