package tv.codely.kata.gildedrose;

public class Backstagepasses extends Item {
    public Backstagepasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void calculateQuality() {
        if (this.sellIn >= 11) {
            this.quality = this.quality + 1;
        }

        if (this.sellIn <= 10 && this.sellIn > 5) {
            this.quality = this.quality + 2;
        }

        if (this.sellIn <= 5) {
            this.quality = this.quality + 3;
        }

        if (this.sellIn <= 0 ) {
            this.quality = 0;
        }

        this.sellIn = this.sellIn - 1;
    }
}
