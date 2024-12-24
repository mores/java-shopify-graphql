package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MarketingActivityUpsertExternalInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MarketingActivityUpsertExternalGraphQLQuery extends GraphQLQuery {
  public MarketingActivityUpsertExternalGraphQLQuery(MarketingActivityUpsertExternalInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MarketingActivityUpsertExternalGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingActivityUpsertExternal";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MarketingActivityUpsertExternalInput input;

    private String queryName;

    public MarketingActivityUpsertExternalGraphQLQuery build() {
      return new MarketingActivityUpsertExternalGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(MarketingActivityUpsertExternalInput input) {
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
