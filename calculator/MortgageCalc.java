package calculator;

public class MortgageCalc{
    public static void main(String[] args){
        Loan customer1 = new Loan();
        customer1.getUserInfo();
        System.out.println("The down payment is: " + customer1.downPayment);
        System.out.println("The cost of the house is: " + customer1.houseCost);
        System.out.println("This is the yearly interest as a percent: " + customer1.yearlyPercentageInterest);
        System.out.println("This is the yearly interest rate as a decimal: " + customer1.yearlyInterestRate);
        System.out.println("This is the monthly interest rate: " + customer1.monthlyInterestRate);
        System.out.println("This is the loan year duration: " + customer1.loanYearDuration);
        System.out.println("This is the loan month duration: " + customer1.loanMonthDuration);
        System.out.println("This is the principal " + customer1.principal);
        System.out.println("This is the monthly payment " + customer1.monthlyPayment);
    }
}