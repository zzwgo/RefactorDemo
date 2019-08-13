package gildedRose;

public class NormalItem implements ItemType {

    @Override
    public void update(Item item) {
        item.handleQualityMoreThanZero();
        item.subSellIn();
        if (item.sellIn < 0) {
            item.handleQualityMoreThanZero();
        }
    }
}
