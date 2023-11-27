
import java.io.FileWriter;
import java.io.IOException;
public class fileWriterDemo {
	public static void main(String[] args) {
		String data="Hello,This is the first input to the file";//sentence to be inputed into the file
		FileWriter obj=null;//object of file is set to null
		try {
			obj=new FileWriter("D://FirstFile");//name of file is first file
			obj.write(data);//to write into the file
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
			obj.flush();
			obj.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
}
