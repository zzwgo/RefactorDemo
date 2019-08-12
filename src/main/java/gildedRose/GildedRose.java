package gildedRose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")) {
                handleQualityLessThanFifty(items[i]);
                items[i].sellIn = items[i].sellIn - 1;
                if (items[i].sellIn < 0) {
                    handleQualityLessThanFifty(items[i]);
                }
            } else if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                return;
            } else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                handleQualityLessThanFifty(items[i]);
                if (items[i].sellIn < 11) {
                    handleQualityLessThanFifty(items[i]);
                }
                if (items[i].sellIn < 6) {
                    handleQualityLessThanFifty(items[i]);
                }
                items[i].sellIn = items[i].sellIn - 1;
                if (items[i].sellIn < 0) {
                    items[i].quality = 0;
                }
            } else {
                if (items[i].quality > 0) {
                    items[i].quality = items[i].quality - 1;
                }
                items[i].sellIn = items[i].sellIn - 1;
                if (items[i].sellIn < 0) {
                    if (items[i].quality > 0) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            }
        }
    }

    private void handleQualityLessThanFifty(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}