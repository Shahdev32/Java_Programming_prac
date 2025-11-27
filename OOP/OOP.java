package OOP;

public class OOP {
    public static void main(String[] args) {
//         Calculator c1 = new Calculator();

// System.out.println(c1.sum(1, 2));              // int sum
// System.out.println(c1.sum(3.5f, 4.6f));        // float sum
// System.out.println(c1.sum(1, 2, 3));
         
        // Pen p1 = new Pen(); // created pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        
    //     BankAccount = myAcc = new BankAccount();
    //     myAcc.userName= "Kumar";
    //  //   myAcc.password="dfdf";  not possible
    //  myAcc.setPassword("dfdfd"); // we can only chage but not see.



    // getter and setter
//   Pen p1 = new Pen();
//   p1.setColor("blue");
//   System.out.println(p1.getColor());
//   p1.setTip(5);
//   System.out.println(p1.getTip());
//   p1.setColor("yellow");
//   System.out.println(p1.getColor());
 

//   Student s1  = new Student();
// //  System.out.println(s1.name);

// Student s2= new Student("Shahdev");
// System.out.println(s2.name);
// Student s3 = new Student(123);
// System.out.println(s3.roll);


//  Student s1 = new Student();
//  s1.name="Kuamr";
//  s1.roll = 5;
//  s1.password = "abc";
//  s1.marks[0]= 100;
//  s1.marks[1]=88;
//  s1.marks[2]=54;
//  Student s2 = new Student(s1); // s1 is copy into copy2
// s2.password = "xyz";
// s2.marks[2]=11;
// for(int i=0;i<3;i++){
//     System.out.println(s2.marks[i]);
// }




//    Fish shark = new Fish();
//    shark.eat();




//   Dog g = new Dog();
//   g.eat();
//   g.legs=4;
//   System.out.println(g.legs);



//   Fish s1 = new Fish();
//   s1.eat();


 
// Deer d = new Deer();
// d.eat();



//  Horse h = new Horse();
//  h.eat();
//  h.walk();


//  Chicken c = new Chicken();
//  c.eat();
//  h.walk();
//  System.out.println((h.color));

//  Mustang my = new Mustang();
//  // animl. horse. mustang



//    Queen q = new Queen();
//    q.moves();


//  Student s1 = new Student();
//  s1.SchoolName="JMV";
 
//  Student s2 = new Student();
//  System.out.println(s2.SchoolName);

//  Student s3 = new Student();
//  s3.SchoolName="ABC";



 Horse h  = new Horse();
 System.out.println(h.color);

 
    }
}




//super keyword
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constustor is called");
    }

}

class Horse   extends Animal{
    Horse(){
        super.color= "Brown";
       // super();
        System.out.println("HOrse consturosi is called");
    }
}











// statics keyword
// public class Student {
//     static int percentage(int eng, int math, int chem){
//         return (eng+math+chem)/3;


//     }
//     String name ;
//     int roll;
//     static String SchoolName;

//     String setName(String name){
//         return  this.name = name;
//     }
//     String getName(String name){
//         return this.name;
//     }
    
    
// }











// interfaces
// interface ChessPlayer {
//     void moves();
// }

// class Queen implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right, diagonal all sides");
//     }
// }

// class Rook implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right");
//     }
// }

// class King implements ChessPlayer {
//     public void moves() {
//         System.out.println("up, down, left, right, diagonal by one step");
//     }
// }

// mutltiples interfaces
//  inteface carnivoris{

//  }
// interface  Harbivoris{

//  }

//  class Bear implements carnivoris,Harbivoris{

//  }


  
// abstract class Animal {

//      String color ;
//      Animal(){
//         //color= "Brown";
//         System.out.println("Animal construtor are called");
//      }
//     // non abstarct method
//     void eat(){
//         System.out.println("animal eats");
//     }
//     // abstract method (in this no definiton)
//     abstract void walk();
// }
 
//  class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse constrcutor called");
//     }
//     void changeColor(){
//         color = "Gray";
//     }
//     void walk(){
//         System.out.println("walk on four legs");
//     }
//  }

//  class Chicken extends Animal{
//     void changeColor(){
//         color = "yellow";
//     }
//     void walk(){
//         System.out.println("walk on two legs");
//     }
//  }

//  class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang construcot called");
//     }
//  }



// method overridng
//   class Animal{
//    void eat(){
//         System.out.println("Eat");
//     }
//   }

//   class Deer extends Animal{
//   void  eat(){
//         System.out.println("Eat Grass");
//     }
//   }


// method overloading
// class Calculator {
//     int sum(int a, int b) {
//         return a + b;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }


//Base class
//  class Animal{
//     String color;

//     void eat(){
//         System.out.println("Eat");
//     }
//     void breath(){
//         System.out.println("Breath");
//     }

//  } 
   // multilevel inheretince
//   class Mamals extends Animal{
//     int legs;

//   }

//   class Dog extends Mamals{
//     String bread;
//   }


  //heriracl inhertance
//   class Mamals extends Animal{
//     void walk(){
//         System.out.println("WALK");
//     }
//   }

//   class Fish extends Animal{
//     void swim(){
//         System.out.println("swim");
//     }
//   }
//   class Bird extends Animal{
//     void fly(){
//         System.out.println("fly");
//     }
//   }

//  // Dervied class or sub class
 
//   class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swim in water");
//     }
//   }



// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];

     


// copy constructor 

    //  shallow copy constructor
    //  Student(Student s1){
    //    marks = new int[3];
    //     this.name=name;
    //     this.roll= roll;
    //     this.marks=marks;
        
    //  }

     // deep copy constrctor
//    Student(Student s1){
//     marks = new int[3];
//     this.name=name;
//     this.roll= roll;
//     for(int i =0;i<3;i++){
//         this.marks[i]=s1.marks[i];

//     }
//    }

    //Non parametezied constructor
//     Student(){
//         // this is constuctor
//        // this.name=name;
//        marks = new int[3];
//        System.out.println("constructor is called");
//     }
//     //paramaterzied constructor
//     Student(String name){
//         marks = new int[3];
//         this.name = name;

//     }
//     Student(int roll){
//         marks = new int[3];
//         this.roll= roll;

//     }
// }


//  class BankAccount(){
    
//    public String userName;
//    private String password;

//    public void setPassword(String pwd){
//     password = pwd;

//    }

//  }



//  class  Pen {
//  // properties and function
//  private String  color ;
//  private  int tip;
 
//     String getColor(){
//         return this.color;

//     }
//     int getTip(){
//         return this.tip;
//     }

//   void setColor(String newColor){
//    this.color= newColor;

//   }

//   void setTip(int newTip){
//     tip = newTip;
    
//   }
    
// }



//  class  Student {
//     String name;
//     int age;
//     float percentage;

//     void calcualePercetage(int phy, int che, int math){
//         percentage = (phy+che+math)/3;

//     }
    
// }
