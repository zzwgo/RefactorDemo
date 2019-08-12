package gildedRose;

import com.sun.deploy.panel.ITreeNode;

import java.util.Arrays;

import static gildedRose.ItemFactory.*;

public class GildedRose {
    private Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(item -> getItemType(item).update(item));
    }
}