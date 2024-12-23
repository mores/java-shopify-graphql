package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductOptionDeleteStrategy;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes the specified options.
 */
public class ProductOptionsDeleteGraphQLQuery extends GraphQLQuery {
  public ProductOptionsDeleteGraphQLQuery(String productId, List<String> options,
      ProductOptionDeleteStrategy strategy, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (options != null || fieldsSet.contains("options")) {
        getInput().put("options", options);
    }if (strategy != null || fieldsSet.contains("strategy")) {
        getInput().put("strategy", strategy);
    }
  }

  public ProductOptionsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productOptionsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<String> options;

    private ProductOptionDeleteStrategy strategy;

    private String queryName;

    public ProductOptionsDeleteGraphQLQuery build() {
      return new ProductOptionsDeleteGraphQLQuery(productId, options, strategy, queryName, fieldsSet);
               
    }

    /**
     * ID of the product from which to delete the options.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * IDs of the options to delete from the product.
     */
    public Builder options(List<String> options) {
      this.options = options;
      this.fieldsSet.add("options");
      return this;
    }

    /**
     * The strategy defines which behavior the mutation should observe,such as how
     * to handle a situation where deleting an option would result in duplicate variants.
     */
    public Builder strategy(ProductOptionDeleteStrategy strategy) {
      this.strategy = strategy;
      this.fieldsSet.add("strategy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
