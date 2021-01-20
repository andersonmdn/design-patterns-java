package br.com.alura.store.tax;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class ICMS implements Tax {
    public BigDecimal calc(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
