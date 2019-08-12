package rentalstore;

public abstract class Statement {

    public String statment(Customer customer){

        String  result="";

        double totalAmount = 0;
        int frequentRenterPoints = 0;

        result += header(customer);

        for (Rental each : customer.getRentals()) {
            double thisAmount = 0;
            thisAmount = each.calAmount(thisAmount);
            frequentRenterPoints++;
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
                frequentRenterPoints++;
            }
            result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        };
        result += content(totalAmount);
        result += footer(frequentRenterPoints);
        return  result;

    }

    public abstract String header(Customer customer);

    public abstract String content(double totalAmount);

    public abstract String footer(int frequentRenterPoints);
}
