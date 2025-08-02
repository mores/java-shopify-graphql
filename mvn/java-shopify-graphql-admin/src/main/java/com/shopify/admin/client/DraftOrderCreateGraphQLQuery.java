package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DraftOrderInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [draft order](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrder)
 * with attributes such as customer information, line items, shipping and billing addresses, and payment terms.
 * Draft orders are useful for merchants that need to:
 *   
 * - Create new orders for sales made by phone, in person, by chat, or elsewhere.
 * When a merchant accepts payment for a draft order, an order is created.
 * - Send invoices to customers with a secure checkout link.
 * - Use custom items to represent additional costs or products not in inventory.
 * - Re-create orders manually from active sales channels.
 * - Sell products at discount or wholesale rates.
 * - Take pre-orders.
 *   
 * After creating a draft order, you can:
 * - Send an invoice to the customer using the [`draftOrderInvoiceSend`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderInvoiceSend) mutation.
 * - Complete the draft order using the [`draftOrderComplete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderComplete) mutation.
 * - Update the draft order using the [`draftOrderUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderUpdate) mutation.
 * - Duplicate a draft order using the [`draftOrderDuplicate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderDuplicate) mutation.
 * - Delete the draft order using the [`draftOrderDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderDelete) mutation.
 *   
 * > Note:
 * > When you create a draft order, you can't [reserve or hold inventory](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps#inventory-states)
 * for the items in the order by default.
 * > However, you can reserve inventory using the [`reserveInventoryUntil`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderCreate#arguments-input.fields.reserveInventoryUntil) input.
 */
public class DraftOrderCreateGraphQLQuery extends GraphQLQuery {
  public DraftOrderCreateGraphQLQuery(DraftOrderInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public DraftOrderCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DraftOrderInput input;

    private String queryName;

    public DraftOrderCreateGraphQLQuery build() {
      return new DraftOrderCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The fields used to create the draft order.
     */
    public Builder input(DraftOrderInput input) {
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
