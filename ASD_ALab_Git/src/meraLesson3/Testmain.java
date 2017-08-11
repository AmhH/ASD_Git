package meraLesson3;

public class Testmain {

	public static void main(String[] args) {
		
		ITable t = new Table();
		IRow r = new Row();
		r.addColumn("Name");
		r.addColumn("age");
		r.addColumn("Mera");
		r.addColumn("26");
		t.addRow(r, 0);
		System.out.println(t.numOfRows());
		t.print();

	}

}
