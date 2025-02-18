package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_something_0_9_given_sellIn_is_1_and_quality_is_10() {
        Item item = new Item("something", 1, 10);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("something, 0, 9", item.toString());
    }

    @Test
    public void should_return_something_0_0_given_sellIn_is_1_and_quality_is_0() {
        Item item = new Item("something", 1, 0);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("something, 0, 0", item.toString());
    }

    @Test
    public void should_return_something_negative1_0_given_sellIn_is_0_and_quality_is_0() {
        Item item = new Item("something", 0, 0);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("something, -1, 0", item.toString());
    }

    @Test
    public void should_return_something_negative1_8_given_sellIn_is_0_and_quality_is_10() {
        Item item = new Item("something", 0, 10);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("something, -1, 8", item.toString());
    }

    @Test
    public void should_return_AgedBrie_0_11_given_sellIn_is_1_and_quality_is_10() {
        Item item = new Item("Aged Brie", 1, 10);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Aged Brie, 0, 11", item.toString());
    }

    @Test
    public void should_return_AgedBrie_0_50_given_sellIn_is_1_and_quality_is_50() {
        Item item = new Item("Aged Brie", 1, 50);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Aged Brie, 0, 50", item.toString());
    }

    @Test
    public void should_return_AgedBrie_negative1_12_given_sellIn_is_0_and_quality_is_10() {
        Item item = new Item("Aged Brie", 0, 10);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Aged Brie, -1, 12", item.toString());
    }

    @Test
    public void should_return_Backstage_9_12_given_sellIn_is_10_and_quality_is_10() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 12", item.toString());
    }

    @Test
    public void should_return_Backstage_9_13_given_sellIn_is_5_and_quality_is_10() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 13", item.toString());
    }

    @Test
    public void should_return_Backstage_19_11_given_sellIn_is_20_and_quality_is_10() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 20, 10);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 19, 11", item.toString());
    }

    @Test
    public void should_return_Backstage_19_50_given_sellIn_is_20_and_quality_is_50() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 20, 50);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 19, 50", item.toString());
    }

    @Test
    public void should_return_Backstage_negative1_0_given_sellIn_is_0_and_quality_is_10() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", item.toString());
    }

    @Test
    public void should_return_Backstage_4_50_given_sellIn_is_5_and_quality_is_49() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50", item.toString());
    }

    @Test
    public void should_return_Sulfuras_5_80_given_sellIn_is_5_and_quality_is_80() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 80);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros, 5, 80", item.toString());
    }

    @Test
    public void should_return_Conjured_4_9_given_sellIn_is_5_and_quality_is_10() {
        Item item = new Item("Conjured", 5, 10);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Conjured, 4, 8", item.toString());
    }

    @Test
    public void should_return_Conjured_negative1_8_given_sellIn_is_0_and_quality_is_10() throws Exception {
        Item item = new Item("Conjured", 0, 10);
        GildedRose gildedRose=new GildedRose(new Item[]{(item)});

        gildedRose.updateQuality();

        assertEquals("Conjured, -1, 6", item.toString());
    }

}