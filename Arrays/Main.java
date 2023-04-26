/**
 * Main
 */
import java.util.*;
public class Main{
  
    public static void main(String args[]) { 
      Scanner sc = new Scanner(System.in);
     
      int n = sc.nextInt();
      Toy toys[]= new Toy[n];
     
      int count=0;
      
        
      System.out.println("---------THE TOYS-------------");  
      // for(int i=0;i<n;i++){
      
      //   toys[i]= new Toy(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.next(), sc.next());
        
      // }
      Toy max = toys[0];
      Toy min = toys[0];
      Toy toys1[]= new Toy[n]; 
      Toy unique[]  = new Toy[n];
      Toy toy10 = new Toy(101, "DC" ,"Bateman",200,"XL" ,"Black","cotton",10,"california","December");
      
      
      // insertElement(toys,i,toy1);
      // findHighestPrice(toys, n, max);
      // findLowestPrice(toys, n, min);
      // findAverage(toys, n, count);
      // highSellingBrand(toys, n);
      // lowSellingBrand(toys, n);
      // highSellingLocation(toys, n);
      // lowSellingLocation(toys, n);
      // highlyPreferredSize(toys, n);
      // highlyPreferredColor(toys, n);
      // mostVisitedCustomer(toys, n, toys1);
      // uniqueCustomer(toys, n, unique);
      // lowPreferredColor(toys, n);
      // findandReplace(toys, n);
      System.out.println(toy10.toString());   
      
      sc.close();

      
      
      }
      
      @Override
      public String toString() {
        return "Main []";
      }

      public static void insertElement(Toy toys[],int index,Toy toy1){
        toys[index]=toy1;
      }

      
        
        
      
      public static void findHighestPrice(Toy toys[], int n, Toy max){
        for(int i=0;i<n;i++){
          if(toys[i].prize>max.prize){
            max=toys[i];
          }

        }
        System.out.println("-------------------------------------");
        System.out.println("--------------THE HIGHEST PRICE TOY-----------------");
        max.display();

      }
      public static void findLowestPrice(Toy toys[], int n ,Toy min ){
        for(int i=0;i<n;i++){
          if(toys[i].prize<min.prize){
            min=toys[i];
          }
        }System.out.println("-----------------THE LOWEST PRICE----------------------");
        System.out.println("THE LOWEST PRICE");
        min.display();
      }
      public static void  findAverage(Toy toys[],int n, double c){
        for(int i=0;i<n;i++){
          c +=toys[i].prize;
        }
        System.out.println("------------------THE AVERAGE---------------------------");
        System.out.println("THE TOTAL AVERAGE PRICE :"+c/n);

      }
      public static void highSellingBrand(Toy toys[], int n){
       
        int maxcount=0;
        String maxBrand="";
        Toy toycopy[] = toys.clone();
        for(int i=0;i<n;i++){
          int count =0;
          for(int j=i+1;j<n;j++){
            if(toycopy[i].brand.equals(toycopy[j].brand)){
              count++;
              
            }
          }
          if(count>maxcount && toycopy[i] != null){
            maxcount=count;
            maxBrand=toycopy[i].brand;
          }
        }
        System.out.println("--------HIGH SELLING BRAND---------");
        System.out.println("HIGH SELLING BRAND : "+maxBrand);
        for(int i=0;i<n;i++){
          if(toycopy[i].brand.equals(maxBrand)){
            toycopy[i].displayAll();
            System.out.println();
          }
            
          

        }
      }
      public static void lowSellingBrand(Toy toys[], int n){
       
        int mincount=10000000;
        String minBrand="";
        Toy toycopy[] = toys.clone();
        for(int i=0;i<n;i++){
          int count =0;
          for(int j=0;j<n;j++){
            if(toycopy[i].brand.equals(toycopy[j].brand)){
              count++;
              
            }
          }
          if(count<mincount && toycopy[i] != null){
            mincount=count;
            minBrand=toycopy[i].brand;
          }
        }
        System.out.println("--------LOW SELLING BRAND---------");
        System.out.println("LOW  SELLING BRAND : "+minBrand);
        for(int i=0;i<n;i++){
          if(toycopy[i].brand.equals(minBrand)){
            toycopy[i].displayAll();
            System.out.println();
          }
            
          

        }
      }
      public static void highSellingLocation(Toy toys[], int n){
        int maxcount=0;
        String maxLocation="";
        int count=0;
        Toy toycopy[]=toys.clone();
        for(int i=0;i<n;i++){
       
          for(int j=0;j<n;j++){
            if(toycopy[i].location.equals(toycopy[i].location)){
              count++;
            }

          }
          if(count>maxcount && toycopy[i] != null){
            maxcount=count;
            maxLocation=toycopy[i].location;
          }

        }
        System.out.println("------------HIGH SELLING LOCATION-----------");
        System.out.println("HIGH SELLING LOCATION : "+maxLocation);
        for(int i=0;i<n;i++){
          if(maxLocation.equals(toycopy[i].location)){
            toycopy[i].displayAll();
            System.out.println();
          }
        }



      }
      
