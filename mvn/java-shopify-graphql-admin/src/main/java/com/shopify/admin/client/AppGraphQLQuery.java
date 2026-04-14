package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves an [`App`](https://shopify.dev/docs/api/admin-graphql/latest/objects/App) by
 * its ID. If no ID is provided, returns details about the currently
 * authenticated app. The query provides access to app details including title,
 * icon, and pricing information.
 *   
 * If the app isn't installed on the current shop, then the [`installation`](https://shopify.dev/docs/api/admin-graphql/latest/queries/app#returns-App.fields.installation)
 * field will be `null`.
 */
public class AppGraphQLQuery extends GraphQLQuery {
  public AppGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public AppGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "app";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public AppGraphQLQuery build() {
      return new AppGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID to lookup the App by.
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
