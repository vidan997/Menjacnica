package menjacnica;

import java.util.LinkedList;

import menjacnica.interfejs.menjacnicainterfejs;

public class RadMenjacnice implements menjacnicainterfejs {

	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public void dodavanjeValute(String datum, String naziv, int srednjiKurs, int prodajniKurs, int kupovniKurs) {
		Kurs valuta = new Kurs();
		
		valuta.setNaziv(naziv);
		valuta.setDatum(datum);
		valuta.setKupovniKurs(kupovniKurs);
		valuta.setProdajniKurs(prodajniKurs);
		valuta.setSrednjiKurs(srednjiKurs);
		valute.addLast(valuta);

	}

	@Override
	public void brisanjeValute(String datum, String naziv) {
		for(int i = 0 ; i < valute.size() ;i++) {
			if(valute.get(i).getDatum().equals(datum) && valute.get(i).getNaziv().equals(naziv)) {
				valute.remove(i);
			}
		}
	}

	@Override
	public String vracanjeValute(String datum , String naziv) {
		String kurs = "";
		
		for(int i = 0 ; i < valute.size() ; i++) {
			if(valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum)) {
				Kurs s = new Kurs();
				s = (Kurs) valute.get(i);
				kurs = "Srednji kurs:"+s.getSrednjiKurs()+"\n Prodajni kurs:"+s.getProdajniKurs()+
						"\n KupovniKurs"+s.getKupovniKurs();
			}
		}
		
		return kurs;
	}

}
