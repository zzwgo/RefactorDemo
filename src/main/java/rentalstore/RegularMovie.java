package rentalstore;

public class RegularMovie extends Movie{

    public RegularMovie(String title) {
        super(title);
    }

    @Override
    public double calAmount(int dayRented) {
        double amount=0;
        amount += 2;
        if (dayRented > 2) {
            amount += (dayRented - 2) * 1.5;
        }
        return amount;
    }

}
