public class Main {
    public static void main(String[] args) {
        int number = 25;
        int remainder = number % 2;

        System.out.println(remainder);
        boolean isPrime = true;
        //isPrime kullanarak varsayım üzerinden kodumuzu çalıştırıyoruz.
        if (number == 1) {
            System.out.print("Sayı Asal Değildir.");
            return;
        }
        if (number < 1) {
            System.out.print("Geçersiz Sayı!");
        }
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }

        }
        if (isPrime) {
            System.out.print("Sayı Asaldır.");

        } else {
            System.out.print("Sayı Asal Değildir.");
        }


    }
}