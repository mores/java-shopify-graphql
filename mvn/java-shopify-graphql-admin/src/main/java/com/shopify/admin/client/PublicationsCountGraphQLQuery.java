package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CatalogType;
import graphql.language.VariableDefinition;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Count of publications. Limited to a maximum of 10000 by default.
 */
public class PublicationsCountGraphQLQuery extends GraphQLQuery {
  public PublicationsCountGraphQLQuery(CatalogType catalogType, Integer limit, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (catalogType != null || fieldsSet.contains("catalogType")) {
        getInput().put("catalogType", catalogType);
    }if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }
  }

  public PublicationsCountGraphQLQuery(CatalogType catalogType, Integer limit, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (catalogType != null || fieldsSet.contains("catalogType")) {
        getInput().put("catalogType", catalogType);
    }if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PublicationsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "publicationsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private CatalogType catalogType;

    private Integer limit;

    private String queryName;

    public PublicationsCountGraphQLQuery build() {
      return new PublicationsCountGraphQLQuery(catalogType, limit, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Filter publications by catalog type.
     */
    public Builder catalogType(CatalogType catalogType) {
      this.catalogType = catalogType;
      this.fieldsSet.add("catalogType");
      return this;
    }

    /**
     * Filter publications by catalog type.
     */
    public Builder catalogTypeReference(String variableRef) {
      this.variableReferences.put("catalogType", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("CatalogType")).build());
      this.fieldsSet.add("catalogType");
      return this;
    }

    /**
     * The upper bound on count value before returning a result. Use `null` to have no limit.
     */
    public Builder limit(Integer limit) {
      this.limit = limit;
      this.fieldsSet.add("limit");
      return this;
    }

    /**
     * The upper bound on count value before returning a result. Use `null` to have no limit.
     */
    public Builder limitReference(String variableRef) {
      this.variableReferences.put("limit", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Int")).build());
      this.fieldsSet.add("limit");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
