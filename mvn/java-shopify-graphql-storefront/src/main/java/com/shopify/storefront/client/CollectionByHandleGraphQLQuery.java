package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Find a collection by its handle.
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
