package fileDirectory;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		
		ArrayList<String> al_s = new ArrayList<String>();
		ArrayList<Character> al_c = new ArrayList<Character>();
		ArrayList<Integer> al_i = new ArrayList<Integer>();
		
		al_s.add("james");
		al_s.add("jane");
		al_s.add("joe");
		
		al_c.add('j');
		al_c.add('k');
		al_c.add('l');
		
		al_i.add(1);
		al_i.add(2);
		al_i.add(3);
		
		GenericPrintList(al_i);
		GenericPrintList(al_c);
		GenericPrintList(al_s);
		
	}
	
	
	public static <E> void GenericPrintList(ArrayList<E> listName){
		for(E item : listName){
			System.out.println(item);
		}
	}
	
	//RESUME 11:30 CST

}
