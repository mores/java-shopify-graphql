package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Completes a [draft order](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrder) and
 * converts it into a [regular order](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order).
 * The order appears in the merchant's orders list, and the customer can be notified about their order.
 *   
 * Use the `draftOrderComplete` mutation when a merchant is ready to finalize a draft order and create a real
 * order in their store. The `draftOrderComplete` mutation also supports sales channel attribution for tracking
 * order sources using the [`sourceName`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderComplete#arguments-sourceName)
 * argument, [cart validation](https://shopify.dev/docs/apps/build/checkout/cart-checkout-validation)
 * controls for app integrations, and detailed error reporting for failed completions.
 *   
 * You can complete a draft order with different [payment scenarios](https://help.shopify.com/manual/fulfillment/managing-orders/payments):
 *   
 * - Mark the order as paid immediately.
 * - Set the order as payment pending using [payment terms](https://shopify.dev/docs/api/admin-graphql/latest/objects/PaymentTerms).
 * - Specify a custom payment amount.
 * - Select a specific payment gateway.
 *   
 * > Note:
 * > When completing a draft order, inventory is [reserved](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps#inventory-states)
 * for the items in the order. This means the items will no longer be available for other customers to purchase.
 * Make sure to verify inventory availability before completing the draft order.
 */
public class DraftOrderCompleteGraphQLQuery extends GraphQLQuery {
  public DraftOrderCompleteGraphQLQuery(String id, String paymentGatewayId, String sourceName,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (paymentGatewayId != null || fieldsSet.contains("paymentGatewayId")) {
        getInput().put("paymentGatewayId", paymentGatewayId);
    }if (sourceName != null || fieldsSet.contains("sourceName")) {
        getInput().put("sourceName", sourceName);
    }
  }

  public DraftOrderCompleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderComplete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String paymentGatewayId;

    private String sourceName;

    private String queryName;

    public DraftOrderCompleteGraphQLQuery build() {
      return new DraftOrderCompleteGraphQLQuery(id, paymentGatewayId, sourceName, queryName, fieldsSet);
               
    }

    /**
     * The draft order to complete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The gateway for the completed draft order.
     */
    public Builder paymentGatewayId(String paymentGatewayId) {
      this.paymentGatewayId = paymentGatewayId;
      this.fieldsSet.add("paymentGatewayId");
      return this;
    }

    /**
     * A channel definition handle used for sales channel attribution.
     */
    public Builder sourceName(String sourceName) {
      this.sourceName = sourceName;
      this.fieldsSet.add("sourceName");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
