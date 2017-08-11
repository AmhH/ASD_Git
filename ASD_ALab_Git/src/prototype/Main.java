package prototype;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(123,"Smith","John","123 Main st","Fairfield","IA","52556");
		Employee emp2 = new Employee(123,"Doe","Jon","123 First st","Ottumwa","IA","52545");
		Employee emp3 = new Employee(123,"Abyssinia","Ethio","123 Capitol st","Des Moines","IA","52538");
		Employee emp4 = new Employee(123,"Kush","Nubia","43 Van Buren st","Washington","IA","52459");
		Employee emp5 = new Employee(123,"Saba","Queen","56 Burlington st","Mt Pleasant","IA","52355");
		Employee emp6 = new Employee(123,"Sheger","Shewa","98 4th st","Fairfield","IA","54552");
		
		Employee[] staff1 = {emp1, emp2, emp3};
		emp4.setStaff(staff1);
		emp4.setSupervisor(emp5);
		System.out.println(emp4.toString());
		System.out.println("================================");
		Employee clone1 = (Employee) emp4.clone();
		System.out.println(clone1.toString());
		System.out.println("==============1==================");
		System.out.println("==============1==================");
		Employee[] staff2 = {emp4, emp2, emp3};
		emp1.setStaff(staff2);
		emp1.setSupervisor(emp6);
		System.out.println(emp1.toString());
		System.out.println("================================");
		Employee clone2 = (Employee) emp1.clone();
		System.out.println(clone2.toString());
		
	}
}