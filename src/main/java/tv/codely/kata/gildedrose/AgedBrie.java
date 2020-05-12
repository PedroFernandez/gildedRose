package tv.codely.kata.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void setQuality() {
        this.quality = this.quality + 1;
    }

    @Override
    protected void setQualityThresholds() {
        return;
    }
}
