package designprinciples.solid.videostorekata.refactoredV1;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getPrice() {
        double thisAmount = 0;

        // in fctie de codul de pret al filmului fac ceva
        switch (movie.getPriceCode()) {
            //daca codul de pret este REGULAR, adica 0
            case Movie.REGULAR:
                //pretul curent al inchirieii este 2
                thisAmount += 2;
                //daca zilele inchiriate sunt mai multe decat 2
                if (daysRented > 2)
                    //adauga la pret ceva in fctie de formula
                    thisAmount += (daysRented - 2) * 1.5;
                break;
            //daca codul de pret este NEW_RELEASE
            case Movie.NEW_RELEASE:
                //pretul este calculat in fctie de formula
                thisAmount += daysRented * 3;
                break;
            //daca codul de pret este CHILDRENS
            case Movie.CHILDRENS:
                //din start pretul este 1.5
                thisAmount += 1.5;
                //daca depasesti mai mult de 3 zile inchiriate
                if (daysRented > 3)
                    //se mai adauga la pret in functie de formula
                    thisAmount += (daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoints = 1;

        // daca codul pretului este New_RELEASE si ai inchiriat mai mult de o zi
        if (isNewRelease() && daysRented > 1) {

            //mai primesti 1 pc de loialitate
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    private boolean isNewRelease() {
        return movie.getPriceCode() == Movie.NEW_RELEASE;
    }
}
