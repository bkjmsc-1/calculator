package calculator;

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

    public Loan(int houseCost, int downPayment, double yearlyInterestRate, int loanYearDuration){
        this.houseCost = houseCost;
        this.downPayment = downPayment;
        this.yearlyInterestRate = yearlyInterestRate;
        this.loanYearDuration = loanYearDuration;
        this.loanMonthDuration = calcLoanMonthDuration();
        this.principal = calcPrincipal();
        this.monthlyInterestRate = calcMonthlyInterest();
        this.monthlyPayment = calcMonthlyPayment();
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
}
