package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Returns a count of published products by publication ID. Limited to a maximum of 10000 by default.
 */
public class PublishedProductsCountGraphQLQuery extends GraphQLQuery {
  public PublishedProductsCountGraphQLQuery(String publicationId, Integer limit, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (publicationId != null || fieldsSet.contains("publicationId")) {
        getInput().put("publicationId", publicationId);
    }if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }
  }

  public PublishedProductsCountGraphQLQuery(String publicationId, Integer limit, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (publicationId != null || fieldsSet.contains("publicationId")) {
        getInput().put("publicationId", publicationId);
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

  public PublishedProductsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "publishedProductsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String publicationId;

    private Integer limit;

    private String queryName;

    public PublishedProductsCountGraphQLQuery build() {
      return new PublishedProductsCountGraphQLQuery(publicationId, limit, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the publication that the products are published to.
     */
    public Builder publicationId(String publicationId) {
      this.publicationId = publicationId;
      this.fieldsSet.add("publicationId");
      return this;
    }

    /**
     * The ID of the publication that the products are published to.
     */
    public Builder publicationIdReference(String variableRef) {
      this.variableReferences.put("publicationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("publicationId");
      return this;
    }

    /**
     * The maximum number of products to count.
     */
    public Builder limit(Integer limit) {
      this.limit = limit;
      this.fieldsSet.add("limit");
      return this;
    }

    /**
     * The maximum number of products to count.
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
