package designprinciples.solid.videostorekata.dirty;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();


    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }


    public String statement() {
        double totalAmount = 0;//pretul total
        int frequentRenterPoints  = 0;  //cate pc de loialitate s-au obtinut

        // in result probabil ca se construieste factura
        //la linia asta se pune prima linie din factura
        //se construieste header-ul facturii
        String result = "Rental Record for " + getName() + "\n";

        //mergem rprin fiecare inchiriere din lista de inchirieri
        for (Rental rental : rentals) {

            //pretul inchirierii curente
            double thisAmount = 0;

            // in fctie de codul de pret al filmului fac ceva
            switch (rental.getMovie().getPriceCode()) {
                //daca codul de pret este REGULAR, adica 0
                case Movie.REGULAR:
                    //pretul curent al inchirieii este 2
                    thisAmount += 2;
                    //daca zilele inchiriate sunt mai multe decat 2
                    if (rental.getDaysRented() > 2)
                        //adauga la pret ceva in fctie de formula
                        thisAmount += (rental.getDaysRented() - 2) * 1.5;
                    break;
                //daca codul de pret este NEW_RELEASE
                case Movie.NEW_RELEASE:
                    //pretul este calculat in fctie de formula
                    thisAmount += rental.getDaysRented() * 3;
                    break;
                //daca codul de pret este CHILDRENS
                case Movie.CHILDRENS:
                    //din start pretul este 1.5
                    thisAmount += 1.5;
                    //daca deoasesti mai mult de 3 zile inchiriate
                    if (rental.getDaysRented() > 3)
                        //se mai adauga la pret in functie de formula
                        thisAmount += (rental.getDaysRented() - 3) * 1.5;
            }

            //orice inchiriere ai face ai 1 pc de loialitate din start
            frequentRenterPoints++;

            // daca codul pretului este New_RELEASE si ai inchiriat mai mult de o zi
            if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {
                //mai primesti 1 pc de loialitate
                frequentRenterPoints++;
            }

            //se adauga la string-ul result(factura) titlul  filmului si pretul inchirierii curente
            result += rental.getMovie().getTitle() + "\t"
                    + String.valueOf(thisAmount) + "\n";
            //la pretul total se adauga pretul inchirierii curente
            totalAmount += thisAmount;


        }
        //adauga la factura footer-ul
        result += "You owed " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";

        return result;

    }
}


