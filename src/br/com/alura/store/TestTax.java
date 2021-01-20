package br.com.alura.store;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.tax.TaxCalculator;
import br.com.alura.store.tax.TypeTax;

import java.math.BigDecimal;

public class TestTax {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator calculator = new TaxCalculator();
        System.out.println(calculator.calc(budget, TypeTax.ISS));
    }
}
