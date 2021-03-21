package com;

import java.io.FileNotFoundException;

public class Image extends Document {

    Image(String newName, String newPath, int newYear, int newRating) throws YearException, FileNotFoundException {
        super(newName, newPath, newYear, newRating);
    }
}
