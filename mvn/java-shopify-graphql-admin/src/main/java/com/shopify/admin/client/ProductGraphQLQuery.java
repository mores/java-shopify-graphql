package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) by its ID.
 * A product is an item that a merchant can sell in their store.
 *   
 * Use the `product` query when you need to:
 *   
 * - Access essential product data (for example, title, description, price, images, SEO metadata, and metafields).
 * - Build product detail pages and manage inventory.
 * - Handle international sales with localized pricing and content.
 * - Manage product variants and product options.
 *   
 * Learn more about working with [Shopify's product model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-components).
 */
public class ProductGraphQLQuery extends GraphQLQuery {
  public ProductGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ProductGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "product";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ProductGraphQLQuery build() {
      return new ProductGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `Product` to return.
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
