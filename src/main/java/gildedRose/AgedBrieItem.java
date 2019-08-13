package gildedRose;

public class AgedBrieItem implements ItemType {

    @Override
    public void update(Item item) {
        item.handleQualityLessThanFifty();
        item.subSellIn();
        if (item.sellIn < 0) {
            item.handleQualityLessThanFifty();
        }
    }
}
