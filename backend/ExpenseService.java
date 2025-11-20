import java.util.ArrayList;
import java.util.List;

public class ExpenseService {

    // mock database
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(String title, String category, double amount, String date) {
        expenses.add(new Expense(title, category, amount, date));
    }

    public List<Expense> getAllExpenses() {
        return expenses;
    }
}

class Expense {
    String title, category, date;
    double amount;

    Expense(String title, String category, double amount, String date) {
        this.title = title;
        this.category = category;
        this.amount = amount;
        this.date = date;
    }
}
