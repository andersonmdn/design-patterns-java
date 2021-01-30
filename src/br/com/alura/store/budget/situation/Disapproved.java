package br.com.alura.store.budget.situation;

import br.com.alura.store.budget.Budget;

public class Disapproved extends BudgetSituation{
    @Override
    public void toFinish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
