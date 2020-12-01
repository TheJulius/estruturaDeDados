package lista1;

public class main {

	public static void main(String[] args) {
		
		//teste explode java
		String data = "21/02/2020";
		
		String[] dataExploded = data.split("/", 4);
		
		System.out.println(dataExploded[0]);
		System.out.println(dataExploded[1]);
		System.out.println(dataExploded[2]);
	}

}
