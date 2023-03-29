package calculator;
import java.util.Scanner;

public class Loan {
    int houseCost = 0;
    int downPayment = 0;
    double yearlyPercentageInterest = 0;    
    double yearlyInterestRate = 0;
    double monthlyInterestRate = 0;
    int loanYearDuration = 0;
    int loanMonthDuration = 0;
    int principal = 0;
    double monthlyPayment = 0;
    Scanner sc = new Scanner(System.in);

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
        yearlyInterestRate = yearlyPercentageInterest/100;
        return yearlyInterestRate;
    }

    public double calcMonthlyInterest(){
        monthlyInterestRate = this.yearlyInterestRate/12;
        return monthlyInterestRate;
    }

    public int calcLoanMonthDuration(){
    
        loanMonthDuration = loanYearDuration * 12;
        return loanMonthDuration;
    }

    public int calcPrincipal(){
        principal = houseCost - downPayment;
        return principal;
    }

    public double calcMonthlyPayment(){
        monthlyPayment = (this.monthlyInterestRate * ((Math.pow(1 + this.monthlyInterestRate, this.loanMonthDuration))) / (Math.pow(1 + this.monthlyInterestRate, this.loanMonthDuration))*this.principal);
        return monthlyPayment;
    }

    public void getUserInfo(){
        getHouseCost();
        getDownPayment();
        calcPrincipal();
        getYearlyPercentageInterest();
        convertPercentage();
        calcMonthlyInterest();
        getLoanYearDuration();
        calcLoanMonthDuration();
  
        System.out.println(calcMonthlyPayment());
    }
    
}
