package rentalstore;

public class NewReleaseMovie extends Movie{


    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double calAmount(int dayRented) {
        double amount=0;
        amount += dayRented * 3;
        return amount;
    }

}
