package week4.day3;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "babub";
		int length=str.length();
		char[] charArray = str.toCharArray();
		for(int i=0;i<length-1;i++) {
		//System.out.println(charArray[i]); 
		}
		Set<Character> val=new HashSet<Character>();
		val.add('b');
		val.add('a');
		val.add('b');
		val.add('u');
		val.add('b');
		//System.out.println(val);
		String [] split=str.split("b");
		for (int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
		}
	     
		 }
	        
