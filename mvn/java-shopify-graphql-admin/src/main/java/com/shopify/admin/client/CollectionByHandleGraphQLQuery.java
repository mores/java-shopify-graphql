package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a collection by its unique handle identifier. Handles provide a
 * URL-friendly way to reference collections and are commonly used in storefront
 * URLs and navigation.
 *   
 * For example, a collection with the title "Summer Sale" might have the handle
 * `summer-sale`, allowing you to fetch it directly without knowing the internal ID.
 *   
 * Use `CollectionByHandle` to:
 * - Fetch collections for storefront display and navigation
 * - Build collection-based URLs and routing systems
 * - Validate collection existence before displaying content
 *   
 * Handles are automatically generated from collection titles but can be
 * customized by merchants for SEO and branding purposes.
 *   
 * Learn more about [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection).
 */
public class CollectionByHandleGraphQLQuery extends GraphQLQuery {
  public CollectionByHandleGraphQLQuery(String handle, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public CollectionByHandleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "collectionByHandle";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String handle;

    private String queryName;

    public CollectionByHandleGraphQLQuery build() {
      return new CollectionByHandleGraphQLQuery(handle, queryName, fieldsSet);
               
    }

    /**
     * The handle of the collection.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
