package Day4;

import java.util.ArrayList;
import java.util.Scanner;

class MySplit {
     ArrayList<String> splitString (String s , String delimiter){
        
        int firstIndex = 0;
        int nextIndex = s.indexOf(delimiter);
        ArrayList<String> myList = new ArrayList<>();
       // System.out.println(s.length());

        while (nextIndex < s.length()) {
            myList.add(s.substring(firstIndex, nextIndex));
        
            firstIndex = nextIndex + delimiter.length();
            nextIndex = s.indexOf(delimiter, nextIndex + 1);
            
            if (nextIndex == -1)
                break;

        }
        return myList;
     }

    public static void main(String[] args) {
        MySplit mySplit = new MySplit();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter the delimiter");
        String del=sc.nextLine();
        ArrayList<String> myList = mySplit.splitString(str, del);
        for(String s : myList){
            System.out.println(s);
        }
    }
}