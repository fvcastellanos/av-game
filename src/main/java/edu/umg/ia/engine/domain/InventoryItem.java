package edu.umg.ia.engine.domain;

public class InventoryItem {
    private Thing thing;
    private boolean finite;
    private int count;

    public InventoryItem(Thing thing, boolean finite, int count) {
        this.thing = thing;
        this.finite = finite;
        this.count = count;
    }

    public void add(int amount) {
        this.count+= amount;
    }

    public void add() {
        add(1);
    }

    public void dec(int amount) {
        if (finite) {
            if ((count - amount) < 0) {
                count = 0;
                return;
            }

            count-= amount;
            return;
        }
    }

    public void dec() {
        dec(1);
    }

    public Thing getThing() {
        return thing;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "thing=" + thing +
                ", finite=" + finite +
                ", count=" + count +
                '}';
    }
}
