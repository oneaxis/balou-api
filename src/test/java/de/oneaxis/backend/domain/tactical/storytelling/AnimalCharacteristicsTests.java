package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.JacksonTests;

import java.util.UUID;

class AnimalCharacteristicsTests extends JacksonTests<AnimalCharacteristics> {

    @Override
    protected void createMockInstance() {
        this.mockInstance = StoryTellingMockFactory.getAnimalCharacteristicsMock();
    }
}
