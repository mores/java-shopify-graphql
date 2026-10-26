package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CatalogContextInput;
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
 * Modifies which contexts, like
 * [markets](https://shopify.dev/docs/api/admin-graphql/latest/objects/Market) or B2B [company locations](https://shopify.dev/docs/api/admin-graphql/latest/objects/CompanyLocation), can access a [`Catalog`](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/Catalog).
 * You can add or remove contexts to control where the catalog's products and
 * prices are available.
 *   
 * Learn more about [managing catalog
 * contexts](https://shopify.dev/docs/apps/build/markets/new-markets/catalogs)
 * and [managing B2B
 * catalogs](https://shopify.dev/docs/apps/build/b2b/manage-catalogs).
 */
public class CatalogContextUpdateGraphQLQuery extends GraphQLQuery {
  public CatalogContextUpdateGraphQLQuery(String catalogId, CatalogContextInput contextsToAdd,
      CatalogContextInput contextsToRemove, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (catalogId != null || fieldsSet.contains("catalogId")) {
        getInput().put("catalogId", catalogId);
    }if (contextsToAdd != null || fieldsSet.contains("contextsToAdd")) {
        getInput().put("contextsToAdd", contextsToAdd);
    }if (contextsToRemove != null || fieldsSet.contains("contextsToRemove")) {
        getInput().put("contextsToRemove", contextsToRemove);
    }
  }

  public CatalogContextUpdateGraphQLQuery(String catalogId, CatalogContextInput contextsToAdd,
      CatalogContextInput contextsToRemove, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (catalogId != null || fieldsSet.contains("catalogId")) {
        getInput().put("catalogId", catalogId);
    }if (contextsToAdd != null || fieldsSet.contains("contextsToAdd")) {
        getInput().put("contextsToAdd", contextsToAdd);
    }if (contextsToRemove != null || fieldsSet.contains("contextsToRemove")) {
        getInput().put("contextsToRemove", contextsToRemove);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CatalogContextUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "catalogContextUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String catalogId;

    private CatalogContextInput contextsToAdd;

    private CatalogContextInput contextsToRemove;

    private String queryName;

    public CatalogContextUpdateGraphQLQuery build() {
      return new CatalogContextUpdateGraphQLQuery(catalogId, contextsToAdd, contextsToRemove, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the catalog for which to update the context.
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      this.fieldsSet.add("catalogId");
      return this;
    }

    /**
     * The ID of the catalog for which to update the context.
     */
    public Builder catalogIdReference(String variableRef) {
      this.variableReferences.put("catalogId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("catalogId");
      return this;
    }

    /**
     * The contexts to add to the catalog.
     */
    public Builder contextsToAdd(CatalogContextInput contextsToAdd) {
      this.contextsToAdd = contextsToAdd;
      this.fieldsSet.add("contextsToAdd");
      return this;
    }

    /**
     * The contexts to add to the catalog.
     */
    public Builder contextsToAddReference(String variableRef) {
      this.variableReferences.put("contextsToAdd", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("CatalogContextInput")).build());
      this.fieldsSet.add("contextsToAdd");
      return this;
    }

    /**
     * The contexts to remove from the catalog.
     */
    public Builder contextsToRemove(CatalogContextInput contextsToRemove) {
      this.contextsToRemove = contextsToRemove;
      this.fieldsSet.add("contextsToRemove");
      return this;
    }

    /**
     * The contexts to remove from the catalog.
     */
    public Builder contextsToRemoveReference(String variableRef) {
      this.variableReferences.put("contextsToRemove", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("CatalogContextInput")).build());
      this.fieldsSet.add("contextsToRemove");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
