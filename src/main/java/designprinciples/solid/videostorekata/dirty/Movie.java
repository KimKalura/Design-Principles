package designprinciples.solid.videostorekata.dirty;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    public static final int CHILDRENS	= 2; //pricecode-uri
    public static final int REGULAR 	= 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie (String title, int priceCode) {
        this.title 		= title;
        this.priceCode 	= priceCode;
    }

    public int getPriceCode () {
        return priceCode;
    }

    public void setPriceCode (int code) {
        priceCode = code;
    }

    public String getTitle () {
        return title;
    }



}
