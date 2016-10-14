package com.durptopia.betrayalhelper.characters.meta;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by sam on 8/17/16.
 */
public class Character {

    protected String name;

    protected CharacterStats stats;
    protected CharacterBio biography;

    public Character() {
        Yaml doc = new Yaml();
    }

    public Character(InputStream res) {
        Yaml doc = new Yaml();
        Map<String, Map<String, Object>> data = (Map<String, Map<String, Object>>) doc.load(res);
        Iterator it = data.entrySet().iterator();
        while(it.hasNext()) {
            Object item = it.next();
        }
    }

    public Character(String name, CharacterStats stats, CharacterBio biography) {
        this.name = name;
        this.stats = stats;
        this.biography = biography;
    }

}

