package tv.codely.kata.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GildedRoseShould {
    private Item[] withArray(Item item) {
        return new Item[]{item};
    }

    @Test
    public void testThatSellInValueIsDecreased() {
        Item whateveritem = ItemFactory.createItem("whatever", "I am generic item", 10, 20);

        GildedRose gildedRose = new GildedRose(withArray(whateveritem));
        gildedRose.updateQuality();

        assertEquals(9, whateveritem.getSellIn());
    }

    @Test
    public void testThatQualityValueIsDecreased() {
        Item whateveritem = ItemFactory.createItem("whatever", "Generic WhatEver", 10, 15);

        GildedRose gildedRose = new GildedRose(withArray(whateveritem));
        gildedRose.updateQuality();

        assertEquals(14, whateveritem.getQuality());
    }

    @Test
    public void testThatQualityDecreasesTwiceAsMuchWhenSellByIsPassed() {
        Item whateveritem = ItemFactory.createItem("whatever", "Generic WhatEver 2", 0, 15);

        GildedRose gildedRose = new GildedRose(withArray(whateveritem));
        gildedRose.updateQuality();

        assertEquals(13, whateveritem.getQuality());
    }

    @Test
    public void testThatQualityIsNeverNegativeInADefaultQualityValue() {
        Item whateveritem = ItemFactory.createItem("whatever", "Generic WhatEver 2", 3, 0);

        GildedRose gildedRose = new GildedRose(withArray(whateveritem));
        gildedRose.updateQuality();

        assertEquals(0, whateveritem.getQuality());
    }

    @Test
    public void testAgedBrieIncreasesQualityWithAge() {
        Item agedBrie = ItemFactory.createItem("agedbrie", "Aged Brie Deluxe", 3, 49);

        GildedRose gildedRose = new GildedRose(withArray(agedBrie));
        gildedRose.updateQuality();

        assertEquals(50, agedBrie.getQuality());
    }

    @Test
    public void testQualityNeverIncreasesPastFifty() {
        Item whateveritem = ItemFactory.createItem("whatever", "whateveritem", 3, 55);

        GildedRose gildedRose = new GildedRose(withArray(whateveritem));
        gildedRose.updateQuality();

        assertEquals(50, whateveritem.quality);
    }

    @Test
    public void testSulfurasNeverChangesSellIn() {
        Item sulfuras = ItemFactory.createItem("sulfuras","Sulfuras Pata Negra", 5, 80);

        GildedRose gildedRose = new GildedRose(withArray(sulfuras));
        gildedRose.updateQuality();

        assertEquals(5, sulfuras.getSellIn());
    }

    @Test
    public void testSulfurasNeverChangesQuality() {
        Item sulfuras = ItemFactory.createItem("sulfuras","Sulfuras Pata Negra", 3, 80);

        GildedRose gildedRose = new GildedRose(withArray(sulfuras));
        gildedRose.updateQuality();

        assertEquals(80, sulfuras.getQuality());
    }

    @Test
    public void testBackstagePassIncreasesQualityByOneIfSellByGreaterThenTen() {
        Item agedBrieBackstage = ItemFactory.createItem("backstagepasses","Backstage Cheese", 11, 30);

        GildedRose gildedRose = new GildedRose(withArray(agedBrieBackstage));
        gildedRose.updateQuality();

        assertEquals(31, agedBrieBackstage.getQuality());
    }

    @Test
    public void testBackstagePassIncreasesQualityByTwoIfSellBySmallerThanTen() {
        Item agedBrieBackstage = ItemFactory.createItem("backstagepasses","Backstage Vine", 10, 30);

        GildedRose gildedRose = new GildedRose(withArray(agedBrieBackstage));
        gildedRose.updateQuality();

        assertEquals(32, agedBrieBackstage.getQuality());
    }

    @Test
    public void testBackstagePassIncreasesQualityByThreeIfSellBySmallerThanFive() {
        Item agedBrieBackstage = ItemFactory.createItem("backstagepasses","Backstage Fruit", 5, 30);

        GildedRose gildedRose = new GildedRose(withArray(agedBrieBackstage));
        gildedRose.updateQuality();

        assertEquals(33, agedBrieBackstage.getQuality());
    }

    @Test
    public void testBackstagePassLosesValueAfterSellByPasses() {
        Item agedBrieBackstage = ItemFactory.createItem("backstagepasses","Backstage Fish", 0, 30);

        GildedRose gildedRose = new GildedRose(withArray(agedBrieBackstage));
        gildedRose.updateQuality();

        assertEquals(0, agedBrieBackstage.getQuality());
    }
}
