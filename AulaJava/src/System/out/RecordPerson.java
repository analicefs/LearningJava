package System.out;

import java.util.ArrayList;
import java.util.Iterator;

public class RecordPerson {
	private ArrayList PersonList; 

	public ArrayList getPersonList() {
		return PersonList;
	}
	public RecordPerson() {
		this.PersonList= new ArrayList();
	}
	public void AdicionaRecorPerson(ArrayList p) {
		this.PersonList.add(p);
		
	}
	public static void main(String[] args) {
		RecordPerson pr = new RecordPerson();
		
		for (Iterator iterator = pr.getPersonList().iterator(); iterator.hasNext();) {
		PersonConstrutor p = (PersonConstrutor) iterator.next();
		p.ImprimirPerson();
			
		}
	}
}

