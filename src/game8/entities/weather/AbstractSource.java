package game8.entities.weather;

import game8.type.weather.*;

/** Global weathers. No position */
public class AbstractSource extends Source {
    public AbstractEvent event;

    @Override
    public byte[] compress() {
        return null;
    }
}