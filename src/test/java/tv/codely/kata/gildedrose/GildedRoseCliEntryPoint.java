package tv.codely.kata.gildedrose;

public class GildedRoseCliEntryPoint {
    public static void main(String[] args) {
        System.out.println("*** Starting Gilded Rose Client Entry Point ***");

        ItemFactory itemFactory = new ItemFactory();
        Item item1 = itemFactory.createItem("whatever", "whatever super generic item", 3, 25);
        Item item2 = itemFactory.createItem("agedbrie", "Aged Brie", 3, 25);
        System.out.println("This is whatever item: " + item1);
        System.out.println("This is aged brie item: " + item2);


        Item[] items = new Item[] {
            item1, item2
        };

        GildedRose gildedRose = new GildedRose(items);

        int days = 2;
        for (int i = 0; i < days; i++) {
            System.out.println("*** This is day number " + i + " ***");
            gildedRose.updateQuality();
        }
    }
}
