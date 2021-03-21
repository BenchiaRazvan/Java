package com;


import java.util.Calendar;

public abstract class Document {
    private String name;
    private String path;
    private int year;
    private int rating;

    Document(String newName, String newPath, int newYear, int newRating) throws YearException {
        if( year > Calendar.getInstance().get(Calendar.YEAR))
            throw new YearException("Nu sunt inca in" + newYear);
        this.name = newName;
        this.path = newPath;
        this.year = newYear;
        this.rating = newRating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public String getPath() {
        return path;
    }

    public class YearException extends Exception {
        public YearException( String s) {
            super(s);
        }
    }

}
