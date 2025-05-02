package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieve a [navigation menu](https://help.shopify.com/manual/online-store/menus-and-links) by its handle.
 */
public class MenuGraphQLQuery extends GraphQLQuery {
  public MenuGraphQLQuery(String handle, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public MenuGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "menu";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String handle;

    private String queryName;

    public MenuGraphQLQuery build() {
      return new MenuGraphQLQuery(handle, queryName, fieldsSet);
               
    }

    /**
     * The navigation menu's handle.
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
