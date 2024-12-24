package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PrivateMetafieldInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class PrivateMetafieldUpsertGraphQLQuery extends GraphQLQuery {
  public PrivateMetafieldUpsertGraphQLQuery(PrivateMetafieldInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PrivateMetafieldUpsertGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "privateMetafieldUpsert";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PrivateMetafieldInput input;

    private String queryName;

    public PrivateMetafieldUpsertGraphQLQuery build() {
      return new PrivateMetafieldUpsertGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(PrivateMetafieldInput input) {
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
