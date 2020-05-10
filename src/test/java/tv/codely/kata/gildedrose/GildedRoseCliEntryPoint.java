package tv.codely.kata.gildedrose;

public class GildedRoseCliEntryPoint {
    public static void main(String[] args) {
        System.out.println("*** Starting Gilded Rose Client Entry Point ***");
        Item[] items = new Item[] {
//            new Item("whatweveritem", 10, 20),
//            new Item("whatweveritem", 10, 15),
//            new Item("whatweveritem", 1, 25),
//            new Item("whatweveritem", 1, -25),
//            new Item("whatweveritem", 3, 0),
//            new Item("whatweveritem", 3, 55),
//            new Item("Aged Brie", 3, 50),
            new Item("Backstage passes", 11, 25),
//            new Item("Sulfuras", 3, 80),
        };

        GildedRose gildedRose = new GildedRose(items);

        int days = 12;
        for (int i = 0; i < days; i++) {
            System.out.println("*** This is day number " + i + " ***");
            for (Item item:items) {
                System.out.println(item);
            }
            gildedRose.updateQuality();
        }
    }
}
