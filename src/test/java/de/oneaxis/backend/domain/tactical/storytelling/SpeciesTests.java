package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.JacksonTests;

class SpeciesTests extends JacksonTests<Species> {

    @Override
    protected void createMockInstance() {
        this.mockInstance = StoryTellingMockFactory.getSpeciesMock();
    }
}
