package de.oneaxis.backend.domain.tactical.storytelling;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.UUID;

class StoryTellingMockFactory {

    enum State {
        NEW, EXISTENT
    }

    static Period getPeriodMock() {
        ZonedDateTime dateInUTC = ZonedDateTime.of(LocalDateTime.now(), ZoneOffset.UTC);
        return new Period(dateInUTC, dateInUTC);
    }

    static AnimalCharacteristics getAnimalCharacteristicsMock() {
        var race = getRaceMock();
        var species = getSpeciesMock();
        return new AnimalCharacteristics(species, race);
    }

    static Animal getAnimalMock(State state) {
        switch (state) {
            case EXISTENT:
                return new Animal(getAnimalIdMock(), getAnimalCharacteristicsMock());
            default:
                return new Animal(null, getAnimalCharacteristicsMock());
        }
    }

    static AnimalId getAnimalIdMock() {
        return new AnimalId(UUID.randomUUID().toString());
    }

    static Race getRaceMock() {
        return new Race(UUID.randomUUID().toString());
    }

    static Species getSpeciesMock() {
        return new Species(UUID.randomUUID().toString());
    }

    static Symptom getSymptomMock(State state) {
        switch (state) {
            case EXISTENT:
                return new Symptom(getSymptomIdMock(), getAnimalMock(state));
            default:
                return new Symptom(null, getAnimalMock(state));
        }
    }

    static SymptomId getSymptomIdMock() {
        return new SymptomId(UUID.randomUUID().toString());
    }
}
