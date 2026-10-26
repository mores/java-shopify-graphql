package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.StorefrontAccessTokenInput;
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
 * Creates a storefront access token that delegates unauthenticated access scopes
 * to clients using the [Storefront
 * API](https://shopify.dev/docs/api/storefront). The token provides public
 * access to storefront resources without requiring customer authentication.
 *   
 * Each shop can have up to 100 active [`StorefrontAccessToken`](https://shopify.dev/docs/api/admin-graphql/latest/objects/StorefrontAccessToken)
 * objects. Headless storefronts, mobile apps, and other client applications
 * typically use these tokens to access public storefront data.
 *   
 * Learn more about [building with the Storefront API](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/getting-started).
 */
public class StorefrontAccessTokenCreateGraphQLQuery extends GraphQLQuery {
  public StorefrontAccessTokenCreateGraphQLQuery(StorefrontAccessTokenInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public StorefrontAccessTokenCreateGraphQLQuery(StorefrontAccessTokenInput input, String queryName,
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

  public StorefrontAccessTokenCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "storefrontAccessTokenCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private StorefrontAccessTokenInput input;

    private String queryName;

    public StorefrontAccessTokenCreateGraphQLQuery build() {
      return new StorefrontAccessTokenCreateGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Provides the input fields for creating a storefront access token.
     */
    public Builder input(StorefrontAccessTokenInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * Provides the input fields for creating a storefront access token.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("StorefrontAccessTokenInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
