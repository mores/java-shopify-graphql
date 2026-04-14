package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductBundleCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a product bundle that groups multiple
 * [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
 * objects together as components. The bundle appears as a single product in the
 * store, with its price determined by the parent product and inventory
 * calculated from the component products.
 *   
 * The mutation runs asynchronously and returns a [`ProductBundleOperation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductBundleOperation)
 * object to track the creation status. Poll the operation using the [`productOperation`](https://shopify.dev/docs/api/admin-graphql/latest/queries/productOperation)
 * query to determine when the bundle is ready.
 *   
 * Learn more about [creating product fixed bundles](https://shopify.dev/docs/apps/build/product-merchandising/bundles/add-product-fixed-bundle#step-1-create-a-bundle).
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
     * Input for creating a product bundle or componentized product.
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
