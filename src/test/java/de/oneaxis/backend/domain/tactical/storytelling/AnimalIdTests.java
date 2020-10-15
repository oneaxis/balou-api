package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.JacksonTests;

class AnimalIdTests extends JacksonTests<AnimalId> {

    @Override
    protected void createMockInstance() {
        this.mockInstance = StoryTellingMockFactory.getAnimalIdMock();
    }
}
