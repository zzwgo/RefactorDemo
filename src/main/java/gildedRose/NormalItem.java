package gildedRose;

public class NormalItem implements ItemType {

    @Override
    public void update(Item item) {
        handleQualityMoreThanZero(item);
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            handleQualityMoreThanZero(item);
        }
    }
    private void handleQualityMoreThanZero(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
