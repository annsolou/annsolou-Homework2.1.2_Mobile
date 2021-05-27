public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int highBalance = 1100;
        int bonus = highBalance / 100;

        if (highBalance > 1000)
        {
            System.out.println(bonus);
        }
        if (highBalance < 1000)
        {
            bonus = 0;
        }

        int resultBalance = accountBalance + highBalance + bonus;

        System.out.println(resultBalance);
    }}