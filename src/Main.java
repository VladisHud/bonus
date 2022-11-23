public class Main {
    public static void main(String[] args) {

        int repamount = 2000;
        int amount = 100;
        int bonus;
        if (repamount > 1000) {
             bonus = (repamount / 100);
            int finamount = (amount + repamount + bonus);
            System.out.println(finamount);
            System.out.println(bonus);
        }
        
    }
}