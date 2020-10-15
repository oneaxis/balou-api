package de.oneaxis.backend.tactical.story;

import de.oneaxis.backend.JacksonTests;

import java.util.UUID;

class PetTests extends JacksonTests<Pet> {

    @Override
    protected void createMockInstance() {
        var animalId = new AnimalId(UUID.randomUUID().toString());
        var race = new Race(UUID.randomUUID().toString());
        var species = new Species(UUID.randomUUID().toString());
        var animalCharacteristics = new AnimalCharacteristics(species, race);
        this.mockInstance = new Pet(animalId, animalCharacteristics);
    }
}
