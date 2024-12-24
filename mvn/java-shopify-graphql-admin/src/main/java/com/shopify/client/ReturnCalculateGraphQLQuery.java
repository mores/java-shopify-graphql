package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CalculateReturnInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ReturnCalculateGraphQLQuery extends GraphQLQuery {
  public ReturnCalculateGraphQLQuery(CalculateReturnInput input, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ReturnCalculateGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "returnCalculate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CalculateReturnInput input;

    private String queryName;

    public ReturnCalculateGraphQLQuery build() {
      return new ReturnCalculateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(CalculateReturnInput input) {
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
