package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductSetInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ProductSetGraphQLQuery extends GraphQLQuery {
  public ProductSetGraphQLQuery(ProductSetInput input, Boolean synchronous, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (synchronous != null || fieldsSet.contains("synchronous")) {
        getInput().put("synchronous", synchronous);
    }
  }

  public ProductSetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productSet";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductSetInput input;

    private Boolean synchronous;

    private String queryName;

    public ProductSetGraphQLQuery build() {
      return new ProductSetGraphQLQuery(input, synchronous, queryName, fieldsSet);
               
    }

    
    public Builder input(ProductSetInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    
    public Builder synchronous(Boolean synchronous) {
      this.synchronous = synchronous;
      this.fieldsSet.add("synchronous");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
