public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refull = 1100;
        int bonus = refull / 100;
        if (refull >= 1000) {
            bonus = 0;
        }
        System.out.println(bonus);

        int amount = account + refull + bonus;
        System.out.println(account);
    }
}