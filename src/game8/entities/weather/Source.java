package game8.entities.weather;

import game8.type.weather.*;

/** Base weather source. */
public class Source {
    public Event event;

    public byte[] compress() {
        return null;
    }
        
    public void update() {}
}