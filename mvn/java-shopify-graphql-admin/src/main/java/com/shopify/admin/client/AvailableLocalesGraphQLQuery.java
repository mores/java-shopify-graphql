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
 * Returns all locales that Shopify supports. Each
 * [`Locale`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Locale)
 * includes an ISO code and human-readable name. Use this query to discover which
 * locales you can enable on a shop with the [`shopLocaleEnable`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/shopLocaleEnable) mutation.
 */
public class AvailableLocalesGraphQLQuery extends GraphQLQuery {
  public AvailableLocalesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public AvailableLocalesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "availableLocales";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String queryName;

    public AvailableLocalesGraphQLQuery build() {
      return new AvailableLocalesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
