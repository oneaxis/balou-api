package de.oneaxis.backend.domain.tactical.storytelling;

public class AnimalValidationService implements ValidationService<Animal> {
    @Override
    public Animal validate(Animal validationSubject) throws ValidationException {
        throw new ValidationException("Not implemented yet!");
    }
}
