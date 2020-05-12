package tv.codely.kata.gildedrose;

public class Sulfuras extends Item {
    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void setQuality() {
        System.out.println("Sulfuras is a lengedary item and never changes its sellin and quality: " +
                this.sellIn + " " + this.quality);
        return;
    }

    @Override
    protected void setQualityThresholds() {

    }
}
