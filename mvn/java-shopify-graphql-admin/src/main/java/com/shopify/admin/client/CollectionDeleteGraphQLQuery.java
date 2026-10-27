package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CollectionDeleteInput;
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
 * Deletes a collection and removes it permanently from the store. This operation
 * cannot be undone and will remove the collection from all sales channels where
 * it was published.
 *   
 * For example, when merchants discontinue seasonal promotions or reorganize
 * their catalog structure, they can delete outdated collections like "Back to
 * School 2023" to keep their store organized.
 *   
 * Use `CollectionDelete` to:
 * - Remove outdated or unused collections from stores
 * - Clean up collection structures during catalog reorganization
 * - Implement collection management tools with deletion capabilities
 *   
 * Products within the deleted collection remain in the store but are no longer grouped under that collection.
 *   
 * Learn more about [collection management](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection).
 */
public class CollectionDeleteGraphQLQuery extends GraphQLQuery {
  public CollectionDeleteGraphQLQuery(CollectionDeleteInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CollectionDeleteGraphQLQuery(CollectionDeleteInput input, String queryName,
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

  public CollectionDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "collectionDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private CollectionDeleteInput input;

    private String queryName;

    public CollectionDeleteGraphQLQuery build() {
      return new CollectionDeleteGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The collection to delete.
     */
    public Builder input(CollectionDeleteInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The collection to delete.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CollectionDeleteInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
