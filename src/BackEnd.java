import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BackEnd {

	private File userlist;
	
	 public BackEnd(){
		userlist = new File("List of Users");
	 }
	 
	 public List<String> getMessages(String username){
		 Encoder temp = new Encoder(username);
		 return temp.read();
	 }
	 public void addMessage(String username, String msg){
		 Encoder temp = new Encoder(username);
		 temp.write(username+": "+msg);
		 try{
		 FileWriter filewriter = new FileWriter(userlist, true);
		 BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
		 bufferedwriter.write(username+"\\n");
		 bufferedwriter.close();
		 }
		 catch(Exception e){
				e.printStackTrace();
			}
	 }
	 public List<String> getUsers()
	 {		
		Scanner scan = null;
		List<String> toret = null;
		try {
			scan = new Scanner(userlist);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(scan.hasNextLine()){
			String input = scan.nextLine();
			toret.add(input);
		}
		scan.close();
		return toret;
	  }
	 
}
