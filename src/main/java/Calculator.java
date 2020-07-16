public class Calculator {
    private String name;

    public Calculator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int sum( int a, int b){
        System.out.println("The sum of the numbers" + a+b);
        return a+b;
    }

    public int substraction(int c, int d){
        return c-d;
    }

    public int multiplication(int x, int y){
        return x*y;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator("ab");
        System.out.println(calculator.multiplication(5,3));
    }
}
