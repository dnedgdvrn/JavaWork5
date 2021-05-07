package entites.concrete;

import entites.abstarct.Entity;

public class User implements Entity {

	
	private String Ad;
	private String Soyad;
	private String ePosta;
	private String Password;
	
	public User(String ad, String soyad, String ePosta, String password) {
		super();
		Ad = ad;
		Soyad = soyad;
		this.ePosta = ePosta;
		Password = password;
	}
	
	
	public String getAd() {
		return Ad;
	}
	public void setAd(String ad) {
		Ad = ad;
	}
	public String getSoyad() {
		return Soyad;
	}
	public void setSoyad(String soyad) {
		Soyad = soyad;
	}
	public String getePosta() {
		return ePosta;
	}
	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
}
