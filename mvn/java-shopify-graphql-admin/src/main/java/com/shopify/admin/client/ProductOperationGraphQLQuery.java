package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a ProductOperation resource by ID.
 *   
 * This can be used to query the
 * [ProductSetOperation](https://shopify.dev/api/admin-graphql/current/objects/ProductSetOperation), using
 * the ID that was returned
 * [when the product was created or updated](https://shopify.dev/api/admin/migrate/new-product-model/sync-data#create-a-product-with-variants-and-options-asynchronously)
 * by the
 * [ProductSet](https://shopify.dev/api/admin-graphql/current/mutations/productSet) mutation.
 *   
 * The `status` field indicates whether the operation is `CREATED`, `ACTIVE`, or `COMPLETE`.
 *   
 * The `product` field provides the details of the created or updated product.
 *   
 * For the
 * [ProductSetOperation](https://shopify.dev/api/admin-graphql/current/objects/ProductSetOperation), the
 * `userErrors` field provides mutation errors that occurred during the operation.
 */
public class ProductOperationGraphQLQuery extends GraphQLQuery {
  public ProductOperationGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ProductOperationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productOperation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ProductOperationGraphQLQuery build() {
      return new ProductOperationGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `ProductOperation` to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
