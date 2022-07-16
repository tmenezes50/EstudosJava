import java.security.*;

public class RollDie {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] frequenty = new int[6];

        for(int i = 0; i < 6; i++) {
            frequenty[i] = 1 + random.nextInt(60);      }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        for(int i = 0; i < frequenty.length; i++)
        {
            System.out.printf("%d%10d%n", i, frequenty[i]);
        }
    }
}
