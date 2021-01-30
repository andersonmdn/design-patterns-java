package br.com.alura.store.budget.situation;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetSituation{
    public BigDecimal toCalcExtraDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void toFinish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
