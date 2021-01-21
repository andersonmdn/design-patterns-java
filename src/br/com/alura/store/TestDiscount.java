package br.com.alura.store;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.discount.DiscountCalculator;

import java.math.BigDecimal;

public class TestDiscount {
    public static void main(String[] args) {
        Budget firstBudget = new Budget(new BigDecimal("200"), 4);
        Budget secondBudget = new Budget(new BigDecimal("1000"), 1);

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calc(firstBudget));
        System.out.println(calculator.calc(secondBudget));
    }
}
