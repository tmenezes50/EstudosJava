public class Time1Teste {
    public static void main(String[] args) {
        Time1 time = new Time1();

        displayTime("After time object is created", time);
        System.out.println();

        time.setTime(13, 27, 6);
        displayTime("After calling setTime ", time);

        try {
            time.setTime(99,99,99);

        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        displayTime("After calling setTime with invali values", time);
    }
    
    private static void displayTime(String header, Time1 t) {
        System.out.printf("%s%nUniversal Time: %s%nStandart time: %s%n", header, t.toUniversalString(), t.toString());
    }
}
