import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BackEnd {

	private File userlist;
	
	 public BackEnd(){
		userlist = new File("List of Users");
	 }
	 
	 public List<String> getMessages(String username){
		 return null;
	 }
	 public void addMessage(String username, String msg){
		 Encoder temp = new Encoder(username);
		 
	 }
	 public List<String> getUsers()
	 {		
		return null;		
	  }
	 
}
