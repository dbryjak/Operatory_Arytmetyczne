public class OperatoryArytmeryczne {
    public static void main(String[] args) {

        System.out.println(3 + 5);
        System.out.println(5 - 3);
        System.out.println(2 * 4);
        System.out.println(4 / 2);
        System.out.println(10 % 3);
        // % wynikiem jest tylko reszta z dzielenia
        // 10 / 3 = 3, gdyż 3*3=9, a 10 - 9 = 1 i ta 1 to ta reszta z dzielenia

        double a = 9;
        double b = 2;

        System.out.println("Dla a = 9 i b = 2 mamy ");
        double dodawanie = a + b;
        System.out.println("Dodawanie: " + dodawanie);
        double odejmowanie = a - b;
        System.out.println("Odejmowanie: " + odejmowanie);
        double mnozenie = a * b;
        System.out.println("Mnozenie: " + mnozenie);
        double dzielenie = a / b;
        System.out.println("Dzielenie: " + dzielenie); // wprowadziłem 'double' dla uzyskania wyniku z wartością po przecinku
        double resztaZDzielenia = a % b;
        System.out.println("Reszta z dzielenia: " + resztaZDzielenia);


        a += b; // inaczej a = a + b;
        System.out.println("a = a + b: " + a);
        // od tej pory a = 11
        a -= b; // inaczej a = a - b;
        System.out.println("a = a - b: " + a);
        // od tej pory a = 9
        a *= b;
        System.out.println("a = a * b: " + a);
        // od tej pory a = 18
        a /= b;
        System.out.println("a = a / b: " + a);
        // od tej pory a = 9
        a %= b;
        System.out.println("a = a % b: " + a);

        a = a + 1;
        System.out.println("a = a + 1: " + a);
        a += 1;
        System.out.println("a += 1: " + a);

        // --------------------------------------------------------
        // inkrementacja - zwiększanie wartości danej zmiennej o 1
        a++;
        System.out.println("a++: " + a);
        // dekrementacja - zmniejszenie wartości danej zmiennej  o 1
        a--;
        System.out.println("a--: " + a);

        ++a;
        System.out.println("++a: " + a);
        --a;
        System.out.println("--a: " + a);
        // a++ - najpierw pobiera daną wartość, a później '+' do niej 1
        // ++a - najpiwerw '+' 1 a póżniej pobiera danąwartość

    }
}
