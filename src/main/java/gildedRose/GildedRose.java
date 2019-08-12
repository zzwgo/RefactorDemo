package gildedRose;

import com.sun.deploy.panel.ITreeNode;

import java.util.Arrays;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(item -> getItemType(item).update(item));
    }

    private ItemType getItemType(Item item) {
        switch (item.getName()) {
            case "Aged Brie":
                return new AgedBrieItem();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageItem();
            default:
                return new NormalItem();
        }
    }
}