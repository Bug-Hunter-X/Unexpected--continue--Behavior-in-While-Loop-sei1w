public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                i++; // Increment i here to prevent an infinite loop if the continue condition changes unexpectedly 
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}