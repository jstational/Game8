package game8.world.blocks.logic.proc;

import java.util.HashMap;
import arc.struct.*;

// pressurelogic executor
public class PLExecutor {
    public HashMap<String, PLVar> vars;
    public IntMap<PLInstruction> instructs;

    public int accumulator = 0;

    public void tick() {}

    public PLExecutor() {}
}