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
 * Retrieves a [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
 * using its handle. A handle is a unique, URL-friendly string that Shopify
 * automatically generates from the product's title.
 *   
 * Returns `null` if no product exists with the specified handle.
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
     * A unique string that identifies the product. Handles are automatically
     * generated based on the product's title, and are always lowercase. Whitespace
     * and special characters are replaced with a hyphen: `-`. If there are
     * multiple consecutive whitespace or special characters, then they're replaced
     * with a single hyphen. Whitespace or special characters at the beginning are
     * removed. If a duplicate product title is used, then the handle is
     * auto-incremented by one. For example, if you had two products called
     * `Potion`, then their handles would be `potion` and `potion-1`. After a
     * product has been created, changing the product title doesn't update the handle.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      this.fieldsSet.add("handle");
      return this;
    }

    /**
     * A unique string that identifies the product. Handles are automatically
     * generated based on the product's title, and are always lowercase. Whitespace
     * and special characters are replaced with a hyphen: `-`. If there are
     * multiple consecutive whitespace or special characters, then they're replaced
     * with a single hyphen. Whitespace or special characters at the beginning are
     * removed. If a duplicate product title is used, then the handle is
     * auto-incremented by one. For example, if you had two products called
     * `Potion`, then their handles would be `potion` and `potion-1`. After a
     * product has been created, changing the product title doesn't update the handle.
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
