package de.oneaxis.backend.domain.tactical.storytelling;

class ValidationException extends RuntimeException {
    ValidationException(String message) {
        super(message);
    }
}
