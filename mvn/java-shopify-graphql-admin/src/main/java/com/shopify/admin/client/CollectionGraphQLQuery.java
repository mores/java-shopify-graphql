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
 * Retrieves a [collection](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection) by its ID.
 * A collection represents a grouping of [products](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
 * that merchants can display and sell as a group in their [online
 * store](https://shopify.dev/docs/apps/build/online-store) and
 * other [sales channels](https://shopify.dev/docs/apps/build/sales-channels).
 *   
 * Use the `collection` query when you need to:
 *   
 * - Manage collection publishing across sales channels
 * - Access collection metadata and SEO information
 * - Work with collection conditions and product relationships
 *   
 * A collection determines which products it includes through conditions that automatically include
 * products that match, and through manual selections of individual products. Each collection has
 * associated metadata including title, description, handle, image, and
 * [metafields](https://shopify.dev/docs/apps/build/custom-data/metafields).
 */
public class CollectionGraphQLQuery extends GraphQLQuery {
  public CollectionGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CollectionGraphQLQuery(String id, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CollectionGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "collection";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String queryName;

    public CollectionGraphQLQuery build() {
      return new CollectionGraphQLQuery(id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the `Collection` to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the `Collection` to return.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
