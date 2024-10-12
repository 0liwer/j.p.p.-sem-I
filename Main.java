public class Main {
    public static void main(String[] args) {
        System.out.println("Hello word");

        int number = 5;

        number = 3;
        number -= 10;

        System.out.println(number);

        int a = 5;
        int b = 7;
        int sum = a + b;
        System.out.println(sum);

        float myFirstNumber = 3.3f;
        float mySecondNumber = 5.2f;
        float mySum = myFirstNumber / mySecondNumber;

        System.out.println(mySum);

        boolean Value1 = true;
        boolean Value2 = false;
        boolean myResult = (Value1 || Value2);

        System.out.print(myResult);

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");


        }
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            ++i;
        }
        System.out.println("Licznik pętli: " + i);
    }

}