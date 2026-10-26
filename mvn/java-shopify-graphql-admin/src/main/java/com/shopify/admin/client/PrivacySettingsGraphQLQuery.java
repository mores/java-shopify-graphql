package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

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
