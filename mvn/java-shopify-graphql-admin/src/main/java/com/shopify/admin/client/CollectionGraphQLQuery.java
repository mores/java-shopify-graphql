package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection) by its ID.
 * A collection represents a grouping of [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
 * that merchants can display and sell as a group in their [online
 * store](https://shopify.dev/docs/apps/build/online-store) and
 * other [sales channels](https://shopify.dev/docs/apps/build/sales-channels).
 *   
 * Use the `collection` query when you need to:
 *   
 * - Manage collection publishing across sales channels
 * - Access collection metadata and SEO information
 * - Work with collection rules and product relationships
 *   
 * A collection can be either a custom ([manual](https://help.shopify.com/manual/products/collections/manual-shopify-collection))
 * collection where products are manually added, or a smart ([automated](https://help.shopify.com/manual/products/collections/automated-collections))
 * collection where products are automatically included based on defined rules.
 * Each collection has associated metadata including
 * title, description, handle, image, and [metafields](https://shopify.dev/docs/apps/build/custom-data/metafields).
 */
public class CollectionGraphQLQuery extends GraphQLQuery {
  public CollectionGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CollectionGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "collection";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CollectionGraphQLQuery build() {
      return new CollectionGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `Collection` to return.
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
