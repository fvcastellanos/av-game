package edu.umg.ia.engine;

import com.google.common.collect.Maps;
import edu.umg.ia.domain.InventoryItem;
import edu.umg.ia.domain.Thing;

import java.util.Map;
import java.util.Optional;

public class ThingInventory {
    private Map<String, InventoryItem> items;

    public ThingInventory() {
        this.items = Maps.newHashMap();
    }

    public void add(String name, Thing thing) {
        items.put(name, new InventoryItem(thing, false, 1));
    }

    public Optional<Thing> get(String name) {
        InventoryItem item = items.get(name);
        if (name == null) {
            return Optional.empty();
        }

        return Optional.of(item.getThing());
    }

    public String getItems() {
        StringBuilder sb = new StringBuilder();
        sb.append("things: [");
        items.forEach((key, item) -> {
            sb.append(key).append(", ");
        });

        sb.append("]");
        return sb.toString();
    }
}
