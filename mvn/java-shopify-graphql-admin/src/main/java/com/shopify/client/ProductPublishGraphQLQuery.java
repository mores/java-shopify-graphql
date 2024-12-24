package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductPublishInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ProductPublishGraphQLQuery extends GraphQLQuery {
  public ProductPublishGraphQLQuery(ProductPublishInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductPublishGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productPublish";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductPublishInput input;

    private String queryName;

    public ProductPublishGraphQLQuery build() {
      return new ProductPublishGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(ProductPublishInput input) {
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
