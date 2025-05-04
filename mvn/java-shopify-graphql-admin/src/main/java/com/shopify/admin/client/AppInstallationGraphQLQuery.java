package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Lookup an AppInstallation by ID or return the AppInstallation for the currently authenticated App.
 */
public class AppInstallationGraphQLQuery extends GraphQLQuery {
  public AppInstallationGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public AppInstallationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "appInstallation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public AppInstallationGraphQLQuery build() {
      return new AppInstallationGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * ID used to lookup AppInstallation.
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
