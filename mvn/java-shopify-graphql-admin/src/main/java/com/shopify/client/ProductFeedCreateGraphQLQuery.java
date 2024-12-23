package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductFeedInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a product feed for a specific publication.
 */
public class ProductFeedCreateGraphQLQuery extends GraphQLQuery {
  public ProductFeedCreateGraphQLQuery(ProductFeedInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductFeedCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productFeedCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductFeedInput input;

    private String queryName;

    public ProductFeedCreateGraphQLQuery build() {
      return new ProductFeedCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The properties of the new product feed.
     */
    public Builder input(ProductFeedInput input) {
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
