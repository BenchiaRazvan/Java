package com;

import java.io.FileNotFoundException;
import java.io.Serializable;

public class Song extends Document{

    Song(String newName, String newPath, int newYear, int newRating) throws YearException {
        super(newName, newPath, newYear, newRating);
    }
}
