package game8.entities.weather;

import game8.type.weather.*;
import mindustry.gen.*;

/** Base weather source. */
public class Source implements Entityc, Syncc {
    public Event event;

    public byte[] compress() {
        return null;
    }
        
    public void update() {}
}