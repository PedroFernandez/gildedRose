package tv.codely.kata.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void calculateQuality() {
        this.quality = this.quality + 1;
    }
}
