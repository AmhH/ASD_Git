package meraLesson3;

import java.util.ArrayList;

public class Row implements IRow{
	
		private ArrayList<String> column = new ArrayList<String>();

		@Override
		public void addColumn(String str) {
			 
			column.add(str);
			
		}


		@Override
		public String toString() {
			return column.toString();
		}

}
