import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Введите сумму кредита, если хотите выйти, введите end");
            String line = scanner.nextLine();
            if(line.equals("end")) break;
            int sum = Integer.parseInt(line);

            System.out.println("Введите срок кредита в месяцах");
            String strTerm = scanner.nextLine();
            int term = Integer.parseInt(strTerm);

            System.out.println("Введите ставку в процентах");
            String strPercent = scanner.nextLine();
            double percent = Double.parseDouble(strPercent);

            System.out.println(sum + " " +  term + " " + percent);

            Credit credit = new Credit(sum, term, percent);
            System.out.println("Ежемесячный платеж: " + credit.calcMonthlyPayment());
            System.out.println("Переплата по кредиту: " + credit.calcOverpayment());
            System.out.println("Общая выплата: " + credit.calcCreditSum());
        }
    }
}
