package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductBundleUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a componentized product.
 */
public class ProductBundleUpdateGraphQLQuery extends GraphQLQuery {
  public ProductBundleUpdateGraphQLQuery(ProductBundleUpdateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ProductBundleUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productBundleUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ProductBundleUpdateInput input;

    private String queryName;

    public ProductBundleUpdateGraphQLQuery build() {
      return new ProductBundleUpdateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Input for updating a componentized product.
     */
    public Builder input(ProductBundleUpdateInput input) {
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
