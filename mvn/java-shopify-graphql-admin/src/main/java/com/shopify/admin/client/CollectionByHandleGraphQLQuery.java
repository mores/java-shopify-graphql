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
 * Retrieves a collection by its unique handle identifier. Handles provide a
 * URL-friendly way to reference collections and are commonly used in storefront
 * URLs and navigation.
 *   
 * For example, a collection with the title "Summer Sale" might have the handle
 * `summer-sale`, allowing you to fetch it directly without knowing the internal ID.
 *   
 * Use `CollectionByHandle` to:
 * - Fetch collections for storefront display and navigation
 * - Build collection-based URLs and routing systems
 * - Validate collection existence before displaying content
 *   
 * Handles are automatically generated from collection titles but can be
 * customized by merchants for SEO and branding purposes.
 *   
 * Learn more about [collections](https://shopify.dev/docs/api/admin-graphql/latest/objects/Collection).
 */
public class CollectionByHandleGraphQLQuery extends GraphQLQuery {
  public CollectionByHandleGraphQLQuery(String handle, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public CollectionByHandleGraphQLQuery(String handle, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
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

  public CollectionByHandleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "collectionByHandle";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String handle;

    private String queryName;

    public CollectionByHandleGraphQLQuery build() {
      return new CollectionByHandleGraphQLQuery(handle, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The handle of the collection.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * The handle of the collection.
     */
    public Builder handleReference(String variableRef) {
      this.variableReferences.put("handle", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("handle");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
