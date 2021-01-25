package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    public BigDecimal makeCalc(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean mustApply(Budget budget) {
        return true;
    }
}
