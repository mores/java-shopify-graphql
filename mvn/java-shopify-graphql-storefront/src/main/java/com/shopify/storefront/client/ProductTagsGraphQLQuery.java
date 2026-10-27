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
 * Returns a paginated list of all tags that have been added to
 * [products](https://shopify.dev/docs/api/storefront/current/objects/Product) in
 * the shop. Useful for building tag-based product filtering or navigation in a storefront.
 */
public class ProductTagsGraphQLQuery extends GraphQLQuery {
  public ProductTagsGraphQLQuery(int first, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    getInput().put("first", first);                   
  }

  public ProductTagsGraphQLQuery(int first, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    getInput().put("first", first);                   
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ProductTagsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productTags";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private int first;

    private String queryName;

    public ProductTagsGraphQLQuery build() {
      return new ProductTagsGraphQLQuery(first, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Returns up to the first `n` elements from the list.
     */
    public Builder first(int first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    /**
     * Returns up to the first `n` elements from the list.
     */
    public Builder firstReference(String variableRef) {
      this.variableReferences.put("first", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("Int"))).build());
      this.fieldsSet.add("first");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
