package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MarketingActivityCreateExternalInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MarketingActivityCreateExternalGraphQLQuery extends GraphQLQuery {
  public MarketingActivityCreateExternalGraphQLQuery(MarketingActivityCreateExternalInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MarketingActivityCreateExternalGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingActivityCreateExternal";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MarketingActivityCreateExternalInput input;

    private String queryName;

    public MarketingActivityCreateExternalGraphQLQuery build() {
      return new MarketingActivityCreateExternalGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(MarketingActivityCreateExternalInput input) {
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
