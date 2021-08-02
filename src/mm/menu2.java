package mm;

import java.util.Scanner;



	
public class menu2 {
		
		public static void main(String args[]){

		//add users
				{
					Scanner in = new Scanner(System.in);
					System.out.print("Enter user's name: ");
					String name = in.nextLine();
					System.out.println("Name is: " + name);
					in.close();
				}
	
	     // search users
			
			{
					Scanner in = new Scanner(System.in);   
		          System.out.println("Search user's name: "); 
		          String name = in.nextLine();
		          System.out.println("Name is: " + name);             
		          in.close();             
		          }
		 
		// delete users
		private void removeUser() {
		    System.out.println("All Users: ");
		    viewUsers();
		    System.out.print("Please enter the ID of the user to be removed: ");
		    int choice = In.nextInt();
		    
		    Object users;
			((Object) users).stream()
		         .filter(user->user.getId() == choice)
		         .findFirst()
		         .ifPresent(users::remove);
	}
		private void viewUsers() {
			// TODO Auto-generated method stub
			
		}
	}
	}
				
				
				 

			