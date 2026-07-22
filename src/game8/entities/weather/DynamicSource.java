package game8.entities.weather;

import game8.type.weather.*;

/** Positional weathers. Has position. */
public class DynamicSource extends Source {
    public float x, y;
    public DynamicEvent event;

    @Override
    public byte[] compress() {
        return null;
    }
}