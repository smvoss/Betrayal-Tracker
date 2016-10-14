package com.durptopia.betrayalhelper.characters.meta;

public class CharacterStats {

    protected StatValues speed, might, knowlege, sanity;

    public CharacterStats(StatValues speed, StatValues might,
                          StatValues knowlege, StatValues sanity) {
        this.speed = speed;
        this.might = might;
        this.knowlege = knowlege;
        this.sanity = sanity;
    }

    public StatValues getSpeed() {
        return speed;
    }

    public StatValues getMight() {
        return might;
    }

    public StatValues getKnowlege() {
        return knowlege;
    }

    public StatValues getSanity() {
        return sanity;
    }

}
