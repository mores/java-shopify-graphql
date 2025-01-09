package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The fulfillment constraint rules that belong to a shop.
 */
public class FulfillmentConstraintRulesGraphQLQuery extends GraphQLQuery {
  public FulfillmentConstraintRulesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public FulfillmentConstraintRulesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentConstraintRules";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public FulfillmentConstraintRulesGraphQLQuery build() {
      return new FulfillmentConstraintRulesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
