import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.io.File;
import java.io.IOException;

public class Client {

    private HashMap<String,String> files;
    private int c;

    public Client() throws IOException {
	files = new HashMap<String,String>();
	files.put("file1.txt","this is file 1");
	files.put("file2.txt","this is file 2");
	files.put("file3.txt","this is file 3");
    }

    public ArrayList<String> getFiles() throws IOException {
	return new ArrayList<String>(files.keySet());
    }

    public void addFile(File a) throws IOException {
	String n = String.format("newfile%d.txt",++c);
	String content = String.format("this is new file %d",c);
	files.put(n,content);
    }

    public String getContent(String s) throws IOException {
	return files.get(s);
    }

    public void editFile(String n, String v) throws IOException {
	files.put(n,v);
    }

    public void disconnect() throws IOException{
	return;
    }
}
