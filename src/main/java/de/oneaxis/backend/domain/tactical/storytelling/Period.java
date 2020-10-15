package de.oneaxis.backend.domain.tactical.storytelling;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;

import java.time.ZonedDateTime;
import java.util.Objects;

class Period {
    @JsonSerialize(using = ZonedDateTimeSerializer.class)
    private final ZonedDateTime from;
    private final ZonedDateTime to;

    @JsonCreator
    public Period(@JsonProperty("from") ZonedDateTime from, @JsonProperty("to") ZonedDateTime to) {
        this.from = from;
        this.to = to;
    }

    public ZonedDateTime getFrom() {
        return from;
    }

    public ZonedDateTime getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Period{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Period)) return false;
        Period period = (Period) o;
        return getFrom().equals(period.getFrom()) &&
                getTo().equals(period.getTo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFrom(), getTo());
    }
}
