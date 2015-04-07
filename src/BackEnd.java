import java.util.List;


public class BackEnd {

	private List<String> usernames;
	private List<String> messages;
	
	 public BackEnd(){
		 usernames = null;
	 }
	 
	 public List<String> getUsernames(){
		 return usernames;
	 }
	 public void addUser(String username){
		 usernames.add(username);
	 }
	 
}
