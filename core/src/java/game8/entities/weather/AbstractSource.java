package game8.entities.weather;

import game8.world.weather.*;

/** Global weathers. No position */
public class AbstractSource extends Source {
    public AbstractEvent event;

    @Override
    public byte[] compress() {
        return null;
    }

    @Override
    public void update() {}
}