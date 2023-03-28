package calculator;
import java.util.Scanner;

public class Loan {
    int houseCost;
    int downPayment;
    double yearlyPercentageInterest;    
    double yearlyInterestRate;
    double monthlyInterestRate;
    int loanYearDuration;
    int loanMonthDuration;
    int principal;
    double monthlyPayment;
    Scanner sc = new Scanner(System.in);

    public Loan(){
        this.houseCost = getHouseCost();
        this.downPayment = getDownPayment();
        this.yearlyPercentageInterest = getYearlyPercentageInterest();
        this.yearlyInterestRate = convertPercentage();
        this.loanYearDuration = getLoanYearDuration();
        this.loanMonthDuration = calcLoanMonthDuration();
        this.principal = calcPrincipal();
        this.monthlyInterestRate = calcMonthlyInterest();
        this.monthlyPayment = calcMonthlyPayment();
    }

    public int getHouseCost(){
        System.out.println("Enter the total cost of your house");
        houseCost = sc.nextInt();
        return houseCost;
    }

    public int getDownPayment(){
        System.out.println("Enter the total downpayment you have paid");
        downPayment = sc.nextInt();
        return downPayment;
    }

    public double getYearlyPercentageInterest(){
        System.out.println("Enter the annual interest rate as a percentage value");
        yearlyPercentageInterest = sc.nextDouble();
        return yearlyPercentageInterest;
    }

    public int getLoanYearDuration(){
        System.out.println("Enter the amount of years your loan is for");
        loanYearDuration = sc.nextInt();
        return loanYearDuration;
    }

     public double convertPercentage(){
        return yearlyPercentageInterest/100;
    }

    public double calcMonthlyInterest(){
        if(yearlyInterestRate <= 0 || yearlyInterestRate > 1)
        throw new IllegalArgumentException("The interest rate should be a decimal value greater than 0 and less than 1.");
        return yearlyInterestRate/12;
    }

    public int calcLoanMonthDuration(){
        if(loanYearDuration < 1 || loanYearDuration > 70)
        throw new IllegalArgumentException("Enter the number of years your loan is for. It should be greater than 1 and less than 70.");
        return loanYearDuration * 12;
    }

    public int calcPrincipal(){
        return houseCost - downPayment;
    }

    public double calcMonthlyPayment(){
        return (monthlyInterestRate * ((Math.pow(1 + monthlyInterestRate, loanMonthDuration))) / (Math.pow(1 + monthlyInterestRate, loanMonthDuration))*principal);
    }

    public void getUserInfo(){
        getHouseCost();
        getDownPayment();
        getYearlyPercentageInterest();
        getLoanYearDuration();
        System.out.println(calcMonthlyPayment());
    }
    
}
