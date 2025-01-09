package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a Fulfillment resource by ID.
 */
public class FulfillmentGraphQLQuery extends GraphQLQuery {
  public FulfillmentGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public FulfillmentGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "fulfillment";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public FulfillmentGraphQLQuery build() {
      return new FulfillmentGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the Fulfillment to return.
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
