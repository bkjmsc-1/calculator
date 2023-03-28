package calculator;

public class MortgageCalc{

    public static void main(String[] args){

        Loan customer1 = new Loan(500_000, 100_000, .05, 30);
        System.out.println(customer1.loanMonthDuration);
        System.out.println(customer1.monthlyInterestRate);
        System.out.println(customer1.principal);
        System.out.println(customer1.monthlyPayment);
    }

}