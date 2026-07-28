package game8.entities.weather;

import mindustry.gen.*;

public class StormSource extends AbstractSource implements Timedc {
    public StormEvent event;

    @Override
    public byte[] compress() {
        return null;
    }

    @Override
    public void update() {}
}