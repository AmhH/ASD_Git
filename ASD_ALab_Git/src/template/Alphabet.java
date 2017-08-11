package template;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Alphabet {
	
	public abstract void replicate(List<String> list); 
	public void draw(String filename){
			
				try {
					List<String> list = Files.lines(Paths.get(filename), Charset.defaultCharset())
											  .collect(Collectors.toList());
					replicate(list);
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
}
/*// Open the file
FileInputStream fstream = new FileInputStream("textfile.txt");
BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

String strLine;

//Read File Line By Line
while ((strLine = br.readLine()) != null)   {
  // Print the content on the console
  System.out.println (strLine);
}

//Close the input stream
br.close();*/