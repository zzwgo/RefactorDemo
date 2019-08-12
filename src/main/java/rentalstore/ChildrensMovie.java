package rentalstore;

public class ChildrensMovie extends Movie {


    public ChildrensMovie(String title) {
        super(title);
    }

    @Override
    public double calAmount(int dayRented) {
        double amount=0;
        amount += 1.5;
        if (dayRented > 3) {
            amount += (dayRented - 3) * 1.5;
        }
        return amount;
    }

}
