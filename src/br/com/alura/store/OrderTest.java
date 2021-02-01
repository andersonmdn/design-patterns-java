package br.com.alura.store;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.order.GenerateOrder;
import br.com.alura.store.order.GenerateOrderHandler;
import br.com.alura.store.order.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderTest {
    public static void main(String[] args) {
        String client = args[0];
        BigDecimal budgetValue = new BigDecimal(args[1]);
        int quantityItens = Integer.parseInt(args[2]);

        GenerateOrder generateOrder = new GenerateOrder(client, budgetValue, quantityItens);
        GenerateOrderHandler handler = new GenerateOrderHandler(/* Dependencies */);
        handler.execute(generateOrder);
    }
}
