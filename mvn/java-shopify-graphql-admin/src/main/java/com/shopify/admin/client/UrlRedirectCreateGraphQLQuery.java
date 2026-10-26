package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.UrlRedirectInput;
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
 * Creates a [`UrlRedirect`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) object.
 */
public class UrlRedirectCreateGraphQLQuery extends GraphQLQuery {
  public UrlRedirectCreateGraphQLQuery(UrlRedirectInput urlRedirect, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (urlRedirect != null || fieldsSet.contains("urlRedirect")) {
        getInput().put("urlRedirect", urlRedirect);
    }
  }

  public UrlRedirectCreateGraphQLQuery(UrlRedirectInput urlRedirect, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (urlRedirect != null || fieldsSet.contains("urlRedirect")) {
        getInput().put("urlRedirect", urlRedirect);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public UrlRedirectCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private UrlRedirectInput urlRedirect;

    private String queryName;

    public UrlRedirectCreateGraphQLQuery build() {
      return new UrlRedirectCreateGraphQLQuery(urlRedirect, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The fields to use when creating the redirect.
     */
    public Builder urlRedirect(UrlRedirectInput urlRedirect) {
      this.urlRedirect = urlRedirect;
      this.fieldsSet.add("urlRedirect");
      return this;
    }

    /**
     * The fields to use when creating the redirect.
     */
    public Builder urlRedirectReference(String variableRef) {
      this.variableReferences.put("urlRedirect", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("UrlRedirectInput"))).build());
      this.fieldsSet.add("urlRedirect");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
