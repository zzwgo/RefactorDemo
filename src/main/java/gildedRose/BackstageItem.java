package gildedRose;

public class BackstageItem implements ItemType {
    @Override
    public void update(Item item) {
        item.handleQualityLessThanFifty();
        if (item.sellIn < 11) {
            item.handleQualityLessThanFifty();
        }
        if (item.sellIn < 6) {
            item.handleQualityLessThanFifty();
        }
        item.subSellIn();
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
