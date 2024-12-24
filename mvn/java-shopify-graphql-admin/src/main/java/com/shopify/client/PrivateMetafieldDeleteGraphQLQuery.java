package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PrivateMetafieldDeleteInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class PrivateMetafieldDeleteGraphQLQuery extends GraphQLQuery {
  public PrivateMetafieldDeleteGraphQLQuery(PrivateMetafieldDeleteInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PrivateMetafieldDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "privateMetafieldDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PrivateMetafieldDeleteInput input;

    private String queryName;

    public PrivateMetafieldDeleteGraphQLQuery build() {
      return new PrivateMetafieldDeleteGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(PrivateMetafieldDeleteInput input) {
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
