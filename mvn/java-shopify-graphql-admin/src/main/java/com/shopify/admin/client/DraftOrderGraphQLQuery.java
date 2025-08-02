package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a [draft order](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrder) by its ID.
 * A draft order is an order created by a merchant on behalf of their
 * customers. Draft orders contain all necessary order details (products, pricing, customer information)
 * but require payment to be accepted before they can be converted into
 * [completed orders](https://shopify.dev/docs/api/admin-graphql/latest/mutations/draftOrderComplete).
 *   
 * Use the `draftOrder` query to retrieve information associated with the following workflows:
 *   
 * - Creating orders for phone, in-person, or chat sales
 * - Sending invoices to customers with secure checkout links
 * - Managing custom items and additional costs
 * - Selling products at discount or wholesale rates
 * - Processing pre-orders and saving drafts for later completion
 *   
 * A draft order is associated with a
 * [customer](https://shopify.dev/docs/api/admin-graphql/latest/objects/Customer)
 * and contains multiple [line items](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrderLineItem).
 * Each draft order has a [status](https://shopify.dev/docs/api/admin-graphql/latest/objects/DraftOrder#field-DraftOrder.fields.status),
 * which indicates its progress through the sales workflow.
 */
public class DraftOrderGraphQLQuery extends GraphQLQuery {
  public DraftOrderGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public DraftOrderGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "draftOrder";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public DraftOrderGraphQLQuery build() {
      return new DraftOrderGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `DraftOrder` to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
