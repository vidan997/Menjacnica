package menjacnica.interfejs;

public interface menjacnicainterfejs {
	
	public void dodavanjeValute(String datum, String naziv, int srednjiKurs, int prodajniKurs, int kupovniKurs);
	public void brisanjeValute(String datum, String naziv);
	public String vracanjeValute(String datum, String naziv);
	
}
