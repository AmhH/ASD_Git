package meraLesson3;

import java.util.ArrayList;

public class Table implements ITable {
	
	private ArrayList<Row> table = new ArrayList<Row>();

	@Override
	public int numOfRows() {
		// TODO Auto-generated method stub
		return table.size();
	}

	@Override
	public IRow getRow(int rowNum) {
		// TODO Auto-generated method stub
		return table.get(rowNum);
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		// TODO Auto-generated method stub
		table.add(rowNum, (Row)row);
	}

	@Override
	public void deleteRow(int rowNum) {
		// TODO Auto-generated method stub
		table.remove(rowNum);
		
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		// TODO Auto-generated method stub
		table.add(rowNum, (Row)row);
		
	}

	@Override
	public void print() {
		
		for(Row r: table){
			System.out.println(r.toString());
		}
	}
	
	

}
