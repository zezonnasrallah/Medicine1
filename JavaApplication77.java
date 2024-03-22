package javaapplication77;
import java.util.Scanner;
public class JavaApplication77 {
    public static String symptoms(){
        Scanner in =new Scanner (System.in);
        System.out.println("write down the symptoms:");
        print ();
        System.out.println("\t");
        String sy =in.nextLine();
        print ();
        System.out.println("\t");
       return Medicine(sy); 
    }
    public static String Medicine(String sy){
    //Spring allergy
    if(sy.equals("allergy")){
        System.out.println("1-Claritin"); 
        System.out.println("2-Respir-All");
    }
    else {
return  Medicine2( sy);}
        return null;
    }
    public static String Medicine2(String sy){
    //Headache;
if(sy.equals("Headache")){
      System.out.println("1-Aspirinh");
      System.out.println("2-paracetamol");
}else return Medicine3(sy);
return null;
        }
   public static String  Medicine3(String sy){
       if(sy.equals("Cough")){
            System.out.println("1-Respir-All");
            System.out.println("2-Green Propoils");
            System.out.println("3-Bronchial Soothe");
            System.out.println("4-Prospan");
            System.out.println("5-Nighttime coughDM");
            System.out.println("6-Benadryl");
            System.out.println("7-DRY cough ");
            System.out.println("8-Night Nurse");
            System.out.println("9-Tukol");
            System.out.println("10-Koflet");
       }else{
           return Medicine4(sy);
       }return null;
    }
   public static String Medicine4(String sy){
       if(sy.equals("Toothache")){
       System.out.println("1-Xyli White");
       System.out.println("2-perio brite");
       System.out.println("3-Extra brite");
       System.out.println("4-Whitening complete care toothpaste");
       System.out.println("5-Desere Essence ");
       System.out.println("6-zimba");
       System.out.println("7-repalr");
       System.out.println("8-Bexident");
       System.out.println("9-neem TOOth& Gumoil");
       System.out.println("10-ibuprofen");
       System.out.println("11-aspirin");
       System.out.println("12-naproxen");
       System.out.println("13-diclofenac");
       System.out.println("14-etodolac");
       }else return  Medicine5(sy);
       return null;}
   public static String Medicine5(String sy){
       if(sy.equals("Eye")){
           System.out.println("Pro DhA eye");
           System.out.println("lutein");
           System.out.println("visine");
       }else System.out.println("finsh");
  return null; }
public static void print (){
    for(int i=0;i<25;i++){
    System.out.print("*");  
}}
    public static void main(String[] args) {
       System.out.println(symptoms());
        
    }
    
}
