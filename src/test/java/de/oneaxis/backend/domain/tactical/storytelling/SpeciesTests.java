package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.MockState;
import de.oneaxis.backend.SerializationTests;

class SpeciesTests extends SerializationTests {
    @Override
    public Object generateTestInstance() {
        return StoryTellingMockFactory.getInstance().apply(Species.class, MockState.FULL_MOCK);
    }
}
