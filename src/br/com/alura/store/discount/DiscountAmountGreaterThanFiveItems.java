package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountAmountGreaterThanFiveItems extends Discount {

    public DiscountAmountGreaterThanFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal makeCalc(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean mustApply(Budget budget) {
        return budget.getCountItems() > 5;
    }
}
