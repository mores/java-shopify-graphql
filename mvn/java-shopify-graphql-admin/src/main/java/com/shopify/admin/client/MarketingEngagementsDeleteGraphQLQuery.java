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
 * Marks engagement data for a channel so it no longer appears in reports.
 * Activity-level data cannot be deleted directly; delete the MarketingActivity instead.
 */
public class MarketingEngagementsDeleteGraphQLQuery extends GraphQLQuery {
  public MarketingEngagementsDeleteGraphQLQuery(String queryName) {
    super("mutation", queryName);
  }

  public MarketingEngagementsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketingEngagementsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String queryName;

    public MarketingEngagementsDeleteGraphQLQuery build() {
      return new MarketingEngagementsDeleteGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
