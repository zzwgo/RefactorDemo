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
}