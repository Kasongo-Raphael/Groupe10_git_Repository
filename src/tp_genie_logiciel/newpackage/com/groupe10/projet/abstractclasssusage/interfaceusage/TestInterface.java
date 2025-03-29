
package tp_genie_logiciel.newpackage.com.groupe10.projet.abstractclasssusage.interfaceusage;

import java.sql.Connection;
import java.sql.SQLException;
import tp_genie_logiciel.newpackage.com.groupe10.projets.connectionsample.ConnectionFactory;
public class TestInterface {

	public static void main(String[] args) {
		try {
			Person e3 = new Employee();
			((Employee) e3).setId(3);
			((Employee) e3).setFirstName("kassa");
			((Employee) e3).setLastName("jeffrey");
			((Employee) e3).setCnss("23LIAGELJ1070385");
			e3.add();
			System.out.println("Employe 3 Inserer avec succes");

			Person e4 = new Employee();
			((Employee) e4).setId(4);
			((Employee) e4).setFirstName("KASONGO");
			((Employee) e4).setLastName("TSHIMAKINDA");
			((Employee) e4).setCnss("23LIAGELJ1070535"); 
			e4.add();
			System.out.println("Employe 4 inserer avec succes");

			//Insertion des etudiants
			Person et9 = new Student(
                                9, 
                                "KASONGO", 
                                "DJAMBA", 
                                "23LIAGELJ1070943"
                        );
			et9.add();
			System.out.println("L'etudiant 9 inserer avec succes!");

			Person et10 = new Student(
                                10, 
                                "KASOLE", 
                                "MATSHEKA", 
                                "23LIAGELJ1070966"
                        );
			et10.add();
                        System.out.println("L'etudiant 10 inserer avec succes!");
                        
                        Person et11 = new Student(
                                11, "KESEREKA",
                                "MUGHUMALEWA",
                                "23LIAGELJ1070368"
                        );
                        et11.add();
                        System.out.println("L'etudiant 11 inserer avec succes!");
                        
                        Person et12 = new Student(
                                12, "KASEREKA",
                                "KYEYA", 
                                "23LIAGELJ1070349"
                        ); 
                        et12.add();
                        System.out.println("L'etudiant 12 inserer avec succes!");
                        
                        Person et13 = new Student(
                                13,
                                "KASOKI", 
                                "MATINA",
                                "22LSILJ650209"
                        );
                        et13.add();
                        System.out.println("L'etudiant 13 inserer avec succes!");
                        
                        Person et14 = new Student(
                                14,
                                "KASEREKA",
                                "TSONGO", 
                                "22LSILJ650206"
                        );
                        et14.add();
                        System.out.println("L'etudiant 14 inserer avec succes!");
                        
                         Person et15 = new Student(
                                15, 
                                "KASEREKA", 
                                "VAMWITE", 
                                "22LSILJ650203"
                        );
                        et15.add();
                        System.out.println("L'etudiant 15 inserer avec succes!");
                        
                         Person et16= new Student(
                                16, 
                                "KASEMIRE", 
                                "TSUNGU", 
                                "22LSILJ690213"
                        );
                        et16.add();
                        System.out.println("L'etudiant 16 inserer avec succes!");
                        
                        
			
                        
                        e3.showDynamicIdentity(((Employee) e3).getId());
			System.out.println("-----------------------------------------");
			e4.showDynamicIdentity(((Employee) e4).getId());
			System.out.println("-----------------------------------------");

                        
			// Show ETUDIANT
			et9.showDynamicIdentity(((Student) et9).getId());
			System.out.println("------------------------------------------");
			et10.showDynamicIdentity(((Student) et10).getId());
			System.out.println("-----------------------------------------");
                        et11.showDynamicIdentity(((Student) et11).getId());
			System.out.println("------------------------------------------");
			et12.showDynamicIdentity(((Student) et12).getId());
			System.out.println("-----------------------------------------");
                        et13.showDynamicIdentity(((Student) et13).getId());
			System.out.println("------------------------------------------");
			et14.showDynamicIdentity(((Student) et14).getId());
			System.out.println("-----------------------------------------");
                        et15.showDynamicIdentity(((Student) et15).getId());
			System.out.println("------------------------------------------");
			et16.showDynamicIdentity(((Student) et16).getId());
			System.out.println("-----------------------------------------");
                       
                        
                        
                        
                        
                        
		} catch (SQLException e) {
			System.out.println("Echec d'insertion dans la base de donnee");
			e.printStackTrace();
		} finally {
			try {
				// Properly close connection to the DataBase even if error occurs, by using
				// try-with-resources
				try (Connection connection = ConnectionFactory.getConnection(ConnectionFactory.MYSQL_CONNECTION)) {
				}
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
				e2.printStackTrace();
			}
		}

	}

}
