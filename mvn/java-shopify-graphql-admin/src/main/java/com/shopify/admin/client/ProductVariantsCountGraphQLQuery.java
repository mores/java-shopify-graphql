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
 * Count of product variants. Limited to a maximum of 10000 by default.
 */
public class ProductVariantsCountGraphQLQuery extends GraphQLQuery {
  public ProductVariantsCountGraphQLQuery(String query, Integer limit, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }
  }

  public ProductVariantsCountGraphQLQuery(String query, Integer limit, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
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

  public ProductVariantsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productVariantsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String query;

    private Integer limit;

    private String queryName;

    public ProductVariantsCountGraphQLQuery build() {
      return new ProductVariantsCountGraphQLQuery(query, limit, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * No supported search fields.
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * No supported search fields.
     */
    public Builder queryReference(String variableRef) {
      this.variableReferences.put("query", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("query");
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
