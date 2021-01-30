public class AccountingMethodApp {
    //refractor -> introduce field로 전역변수 선언
    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;

    public static void main(String[] args) {
        valueOfSupply = 10000.0;
        vatRate = 0.1;
        expenseRate = 0.3;

//        //refractor -> extract method 하면 만들어짐
//        double vat = getVat();     //만들어진 method 호출, 실행 코드
//        double total = getTotal();
//        double expense = getExpense();
//        double income = getIncome();
//        double dividend1 = getDividend1();
//        double dividend2 = getDividend2();
//        double dividend3 = getDividend3();

        print();

    }
    
    //method 정의 코드

    public static void print() {
        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : "+ getVat());
        System.out.println("Total : "+ getTotal());
        System.out.println("Expense : "+ getTotal());
        System.out.println("Income : "+ getIncome());
        System.out.println("Dividend1 : "+ getDividend1());
        System.out.println("Dividend2 : "+ getDividend2());
        System.out.println("Dividend3 : "+ getDividend3());
    }

    public static double getDividend3() {
        return getIncome() * 0.2;
    }

    public static double getDividend2() {
        return getIncome() * 0.3;
    }

    public static double getDividend1() {
        return getIncome() * 0.5;
    }

    public static double getIncome() {
        return valueOfSupply - getExpense();
    }

    public static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public static double getTotal() {
        return valueOfSupply * getVat();
    }

    public static double getVat() {    //method 정의 코드
        return vatRate;
    }
}
