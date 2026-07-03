// this program si to implement for each loop
// import java.util.*;
// public class NewClass {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.close();
//         int fact = 1;
//         while(n != 0){
//             fact = fact * n;
//             n--;
//         }
//     }
// }


// int j[] = {10,20,30};
//         for( int m: j){
//             System.out.println(m);


// the following program is to implement the student class with name and marks using a constructor
// import java.util.*;
// class NewClass{
//     String name;
//     int marks;
//     NewClass(String n, int m){
//         name = n;
//         marks = m;
//     }
//     void display(){
//         System.out.println("Name: " + name);
//         System.out.println("Marks: " + marks);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter name: ");
//         String name = sc.nextLine();
//         System.out.print("Enter marks: ");
//         int marks = sc.nextInt();
//         NewClass student = new NewClass(name, marks);
//         student.display();
//         sc.close();
//     }
// }

// Create an Employee class using private variables and getter/setter methods.
// import java.util.Scanner;
// class Employee {
//     private String name;
//     private int age;

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }
// }

// public class NewClass {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Employee employee = new Employee();

//         System.out.print("Enter name: ");
//         employee.setName(sc.nextLine());

//         System.out.print("Enter age: ");
//         employee.setAge(sc.nextInt());
//         sc.nextLine();

//         System.out.println("\nEmployee Details:");
//         System.out.println("Name: " + employee.getName());
//         System.out.println("Age: " + employee.getAge());

//         sc.close();
//     }
// }

 // Demonstrate method overloading using a Calculator class
// import java.util.Scanner;
// class Calculator {
//     public void add(int a, int b) {
//         System.out.println("Result: " + (a + b));
//     }

//     public void add(double a, double b) {
//         System.out.println("Result: " + (a + b));
//     }
// }

// public class NewClass {
//     public static void main(String[] args) {
//         Calculator calculator = new Calculator();
//         calculator.add(10, 20);
//         calculator.add(1.5, 2.5);
//     }
// }

//  Create an ArrayList of Integers and print all even numbers.

// import java.util.*;
// public class NewClass {
//     public static void main(String[] args){
//         ArrayList list = new ArrayList();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         for(int i = 0; i < list.size(); i++){
//             if((int)list.get(i) % 2 == 0){
//                 System.out.println(list.get(i));
//             }
//         }
//     }
// }

//Create a HashSet of Strings and remove duplicate names.
// import java.util.*;
// public class NewClass {

//     public static void main(String[] args){
//         HashSet<String> set = new HashSet<>();
//         set.add("John");
//         set.add("Jane");
//         set.add("John");
//         set.add("Doe");
//         System.out.println(set);
//     }
// }

//Create a HashMap of student names and marks and display all entries.
// import java.util.*;
// public class NewClass {
//     public static void main(String[] args){
//         HashMap<String, Integer> map = new HashMap<>();
//         map.put("John", 85);
//         map.put("Jane", 90);
//         map.put("Doe", 95);
//         System.out.println(map);
//     }
// }

//Demonstrate inheritance using Animal and Dog classes.
// class Animal {
//     void sound() {
//         System.out.println("The animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("The dog barks");
//     }
// }

// public class NewClass {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.sound();
//         dog.bark();
//     }
// }



