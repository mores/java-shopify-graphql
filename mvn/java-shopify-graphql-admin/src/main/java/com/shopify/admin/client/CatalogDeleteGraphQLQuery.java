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
 * Delete a catalog.
 */
public class CatalogDeleteGraphQLQuery extends GraphQLQuery {
  public CatalogDeleteGraphQLQuery(String id, Boolean deleteDependentResources, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (deleteDependentResources != null || fieldsSet.contains("deleteDependentResources")) {
        getInput().put("deleteDependentResources", deleteDependentResources);
    }
  }

  public CatalogDeleteGraphQLQuery(String id, Boolean deleteDependentResources, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (deleteDependentResources != null || fieldsSet.contains("deleteDependentResources")) {
        getInput().put("deleteDependentResources", deleteDependentResources);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CatalogDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "catalogDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private Boolean deleteDependentResources;

    private String queryName;

    public CatalogDeleteGraphQLQuery build() {
      return new CatalogDeleteGraphQLQuery(id, deleteDependentResources, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the catalog to delete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the catalog to delete.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Whether to also delete the price list and the publication owned by the catalog.
     */
    public Builder deleteDependentResources(Boolean deleteDependentResources) {
      this.deleteDependentResources = deleteDependentResources;
      this.fieldsSet.add("deleteDependentResources");
      return this;
    }

    /**
     * Whether to also delete the price list and the publication owned by the catalog.
     */
    public Builder deleteDependentResourcesReference(String variableRef) {
      this.variableReferences.put("deleteDependentResources", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("deleteDependentResources");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
