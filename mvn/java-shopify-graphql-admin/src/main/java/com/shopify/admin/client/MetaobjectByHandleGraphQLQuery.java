package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetaobjectHandleInput;
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
 * Retrieves a [`Metaobject`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Metaobject) by its handle and type. Handles are unique identifiers within a metaobject type.
 */
public class MetaobjectByHandleGraphQLQuery extends GraphQLQuery {
  public MetaobjectByHandleGraphQLQuery(MetaobjectHandleInput handle, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public MetaobjectByHandleGraphQLQuery(MetaobjectHandleInput handle, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MetaobjectByHandleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metaobjectByHandle";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private MetaobjectHandleInput handle;

    private String queryName;

    public MetaobjectByHandleGraphQLQuery build() {
      return new MetaobjectByHandleGraphQLQuery(handle, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The identifier of the metaobject to return.
     */
    public Builder handle(MetaobjectHandleInput handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The identifier of the metaobject to return.
     */
    public Builder handleReference(String variableRef) {
      this.variableReferences.put("handle", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MetaobjectHandleInput"))).build());
      this.fieldsSet.add("handle");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
