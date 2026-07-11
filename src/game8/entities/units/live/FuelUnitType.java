package game8.entities.units.live;

import mindustry.type.*;
import mindustry.world.meta.*;
import game8.entities.units.*;
import arc.struct.Seq;
import mindustry.gen.Unit;

public class FuelUnitType extends UnitType {
    public Seq<FuelTank> fuelTanks;

    public FuelUnitType(String name) {
        super(name);
    }

    @Override
    public void update(Unit unit) {
        super.update(unit);
    }
}