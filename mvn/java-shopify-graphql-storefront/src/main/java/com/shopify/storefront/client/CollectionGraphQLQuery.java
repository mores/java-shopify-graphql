package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Fetch a specific `Collection` by one of its unique attributes.
 */
public class CollectionGraphQLQuery extends GraphQLQuery {
  public CollectionGraphQLQuery(String handle, String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }if (id != null || fieldsSet.contains("id")) {
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

    private String handle;

    private String id;

    private String queryName;

    public CollectionGraphQLQuery build() {
      return new CollectionGraphQLQuery(handle, id, queryName, fieldsSet);
               
    }

    /**
     * The handle of the `Collection`.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The ID of the `Collection`.
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
