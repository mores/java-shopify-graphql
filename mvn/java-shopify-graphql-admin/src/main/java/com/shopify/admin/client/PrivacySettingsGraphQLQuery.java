package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Privacy related settings for a shop.
 */
public class PrivacySettingsGraphQLQuery extends GraphQLQuery {
  public PrivacySettingsGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public PrivacySettingsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "privacySettings";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public PrivacySettingsGraphQLQuery build() {
      return new PrivacySettingsGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
