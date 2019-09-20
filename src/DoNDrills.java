public class DoNDrills {

    public static void main(String[] args) {
        for (int num = 0; num < 10; num++) {
            System.out.println(num);
        }
        for (int num = 10; num > -1; num--) {
            System.out.println(num);
        }
        for (int num = 1; num <= 256; num = num * 2) {
            System.out.println(num);
        }
        for (int num = 1; num <= 256; num *= 2) {
            System.out.println(num - 1);
        }
    }
}
