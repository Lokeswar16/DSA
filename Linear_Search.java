package Dsa;
import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
      //searching for an element in an array
        Scanner in= new Scanner(System.in);
//        System.out.println("Enter the number of eleements in the array");
//        int n=in.nextInt();
//        int[] array =new int[n] ;
//        for(int i=0;i<n;i++){
//            array[i]=in.nextInt();
//        }
//        System.out.println("Enter the ele u want to search");
//        int ele= in.nextInt();
//        System.out.println("Enter the string");
//        String st = in.nextLine();
//        System.out.println("Enter the char you want to search");
//        char e= in.next().charAt(0);
//        boolean res=String_search(st,e);
//        if(res){
//            System.out.print("The ele is present");
//        }
//        else{
//            System.out.println("The given element is not there");
//        }
        int[] array={8,2,3,4,5};
        System.out.println(MinimunNumber(array));
    }
    static boolean Linear_Search(int[] array,int ele ){
        if(array.length==0){
            return false;
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==ele){
                return true;
            }
        }
        return false;
    }
    static boolean String_search(String st,char s){
        //check if a char is present in the string
        if(st.length()==0){
            return false;
        }
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==s){
                return true;
            }
        }
        return false;
    }
    static int MinimunNumber(int[] array){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
