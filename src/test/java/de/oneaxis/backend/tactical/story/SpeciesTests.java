package de.oneaxis.backend.tactical.story;

import de.oneaxis.backend.JacksonTests;

import java.util.UUID;

class SpeciesTests extends JacksonTests<Species> {

    @Override
    protected void createMockInstance() {
        this.mockInstance = new Species(UUID.randomUUID().toString());
    }
}
