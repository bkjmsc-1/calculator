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
        while(true){
        System.out.println("Enter the total cost of your house");
        houseCost = sc.nextInt();
        if(houseCost > 1_000 && houseCost <= 1_000_000)
            break;  
        System.out.println("Enter a number greater than 1,000 and less than 1,000,000");
        }
        return houseCost;
    }

    public int getDownPayment(){
        while(true){
        System.out.println("Enter the total downpayment you have paid");
        downPayment = sc.nextInt();
        if(downPayment >= 0 && downPayment < houseCost)
            break;
        System.out.println("The downpayment must be 0 or greater and less than the cost of the house.");    
        }
        return downPayment;
    }

    public double getYearlyPercentageInterest(){
        while(true){
        System.out.println("Enter the annual interest rate as a percentage value");
        yearlyPercentageInterest = sc.nextDouble();
        if(yearlyPercentageInterest > 0 && yearlyPercentageInterest< 100)
            break;
        System.out.println("Enter a number greater than 0 and less than 100.");
        }
        return yearlyPercentageInterest;
    }

    public int getLoanYearDuration(){
        while(true){
        System.out.println("Enter the amount of years your loan is for");
        loanYearDuration = sc.nextInt();
        if(loanYearDuration > 0 && loanYearDuration <= 70)
            break;
        System.out.println("Enter a number greater than 0 and less than or equal to 70.");
        }
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
