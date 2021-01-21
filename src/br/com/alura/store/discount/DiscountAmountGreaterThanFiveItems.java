package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountAmountGreaterThanFiveItems extends Discount {

    public DiscountAmountGreaterThanFiveItems(Discount next) {
        super(next);
    }

    @Override
    public BigDecimal calc(Budget budget) {
        if (budget.getCountItems() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        return next.calc(budget);
    }
}
