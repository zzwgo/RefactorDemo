package gildedRose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        ItemType itemType;
        for(Item item:items){
            switch (item.getName()){
                case "Aged Brie": itemType=new AgedBrieItem();break;
                case "Sulfuras, Hand of Ragnaros":itemType=new SulfurasItem();break;
                case "Backstage passes to a TAFKAL80ETC concert":itemType=new BackstageItem();break;
                default:itemType=new NormalItem();
            }
            itemType.update(item);
        }
    }
}