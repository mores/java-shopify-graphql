package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ArticleTagSort;
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
 * List of all article tags.
 */
public class ArticleTagsGraphQLQuery extends GraphQLQuery {
  public ArticleTagsGraphQLQuery(ArticleTagSort sort, int limit, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (sort != null || fieldsSet.contains("sort")) {
        getInput().put("sort", sort);
    }getInput().put("limit", limit);                   
  }

  public ArticleTagsGraphQLQuery(ArticleTagSort sort, int limit, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (sort != null || fieldsSet.contains("sort")) {
        getInput().put("sort", sort);
    }getInput().put("limit", limit);                   
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ArticleTagsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "articleTags";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private ArticleTagSort sort;

    private int limit;

    private String queryName;

    public ArticleTagsGraphQLQuery build() {
      return new ArticleTagsGraphQLQuery(sort, limit, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Type of sort order.
     */
    public Builder sort(ArticleTagSort sort) {
      this.sort = sort;
      this.fieldsSet.add("sort");
      return this;
    }

    /**
     * Type of sort order.
     */
    public Builder sortReference(String variableRef) {
      this.variableReferences.put("sort", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ArticleTagSort")).build());
      this.fieldsSet.add("sort");
      return this;
    }

    /**
     * The maximum number of tags to return.
     */
    public Builder limit(int limit) {
      this.limit = limit;
      this.fieldsSet.add("limit");
      return this;
    }

    /**
     * The maximum number of tags to return.
     */
    public Builder limitReference(String variableRef) {
      this.variableReferences.put("limit", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("Int"))).build());
      this.fieldsSet.add("limit");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
