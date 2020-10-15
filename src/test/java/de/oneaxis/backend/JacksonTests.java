package de.oneaxis.backend;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public abstract class JacksonTests<T> {

    private ObjectMapper objectMapper;
    protected T mockInstance;

    @BeforeEach
    void createPrerequisites() {
        this.objectMapper = new ObjectMapper();
        this.createMockInstance();
    }

    @Test
    void ShouldParseAndProof() throws JsonProcessingException {
        var parsedObjectJson = this.objectMapper.writeValueAsString(mockInstance);
        System.out.println("Parsed object JSON result:");
        System.out.println(parsedObjectJson);

        var proofObject = this.objectMapper.readValue(parsedObjectJson, mockInstance.getClass());
        System.out.println("Proof object result:");
        System.out.println(proofObject.toString());
        assertThat(proofObject).isEqualToComparingFieldByField(mockInstance);

    }

    /**
     * Should create a mock instance of T to be used for inherited tests. E.g.:
     * <code>
     * protected void createMockInstance() {
     *     this.mockInstance = someMockedInstance;
     * }
     * </code>
     */
    protected abstract void createMockInstance();
}
