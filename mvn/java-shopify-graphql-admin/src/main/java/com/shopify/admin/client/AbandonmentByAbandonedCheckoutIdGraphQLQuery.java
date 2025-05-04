package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns an Abandonment by the Abandoned Checkout ID.
 */
public class AbandonmentByAbandonedCheckoutIdGraphQLQuery extends GraphQLQuery {
  public AbandonmentByAbandonedCheckoutIdGraphQLQuery(String abandonedCheckoutId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (abandonedCheckoutId != null || fieldsSet.contains("abandonedCheckoutId")) {
        getInput().put("abandonedCheckoutId", abandonedCheckoutId);
    }
  }

  public AbandonmentByAbandonedCheckoutIdGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "abandonmentByAbandonedCheckoutId";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String abandonedCheckoutId;

    private String queryName;

    public AbandonmentByAbandonedCheckoutIdGraphQLQuery build() {
      return new AbandonmentByAbandonedCheckoutIdGraphQLQuery(abandonedCheckoutId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the Abandoned Checkout ID to query by.
     */
    public Builder abandonedCheckoutId(String abandonedCheckoutId) {
      this.abandonedCheckoutId = abandonedCheckoutId;
      this.fieldsSet.add("abandonedCheckoutId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
