package de.oneaxis.backend;

public enum MockState {
    /**
     * Deep mocking for every instance parameter
     */
    FULL_MOCK,

    /**
     * Generates a mock in a stateless manner, without identifiers
     */
    STATELESS
}
