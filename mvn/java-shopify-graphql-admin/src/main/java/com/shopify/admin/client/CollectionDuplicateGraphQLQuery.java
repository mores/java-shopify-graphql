package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CollectionDuplicateInput;
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
 * Duplicates a [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection).
 *   
 * An existing collection ID and new title are required.
 *   
 * ## Publication Duplication
 *   
 * Publications may be excluded by passing `copyPublications: false` in the input.
 *   
 * ## Metafields
 * Metafield values are not duplicated if the unique values capability is enabled.
 */
public class CollectionDuplicateGraphQLQuery extends GraphQLQuery {
  public CollectionDuplicateGraphQLQuery(CollectionDuplicateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CollectionDuplicateGraphQLQuery(CollectionDuplicateInput input, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CollectionDuplicateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionDuplicate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private CollectionDuplicateInput input;

    private String queryName;

    public CollectionDuplicateGraphQLQuery build() {
      return new CollectionDuplicateGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input for duplicating a collection.
     */
    public Builder input(CollectionDuplicateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input for duplicating a collection.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CollectionDuplicateInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
