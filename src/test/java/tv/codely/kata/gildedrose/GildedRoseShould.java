package tv.codely.kata.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GildedRoseShould {
    private Item[] withArray(Item item) {
        return new Item[]{item};
    }

    @Test
    public void testThatSellInValueIsDecreased() {
        Item whateveritem = new Item("whateveritem", 10, 20);

        GildedRose gildedRose = new GildedRose(withArray(whateveritem));
        gildedRose.updateQuality();

        assertEquals(9, whateveritem.sellIn);
    }

    @Test
    public void testThatQualityValueIsDecreased() {
        Item whateveritem = new Item("whateveritem", 10, 15);

        GildedRose gildedRose = new GildedRose(withArray(whateveritem));
        gildedRose.updateQuality();

        assertEquals(14, whateveritem.quality);
    }

    @Test
    public void testThatQualityDecreasesTwiceAsMuchWhenSellByIsPassed() {
        Item whateveritem = new Item("whateveritem", 0, 15);

        GildedRose gildedRose = new GildedRose(withArray(whateveritem));
        gildedRose.updateQuality();

        assertEquals(13, whateveritem.quality);
    }

    @Test
    public void testThatQualityIsNeverNegativeInADefaultQualityValue() {
        Item whateveritem = new Item("whateveritem", 3, 0);

        GildedRose gildedRose = new GildedRose(withArray(whateveritem));
        gildedRose.updateQuality();

        assertEquals(0, whateveritem.quality);
    }

    @Test
    public void testAgedBrieIncreasesQualityWithAge() {
        Item agedBrie = new Item("Aged Brie", 3, 49);

        GildedRose gildedRose = new GildedRose(withArray(agedBrie));
        gildedRose.updateQuality();

        assertEquals(50, agedBrie.quality);
    }

    @Test
    public void testQualityNeverIncreasesPastFifty() {
        Item whateveritem = new Item("whateveritem", 3, 55);

        GildedRose gildedRose = new GildedRose(withArray(whateveritem));
        gildedRose.updateQuality();

        assertEquals(50, whateveritem.quality);
    }

    @Test
    public void testSulfurasNeverChangesSellIn() {
        Item sulfuras = new Item("Sulfuras", 5, 80);

        GildedRose gildedRose = new GildedRose(withArray(sulfuras));
        gildedRose.updateQuality();

        assertEquals(5, sulfuras.sellIn);
    }

    @Test
    public void testSulfurasNeverChangesQuality() {
        Item sulfuras = new Item("Sulfuras", 3, 80);

        GildedRose gildedRose = new GildedRose(withArray(sulfuras));
        gildedRose.updateQuality();

        assertEquals(80, sulfuras.quality);
    }

    @Test
    public void testBackstagePassIncreasesQualityByOneIfSellByGreaterThenTen() {
        Item agedBrieBackstage = new Item("Backstage passes", 11, 30);

        GildedRose gildedRose = new GildedRose(withArray(agedBrieBackstage));
        gildedRose.updateQuality();

        assertEquals(31, agedBrieBackstage.quality);
    }

    @Test
    public void testBackstagePassIncreasesQualityByTwoIfSellBySmallerThanTen() {
        Item agedBrieBackstage = new Item("Backstage passes", 10, 30);

        GildedRose gildedRose = new GildedRose(withArray(agedBrieBackstage));
        gildedRose.updateQuality();

        assertEquals(32, agedBrieBackstage.quality);
    }

    @Test
    public void testBackstagePassIncreasesQualityByThreeIfSellBySmallerThanFive() {
        Item agedBrieBackstage = new Item("Backstage passes", 5, 30);

        GildedRose gildedRose = new GildedRose(withArray(agedBrieBackstage));
        gildedRose.updateQuality();

        assertEquals(33, agedBrieBackstage.quality);
    }

    @Test
    public void testBackstagePassLosesValueAfterSellByPasses() {
        Item agedBrieBackstage = new Item("Backstage passes", 0, 30);

        GildedRose gildedRose = new GildedRose(withArray(agedBrieBackstage));
        gildedRose.updateQuality();

        assertEquals(0, agedBrieBackstage.quality);
    }
}
