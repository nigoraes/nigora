import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(walk(20,38));
        System.out.println(walk(22,-10));
        System.out.println(walk(40,25));
        System.out.println(walk(41,18));
        System.out.println(walk(40,-5));

        System.out.println(walk(generateRandomAge(),23));

    }

    public static String walk(int age, int temperature) {
       if ( age >=20 && age <=45 && temperature >= -20 && temperature <=30) {
           return "можно идти гулять";
       } else if ( age >=20 && temperature >= 0 && temperature <= 28){
           return "можно идти гулять ";
       } else if (age >=45 && temperature >= -10 && temperature <=25 ){
            return "можно идти гулять ";
        } else {
           return  "оставайтесь дома";
       }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(1, 100);

    }
      
        }



   }

