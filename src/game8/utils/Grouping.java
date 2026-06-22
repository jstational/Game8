package game8.utils;

import arc.struct.Seq;
import static game8.utils.Util.isInstanceOf;
import static game8.utils.Util.contentField;
import mindustry.gen.Building;
import mindustry.world.Block;
import arc.math.IntSet;

public class Grouping {
    private final Seq<Building> members = new Seq<>();

    private Grouping() {}
    public Seq<Building> getMembers() {
        return members;
    }
    public int size() {
        return members.size;
    }

    @SafeVarargs
    public static Grouping getGrouping(Building build, Class<? extends Block>... classes) {
        Grouping group = new Grouping();
        Seq<Building> track = new Seq<>();
        IntSet trackPos = new IntSet();

        track.add(build);
        trackPos.add(build.pos());

        while (!track.isEmpty()) {
            Building cur = track.remove(0);
            group.members.add(cur);

            cur.proximity.each(other -> {
                if(!trackPos.contains(other.pos()) && other.team == build.team && isInstanceOf(other, classes)) {
                    trackPos.add(other.pos());
                    track.add(other);
                }
            });
        }
        return group;
    }
    public static Grouping getGrouping(Building build, String field, Object fcont) {
        Grouping group = new Grouping();
        Seq<Building> track = new Seq<>();
        IntSet trackPos = new IntSet();

        track.add(build);
        trackPos.add(build.pos());

        while (!track.isEmpty()) {
            Building cur = track.remove(0);
            group.members.add(cur);

            cur.proximity.each(other -> {
                if(!trackPos.contains(other.pos()) && other.team == build.team && checkFieldCondition(fcont, other, field)) {
                    trackPos.add(other.pos());
                    track.add(other);
                }
            });
        }
        return group;
    }
    private static class PrefixResult {
        String cleanedString;
        boolean isInverted;
        PrefixResult(String cleanedString, boolean isInverted) {
            this.cleanedString = cleanedString;
            this.isInverted = isInverted;
        }
    }
    private static PrefixResult parsePrefix(String inquire) {
        boolean isInverted = inquire.startsWith("!/");
        boolean isNotChanged = inquire.startsWith("//");
        String cleaned = (isInverted || isNotChanged) ? inquire.substring(2) : inquire;
        return new PrefixResult(cleaned, isInverted);
    }
    private static boolean checkFieldCondition(Object inquire, Building other, String field) {
        if (!(inquire instanceof String)) {
            Object fieldValue = contentField(other, field);
            return fieldValue != null && fieldValue.equals(inquire);
        }

        PrefixResult prefix = parsePrefix((String) inquire);
        Object fieldValue = contentField(other, field);
        boolean matches = fieldValue != null && fieldValue.toString().equals(prefix.cleanedString);
        
        return prefix.isInverted ? !matches : matches;
    }
}