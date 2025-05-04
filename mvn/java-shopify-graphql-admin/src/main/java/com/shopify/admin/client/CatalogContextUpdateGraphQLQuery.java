package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CatalogContextInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the context of a catalog.
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

    private String catalogId;

    private CatalogContextInput contextsToAdd;

    private CatalogContextInput contextsToRemove;

    private String queryName;

    public CatalogContextUpdateGraphQLQuery build() {
      return new CatalogContextUpdateGraphQLQuery(catalogId, contextsToAdd, contextsToRemove, queryName, fieldsSet);
               
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
     * The contexts to add to the catalog.
     */
    public Builder contextsToAdd(CatalogContextInput contextsToAdd) {
      this.contextsToAdd = contextsToAdd;
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
