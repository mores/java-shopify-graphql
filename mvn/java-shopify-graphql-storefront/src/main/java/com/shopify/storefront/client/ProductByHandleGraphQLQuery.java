package com.shopify.storefront.client;

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
 * Retrieves a [`Product`](https://shopify.dev/docs/api/storefront/current/objects/Product)
 * by its handle. The handle is a URL-friendly identifier that's automatically
 * generated from the product's title. If no product exists with the specified
 * handle, returns `null`.
 */
public class ProductByHandleGraphQLQuery extends GraphQLQuery {
  public ProductByHandleGraphQLQuery(String handle, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (handle != null || fieldsSet.contains("handle")) {
        getInput().put("handle", handle);
    }
  }

  public ProductByHandleGraphQLQuery(String handle, String queryName, Set<String> fieldsSet,
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

  public ProductByHandleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productByHandle";
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

    public ProductByHandleGraphQLQuery build() {
      return new ProductByHandleGraphQLQuery(handle, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * A unique, human-readable string of the product's title.
     * A handle can contain letters, hyphens (`-`), and numbers, but no spaces.
     * The handle is used in the online store URL for the product.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * A unique, human-readable string of the product's title.
     * A handle can contain letters, hyphens (`-`), and numbers, but no spaces.
     * The handle is used in the online store URL for the product.
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
