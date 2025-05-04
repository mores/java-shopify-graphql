package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Fetch a specific `Product` by one of its unique attributes.
 */
public class ProductGraphQLQuery extends GraphQLQuery {
  public ProductGraphQLQuery(String id, String handle, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
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

    private String handle;

    private String queryName;

    public ProductGraphQLQuery build() {
      return new ProductGraphQLQuery(id, handle, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `Product`.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The handle of the `Product`.
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
