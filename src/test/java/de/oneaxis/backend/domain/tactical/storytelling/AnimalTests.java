package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.JacksonTests;

class AnimalTests extends JacksonTests<Animal> {

    @Override
    protected void createMockInstance() {
        this.mockInstance = StoryTellingMockFactory.getAnimalMock(StoryTellingMockFactory.State.EXISTENT);
    }
}
