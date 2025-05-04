package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Fetches an app by its client ID.
 * Returns null if the app doesn't exist.
 */
public class AppByKeyGraphQLQuery extends GraphQLQuery {
  public AppByKeyGraphQLQuery(String apiKey, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (apiKey != null || fieldsSet.contains("apiKey")) {
        getInput().put("apiKey", apiKey);
    }
  }

  public AppByKeyGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "appByKey";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String apiKey;

    private String queryName;

    public AppByKeyGraphQLQuery build() {
      return new AppByKeyGraphQLQuery(apiKey, queryName, fieldsSet);
               
    }

    /**
     * Client ID of the app.
     */
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      this.fieldsSet.add("apiKey");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
