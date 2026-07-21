package game8.world.blocks.distribution.items;

import game8.world.*;
import mindustry.gen.Building;
import mindustry.world.blocks.payloads.*;

/** moves payloads forward */
public class PayloadDuct extends BaseBlock {
    public float moveSpeed = 0f;

    public PayloadDuct(String name) {
        super(name);
    }

    public class PayloadDuctBuild extends BaseBuild {
        // this PayloadDuct will send the current payload to this building
        // hold up!!! how am i gonna dynamically update this WHILE a payload is being transfered????
        // do i update the live payload's destination?
        public Building out;
        public Payload payload;
    }
}