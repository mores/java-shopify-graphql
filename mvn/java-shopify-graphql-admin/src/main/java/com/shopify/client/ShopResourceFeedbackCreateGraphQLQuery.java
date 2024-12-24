package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ResourceFeedbackCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ShopResourceFeedbackCreateGraphQLQuery extends GraphQLQuery {
  public ShopResourceFeedbackCreateGraphQLQuery(ResourceFeedbackCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ShopResourceFeedbackCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopResourceFeedbackCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ResourceFeedbackCreateInput input;

    private String queryName;

    public ShopResourceFeedbackCreateGraphQLQuery build() {
      return new ShopResourceFeedbackCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(ResourceFeedbackCreateInput input) {
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
