package template;

import java.util.List;

public class Horizontal extends Alphabet {

	@Override
	public void replicate(List<String> list) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=5; i<list.size();i++){
				sb.append(list.get(i)+"\n");
		}
		for(int i=1; i<list.size()-5;i++){
			sb.append(list.get(list.size()-i)+"\n");
	}
		System.out.println(sb.toString());	
	}
}