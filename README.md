## javatrain - IamSamk
# demo.java is the Hello world program in Java
# HelloWorld.class is a .class file after running
  '
    javac demo.java
  '
# To run the .class file, use the command
    '
        java HelloWorld
    '
# Methodless.java - No method used all operation performed in main method/function
# Method.java - Same thing but used methods

# You always consider the file name with the class name where main function is present.
# Once aray is created size cannot be changed.


prob1-7 are class problems

# new is a a keyword to allot space in heap memory similiar to malloc in C/C++.
# the syntax for object creation is
    '
        class_name object_name = new class_name();
    '
day2 = lab2 :]

# Constructor is a special method which is used to initialize the object.
# It has the same name as that of the class and it does not have any return type
# if no constructor is defined JVM provides a default constructor.A default constructor is a constructor which does not take any parameters and it initializes the instance variables with default values. For example, if we have an instance variable of type int, it will be initialized with 0 and if we have an instance variable of type String, it will be initialized with null.

# When an object is created, the constructor is called and it initializes the calues in the object.

Example :

class demo
{
    int x;
    string s;
    pvsm(-----){
        demo d = new demo(); // constructor is called here where x = 0  and s = null
    }
}

# variable shadowing is a concept where the local variable has the same name as that of the instance variable. In this case, the local variable will shadow the instance variable and we cannot access the instance variable directly. To access the instance variable, we can use the keyword "this".

Example:

class students{
    int roll_no;
    string student_name;
    students(int roll_no,string student_name){         // **This is the constructor of the class students which is used to initialize the values of roll_no and student_name. **
        roll_no = roll_no; //Here roll_no is the local variable and it is shadowing the instance variable roll_no.
        student_name = student_name; //Here student_name is the local variable and it is shadowing the instance variable student_name.
        this.roll_no = roll_no; //Here we are using this keyword to access the instance variable roll_no.
        this.student_name = student_name; //Here we are using this keyword to access the instance
    }
    students s1= new students(1,"Samk"); //Here we are creating an object of the class students and passing the values to the constructor.
}

# for(int i = 0; i < 5; i++);
# {
#     System.out.println("JAVA");
# } //Here output JAVA will print once because of the semicolon as semicolon indicates end of statement and the block of code will be executed only once.

# Scanner(System.in) is used to take input from the user. It is a class in java.util package and it is used to read the input from the console. It has various methods to read different types of input like nextInt(), nextLine(), nextDouble() etc. System.in is an input stream which is used to read the input from the console. It is a standard input stream and it is used to read the input from the keyboard.The other options to put there are System.out and System.err which are used to print the output to the console and to print the error messages to the console respectively.System is class here and in is a field or Static reference variable, out and err of input stream class.


# sc.close(); is used to close the scanner object and it is a good practice to close the scanner object after use to free up the resources. It is also used to prevent memory leaks. If we do not close the scanner object, it will keep on consuming the memory and it may lead to memory leaks.

#Runtime polymorphism is a concept where the method to be called is determined at runtime. It is also known as dynamic method dispatch. It is achieved through method overriding. Method overriding is a concept where a subclass provides a specific implementation of a method that is already provided by its superclass. The method in the subclass should have the same name, return type and parameters as that of the method in the superclass. When we create an object of the subclass and call the method, the method in the subclass will be called instead of the method in the superclass. This is because at runtime, JVM determines which method to call based on the type of object that is being referred to by the reference variable.
Example :

class A{
    void display(){
        System.out.println("This is class A");
    }
}
class B extends A{
    void display(){
        System.out.println("This is class B");
    }
}
class main{
    public static void main(String[] args){
        A a = new B(); // Here we are creating an object of class B and referring it to a reference variable of class A. This is called upcasting.
        a.display(); // Here at runtime, JVM will determine which method to call based on the type of object that is being referred to by the reference variable. Since the reference variable is of type A and it is referring to an object of type B, the method in class B will be called. This is runtime polymorphism.
        B b = (B)a; // Here we are downcasting the reference variable a to reference variable b of type B. This is called downcasting.
    }
}

