package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetafieldDefinitionInput;
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
 * Creates a [`MetafieldDefinition`](https://shopify.dev/docs/api/admin-graphql/current/objects/MetafieldDefinition) that establishes structure and validation rules for metafields. The definition
 * specifies the data type, validation constraints, and access permissions for
 * metafields with a given namespace and key combination.
 *   
 * When you create a new definition, the system validates any existing
 * unstructured metafields matching the same owner type, namespace, and key
 * against it. The system updates each valid metafield's type to match the
 * definition. Invalid metafields remain unchanged but must conform to the
 * definition when updated.
 *   
 * Learn more about [creating metafield definitions](https://shopify.dev/docs/apps/build/custom-data/metafields/definitions).
 */
public class MetafieldDefinitionCreateGraphQLQuery extends GraphQLQuery {
  public MetafieldDefinitionCreateGraphQLQuery(MetafieldDefinitionInput definition,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (definition != null || fieldsSet.contains("definition")) {
        getInput().put("definition", definition);
    }
  }

  public MetafieldDefinitionCreateGraphQLQuery(MetafieldDefinitionInput definition,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (definition != null || fieldsSet.contains("definition")) {
        getInput().put("definition", definition);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MetafieldDefinitionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metafieldDefinitionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private MetafieldDefinitionInput definition;

    private String queryName;

    public MetafieldDefinitionCreateGraphQLQuery build() {
      return new MetafieldDefinitionCreateGraphQLQuery(definition, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the input fields for a metafield definition.
     */
    public Builder definition(MetafieldDefinitionInput definition) {
      this.definition = definition;
      this.fieldsSet.add("definition");
      return this;
    }

    /**
     * Specifies the input fields for a metafield definition.
     */
    public Builder definitionReference(String variableRef) {
      this.variableReferences.put("definition", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MetafieldDefinitionInput"))).build());
      this.fieldsSet.add("definition");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
