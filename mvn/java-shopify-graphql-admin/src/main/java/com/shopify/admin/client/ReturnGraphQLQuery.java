package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a return by its ID. A return represents the intent of a buyer to ship one or more items from an
 * order back to a merchant or a third-party fulfillment location.
 *   
 * Use the `return` query to retrieve information associated with the following workflows:
 *   
 * - [Managing returns](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-management)
 * - [Processing exchanges](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-exchanges)
 * - [Tracking reverse fulfillment orders](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-reverse-fulfillment-orders)
 *   
 * A return is associated with an
 * [order](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order)
 * and can include multiple return [line items](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem).
 * Each return has a [status](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps#return-statuses),
 * which indicates the state of the return.
 */
public class ReturnGraphQLQuery extends GraphQLQuery {
  public ReturnGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ReturnGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "return";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ReturnGraphQLQuery build() {
      return new ReturnGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The [globally-unique ID](https://shopify.dev/docs/api/usage/gids)
     * of the return to retrieve.
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
