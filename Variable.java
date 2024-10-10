public class Variable {
    public static void main(String[] args){
        int a = 10, b = 25, sum = a + b;
        int diff = b - a;
        int multi = a * b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(b + " - " + a + " = " + diff);
        System.out.println(a + " * " + b + " = " + multi);

        System.out.println("10 * 5 / 10 - 5 = " + (10 * 5 / 10 - 5));  // wrong way of writing 
        System.out.println("(10 * 5) / (10 - 5) = " + ((10 * 5) / (10 - 5))); // correct way of writing 
    }
}
