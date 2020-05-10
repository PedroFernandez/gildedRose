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
                System.out.println("Sulfuras is a lengedary item and never changes its sellin and quality: " +
                        items[i].sellIn + " " + items[i].quality);
                return;
            }

            if (!items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes")) {
                if (items[i].sellIn <= 0) {
                    items[i].quality = items[i].quality - 1;
                }

                items[i].sellIn = items[i].sellIn - 1;
                items[i].quality = items[i].quality - 1;
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
                items[i].quality = items[i].quality + 1;
            }

            if (items[i].quality < 0) {
                items[i].quality = 0;
            }

            if (items[i].quality > 50) {
                items[i].quality = 50;
            }
        }
    }
}