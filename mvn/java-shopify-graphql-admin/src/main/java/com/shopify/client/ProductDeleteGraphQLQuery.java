package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductDeleteInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a product, including all associated variants and media.
 *   
 * As of API version `2023-01`, if you need to delete a large product, such as one that has many
 * [variants](https://shopify.dev/api/admin-graphql/latest/input-objects/ProductVariantInput)
 * that are active at several
 * [locations](https://shopify.dev/api/admin-graphql/latest/input-objects/InventoryLevelInput),
 * you may encounter timeout errors. To avoid these timeout errors, you can instead use the asynchronous
 * [ProductDeleteAsync](https://shopify.dev/api/admin-graphql/latest/mutations/productDeleteAsync)
 * mutation.
 */
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

    /**
     * Specifies the product to delete by its ID.
     */
    public Builder input(ProductDeleteInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * Specifies whether or not to run the mutation synchronously.
     */
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
