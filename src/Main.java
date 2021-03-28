public class Main {
    public static void main(String[] args) {
        int refull = 6300;
        int bonus = refull / 100;
        if (refull <= 1000) {
            bonus = 0;
        }
        System.out.println(bonus);
        int account = bonus + refull;
    System.out.println(account);
    }
}
