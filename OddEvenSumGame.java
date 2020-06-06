package com.example;
import java.util.*;
import java.util.Scanner;

public class OddsAndEvens {

  public static void main(String[] args) {
System.out.println("Let’s play a game called “Odds and Evens”");
Scanner sc = new Scanner (System.in);
System.out.println("What is your name?");
String name= sc.nextLine();
String choose="";
while( !(choose.equals("O") || choose.equals("E")))
{
  System.out.println("Hi "+name+", which do you choose? (O)dds or (E)vens?");  choose= sc.nextLine();
  
}
if(choose.equals("O"))
{
  System.out.println(name+" has picked odds! The computer will be evens.");
  
}
else{
  System.out.println(name+" has picked evens! The computer will be odds.");
}
System.out.println("--------------------");
System.out.println();
System.out.println();
System.out.println();
  System.out.println("How many “fingers” do you put out?");
  
  int user= sc.nextInt();
  Random rand = new Random();
int computer = rand.nextInt(6);
System.out.println("The computer plays "+computer+" fingers.");
System.out.println("--------------------");
System.out.println();
System.out.println();
int sum= user+computer;
System.out.println(user+computer+"= sum");
if(sum % 2 == 0)
{
  System.out.println(sum+"is ... even");
  if(choose.equals("E"))
  {
    System.out.println("That means "+name+" wins !");
  }
  else{
    System.out.println("That means "+name+" loss !");
  }
}
else{
  System.out.println(sum+"is ... odd");
  if(choose.equals("O"))
  {
    System.out.println("That means "+name+" wins !");
  }
  else{
    System.out.println("That means "+name+" loss !");
  }
  System.out.println("--------------------");
System.out.println();
System.out.println();
}


}

}