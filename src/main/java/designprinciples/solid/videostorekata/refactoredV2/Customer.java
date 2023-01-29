package designprinciples.solid.videostorekata.refactoredV2;

import java.util.ArrayList;
import java.util.List;
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
        invoiceText += rentals.stream().map(Customer::createBody).collect(Collectors.joining());
        invoiceText += createFooter();
        return invoiceText;
    }

    private static String createBody(Rental rental) {
        String invoiceText = "";
        invoiceText += "\t" + rental.getMovie().getTitle() + "\t"
                + String.valueOf(rental.getPrice()) + "\n";
        return invoiceText;
    }

    private String createHeader() {
        return "Rental Record for " + this.name + "\n";
    }

    private String createFooter() {
        int totalFrequentRenterPoints = rentals.stream().mapToInt(Rental::getFrequentRenterPoints).sum();
        double totalAmount = rentals.stream().mapToDouble(Rental::getPrice).sum();
        String result = "";
        result += "You owed " + totalAmount + "\n";
        result += "You earned " + totalFrequentRenterPoints + " frequent renter points\n";
        return result;
    }




}
