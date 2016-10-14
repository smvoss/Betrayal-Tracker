package com.durptopia.betrayalhelper.characters.meta;

public class StatValues {

    protected final int[] range;
    protected int currentValue;

    public StatValues(int[] range, int currentValue) {
        this.range = range;
        this.currentValue = currentValue;
    }

    public int[] getRange() {
        return range;
    }

    public int getCurrentValue() {
        return currentValue;
    }

}
