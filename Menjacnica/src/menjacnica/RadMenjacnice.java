package menjacnica;

import java.util.LinkedList;

import menjacnica.interfejs.menjacnicainterfejs;

public class RadMenjacnice implements menjacnicainterfejs {

	LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	public void dodavanjeValute(String datum, String naziv, int srednjiKurs, int prodajniKurs, int kupovniKurs) {
		Valuta valuta = new Kurs();
		valuta.setDatum(datum);
		valuta.setNaziv(naziv);
		valuta.setSkraceniNaziv(naziv);
	}

	@Override
	public void brisanjeValute(String datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public String vracanjeValute(String datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
