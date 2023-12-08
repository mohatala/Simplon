package firstproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inverseword {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String []list;
		Scanner cl = new Scanner(System.in);
		int i,n;
		ArrayList<String> l= new ArrayList<String>();
		System.out.print("Enter Word:");
		String s=cl.nextLine();
		
		for(i=1;i<=s.length(); i++) {
			System.out.print(s.charAt(s.length()-i));
		}
		
		/*System.out.print("Enter Word Size:");
		n=cl.nextInt();
		
		list = new String[n];
		System.out.print("Enter Word:");
		
		for(i = 0; i < n; i++) {
			list[i]=cl.next();
		}
		for(i = list.length-1; i >= 0; i--) {
			System.out.print(list[i]);
		}*/
		/*System.out.print("Enter Word:");
		for(i = 0; i < 5; i++) {
			l.add(cl.next());
		}
		
		for(i = l.size()-1; i >= 0; i--) {
			System.out.print(l.get(i));
		}*/
	}

}
