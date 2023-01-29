package designprinciples.solid.videostorekata.refectoredV3;

public class ChildrenMovie extends Movie {
    public ChildrenMovie(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
        double price = 1.5;
        //daca depaseste mai mult de 3 zile inchiriate
        if (daysRented > 3) {
            //se mai adauga la pret in fctie de formula
            price += (daysRented - 3) * 1.5;
        }
        return price;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
