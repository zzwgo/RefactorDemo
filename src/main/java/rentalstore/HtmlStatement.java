package rentalstore;

public class HtmlStatement extends Statement {

    @Override
    public String header(Customer customer) {
        String result = "<H1>Rental Record for <EM>" + customer.getName() + "</EM></H1>\n";
        return result;
    }

    @Override
    public String content(double totalAmount) {
        String result = "<P>You owe<EM>" + totalAmount + "</EM><P>\n";
        return result;
    }

    @Override
    public String footer(int frequentRenterPoints) {
        String result = "On this rental you earned <EM>" + frequentRenterPoints
                + "</EM> frequent renter points<P>";
        return result;
    }
}
