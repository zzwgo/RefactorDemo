package gildedRose;

public class BackstageItem implements ItemType {
    @Override
    public void update(Item item) {
        item. handleQualityLessThanFifty(item);
        if (item.sellIn < 11) {
            item.handleQualityLessThanFifty(item);
        }
        if (item.sellIn < 6) {
            item.handleQualityLessThanFifty(item);
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
