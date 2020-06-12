import com.upgrad.mtb.beans.Customer;
import com.upgrad.mtb.beans.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.upgrad.hibernate.mtb.jpa");
        Customer customer1 = new Customer();
        customer1.setFirstName("Mohan");
        customer1.setLastName("Kumar");
        customer1.setUsername("mohanKumar");
        customer1.setPassword("password");
        customer1.setPhoneNumber("1234567890");
        customer1.setDateOfBirth(new Date("22/10/1996"));

        Movie movie1 = new Movie();
        movie1.setCoverPhotoURL("URLString");
        movie1.setDuration(100);
        movie1.setLanguageId(1);
        movie1.setStatusId(1);
        movie1.setDescription("desc of movie");
        movie1.setName("Dhoom 213");
        movie1.setReleaseDate(new Date("23/10/2040"));
        movie1.setTrailerURL("trailerURL");


        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(customer1);
        entityManager.persist(movie1);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
    }
}
