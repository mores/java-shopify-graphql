package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetaobjectBulkDeleteWhereCondition;
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
 * Asynchronously delete metaobjects and their associated metafields in bulk.
 */
public class MetaobjectBulkDeleteGraphQLQuery extends GraphQLQuery {
  public MetaobjectBulkDeleteGraphQLQuery(MetaobjectBulkDeleteWhereCondition where,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (where != null || fieldsSet.contains("where")) {
        getInput().put("where", where);
    }
  }

  public MetaobjectBulkDeleteGraphQLQuery(MetaobjectBulkDeleteWhereCondition where,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (where != null || fieldsSet.contains("where")) {
        getInput().put("where", where);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MetaobjectBulkDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metaobjectBulkDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private MetaobjectBulkDeleteWhereCondition where;

    private String queryName;

    public MetaobjectBulkDeleteGraphQLQuery build() {
      return new MetaobjectBulkDeleteGraphQLQuery(where, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the condition by which metaobjects are deleted.
     * Exactly one field of input is required.
     */
    public Builder where(MetaobjectBulkDeleteWhereCondition where) {
      this.where = where;
      this.fieldsSet.add("where");
      return this;
    }

    /**
     * Specifies the condition by which metaobjects are deleted.
     * Exactly one field of input is required.
     */
    public Builder whereReference(String variableRef) {
      this.variableReferences.put("where", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MetaobjectBulkDeleteWhereCondition"))).build());
      this.fieldsSet.add("where");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
