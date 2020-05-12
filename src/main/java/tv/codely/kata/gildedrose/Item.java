package tv.codely.kata.gildedrose;

public abstract class Item {
    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    abstract protected void setQuality();
    abstract protected void setQualityThresholds();

    @Override
    public String toString() {
        return this.name + " " + this.sellIn + " " + this.quality;
    }
}