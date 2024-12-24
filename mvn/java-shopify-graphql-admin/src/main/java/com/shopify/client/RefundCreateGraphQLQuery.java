package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.RefundInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class RefundCreateGraphQLQuery extends GraphQLQuery {
  public RefundCreateGraphQLQuery(RefundInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public RefundCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "refundCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private RefundInput input;

    private String queryName;

    public RefundCreateGraphQLQuery build() {
      return new RefundCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(RefundInput input) {
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
