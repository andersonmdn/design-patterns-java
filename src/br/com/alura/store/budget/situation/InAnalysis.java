package br.com.alura.store.budget.situation;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class InAnalysis extends BudgetSituation{
    public BigDecimal calcExtraDiscount(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    public void toApproved(Budget budget) {
        budget.setSituation(new Approved());
    }

    public void toDisapproved(Budget budget) {
        budget.setSituation(new Disapproved());
    }
}
