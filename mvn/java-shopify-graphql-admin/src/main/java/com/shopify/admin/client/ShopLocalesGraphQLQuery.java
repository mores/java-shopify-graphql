package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Returns the locales enabled on a shop. Each locale represents a language for
 * translations and determines how content displays to customers in different markets.
 *   
 * Use the optional `published` argument to filter for only the locales that are
 * visible to customers. The response includes the ISO locale code, whether it's
 * the shop's primary locale, and which [`MarketWebPresence`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MarketWebPresence)
 * objects use each locale.
 */
public class ShopLocalesGraphQLQuery extends GraphQLQuery {
  public ShopLocalesGraphQLQuery(Boolean published, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (published != null || fieldsSet.contains("published")) {
        getInput().put("published", published);
    }
  }

  public ShopLocalesGraphQLQuery(Boolean published, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (published != null || fieldsSet.contains("published")) {
        getInput().put("published", published);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ShopLocalesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "shopLocales";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private Boolean published;

    private String queryName;

    public ShopLocalesGraphQLQuery build() {
      return new ShopLocalesGraphQLQuery(published, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Return only published locales.
     */
    public Builder published(Boolean published) {
      this.published = published;
      this.fieldsSet.add("published");
      return this;
    }

    /**
     * Return only published locales.
     */
    public Builder publishedReference(String variableRef) {
      this.variableReferences.put("published", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("published");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
