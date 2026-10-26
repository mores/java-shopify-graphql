package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MetaobjectDefinitionCreateInput;
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
 * Creates a metaobject definition that establishes the structure for custom data
 * objects in your store. The definition specifies the fields, data types, and
 * access permissions that all [`Metaobject`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Metaobject)
 * entries of this type share.
 *   
 * Use the `type` field to create a unique namespace for your metaobjects. Prefix
 * the type with `$app:` to reserve the definition for your app's exclusive use.
 * The definition can include capabilities like publishable status or translation
 * eligibility, to extend how metaobjects integrate with Shopify's features.
 *   
 * Learn more about [managing metaobjects](https://shopify.dev/docs/apps/build/custom-data/metaobjects/manage-metaobjects).
 */
public class MetaobjectDefinitionCreateGraphQLQuery extends GraphQLQuery {
  public MetaobjectDefinitionCreateGraphQLQuery(MetaobjectDefinitionCreateInput definition,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (definition != null || fieldsSet.contains("definition")) {
        getInput().put("definition", definition);
    }
  }

  public MetaobjectDefinitionCreateGraphQLQuery(MetaobjectDefinitionCreateInput definition,
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

  public MetaobjectDefinitionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "metaobjectDefinitionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private MetaobjectDefinitionCreateInput definition;

    private String queryName;

    public MetaobjectDefinitionCreateGraphQLQuery build() {
      return new MetaobjectDefinitionCreateGraphQLQuery(definition, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for creating a metaobject definition.
     */
    public Builder definition(MetaobjectDefinitionCreateInput definition) {
      this.definition = definition;
      this.fieldsSet.add("definition");
      return this;
    }

    /**
     * The input fields for creating a metaobject definition.
     */
    public Builder definitionReference(String variableRef) {
      this.variableReferences.put("definition", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("MetaobjectDefinitionCreateInput"))).build());
      this.fieldsSet.add("definition");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
