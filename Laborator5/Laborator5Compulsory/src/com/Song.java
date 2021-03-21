package com;

import java.io.FileNotFoundException;

public class Song extends Document{

    Song(String newName, String newPath, int newYear, int newRating) throws YearException, FileNotFoundException {
        super(newName, newPath, newYear, newRating);
    }
}
