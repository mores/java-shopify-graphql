package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The regions that can be used as the backup region of the shop.
 */
public class AvailableBackupRegionsGraphQLQuery extends GraphQLQuery {
  public AvailableBackupRegionsGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public AvailableBackupRegionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "availableBackupRegions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public AvailableBackupRegionsGraphQLQuery build() {
      return new AvailableBackupRegionsGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
