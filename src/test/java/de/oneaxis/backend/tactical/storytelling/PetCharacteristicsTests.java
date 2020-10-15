package de.oneaxis.backend.tactical.storytelling;

import de.oneaxis.backend.JacksonTests;

import java.util.UUID;

class PetCharacteristicsTests extends JacksonTests<AnimalCharacteristics> {

    @Override
    protected void createMockInstance() {
        var race = new Race(UUID.randomUUID().toString());
        var species = new Species(UUID.randomUUID().toString());
        this.mockInstance = new AnimalCharacteristics(species, race);
    }
}
