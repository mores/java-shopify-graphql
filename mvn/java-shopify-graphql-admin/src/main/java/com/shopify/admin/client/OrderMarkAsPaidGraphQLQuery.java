package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderMarkAsPaidInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Marks an order as paid by recording a payment transaction for the outstanding amount.
 *   
 * Use the `orderMarkAsPaid` mutation to record payments received outside the standard checkout
 * process. The `orderMarkAsPaid` mutation is particularly useful in scenarios where:
 *   
 * - Orders were created with manual payment methods (cash on delivery, bank deposit, money order)
 * - Payments were received offline and need to be recorded in the system
 * - Previously authorized payments need to be captured manually
 * - Orders require manual payment reconciliation due to external payment processing
 *   
 * The mutation validates that the order can be marked as paid before processing.
 * An order can be marked as paid only if it has a positive outstanding balance and its
 * [financial status](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-Order.fields.displayFinancialStatus)
 * isn't already `PAID`. The mutation will either create a new sale transaction for the full
 * outstanding amount or capture an existing authorized transaction, depending on the order's current payment state.
 *   
 * After successfully marking an order as paid, the order's financial status is updated to
 * reflect the payment, and payment events are logged for tracking and analytics
 * purposes.
 *   
 * Learn more about [managing orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps)
 * in apps.
 */
public class OrderMarkAsPaidGraphQLQuery extends GraphQLQuery {
  public OrderMarkAsPaidGraphQLQuery(OrderMarkAsPaidInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public OrderMarkAsPaidGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderMarkAsPaid";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderMarkAsPaidInput input;

    private String queryName;

    public OrderMarkAsPaidGraphQLQuery build() {
      return new OrderMarkAsPaidGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input for the mutation.
     */
    public Builder input(OrderMarkAsPaidInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
