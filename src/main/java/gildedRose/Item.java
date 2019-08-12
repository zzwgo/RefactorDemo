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
    protected void handleQualityLessThanFifty(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
