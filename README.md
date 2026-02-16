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