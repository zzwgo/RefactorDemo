package gildedRose;

public class ConjuredItem implements ItemType {
    @Override
    public void update(Item item) {
        item.handleQualityMoreThanZero();
        item.handleQualityMoreThanZero();
        item.subSellIn();
        if (item.sellIn < 0) {
            item.handleQualityMoreThanZero();
            item.handleQualityMoreThanZero();
        }
    }
}