package firstproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
	
	ArrayList<Contact> Contacts= new ArrayList<Contact>();
	
	public ContactManager() {}

	public void addContact() {
		System.out.println("Ajouter un Contact");
		Scanner cl = new Scanner(System.in);
		System.out.println("Taper votre Nom:");
		String nom=cl.nextLine();
		System.out.println("Taper votre Prenom:");
		String prenom=cl.nextLine();
		System.out.println("Taper votre Tel:");
		String tel=cl.nextLine();
		System.out.println("Taper votre Email:");
		String email=cl.nextLine();
		System.out.println("Taper votre Adresse:");
		String address=cl.nextLine();
		Contact c=new Contact(nom, prenom, tel, email, address);
		Contacts.add(c);
	}
	
	public void allContact() {
		System.out.println("Liste Des Contacts");
		if(Contacts.isEmpty()) {
			System.out.println("Aucun Contact");
		}
		else {
			for(int i =0 ; i< Contacts.size(); i++) {
					System.out.println(Contacts.get(i).toString());
			}
		}
	}
	
	public void searchContact() {
		System.out.println("Chercher un Contact");
		Scanner cl = new Scanner(System.in);
		System.out.println("Taper le Nom a chercher:");
		String n=cl.nextLine();
		for(int i = 0 ; i< Contacts.size(); i++) {
			if(Contacts.get(i).getNom().contentEquals(n)) {
				System.out.println(Contacts.get(i).toString());
			}
			else {		
				System.out.println("Contact n'existe pas");
			}
		}
	}

	public void updateContact() {
		System.out.println("Modifier un Contact");
		Contact c =new Contact();
		Scanner cl = new Scanner(System.in);
		System.out.println("Taper le Nom de contact a modifier:");
		String oldnom=cl.nextLine();
		
		for(int i =0 ; i< Contacts.size() ; i++) {
			if(Contacts.get(i).getNom().contentEquals(oldnom)) {
				System.out.println("Taper Nouveau Nom:");
				String nom=cl.nextLine();
				System.out.println("Taper Nouveau Prenom:");
				String prenom=cl.nextLine();
				System.out.println("Taper Nouveau Tel:");
				String tel=cl.nextLine();
				System.out.println("Taper Nouveau Email:");
				String email=cl.nextLine();
				System.out.println("Taper Nouveau Adresse:");
				String address=cl.nextLine();
				c.setNom(nom);
				c.setPrenom(prenom);
				c.setAdress(address);
				c.setEmail(email);
				c.setTel(tel);
				Contacts.remove(i);
				Contacts.add(c);
			}
		}
	}
	
	public void deleteContact() {
		System.out.println("Supprimer un Contact");
		Scanner cl = new Scanner(System.in);
		System.out.println("Taper le Nom de contact a Supprimer:");
		String nom=cl.nextLine();
		for(int i =0 ; i< Contacts.size() ; i++) {
					if(Contacts.get(i).getNom().contentEquals(nom)) {
						Contacts.remove(i);
					}
					else {		
						System.out.println("Contact n'existe pas");
					}
				}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactManager CM =new ContactManager();
		Scanner cl = new Scanner(System.in);
		int c=0;
		
		do {
			System.out.println("***********Bienvenu a votre list de Contact***********");
			System.out.println("Choisie L'operation que vous voulez faire");
			System.out.println("Pour Ajouter Contact taper 1");
			System.out.println("Pour Chercher Contact taper 2");
			System.out.println("Pour Modifier Contact taper 3");
			System.out.println("Pour Supprimer Contact taper 4");
			System.out.println("Pour Afficher tous les Contacts taper 5");
			System.out.println("Pour Quitter taper 0");
			c=cl.nextInt();
			switch (c) {
				case 1: {
					CM.addContact();break;
				}
				case 2: {
					CM.searchContact();break;
						}
				case 3: {
					
					CM.updateContact();break;
				}
				case 4: {
					
					CM.deleteContact();break;
				}
				case 5: {
					
					CM.allContact();break;
				}
			}
		}while(c!=0);
		
	}

}
