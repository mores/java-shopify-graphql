package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MetafieldStorefrontVisibilityInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class MetafieldStorefrontVisibilityCreateGraphQLQuery extends GraphQLQuery {
  public MetafieldStorefrontVisibilityCreateGraphQLQuery(MetafieldStorefrontVisibilityInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MetafieldStorefrontVisibilityCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldStorefrontVisibilityCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MetafieldStorefrontVisibilityInput input;

    private String queryName;

    public MetafieldStorefrontVisibilityCreateGraphQLQuery build() {
      return new MetafieldStorefrontVisibilityCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(MetafieldStorefrontVisibilityInput input) {
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
