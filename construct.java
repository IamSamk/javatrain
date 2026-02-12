class construct {
    int roll_no;
    String student_name;
    construct(int roll_no,String student_name){         // **This is the constructor of the class students which is used to initialize the values of roll_no and student_name. **
        roll_no = roll_no; //Here roll_no is the local variable and it is shadowing the instance variable roll_no.
        student_name = student_name; //Here student_name is the local variable and it is shadowing the instance variable student_name.
        this.roll_no = roll_no; //Here we are using this keyword to access the instance variable roll_no.
        this.student_name = student_name; //Here we are using this keyword to access the instance
        System.out.println("Roll No: " + roll_no);
        System.out.println("Student Name: " + student_name);
    }
    public static void main(String[] args) {
        construct s1= new construct(1,"Samk"); //Here we are creating an object of the class students and passing the values to the constructor.
    }
    
}