package rentalstore;

public class RegularMovie implements MovieType {

    @Override
    public double calculateAmount(double amount, int dayRented) {
        amount += 2;
        if (dayRented > 2) {
            amount += (dayRented - 2) * 1.5;
        }
        return amount;
    }

}
