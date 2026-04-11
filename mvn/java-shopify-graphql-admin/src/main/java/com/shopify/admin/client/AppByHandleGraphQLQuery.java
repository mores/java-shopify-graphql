package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves an app by its unique handle. The handle is a URL-friendly identifier for the app.
 *   
 * Returns the [`App`](https://shopify.dev/docs/api/admin-graphql/latest/objects/App) if
 * found, or `null` if no app exists with the specified handle.
 */
public class AppByHandleGraphQLQuery extends GraphQLQuery {
  public AppByHandleGraphQLQuery(String handle, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public AppByHandleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "appByHandle";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String handle;

    private String queryName;

    public AppByHandleGraphQLQuery build() {
      return new AppByHandleGraphQLQuery(handle, queryName, fieldsSet);
               
    }

    /**
     * Handle of the App.
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
