package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a [`SubscriptionContract`](https://shopify.dev/docs/api/customer/latest/objects/SubscriptionContract) by ID.
 *   
 * The contract tracks the subscription's lifecycle through various [statuses](https://shopify.dev/docs/api/admin-graphql/latest/queries/subscriptionContract#returns-SubscriptionContract.fields.status),
 * and links to related billing attempts, generated
 * [`Order`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order)
 * objects, and the customer's [`CustomerPaymentMethod`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CustomerPaymentMethod).
 */
public class SubscriptionContractGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public SubscriptionContractGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContract";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public SubscriptionContractGraphQLQuery build() {
      return new SubscriptionContractGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the Subscription Contract to return.
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
