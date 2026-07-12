package game8.world.blocks.logic;

import mindustry.world.Block;
import mindustry.gen.Building;
import game8.logic.*;

public class PressureLogicBlock extends Block {
    public int maxInstructions = 34;
    public float maxVarValue = 40f;
    public float minVarValue = -3f;

    public PressureLogicBlock(String name) {
        super(name);
    }

    public class PressureLogicBuild extends Building {
        public Seq<PLInstruction> code;
        public PLExecutor executor;
        public Building[] links;
    }
}