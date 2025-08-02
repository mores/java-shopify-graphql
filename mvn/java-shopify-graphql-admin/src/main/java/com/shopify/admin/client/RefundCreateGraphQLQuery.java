package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.RefundInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a refund for an order, allowing you to process returns and issue payments back to customers.
 *   
 * Use the `refundCreate` mutation to programmatically process refunds in scenarios where you need to
 * return money to customers, such as when handling returns, processing chargebacks, or correcting
 * order errors.
 *   
 * The `refundCreate` mutation supports various refund scenarios:
 *   
 * - Refunding line items with optional restocking
 * - Refunding shipping costs
 * - Refunding duties and import taxes
 * - Refunding additional fees
 * - Processing refunds through different payment methods
 * - Issuing store credit refunds (when enabled)
 *   
 * You can create both full and partial refunds, and optionally allow over-refunding in specific
 * cases.
 *   
 * After creating a refund, you can track its status and details through the order's
 * [`refunds`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order#field-Order.fields.refunds)
 * field. The refund is associated with the order and can be used for reporting and reconciliation purposes.
 *   
 * Learn more about
 * [managing returns](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-management)
 * and [refunding duties](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/view-and-refund-duties).
 *   
 * > Note:
 * > The refunding behavior of the `refundCreate` mutation is similar to the
 * [`refundReturn`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/returnRefund)
 * mutation. The key difference is that the `refundCreate` mutation lets you to specify restocking behavior
 * for line items, whereas the `returnRefund` mutation focuses solely on handling the financial refund without
 * any restocking input.
 */
public class RefundCreateGraphQLQuery extends GraphQLQuery {
  public RefundCreateGraphQLQuery(RefundInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public RefundCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "refundCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private RefundInput input;

    private String queryName;

    public RefundCreateGraphQLQuery build() {
      return new RefundCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields that are used in the mutation for creating a refund.
     */
    public Builder input(RefundInput input) {
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
