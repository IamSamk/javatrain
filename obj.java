class cal{
    String name = "Java";
    public static int cal(int a,int b){
        return a + b;
    }    
}
class obj{
    public static void main(String args[]){
        cal obj1 = new cal();
        System.out.println("Name: " + obj1.name);
        int result = cal.cal(5, 10);
        System.out.println("Sum: " + result);
    }
}