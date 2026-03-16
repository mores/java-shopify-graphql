package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderCaptureInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Captures payment for an authorized transaction on an order. Use this mutation to claim the money that was previously
 * reserved by an authorization transaction.
 *   
 * The `orderCapture` mutation can be used in the following scenarios:
 *   
 * - To capture the full amount of an authorized transaction
 * - To capture a partial payment by specifying an amount less than the total order amount
 * - To perform multiple captures on the same order, as long as the order transaction is
 * [multi-capturable](https://shopify.dev/docs/api/admin-graphql/latest/objects/ordertransaction#field-OrderTransaction.fields.multiCapturable)
 *   
 * > Note:
 * > Multi-capture functionality is only available to stores on a
 * [Shopify Plus plan](https://help.shopify.com/manual/intro-to-shopify/pricing-plans/plans-features/shopify-plus-plan).
 * For multi-currency orders, the [`currency`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderCapture#arguments-input.fields.currency)
 * field is required and should match the presentment currency from the order.
 *   
 * After capturing a payment, you can:
 *   
 * - View the transaction details including status, amount, and processing information.
 * - Track the captured amount in both shop and presentment currencies.
 * - Monitor the transaction's settlement status.
 *   
 * Learn more about [order transactions](https://shopify.dev/docs/api/admin-graphql/latest/objects/OrderTransaction).
 */
public class OrderCaptureGraphQLQuery extends GraphQLQuery {
  public OrderCaptureGraphQLQuery(OrderCaptureInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public OrderCaptureGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderCapture";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderCaptureInput input;

    private String queryName;

    public OrderCaptureGraphQLQuery build() {
      return new OrderCaptureGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input for the mutation.
     */
    public Builder input(OrderCaptureInput input) {
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
