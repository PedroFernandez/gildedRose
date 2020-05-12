package tv.codely.kata.gildedrose;

public class GildedRoseCliEntryPoint {
    public static void main(String[] args) {
        System.out.println("*** Starting Gilded Rose Client Entry Point ***");

        Item whateveritem = new Whateveritem("very common item", 1, 5);

        Item[] items = new Item[] {
            whateveritem
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
