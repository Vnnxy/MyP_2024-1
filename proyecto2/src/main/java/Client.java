import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.io.File;

public class Client {

    private HashMap<String,String> files;
    private int c;

    public Client(){
	files = new HashMap<String,String>();
	files.put("file1.txt","this is file 1");
	files.put("file2.txt","this is file 2");
	files.put("file3.txt","this is file 3");
    }

    public ArrayList<String> getFiles(){
	return new ArrayList<String>(files.keySet());
    }

    public void addFile(File a){
	String n = String.format("newfile%d.txt",++c);
	String content = String.format("this is new file %d",c);
	files.put(n,content);
    }

    public String getContent(String s){
	return files.get(s);
    }

    public void editFile(String n, String v){
	files.put(n,v);
    }
}
