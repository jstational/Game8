package game8.logic;

import game8.logic.*;
import arc.struct.*;

// pressurelogic executor
public class PLExecutor {
    public ObjectMap<String, PLVar> vars = new ObjectMap<>();
    public IntMap<PLInstruction> instructs = new IntMap<>();

    public int accumulator = 0;

    public void tick() {}
}