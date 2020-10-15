package de.oneaxis.backend.tactical.storytelling;

import de.oneaxis.backend.JacksonTests;

import java.util.UUID;

class RaceTests extends JacksonTests<Race> {

    @Override
    protected void createMockInstance() {
        this.mockInstance = new Race(UUID.randomUUID().toString());
    }
}
