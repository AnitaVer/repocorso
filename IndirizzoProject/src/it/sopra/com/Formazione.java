package it.sopra.com;

import java.util.ArrayList;
import java.util.List;

public class Formazione {

	public static List<Studente> formazione(List<Studente> studenti) {
		ArrayList<Studente> tmp = new ArrayList<>();
		for(Studente s:studenti) {
			if(s.getCorsiFormazione().size() > 1) {
				tmp.add(s);
			}
		}
		return tmp;
	}
}
