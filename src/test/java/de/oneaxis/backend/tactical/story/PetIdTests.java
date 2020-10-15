package de.oneaxis.backend.tactical.story;

import de.oneaxis.backend.JacksonTests;

import java.util.UUID;

class PetIdTests extends JacksonTests<AnimalId> {

    @Override
    protected void createMockInstance() {
        this.mockInstance = new AnimalId(UUID.randomUUID().toString());
    }
}