      public static void lowSellingLocation(Toy toys[], int n){
        int mincount=1000000000;
        String minLocation="";
        int count=0;
        Toy toycopy[]=toys.clone();
        for(int i=0;i<n;i++){

         
          for(int j=i+1;j<n;j++){
            if(toycopy[i].location.equals(toycopy[i].location)){
              count++;
            }

          }
          if(count< mincount && toycopy[i] != null){
            mincount=count;
            minLocation=toycopy[i].location;
          }

        }
        System.out.println("------------LOW SELLING LOCATION-----------");
        System.out.println("LOW SELLING LOCATION : "+minLocation);
        for(int i=0;i<n;i++){
          if(minLocation.equals(toycopy[i].location)){
            toycopy[i].displayAll();
            System.out.println();
          }
        }



      }
      public static void highlyPreferredSize(Toy toys[], int n){
        int maxcount=0;
        int count=0;
        String maxSize="";
        Toy toycopy[]= toys.clone();
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            if(toycopy[i].size.equals(toycopy[i].size)){
              count++;

            }
          }
          if(toycopy[i] != null && count>maxcount){
            maxcount=count;
            maxSize=toycopy[i].size;


          }
          
        }
        System.out.println("---------HIGHLY PREFERRED SIZE--------");
          System.out.println("HIGHLY PREFERED SIZE: "+ maxSize);
          for(int i=0;i<n;i++){
            if(toycopy[i].size.equals(maxSize)){
              toycopy[i].displayAll();
              System.out.println();
            }
          }

      }
      public static void highlyPreferredColor(Toy toys[],int n){
        int maxcount=0;
        int count=0;
        String maxColor="";
        Toy toycopy[] = toys.clone();
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            if(toycopy[i].color.equals(toycopy[i].color)){
              count++;
            }
          }
          if(count>maxcount && toycopy[i] != null){
            maxcount=count;
            maxColor=toycopy[i].color;

          }
        }
        System.out.println("-------------HIGHLY PREFERRED COLOR------------");
        System.out.println("HIGHLY PREFRRED COLOR: "+maxColor);
        for(int i=0;i<n;i++){
          if(toycopy[i].color.equals(maxColor)){
            toycopy[i].displayAll();
            System.out.println();
          }
        }

      }
      public static void lowPreferredColor(Toy toys[], int n){
        int mincount=1000000;
        int count=0;
        String minColor="";
        Toy toycopy[]= toys.clone();
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            if(toycopy[i].color.equals(toycopy[j].color)){
              count++;
            }
          }
          if(count<mincount && toycopy[i] != null ){
            mincount=count;
            minColor=toycopy[i].color;


          }
          
        }
        System.out.println("--------------------LOW PREFERRED COLOR------------------");
        System.out.println("LOW PREFERRED COLOR : "+minColor);
        for(int i=0;i<n;i++){
          if(toycopy[i].color.equals(minColor)){
            toycopy[i].displayAll();
            System.out.println();
          }
        }

      }

      public static void mostVisitedCustomer(Toy toys[], int n, Toy toys1[]){
        int index=0;
        int ID =0;
        Toy toycopy[] = toys.clone();
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            {
              if(toycopy[i].CustId ==toycopy[j].CustId && (i != j)){
                toys1[index]=toycopy[i];
                index++;
              }
            }

          }
          ID=toycopy[i].CustId;

        }
        System.out.println("---------------MOST VISITED CUSTOMER---------------");
        System.out.println("MOST VISITED CUSTOMER ID: "+ID);
        for(int i =0 ;i<toys1.length;i++){
          if(toys1[i] != null){
            toys1[i].displayAll();
            System.out.println();
          }
        }

      }
      public static void uniqueCustomer(Toy toys[], int n,Toy unique[]){
        int count=0;
        int index=0;
        Toy toycopy[]=toys.clone(); 
        for(int i=0;i<n;i++){
          count=0;
          for(int j=0;j<n;j++){
            if(toycopy[i].CustId == toycopy[j].CustId && (i != j)){
              count++;
            }

          }
          if(count == 0){
            unique[index]=toycopy[i];
            index++;
          }
        }
        System.out.println("------------UNIQUE CUSTOMER----------------------");
        System.out.println("THE UNIQUE CUSTOMER LIST : ");
        for(int i=0;i<unique.length;i++){
          if(unique[i] != null){
            unique[i].displayAll();
            System.out.println();
          }
      
        }



      }
      public static void findandReplace(Toy toys[], int n){
        Toy toycopy[]= toys.clone();
        String findColor="Black";
        String replaceColor="White";
        for(int i=0;i<n;i++){
          //toycopy[i].color=toycopy[i].color.toLowerCase();

          if(toycopy[i].color.equals(findColor)){
            toycopy[i].color=replaceColor;
          }
        }
        System.out.println("------------FIND AND REPLCED-------");
        System.out.println("THE REPLCED COLOR: "+replaceColor);
        for(int i=0;i<n;i++){
          if(toycopy[i].color.equals(replaceColor)){
            toycopy[i].displayAll();
            System.out.println();
          }
        }
      }
        
      
        
      
      }

    

      
       
 
      





