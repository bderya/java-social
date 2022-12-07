import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class UserPanel extends users
{    
	public static void main(String[] args)
  {
	 Date time=new Date();
	 
     int userc,menu,message = 0,follow;
     int durum;
     int choose=0;
     int control=0;
     int timeline = 0;
     String usermessages = null;
     
     String posts;
     users contant;
     users contant2 = null;
     users contant3 = null;
     users contant4 = null;
     users contant5 = null;

     
     DateFormat df = new SimpleDateFormat("dd/MM");
     String temp=df.format(time);
  
     Scanner use=new Scanner(System.in);
     Scanner men=new Scanner(System.in);
     Scanner messa=new Scanner(System.in);
     Scanner writemes=new Scanner(System.in);
     Scanner post=new Scanner(System.in);
     Scanner timel=new Scanner(System.in);
     Scanner followw=new Scanner(System.in);
     Scanner like=new Scanner(System.in); 
     Scanner no=new Scanner(System.in); 
     Scanner durums=new Scanner(System.in); 
     
    
     ArrayList<users> kullanici=new ArrayList<users>();
    
         System.out.println("#####    Welcome to JAVASOCIAL    #####");
         System.out.println();
    	 System.out.println("===>You want to create a new user = 1<===");
         durum=durums.nextInt();
         while(durum!=1)
         {
        	 System.out.println("===>Wrong user please try again...<==="); 
        	 System.out.println("===>You want to create a new user = 1<===");
             durum=durums.nextInt();
        	
         }
    
         while(durum==1)
         {
         System.out.println("===>Enter the name and surname<===");
         String name = no.nextLine();
         System.out.println("===>Enter the location<===");
         String location = no.nextLine();
         System.out.println("===>Enter the birthday=(ex:05/05)<===");
         String birthday = no.nextLine();
         
         contant5=new users();
         contant5.birthDay.add(birthday);
         contant5.city.add(location);
         
        
         kullanici.add(contant5);
         contant5.addName(name); 
         System.out.println("===>You want to create a new user = 1<===");
         System.out.println("===>You want to continue = 2<===");
         durum=durums.nextInt();
         if (durum==2)
         {
        	 break;
         }
         else if(durum!=1)
         {
        	System.out.println("===>Wrong user please try again...<==="); 
        	 System.out.println("===>You want to create a new user = 1<===");
             durum=durums.nextInt();
         }
         }
   
      for(int i=0; i<user.size();i++)
   	 {
         System.out.println(i+"-)"+user.get(i));
      }
     System.out.println("===>You have to choose a user:<===");
     userc=use.nextInt();
     
     while(userc>=kullanici.size())
     {
    	 for(int i=0; i<user.size();i++)
       	 {
             System.out.println(i+"-)"+user.get(i));
          }
    	 System.out.println("===>Wrong user please try again...<==="); 
         System.out.println("===>You have to choose a user:<===");
         userc=use.nextInt();
     }
  
       while(userc!=-1)
     {
    	   contant=kullanici.get(userc);
    	   if(temp.equals(contant.birthDay.get(userc)))
    	   {
    		   System.out.println("===>Happy birthday<===");
    	   }
     System.out.println();	   
     System.out.println("1. Show Inbox");
     System.out.println("2. Show Outbox");
     System.out.println("3. Send Message");
     System.out.println("4. Share Post");
     System.out.println("5. Show Timeline");
     System.out.println("6. Show Contact List");
     System.out.println("7. Show Notification");
     System.out.println("8. Follow People");
     System.out.println("9. Sign Out");
     System.out.println();
     System.out.println("===>Welcome Username, please choose a operation which you want;<===");
     System.out.println("===>You want to stopped you entered -1...<===");
     menu=men.nextInt();
     
     
     if(menu==1)
     {
    	 if(contant.messageBox.size()==0)
    	 {
    		 System.out.println("Your message box empty..."); 
    	 }
    	 else
    	 {
    		 for(String elements:contant.messageBox)
             {
                 System.out.println(elements);
             }
    	 }
     }
     else  if(menu==2)
     {
    	 if(contant.outgoingmessageBox.size()==0)
    	 {
    		 System.out.println("Your out going message box empty..."); 
    	 }
    	 else
    	 {
    		 for(String elements:contant.outgoingmessageBox)
             {
                 System.out.println(elements);
             }
    	 }
     }
     else if(menu==3)
     {
         System.out.println("===>Choose the person whom you want to send message:<===");        
         for(int i=0; i<user.size();i++)
       	 {
             System.out.println(i+"-)"+user.get(i));
       	 }
         message=messa.nextInt();
         contant2=kullanici.get(message);
         
         System.out.println("===>Enter the you want to send<===");
         usermessages=writemes.nextLine();
  
         if(userc==message)
         {         	
        	    contant2.messageBox.add("Message sent by "+contant.getUsername(userc)+"= "+usermessages+" "+time.toString());
			 	contant.outgoingmessageBox.add("My message to "+contant.getUsername(message)+"= "+usermessages+" "+time.toString());
			 	contant2.notificationBox.add(time.toString()+contant.getUsername(userc)+" Sent you messages...");
			 	System.out.println("Sent message..");
         }
         else
         { 
        	 if(contant.followBox.size()==0)
      	   		{
      		   System.out.println("The person is not follow you so you don't send message...");
      	   		}
        	 else
        	 	{
        		 for(String elements:contant.followBox)
            	  {
        			 if(elements.equals(contant2.getUsername(message)))
                		{
        				 contant2.messageBox.add("Message sent by "+contant.getUsername(userc)+"= "+usermessages+" "+time.toString());
        				 contant.outgoingmessageBox.add("My message to "+contant.getUsername(message)+"= "+usermessages+" "+time.toString());
        			 	contant2.notificationBox.add(time.toString()+contant.getUsername(userc)+" Sent you messages...");
        			 	System.out.println("Sent message..");
                		}
        			 else
        			 {
        				 System.out.println("You do not following "+contant2.getUsername(message));
        			 }
            	  }
        	 	}
         }
     }
     else if(menu==4)
     {
         System.out.println("===>Share a post...<===");
         posts=post.nextLine();
         contant.timeLine.add(time.toString()+" "+contant.getUsername(userc)+" "+posts); 
     }
     else if (menu==5)
     { 
    	System.out.println("===>Choose Time line<===");
    	 for(int i=0; i<user.size();i++)
       	 {
             System.out.println(i+"-)"+user.get(i));
       	 }
    	timeline=timel.nextInt();
    	contant4=kullanici.get(timeline);
    	if(contant==contant4)
    	{
   		for(String element:contant.timeLine)
        {
            System.out.println(element);
        } 
   		}
   	 
   	 else
   	 {
   	   for(String elements:contant.followBox)
        	  {
   		 	if(elements.equals(contant.getUsername(timeline)))
   		 	{
   		 		for(String element:contant4.timeLine)											
   		 		{											
    				System.out.println(element);
    				if(control==0)
                   {
                   System.out.println("1-Like, 2-Share,3-Continue ");
                   choose=like.nextInt();
                   if(choose==1)
                   {
                       contant4.notificationBox.add(contant.getUsername(userc)+" Like Your Post ="+element);
                       contant.likeBox.add(element);
                   }
                   else if(choose==2)
                   {
                       contant4.notificationBox.add(contant.getUsername(userc)+" Share Your Post ="+element);
                       contant.timeLine.add("Posts by "+contant4.getUsername(timeline)+" "+element);
                   }
                   else if(choose==3)
                   {
                       continue;
                   }
                   else
                   {
                       System.out.println("===>Wrong number...<===");
                   }
            		
   		 	    }
   		 		}
   		 	}
   		 }
   	 }
     }
    else if(menu==6)
    {
    	for(String elements:contant.followBox)
        {
            System.out.println(elements);
        }
    }
    else if(menu==7)
    {
        int a;
        a=contant.messageBox.size();
        System.out.println("You have "+a+" messages.Read your messages...");
        int b;
        b=contant.followBox.size();
        System.out.println("You have "+b+" follower...");
        for(String elements:contant.notificationBox)
        {
        	 System.out.println(elements);
        }     
    }
   else if(menu==8)
    {
        System.out.println("===>Who do you want to follow?<===");
        for(int i=0; i<user.size();i++)
      	 {
            System.out.println(i+"-)"+user.get(i));
      	 }
       follow=followw.nextInt();
       contant3=kullanici.get(follow);
       if(userc==follow)
       {
           System.out.println("You can not follow yourself....");
       }
       else
         { 
       	 contant.followBox.add(contant3.getUsername(follow));
       	 contant3.followBox.add(contant.getUsername(userc)); 
         contant3.notificationBox.add(time.toString()+" "+contant.getUsername(userc)+" Follow You...");
         contant.notificationBox.add(time.toString()+" "+contant3.getUsername(follow)+" Follow You...");
         }
    }
   else if (menu==9)
   {
	 System.out.println("===>You want to create a new user = 1<===");
	 System.out.println("===>You want to continue = 2<===");
	 durum=durums.nextInt();
	    if (durum==2)
	    {
	    	for(int i=0; i<user.size();i++)
	    	   	 {
	    	         System.out.println(i+"-)"+user.get(i));
	    	      }
	    	     System.out.println("===>You have to choose a user:<===");
	    	     userc=use.nextInt();
	    	     continue;
	    }
     while (durum!=1)
    {
   	 System.out.println("===>Wrong user please try again...<==="); 
   	 System.out.println("===>You want to create a new user = 1<===");
     durum=durums.nextInt();
    }
    while(durum==1)
    {
    System.out.println("Enter the name and surname=");
    String name = no.nextLine();
    System.out.println("Enter the location=");
    String location = no.nextLine();
    System.out.println("Enter the birthday=(ex:05/05)");
    String birthday = no.nextLine();
    
    contant5=new users();
    contant5.birthDay.add(birthday);
    contant5.city.add(location);
    
   
    kullanici.add(contant5);
    contant5.addName(name); 
    System.out.println("===>You want to create a new user = 1<===");
    System.out.println("===>You want to continue = 2<===");
    durum=durums.nextInt();
    if (durum==2)
    {
    	for(int i=0; i<user.size();i++)
    	   	 {
    	         System.out.println(i+"-)"+user.get(i));
    	      }
    	     System.out.println("===>You have to choose a user:<===");
    	     userc=use.nextInt();
    }
    else if(durum!=1)
    {
   	System.out.println("===>Wrong user please try again...<==="); 
   	 System.out.println("===>You want to create a new user = 1<===");
        durum=durums.nextInt();
    }
    }
   }
   else
   {
	   System.out.println("===>Wrong user please try again...<==="); 
   }
     
     if(menu==-1)
     {
         System.out.println("===>Program Stopped...<===");
         System.exit(0);
     }
     }
  }
 }
