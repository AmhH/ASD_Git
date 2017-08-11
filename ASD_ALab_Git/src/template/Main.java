package template;

public class Main {
	public static void main(String[] args) {
		//Each letter was saved separately in a file 
		Alphabet vertical = new Vertical();
		vertical.draw("inputA.txt");
		System.out.println("===========");
		Alphabet none = new None();
		none.draw("inputB.txt");
		System.out.println("===========");
		Alphabet horizontal = new Horizontal();
		horizontal.draw("inputC.txt");
	}
}