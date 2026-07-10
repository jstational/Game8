package game8.type.weather;

import mindustry.ctype.*;

public class Event extends Content {
    public Event() {}

    @Override
    public abstract ContentType getContentType() {
        return ContentType.weather;
    }
}