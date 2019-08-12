package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental Record for " + getName() + "\n";

        for (Rental each : this.rentals) {
            double thisAmount = 0;

            thisAmount = each.calAmount(thisAmount);

            frequentRenterPoints = calFrequentRenterPoints(frequentRenterPoints, each);

            result = showFiguresForRental(result, each, thisAmount);

            totalAmount += thisAmount;
        }

        result += "Amount owed is " + totalAmount + "\n";

        result += "You earned " + frequentRenterPoints + " frequent renter points";

        return result;
    }

    private String showFiguresForRental(String result, Rental each, double thisAmount) {
        result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
        return result;
    }

    private int calFrequentRenterPoints(int frequentRenterPoints, Rental each) {
        frequentRenterPoints++;

        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }



    public String statementHtml() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "<H1>Rental Record for <EM>" + getName() + "</EM></H1>\n";
        for (Rental each : this.rentals) {
            double thisAmount = 0;

            thisAmount = each.calAmount(thisAmount);

            frequentRenterPoints = calFrequentRenterPoints(frequentRenterPoints, each);

            result = showFiguresForRental(result, each, thisAmount);
            totalAmount += thisAmount;
        }

        result += "<P>You owe<EM>" + totalAmount + "</EM><P>\n";
        result += "On this rental you earned <EM>" + frequentRenterPoints + "</EM> frequent renter points<P>";
        return result;
    }
}
