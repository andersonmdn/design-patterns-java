package br.com.alura.store.tax;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public interface Tax {
    BigDecimal calc(Budget budget);
}
