package game8.world.blocks.logic;

import game8.world.*;
import mindustry.gen.Building;
import game8.logic.*;
import arc.struct.*;

public class PressureLogicBlock extends BaseBlock {
    public int maxInstructions = 34;
    public float maxVarValue = 40f;
    public float minVarValue = -3f;

    public PressureLogicBlock(String name) {
        super(name);
    }

    public class PressureLogicBuild extends BaseBuild {
        public Seq<PLInstruction> code;
        public PLExecutor executor;
        public Building[] links;
    }
}