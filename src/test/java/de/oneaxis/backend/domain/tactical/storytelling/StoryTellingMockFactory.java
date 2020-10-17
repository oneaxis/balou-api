package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.MockFactory;
import de.oneaxis.backend.MockState;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

class StoryTellingMockFactory implements MockFactory {

    private static StoryTellingMockFactory ourInstance = new StoryTellingMockFactory();

    public static StoryTellingMockFactory getInstance() {
        return ourInstance;
    }

    private StoryTellingMockFactory() {
    }

    private ConcurrentHashMap<Class, Function<MockState, Object>> mockMap = new ConcurrentHashMap<>() {
        {
            put(Animal.class, StoryTellingMockFactory::getAnimalMock);
            put(AnimalId.class, state -> StoryTellingMockFactory.getAnimalIdMock());
            put(AnimalCharacteristics.class, state -> StoryTellingMockFactory.getAnimalCharacteristicsMock());
            put(Period.class, state -> StoryTellingMockFactory.getPeriodMock());
            put(Species.class, state -> StoryTellingMockFactory.getSpeciesMock());
            put(Race.class, state -> StoryTellingMockFactory.getRaceMock());
            put(Symptom.class, StoryTellingMockFactory::getSymptomMock);
            put(SymptomId.class, state -> StoryTellingMockFactory.getSymptomIdMock());
        }
    };

    private static  Period getPeriodMock() {
        ZonedDateTime dateInUTC = ZonedDateTime.of(LocalDateTime.now(), ZoneOffset.UTC);
        return new Period(dateInUTC, dateInUTC);
    }

    private static  AnimalCharacteristics getAnimalCharacteristicsMock() {
        var race = getRaceMock();
        var species = getSpeciesMock();
        return new AnimalCharacteristics(species, race);
    }

    private static  Animal getAnimalMock(MockState mockState) {
        switch (mockState) {
            case STATELESS:
                return new Animal(null, getAnimalCharacteristicsMock());
            default:
                return new Animal(getAnimalIdMock(), getAnimalCharacteristicsMock());
        }
    }

    private static  AnimalId getAnimalIdMock() {
        return new AnimalId(UUID.randomUUID().toString());
    }

    private static  Race getRaceMock() {
        return new Race(UUID.randomUUID().toString());
    }

    private static  Species getSpeciesMock() {
        return new Species(UUID.randomUUID().toString());
    }

    private static  Symptom getSymptomMock(MockState mockState) {
        switch (mockState) {
            case STATELESS:
                return new Symptom(null, getAnimalMock(mockState));
            default:
                return new Symptom(getSymptomIdMock(), getAnimalMock(mockState));
        }
    }

    private static  SymptomId getSymptomIdMock() {
        return new SymptomId(UUID.randomUUID().toString());
    }

    @Override
    public Object apply(Class aClass, MockState mockState) {
        var mockFunction = this.mockMap.get(aClass);
        if (mockFunction == null) throw new NullPointerException("Mock function not set! Extend this.mockMap");
        return mockFunction.apply(mockState);
    }
}
