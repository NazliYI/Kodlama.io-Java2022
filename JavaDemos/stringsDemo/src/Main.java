import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj = " Bugün hava çok güzel. ";
        System.out.println(mesaj);
       /* System.out.println(mesaj);
        System.out.println("Eleman sayısı :" + mesaj.length());
        //length mesajdaki karakter sayısını bulmamızı sağalr.
        System.out.println("5.eleman :" + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        //concat mesaj eklemek, yeni girilen mesajla hali hazırda bulunan mesajı birleştirmek için kullanılır.
        System.out.println(mesaj.startsWith("B"));
        //Mesaj B ile başlıyorsa true, başlamıyorsa false döndürür.
        System.out.println(mesaj.endsWith("B"));
        //Mesaj B ile bitiyorsa true, bitmiyorsa false döndürür.
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        //getChars istediğiniz bir kelimenin karakterlerini yazdırmak için kullanılır.
        System.out.println(mesaj.indexOf('a'));
        *//*indexOf yazdığımız karakterin mesaj içerisindeki kaçıncı karakter olduğunu bulmamızı sağlar.
         ilk bulduğu a yı ekrana yazar.*//*
        System.out.println(mesaj.lastIndexOf("e"));
        //Aynı özelliktir ama aramaya sağdan başlar.*/

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(mesaj.replace(' ', '-'));
        System.out.println(mesaj.substring(2, 5));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());//Mesajdaki tüm harfleri küçük yazar.
        System.out.println(mesaj.toUpperCase());//Mesajdaki tüm harfleri büyük yazar.
        System.out.println(mesaj.trim());//Mesajdaki tüm boşlukları ortadan kaldırır.


    }
}