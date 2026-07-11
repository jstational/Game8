package game8.entities.units.live;

import mindustry.type.*;
import mindustry.world.meta.*;
import game8.entities.units.*;
import arc.struct.Seq;

public class AltitudeFuelUnitType extends UnitType {
    public Seq<FuelTank> fuelTanks;
    public float maxAltitude;

    public AltitudeFuelUnitType(String name) {
        super(name);
    }

    @Override
    public void update(Unit unit) {
        super.update(unit);
    }
}