package game8.interfaces;

import game8.world.PressureSystem;

// only a stub

public interface PressureBlock {
    default float systemVolume() {
        return getSystemVolume(this.PressureSystem);
    }
    default float systemPressure() {
        return getSystemPressure(this.PressureSystem);
    }
}