package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.Aggregate;
import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import java.time.Instant;

@Aggregate
@Data
@Builder
public class Story {
    @Valid
    private final StoryId storyId;
    @Valid
    private final Symptom symptom;
    @Valid
    private final Animal animal;
    @Valid
    private final StoryContent storyContent;
    private final Instant createdAt;
    private Instant updatedAt, deletedAt;
}
