package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a [product variant](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant) by its ID.
 *   
 * A product variant is a specific version of a
 * [product](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) that comes in more than
 * one [option](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductOption),
 * such as size or color. For example, if a merchant sells t-shirts with options for size and color,
 * then a small, blue t-shirt would be one product variant and a large, blue t-shirt would be another.
 *   
 * Use the `productVariant` query when you need to:
 *   
 * - Access essential product variant data (for example, title, price, image, and metafields).
 * - Build product detail pages and manage inventory.
 * - Handle international sales with localized pricing and content.
 * - Manage product variants that are part of a bundle or selling plan.
 *   
 * Learn more about working with [Shopify's product model](https://shopify.dev/docs/apps/build/graphql/migrate/new-product-model/product-model-components).
 */
public class ProductVariantGraphQLQuery extends GraphQLQuery {
  public ProductVariantGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ProductVariantGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productVariant";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ProductVariantGraphQLQuery build() {
      return new ProductVariantGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `ProductVariant` to return.
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
