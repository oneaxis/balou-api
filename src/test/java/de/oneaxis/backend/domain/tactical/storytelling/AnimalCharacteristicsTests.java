package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.MockState;
import de.oneaxis.backend.SerializationTests;
import de.oneaxis.backend.MockFactory;

class AnimalCharacteristicsTests extends SerializationTests {

    @Override
    public Object generateTestInstance() {
        return StoryTellingMockFactory.getInstance().apply(AnimalCharacteristics.class, MockState.FULL_MOCK);
    }
}
