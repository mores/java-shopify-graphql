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
 * Submit the cart for checkout completion.
 */
public class CartSubmitForCompletionGraphQLQuery extends GraphQLQuery {
  public CartSubmitForCompletionGraphQLQuery(String cartId, String attemptToken, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (attemptToken != null || fieldsSet.contains("attemptToken")) {
        getInput().put("attemptToken", attemptToken);
    }
  }

  public CartSubmitForCompletionGraphQLQuery(String cartId, String attemptToken, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (attemptToken != null || fieldsSet.contains("attemptToken")) {
        getInput().put("attemptToken", attemptToken);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartSubmitForCompletionGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartSubmitForCompletion";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String cartId;

    private String attemptToken;

    private String queryName;

    public CartSubmitForCompletionGraphQLQuery build() {
      return new CartSubmitForCompletionGraphQLQuery(cartId, attemptToken, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the cart.
     */
    public Builder cartId(String cartId) {
      this.cartId = cartId;
      this.fieldsSet.add("cartId");
      return this;
    }

    /**
     * The ID of the cart.
     */
    public Builder cartIdReference(String variableRef) {
      this.variableReferences.put("cartId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("cartId");
      return this;
    }

    /**
     * The attemptToken is used to guarantee an idempotent result.
     * If more than one call uses the same attemptToken within a short period of time, only one will be accepted.
     */
    public Builder attemptToken(String attemptToken) {
      this.attemptToken = attemptToken;
      this.fieldsSet.add("attemptToken");
      return this;
    }

    /**
     * The attemptToken is used to guarantee an idempotent result.
     * If more than one call uses the same attemptToken within a short period of time, only one will be accepted.
     */
    public Builder attemptTokenReference(String variableRef) {
      this.variableReferences.put("attemptToken", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("attemptToken");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
