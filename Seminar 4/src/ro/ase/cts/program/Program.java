package ro.ase.cts.program;
import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerSpital m1 = ManagerSpital.getInstance();  
		ManagerSpital m2 = ManagerSpital.getInstance(); 
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		ManagerSpitalLazy managerLazy1 = ManagerSpitalLazy.getInstance("lazy 1", 56, 1056);
		ManagerSpitalLazy managerLazy2 = ManagerSpitalLazy.getInstance("lazy 2", 58, 3056);
		
		System.out.println(managerLazy1.toString());
		System.out.println(managerLazy2.toString());
	}

}
