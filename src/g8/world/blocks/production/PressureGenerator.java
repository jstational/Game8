package game8.world.blocks.production;

import mindustry.world.blocks.environment.Floor;
import mindustry.world.blocks.environment.StaticWall;
import arc.struct.Seq;
import game8.world.blocks;

public class PressureGenerator extends g8b {
  public Seq<Floor> tileboost = new Seq<>();
  public Seq<StaticWall> wallboost = new Seq<>();
}
