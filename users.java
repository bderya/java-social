import java.util.*;
public class users extends message
{
	
	static ArrayList<String> user=new ArrayList<String>();
    ArrayList<String> email=new ArrayList<String>();
   static ArrayList<String> birthDay=new ArrayList<String>();
    TreeSet<String> notificationBox=new  TreeSet<String>();
    
    ArrayList<String> likeBox=new ArrayList<String>();
    ArrayList<String> shareBox=new ArrayList<String>();
    TreeSet<String> followBox = new TreeSet<String>();
    ArrayList<String> city=new ArrayList<String>();
	
   
    public String getUsername(int number)
    {
       return user.get(number);
    }
    public static int getUsersSize()
    {
        return user.size();
    }
	public int length() {
		
		return 0;
	}
	public void addName(String ad)
	{
		user.add(ad);
	}
}

