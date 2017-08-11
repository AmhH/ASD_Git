package mukera;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private String directory = System.getProperty("user.dir") + "\\dataStorage\\";
	List<Test> list = new ArrayList<>();

	public void inputConnection(String className) {
		boolean check = true;
		try {
			File file = new File(directory + className + ".txt");
			File dir = new File(file.getParentFile().getAbsolutePath());
			System.out.println(dir);
			if(!dir.exists())
				dir.mkdirs();
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream input = new ObjectInputStream(fileInputStream);
			Object test = input.readObject();
				while (check) {
					System.out.println("hello am here");
					list.add((Test)test);
					System.out.println(test);
					System.out.println(list);
					test = input.readObject();
				}
				input.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException ex){
			check=false;
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("resource")
	public void outputConnection(String className) {
		try {
			File file = new File(directory + className + ".txt");
			File dir = new File(file.getParentFile().getAbsolutePath());
			if(!file.exists()){
				dir.mkdirs();
				file.createNewFile();
			}
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
			for (Test t : list) {
				output.writeObject(t);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public String toString() {
		return "Main [directory=" + directory + ", list=" + list + "]";
	}

	public static void main(String[] args) {
		Main main = new Main();
		Test t1 = new Test("A", 1);
		Test t2 = new Test("B", 2);
		Test t3 = new Test("C", 3);
		Test t4 = new Test("D", 4);
		main.list.add(t4);
		main.list.add(t1);
		main.list.add(t2);
		main.list.add(t3);
		main.outputConnection(Test.class.getSimpleName());
		main.inputConnection(Test.class.getSimpleName());
		//System.out.println(main.list.toString());
	}
}
