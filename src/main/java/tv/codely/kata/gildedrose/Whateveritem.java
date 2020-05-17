package tv.codely.kata.gildedrose;

public class Whateveritem extends Item {
    public Whateveritem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void calculateQuality() {
        if (this.sellIn <= 0) {
            this.quality = this.quality - 1;
        }

        this.sellIn = this.sellIn - 1;
        this.quality = this.quality - 1;

        this.setQualityThresholds();
    }

    private void setQualityThresholds() {
        if (this.quality < 0) {
            this.quality = 0;
        }

        if (this.quality > 50) {
            this.quality = 50;
        }
    }
}
