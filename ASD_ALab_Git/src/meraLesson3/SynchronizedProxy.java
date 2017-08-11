package meraLesson3;

public class SynchronizedProxy implements ITable {
	
	private ITable table = new Table();

	@Override
	public int numOfRows() {
		// TODO Auto-generated method stub
		return table.numOfRows();
	}

	@Override
	public IRow getRow(int rowNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		// TODO Auto-generated method stub

        table.addRow(row, rowNum);
		
	}

	@Override
	public void deleteRow(int rowNum) {
		synchronized (table.getRow(rowNum)) {
			table.deleteRow(rowNum);
		}
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		synchronized (table.getRow(rowNum)) {
			table.deleteRow(rowNum);
			table.modifyRow(rowNum, row);
		}
		
	}

	@Override
	public void print() {
		
			table.print();
	}

}
