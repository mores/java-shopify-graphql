package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductBundleCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new componentized product.
 */
public class ProductBundleCreateGraphQLQuery extends GraphQLQuery {
  public ProductBundleCreateGraphQLQuery(ProductBundleCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductBundleCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productBundleCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductBundleCreateInput input;

    private String queryName;

    public ProductBundleCreateGraphQLQuery build() {
      return new ProductBundleCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Input for creating a componentized product.
     */
    public Builder input(ProductBundleCreateInput input) {
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
