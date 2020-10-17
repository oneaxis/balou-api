//package de.oneaxis.backend.domain.tactical.storytelling;
//
//import de.oneaxis.backend.SerializationTests;
//
//import java.time.LocalDateTime;
//import java.time.OffsetDateTime;
//import java.time.ZoneOffset;
//import java.time.ZonedDateTime;
//import java.util.UUID;
//
//class PeriodTests extends SerializationTests<StoryTellingMockFactory, Period> {
//
//    @Override
//    protected void createMockInstance() {
//        ZonedDateTime dateInUTC = ZonedDateTime.of(LocalDateTime.now(), ZoneOffset.UTC);
//        this.mockInstance = new Period(dateInUTC, dateInUTC);
//    }
//}
