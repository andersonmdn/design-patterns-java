package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {
    public BigDecimal calc(Budget budget) {
        Discount discount = new DiscountAmountGreaterThanFiveItems(
                new DiscountAmountGreaterThanFiveHundred(
                        new NoDiscount()
                )
        );

        return discount.calc(budget);
    }
}
