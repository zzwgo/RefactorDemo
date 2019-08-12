package gildedRose;

public class ItemFactory {
    static ItemType getItemType(Item item) {
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
