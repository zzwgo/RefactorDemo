package gildedRose;

public class Item {

    private String name;

    public int sellIn;

    public int quality;

    public String getName() {
        return name;
    }

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    protected void handleQualityLessThanFifty() {
        if (this.quality < 50) {
            this.quality = this.quality + 1;
        }
    }
    protected void subSellIn() {
        this.sellIn = this.sellIn - 1;
    }

    protected void handleQualityMoreThanZero() {
        if (this.quality > 0) {
            this.quality = this.quality - 1;
        }
    }
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
