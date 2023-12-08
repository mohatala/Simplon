package firstproject;

public class Contact {
	
	private String Nom;
	private String Prenom;
	private String Tel;
	private String Email;
	private String Adresse;
	
	public Contact() {}

	public Contact (String n,String p,String t,String m,String a) {
		this.Nom= n;
		this.Prenom= p;
		this.Tel= t;
		this.Email= m;
		this.Adresse= a;
	}
	
	public String getNom() {return this.Nom;}
	public String getPreom() {return this.Prenom;}
	public String getTel() {return this.Tel;}
	public String getEmail() {return this.Email;}
	public String getAdresse() {return this.Adresse;}
	
	public void setNom(String n) {this.Nom = n;}
	public void setPrenom(String p) {this.Prenom = p;}
	public void setTel(String t) {this.Tel = t;}
	public void setEmail(String e) {this.Email = e;}
	public void setAdress(String a) {this.Adresse = a;}

	public  String toString() {
		String s =this.Nom +" "+ this.Prenom+" "+ this.Tel  +" "+  this.Email +" "+ this.Adresse;
		return s;
	}
}
