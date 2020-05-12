package tv.codely.kata.gildedrose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].quality < 0) {
                return;
            }

            if (items[i].name.equals("Sulfuras")) {
                items[i].setQuality();
            }

            if (!items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes")) {
                items[i].setQuality();
            } else if (items[i].name.equals("Backstage passes")) {
                if (items[i].sellIn >= 11) {
                    items[i].quality = items[i].quality + 1;
                }

                if (items[i].sellIn <= 10 && items[i].sellIn > 5) {
                    items[i].quality = items[i].quality + 2;
                }

                if (items[i].sellIn <= 5) {
                    items[i].quality = items[i].quality + 3;
                }

                if (items[i].sellIn <= 0 ) {
                    items[i].quality = 0;
                }

                items[i].sellIn = items[i].sellIn - 1;
            } else {
                items[i].setQuality();
            }
                items[i].setQualityThresholds();
        }
    }
}