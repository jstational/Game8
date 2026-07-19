package game8.type;

import mindustry.world.blocks.payloads.*;
import game8.type.*;

public class PayloadOut extends Out {
    private Payload payload;

    public PayloadOut() {}

    public void changePayload(Payload payload) {
        this.payload = payload;
    }

    public Payload getPayload() {
        return this.payload;
    }

    public boolean isUnit() {
        return this.payload instanceof UnitPayload;
    }

    public boolean isBuild() {
        return this.payload instanceof BuildPayload;
    }
}