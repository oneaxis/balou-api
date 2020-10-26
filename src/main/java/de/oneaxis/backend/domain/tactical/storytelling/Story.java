package de.oneaxis.backend.domain.tactical.storytelling;

import de.oneaxis.backend.domain.strategic.Aggregate;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Aggregate
@Data
@Builder
public class Story {
    private final StoryId storyId;
    private final Symptom symptom;
    private final Animal animal;
    private final StoryContent storyContent;
    private final Instant createdAt;
    private Instant updatedAt, deletedAt;
}
