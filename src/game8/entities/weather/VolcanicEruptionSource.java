package game8.entities.weather;

import game8.type.weather.*;

public class VolcanicEruptionSource extends DynamicSource {
    public VolcanicEruptionEvent event;

    @Override
    public byte[] compress() {
        return null;
    }

    @Override
    public void update() {}
}