/*  Java Assessment - Loops, OOP & Collections (Medium)
Duration: 60 Minutes
Topics:
• Loops
• Object-Oriented Programming
• Basic Collections

Sections:
15 Objective Questions
10 Short Answer Questions
10 Coding Questions
anubhavsaxenavibhu@gmail.com Switch account
 
Not shared
 
Draft saved
* Indicates required question
Name
*
1 point
Anubhav Saxena
Roll no.
*
1 point
1230439067
Batch
*
1 point
2nd batch 2026
phone .
*
1 point
800891669
1. Which loop is guaranteed to execute at least once?
*
1 point
for
while
do-while
Enhanced for
2. Which keyword is used for inheritance?
*
1 point
implements
extends
inherit
super
3. Which OOP concept allows method overloading?
*
1 point
Encapsulation
Abstraction
Polymorphism
Inheritance
4. Which collection allows duplicate elements?
*
1 point
HashSet
TreeSet
ArrayList
HashMap
5. Which collection stores key-value pairs?
*
1 point
ArrayList
HashMap
HashSet
LinkedList
6. Which statement exits a loop?
*
1 point
continue
return
break
stop
7. Which method adds an element to ArrayList?
*
1 point
insert()
push()
add()
append()
8. Which collection does not allow duplicate elements?
*
1 point
ArrayList
Vector
HashSet
LinkedList
9. Which keyword refers to the current object?
*
1 point
super
current
this
self
10. Constructors have:
*
1 point
void return type
int return type
No return type
Object return type
11. Which loop is preferred when iterations are known?
*
1 point
while
do-while
for
foreach
12. Which method returns ArrayList size?
*
1 point
length()
count()
size()
getSize()
13. Which access modifier provides maximum accessibility?
*
1 point
private
protected
default
public
14. Parent class of every Java class is:
*
1 point
Main
Parent
Object
Base
15. Which collection is unordered?
*
1 point
ArrayList
LinkedList
HashSet
Vector
1. What is the difference between while and do-while loop?
*
1 point
while and do-while have a subtle difference that while first checks condition and then runs and do-while first runs and then checks condition.
2. What is Encapsulation?
*
1 point
Encapsulation in OOPs is a method in which we encapsualte the class and show only that part to user which is necessary.
3. What is Constructor?
*
1 point
Constructor in java is a code which is used to initialize the new created objects.
4. Explain Inheritance.
*
1 point
Inheritaance in OOPs is a concept where we inherit a parent class in a child class which means that child can use parent's class methods.
5. What is Polymorphism?
*
1 point
Polymorphism in OOPs is a concept in which it tells how to use a specific class on based on methods in different scenarios, this helps in inheritance. 
6. Difference between ArrayList and HashSet.
*
1 point
ArrayList is ordered collection whereas HashSet is a unordered collection. Arraylist uses list interface and Hashset uses Set interface at core.
7. Write two advantages of OOP.
*
1 point
OOP helps us in writing code cleanly which helps us to organize code, 2- OOP helps us in Code Maintainence 
8. What is HashMap?
*
1 point
HashMap is a collection in java which uses Map interface at core, and it stores data in key value pairs.
9. Explain break statement.
*
1 point
Break statement is used for exiting a loop at the specific condition we want it to break.
10. Difference between this and super.
*
1 point
"this" keyword is used to access the arguments passed in the self class where as "super" keyword is use to accessing the elements in methods of the parent class.
1. Write a Java program to print numbers from 1 to 100 using a for loop.
*
1 point
public class NewClass {
    public static void main(String[] args){
        
            for(int i = 1; i < 101; i++){
                System.out.println(i);

            }
        }
    }
2. Write a Java program to print the multiplication table of a given number.
*
1 point
import java.util.*;
public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i < 11; i++){
            System.out.println(n*i);
        }
       
        
    }
}
3. Write a Java program to calculate factorial using a loop.
*
1 point
import java.util.*;
public class NewClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int fact = 1;
        while(n != 0){
            fact = fact * n;
            n--;
        }
    }
}
4. Create a Student class with name and marks using a constructor.
*
1 point
import java.util.*;
class NewClass{
    String name;
    int marks;
    NewClass(String n, int m){
        name = n;
        marks = m;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        NewClass student = new NewClass(name, marks);
        student.display();
        sc.close();
    }
}
5. Create an Employee class using private variables and getter/setter methods.
*
1 point
import java.util.Scanner;
class Employee {
    private String name;
    private int age;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("enter name: ");
        employee.setName(sc.nextLine());

        System.out.print("enter age: ");
        employee.setAge(sc.nextInt());
        sc.nextLine();

        System.out.println("employee Details:");
        System.out.println("name: " + employee.getName());
        System.out.println("age: " + employee.getAge());

        sc.close();
    }
}
6. Demonstrate method overloading using a Calculator class.
*
1 point
 
This is a required question
7. Create an ArrayList of Integers and print all even numbers.
*
1 point
8. Create a HashSet of Strings and remove duplicate names.
*
1 point
9. Create a HashMap of student names and marks and display all entries.
*
1 point
10. Demonstrate inheritance using Animal and Dog classes.
*
1 point
Never submit passwords through Google Forms.
This content is neither created nor endorsed by Google. - Contact form owner - Terms of Service - Privacy Policy
Does this form look suspicious? Report

Google Forms */