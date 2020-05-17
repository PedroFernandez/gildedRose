package tv.codely.kata.gildedrose;

public class ItemFactory {

    public static Item createItem(String type, String name, int sellIn, int quality) {
        if (type.equals("whatever")) {
            return new Whateveritem(name, sellIn, quality);
        } else if (type.equals("agedbrie")) {
            return new AgedBrie(name, sellIn, quality);
        } else if (type.equals("sulfuras")) {
            return new Sulfuras(name, sellIn, quality);
        } else if (type.equals("backstagepasses")) {
            return new Backstagepasses(name, sellIn, quality);
        } else {
            return null;
        }

    }
}
