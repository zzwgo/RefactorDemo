package rentalstore;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void should_return_result_given_no_movie_and_rentals() {
        Customer customer=new Customer("aaron");

        String result=customer.statement();

        assertEquals("Rental Record for "+customer.getName()+"\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points",result);
    }

    @Test
    public void should_return_result_given_a_regular_movie_and_rental() {
        Customer customer = new Customer("penny");
        Movie movie = new Movie("titanic", Movie.REGULAR);
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String result=customer.statement();

        assertEquals("Rental Record for penny\n" +
                "\t" + rental.getMovie().getTitle() +"\t"+"2.0\n" +
                "Amount owed is " + 2.0 + "\n" +
                "You earned 1 frequent renter points",result);
    }

    @Test
    public void should_return_result_given_a_regular_movie_and_3_dayRented(){

        Customer customer = new Customer("penny");
        Movie movie = new Movie("titanic", Movie.REGULAR);
        Rental rental = new Rental(movie, 2);
        customer.addRental(rental);

        String result=customer.statement();

        assertEquals("Rental Record for penny\n" +
                "\ttitanic\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points",result);
    }

    @Test
    public void should_return_result_given_a_new_release_movie_and_3_dayRented(){

        Customer customer = new Customer("penny");
        Movie movie = new Movie("GG", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        String result=customer.statement();

        assertEquals("Rental Record for penny\n" +
                "\tGG\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points",result);
    }

    @Test
    public void should_return_result_given_a_childrens_movie_and_3_dayRented(){

        Customer customer = new Customer("penny");
        Movie movie = new Movie("GG", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        String result=customer.statement();

        assertEquals("Rental Record for penny\n" +
                "\tGG\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points",result);
    }

    @Test
    public void should_return_result_given_a_childrens_movie_and_4_dayRented(){

        Customer customer = new Customer("penny");
        Movie movie = new Movie("GG", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 3);
        customer.addRental(rental);

        String result=customer.statement();


        assertEquals("Rental Record for penny\n" +
                "\tGG\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points",result);
    }

}