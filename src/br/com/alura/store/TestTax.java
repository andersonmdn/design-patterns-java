package br.com.alura.store;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.tax.ICMS;
import br.com.alura.store.tax.ISS;
import br.com.alura.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class TestTax {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        TaxCalculator calculator = new TaxCalculator();
        System.out.println(calculator.calc(budget, new ICMS()));
    }
}
