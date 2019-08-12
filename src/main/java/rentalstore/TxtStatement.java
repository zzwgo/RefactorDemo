package rentalstore;

public class TxtStatement extends Statement {

    @Override
    public String header(Customer customer) {
        String result = "Rental Record for " + customer.getName() + "\n";
        return result;
    }

    @Override
    public String content(double totalAmount) {
        String result = "Amount owed is " + totalAmount + "\n";
        return result;
    }

    @Override
    public String footer(int frequentRenterPoints) {
        String result = "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

}
