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
 * Updates a URL redirect.
 */
public class UrlRedirectUpdateGraphQLQuery extends GraphQLQuery {
  public UrlRedirectUpdateGraphQLQuery(String id, UrlRedirectInput urlRedirect, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (urlRedirect != null || fieldsSet.contains("urlRedirect")) {
        getInput().put("urlRedirect", urlRedirect);
    }
  }

  public UrlRedirectUpdateGraphQLQuery(String id, UrlRedirectInput urlRedirect, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (urlRedirect != null || fieldsSet.contains("urlRedirect")) {
        getInput().put("urlRedirect", urlRedirect);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public UrlRedirectUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private UrlRedirectInput urlRedirect;

    private String queryName;

    public UrlRedirectUpdateGraphQLQuery build() {
      return new UrlRedirectUpdateGraphQLQuery(id, urlRedirect, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the URL redirect to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the URL redirect to update.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields required to update the URL redirect.
     */
    public Builder urlRedirect(UrlRedirectInput urlRedirect) {
      this.urlRedirect = urlRedirect;
      this.fieldsSet.add("urlRedirect");
      return this;
    }

    /**
     * The input fields required to update the URL redirect.
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
