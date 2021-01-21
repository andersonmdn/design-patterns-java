package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calc(Budget budget) {
        if (budget.getCountItems() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
}
