package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountAmountGreaterThanFiveHundred extends Discount {
    public DiscountAmountGreaterThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal makeCalc(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean mustApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
