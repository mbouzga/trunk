package ma.ensao.bean;

public class produits {
	private String nom;
	private int id;
	private double prix;
	private String categorie;
	private String couleur;
	private int nbr_stock;
	private int promo;
	private boolean special;
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getNbr_stock() {
		return nbr_stock;
	}
	public void setNbr_stock(int nbr_stock) {
		this.nbr_stock = nbr_stock;
	}
	public int getPromo() {
		return promo;
	}
	public void setPromo(int promo) {
		this.promo = promo;
	}
	public boolean getSpecial() {
		return special;
	}
	public void setSpecial(boolean i) {
		this.special = i;
	}
	private String Description;
	private String photo;
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}

}
