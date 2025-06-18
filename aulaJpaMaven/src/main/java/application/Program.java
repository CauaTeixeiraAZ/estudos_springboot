package application;

import dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos da silva", "Carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana maria", "ana@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
		
		
	}
}