compile time polymorphism is a concept where the method to be called is determined at compile time. It is also known as static method dispatch. It is achieved through method overloading. Method overloading is a concept where a class has more than one method with the same name but different parameters. The method to be called is determined at compile time based on the number and type of parameters passed to the method.
For example :
class A{
    void display(int a){
        System.out.println("This is method with one parameter: " + a);
    }
    void display(int a, int b){
        System.out.println("This is method with two parameters: " + a + " and " + b);
    }
}
class main{
    public static void main(String[] args){
        A a = new A();
        a.display(5); // Here at compile time, the method to be called is determined based on the number and type of parameters passed to the method. Since we are passing one parameter of type int, the method with one parameter will be called.
        a.display(5, 10); // Here at compile time, the method to be called is determined based on the number and type of parameters passed to the method. Since we are passing two parameters of type int, the method with two parameters will be called.
    }
}

inheritance is a concept where a new class is derived from an existing class. The new class is called subclass or child class and the existing class is called superclass or parent class. The subclass inherits the properties and behaviors of the superclass and it can also have its own properties and behaviors. Inheritance promotes code reusability and it also helps in achieving runtime polymorphism.


# Consider this roject structure

Project
|-- src
    | -- Package1
        |-- Class1.java
        |-- Class2.java
    | -- Package2
        |-- Class3.java
        |-- Class4.java

# In this project structure, we have two packages Package1 and Package2. Each package contains two classes. To access the classes in the other package, we need to import the package using the import statement. For example, if we want to access Class3 in Package2 from Class1 in Package1, we need to import Package2 in Class1 using the following statement:
    '
        import Package2.Class3;
    '

If you want to import all the classes in Package2, you can use the following statement:
    '
        import Package2.*;
    '

For objects
package1.class1 obj = new package1.class1();

# Access modifiers are used to restrict the access of the members of a class. There are four types of access modifiers in Java:
1. public: The members of a class declared as public can be accessed from anywhere in the program.
2. private: The members of a class declared as private can only be accessed within the same class.
3. protected: The members of a class declared as protected can be accessed within the same package and also by the subclasses in other packages.
4. default: The members of a class declared without any access modifier are called default members and they can be accessed within the same package only.

# For a protected class

Imagine c1 is a protected class and the code is like

Package package1;
import package1.c1; // A specific class is imported here

class c2 extends c1 
{
    // code
}


# for classes with final they cannot be imported and cannot be extended

#Encapsulation is a concept where the data members of a class are hidden from the outside world and can only be accessed through the member functions of the class. It is achieved through access modifiers. The data members of a class are declared as private and the member functions are declared as public. This way, we can control the access to the data members and we can also protect the data from unauthorized access.

Example:

class EncapsulationExample {
    private int data; // data member is declared as private

    public void setData(int data) { // setter method to set the value of data
        this.data = data;
    }

    public int getData() { // getter method to get the value of data
        return data;
    }
}

class main {
    public static void main(String[] args) {
        EncapsulationExample obj = new EncapsulationExample();
        obj.setData(10); // setting the value of data using setter method
        System.out.println("The value of data is: " + obj.getData()); // getting the value of data using getter method
    }
}


# Concrete method

These are the methods which have a body and they are implemented in the class. They can be called using the object of the class.
Concrete class is a class which has at least one concrete method. It can be instantiated and we can create objects of it.

# Abstract class

These are the classes which have at least one abstract method. An abstract method is a method which is declared without any implementation. Abstract classes cannot be instantiated and we cannot create objects of it. They are used to achieve abstraction in Java.

# If there is an abstract class and concrete class then the class will be abstract class. If there is neither it will be concrete class. If there is only abstract method then it will be abstract class. If there is only concrete method then it will be concrete class.

Consider a code block where there is an abstract class A with two abstract methods void print1 and void print 2 and a normal void print3 which is not abstract.
Now a class B extends A and there is a method called void print1 with code in the body of the method. So what will be the type of class B?

Code :

abstract class A {
    abstract void print1();
    abstract void print2();
    void print3() {
        System.out.println("This is a concrete method in abstract class A");
    }
}

class B extends A {
    void print1() {
        System.out.println("This is the implementation of print1 method in class B");
    }
}

So class B will be an abstract class because it has one abstract method print2 which is not implemented in class B. If we want to make class B a concrete class, we need to implement the print2 method in class B.