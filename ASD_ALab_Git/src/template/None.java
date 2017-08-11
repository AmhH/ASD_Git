package template;

import java.util.List;

public class None extends Alphabet {

	@Override
	public void replicate(List<String> list) {
		for(int i=5; i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}

}