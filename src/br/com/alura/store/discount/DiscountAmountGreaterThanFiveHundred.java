package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountAmountGreaterThanFiveHundred extends Discount {
    public DiscountAmountGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal calc(Budget budget) {
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }

        return next.calc(budget);
    }
}
