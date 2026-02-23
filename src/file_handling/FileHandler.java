package file_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileOutputStream;

public class FileHandler{
	private File f;
	
	public FileHandler(String filePath) {
		f = new File(filePath);
	}
	
	public boolean createFile() {
		try {
			return f.createNewFile();
		} catch (IOException e) {
			return false;
		}		
	}
	
	public boolean deleteFile() {
		if(f.exists()) {
			return f.delete();
		}
		return false;
	}
	
	 public void writeFile(String str) {
		FileWriter writer;
		try {
			writer = new FileWriter(f);
			writer.write(str);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	 
	 public void readFile() {
		 try {
			FileReader reader = new FileReader(f);
			int c;
			try {
				while((c=reader.read()) != -1) {
					char ch = (char) c;
					System.out.println(ch);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		 } catch (FileNotFoundException e) {
			e.printStackTrace();
		 }
		 
	 }
	
	public static void main(String[] args) {
		FileHandler fh = new FileHandler("D:\\college\\sem-3\\JAVA_TUTORIAL_CLG\\src\\file_handling\\test.txt");
		System.out.println(fh.createFile());
//		System.out.println(fh.deleteFile());
		fh.writeFile("Sitare is best University");
		fh.readFile();
//		fh.deleteFile();
		
		
		
		
		
	}
	
}
