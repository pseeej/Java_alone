public class AccountingApp {
    public static void main(String[] args) {

        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double dividend1 = (income) * 0.5;
        double dividend2 = (income) * 0.3;
        double dividend3 = (income) * 0.2;

        //Edit의 replace 하면 한 번에 바꿀 수 있음
        //선택하고 refractor -> introduce variables -> ~ 선택하면 같은 숫자 한꺼번에 다 바꿀 수 있음. 단축키는 ctrl alt v
        System.out.println("Value of supply : "+ valueOfSupply);
        System.out.println("VAT : "+ vat);
        System.out.println("Total : "+ total);
        System.out.println("Expense : "+ expense);
        System.out.println("Income : "+ income);
        System.out.println("Dividend1 : "+ dividend1);
        System.out.println("Dividend2 : "+ dividend2);
        System.out.println("Dividend3 : "+ dividend3);

    }
}
