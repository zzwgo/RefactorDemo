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

}