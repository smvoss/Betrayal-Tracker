package com.durptopia.betrayalhelper.characters.meta;

/**
 *
 */
public class CharacterBio {

    protected final int age;

    protected final String eyeColor;
    protected final String height;
    protected final String weight;
    protected final String hobbies;
    protected final String birthday;
    protected final String background;

    public CharacterBio(int age, String eyeColor, String height, String weight,
                        String hobbies, String birthday, String background) {
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
        this.hobbies = hobbies;
        this.birthday = birthday;
        this.background = background;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBackground() {
        return background;
    }

}
