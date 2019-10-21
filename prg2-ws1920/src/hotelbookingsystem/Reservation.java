package hotelbookingsystem;
import java.util.Date;

public class Reservation {
private String preis;
private Guest guest;
private String dauer;
private Date anreisetag;
private Date abreisetag;
public String getPreis() {
	return preis;
}
public void setPreis(String preis) {
	this.preis = preis;
}
public Guest getGuest() {
	return guest;
}
public void setGuest(Guest guest) {
	this.guest = guest;
}
public String getDauer() {
	return dauer;
}
public void setDauer(String dauer) {
	this.dauer = dauer;
}
public Date getAnreisetag() {
	return anreisetag;
}
public void setAnreisetag(Date anreisetag) {
	this.anreisetag = anreisetag;
}
public Date getAbreisetag() {
	return abreisetag;
}
public void setAbreisetag(Date abreisetag) {
	this.abreisetag = abreisetag;
}
public Reservation(String preis, Guest guest, String dauer, Date anreisetag, Date abreisetag) {
	super();
	this.preis = preis;
	this.guest = guest;
	this.dauer = dauer;
	this.anreisetag = anreisetag;
	this.abreisetag = abreisetag;
}

}
