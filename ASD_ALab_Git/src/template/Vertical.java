package template;

import java.util.List;

public class Vertical extends Alphabet {

	@Override
	public void replicate(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for(int i=5; i<list.size();i++){
			sb.delete(0, sb.length());
			sb.append(list.get(i));
			System.out.println(list.get(i)+ sb.reverse().toString().trim());
		}
		
	}

}