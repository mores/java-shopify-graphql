package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MarketCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new market.
 */
public class MarketCreateGraphQLQuery extends GraphQLQuery {
  public MarketCreateGraphQLQuery(MarketCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MarketCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MarketCreateInput input;

    private String queryName;

    public MarketCreateGraphQLQuery build() {
      return new MarketCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The properties of the new market.
     */
    public Builder input(MarketCreateInput input) {
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
