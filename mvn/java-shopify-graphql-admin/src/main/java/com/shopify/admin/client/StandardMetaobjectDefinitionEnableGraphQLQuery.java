package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Enables the specified standard metaobject definition from its template.
 */
public class StandardMetaobjectDefinitionEnableGraphQLQuery extends GraphQLQuery {
  public StandardMetaobjectDefinitionEnableGraphQLQuery(String type, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (type != null || fieldsSet.contains("type")) {
        getInput().put("type", type);
    }
  }

  public StandardMetaobjectDefinitionEnableGraphQLQuery(String type, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (type != null || fieldsSet.contains("type")) {
        getInput().put("type", type);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public StandardMetaobjectDefinitionEnableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "standardMetaobjectDefinitionEnable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String type;

    private String queryName;

    public StandardMetaobjectDefinitionEnableGraphQLQuery build() {
      return new StandardMetaobjectDefinitionEnableGraphQLQuery(type, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The type of the metaobject definition to enable.
     */
    public Builder type(String type) {
      this.type = type;
      this.fieldsSet.add("type");
      return this;
    }

    /**
     * The type of the metaobject definition to enable.
     */
    public Builder typeReference(String variableRef) {
      this.variableReferences.put("type", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("type");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
