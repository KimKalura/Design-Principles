package designprinciples.solid.videostorekata.refactoredV1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        String invoiceText = createHeader();
        double totalAmount = 0;
        int totalFrequentRenterPoints = 0;

        for (Rental rental : rentals) {
            double currentRentalPrice = rental.getPrice();
            totalFrequentRenterPoints += rental.getFrequentRenterPoints();
            invoiceText += createBody(rental, currentRentalPrice);
            totalAmount += currentRentalPrice;
        }

        invoiceText += createFooter(totalAmount, totalFrequentRenterPoints);
        return invoiceText;
    }

    private String createBody(Rental rental, double currentRentalPrice) {
        String invoiceText = "";
        invoiceText += "\t" + rental.getMovie().getTitle() + "\t" + currentRentalPrice + "\n";
        return invoiceText;
    }

    private String createHeader() {
        return "Rental Record for " + this.name + "\n";
    }

    private String createFooter(double totalAmount, int totalFrequentRenterPoints) {
        String result = "";
        result += "You owed " + totalAmount + "\n";
        result += "You earned " + totalFrequentRenterPoints + " frequent renter points\n";
        return result;
    }

}
