package listaDoisExcOito;

import org.omg.CORBA.portable.UnknownException;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//confesso que nao tinha muita ideia em como fazer, achei essa solucao no guj
		
		List list = new List();
		list.insertAtFront("a");
		list.insertAtFront("b");
		list.insertAtBack("c");
		list.insertAtBack("d");
		list.print();
		String removedEl;
	try {
		removedEl = list.removeFromFront();
		System.out.println(removedEl.toString() + " removed");
		removedEl = list.removeFromFront();
		System.out.println(removedEl.toString() + " removed");
		removedEl = list.removeFromBack();
		System.out.println(removedEl.toString() + " removed");
		removedEl = list.removeFromBack();
		System.out.println(removedEl.toString() + " removed");
	} catch (UnknownException e) {
		System.out.println(e.toString());
	}
	
	}

}


