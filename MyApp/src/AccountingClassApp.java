class Accounting{
    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;


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

public class AccountingClassApp {


    public static void main(String[] args) {
        //class는 서로 연관된 변수, method를 그룹화하는 것이고, 이에 이름을 짓는 것

//        //Accounting.으로 소속 관계 제대로 밝힘
//        Accounting.valueOfSupply = 10000.0;
//        Accounting.vatRate = 0.1;
//        Accounting.expenseRate = 0.3;
//        Accounting.print();

        //instance 이용
        //instance는 하나의 class를 복제해서 서로 다른 data의 값과 서로 같은 method를 이용하는 것
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();

        Accounting a2 = new Accounting();
        a2.valueOfSupply = 20000.0;
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();

        a1.print();
    }

}
