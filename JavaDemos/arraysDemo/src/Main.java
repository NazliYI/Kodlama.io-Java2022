public class Main {
    public static void main(String[] args) {
        String ogrenci1="Engin";
        String ogrenci2="Deniz";
        String ogrenci3="Çisel";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

      System.out.println("----------------------------");

        String[] ogrenciler = new String[3];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Deniz";
        ogrenciler[2]="Çisel";

        for (int i=0;i<ogrenciler.length;i++){
            //Küçüktür öğrenciler deme sebebi indexlerin 0'dan başlamasıdır.
            System.out.println(ogrenciler[i]);

        }

        System.out.println("----------------------------");
        for (String ogrenci:ogrenciler){ //Öğrenciler dizisindeki her bir elemanı gez.
            System.out.println(ogrenci);

        }
    }
}