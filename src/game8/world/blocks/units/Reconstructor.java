package game8.world.blocks.units;

import game8.type.*;;
import game8.world.*;
import mindustry.world.blocks.payloads.*;

public class Reconstructor extends BaseBlock {
    public DuoHashMap<Payload, Payload, ConsumeSeq> changeSet;

    public Reconstructor(String name) {
        super(name);
    }

    public class ReconstructorBuild extends BaseBuild {
        public Reconstructor block;

        public Payload reconstruct(Payload payload) {
            if(block.changeSet.containsKey(payload)) {
                return block.changeSet.get(payload).a;
            }
            return payload;
        }
    }
}