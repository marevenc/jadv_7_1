public class Credit {
    int sum;
    int term;
    double percent;

    public Credit(int sum, int term, double percent){
        this.sum = sum;
        this.term = term;
        this.percent = percent;
    }

    public int calcMonthlyPayment(){
        double i = percent * 0.01 / 12;
        double k = i * Math.pow((1 + i), term)/(Math.pow((1 + i), term) - 1);
        double res = k * sum;
        return (int) res;
    }

    public int calcCreditSum(){
        return this.calcMonthlyPayment() * term;
    }

    public int calcOverpayment(){
        return this.calcCreditSum() - sum;
    }
}
