package br.com.alura.store;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.order.GenerateOrder;
import br.com.alura.store.order.GenerateOrderHandler;
import br.com.alura.store.order.Order;
import br.com.alura.store.order.action.SaveDB;
import br.com.alura.store.order.action.SendEmail;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class OrderTest {
    public static void main(String[] args) {
        String client = "Rodrigo";
        BigDecimal budgetValue = new BigDecimal("300");
        int quantityItens = Integer.parseInt("2");

        GenerateOrder generateOrder = new GenerateOrder(client, budgetValue, quantityItens);
        GenerateOrderHandler handler = new GenerateOrderHandler(Arrays.asList(new SaveDB(), new SendEmail()));
        handler.execute(generateOrder);
    }
}
