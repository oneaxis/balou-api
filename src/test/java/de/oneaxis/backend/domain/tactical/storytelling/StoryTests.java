package de.oneaxis.backend.domain.tactical.storytelling;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.UUID;

public class StoryTests {

    @Test
    void ShouldCreateFullStoryAndValidate() {

        //With
        var animalId = AnimalId.builder().value(UUID.randomUUID().toString()).build();
        var species = Species.builder().value("Dog").build();
        var race = Race.builder().value("Akita").build();
        var animalCharacteristics = AnimalCharacteristics.builder().race(race).species(species).build();
        var animal = Animal.builder().animalId(animalId).animalCharacteristics(animalCharacteristics).build();
        var symptomId = SymptomId.builder().value(UUID.randomUUID().toString()).build();
        var symptomName = SymptomName.builder().value("VKH").build();
        var symptomDescription = SymptomDescription.builder().value("Uveitis and vision disruption").build();
        var symptom = Symptom.builder().symptomId(symptomId).symptomName(symptomName).symptomDescription(symptomDescription).build();

        //When

        var storyId = StoryId.builder().value(UUID.randomUUID().toString()).build();
        var storyContent = StoryContent.builder().value("It all happened over night...").build();
        var story = Story.builder()
                .createdAt(Instant.now())
                .deletedAt(Instant.now())
                .animal(animal)
                .storyContent(storyContent)
                .storyId(storyId)
                .symptom(symptom)
                .updatedAt(Instant.now())
                .build();

        //Should
        var storyValidationService = new StoryValidationService();
        storyValidationService.validate(story);
    }
}
