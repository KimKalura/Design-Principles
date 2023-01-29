package designprinciples.solid.videostorekata.refectoredV3;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        double price = 2;
        //daca zilele inchiriate sunt mai mult de 2
        if (daysRented > 2) {
            //adauga la pret ceva in fctie de formula
            price += (daysRented - 2) * 1.5;
        }
        return price;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}