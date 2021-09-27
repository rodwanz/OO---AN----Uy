package application;

public class ProgramaForEach {

	public static void main(String[] args) {
		
		
		System.out.println("Convocação dos trabalhadores: ");		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
//		System.out.println("Eles querem trbalhar!");
//		String[] v = new String[] {"Mirian, Marcelo, Albero"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for(String obj : vect) {
			System.out.println(obj);
		}
//			System.out.print("Name: ");
//			System.out.println("Maria");
//			System.out.println("Mirian");
		}
		
//		for(int i=0; i<v.length; i++) {
//			System.out.println(v[i]);
//		}
		
		
          
	

}
