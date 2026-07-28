package game8.entities.weather;

import mindustry.gen.*;

/** Positional weathers. Has position. */
public class DynamicSource extends Source implements Posc {
    public DynamicEvent event;

    @Override
    public byte[] compress() {
        return null;
    }

    @Override
    public void update() {}
}