package game8.entities;

import mindustry.gen.Building;
import java.util.HashMap;
import java.lang.Integer;
import arc.math.geom.*;

public class InTransferPayload extends DynamicEntity {
    public Building attachedBuilding;
    public Building targetBuilding;
    public HashMap<Integer, Point2> pathPoints;
}