package br.com.alura.store.tax;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {
    public BigDecimal calc(Budget budget, Tax tax) {
        return tax.calc(budget);
    }
}
