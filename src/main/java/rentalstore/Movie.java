package rentalstore;

public abstract class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public abstract double calAmount(int dayRented);
}
