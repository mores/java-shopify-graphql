package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductDeleteInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ProductDeleteGraphQLQuery extends GraphQLQuery {
  public ProductDeleteGraphQLQuery(ProductDeleteInput input, Boolean synchronous, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (synchronous != null || fieldsSet.contains("synchronous")) {
        getInput().put("synchronous", synchronous);
    }
  }

  public ProductDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductDeleteInput input;

    private Boolean synchronous;

    private String queryName;

    public ProductDeleteGraphQLQuery build() {
      return new ProductDeleteGraphQLQuery(input, synchronous, queryName, fieldsSet);
               
    }

    
    public Builder input(ProductDeleteInput input) {
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
