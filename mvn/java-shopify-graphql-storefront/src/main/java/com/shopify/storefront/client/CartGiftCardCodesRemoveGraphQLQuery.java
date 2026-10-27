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
 * Removes gift cards from a
 * [`Cart`](https://shopify.dev/docs/api/storefront/current/objects/Cart) using
 * their IDs. You can retrieve the IDs of applied gift cards from the cart's [`appliedGiftCards`](https://shopify.dev/docs/api/storefront/current/objects/Cart#field-Cart.fields.appliedGiftCards) field.
 */
public class CartGiftCardCodesRemoveGraphQLQuery extends GraphQLQuery {
  public CartGiftCardCodesRemoveGraphQLQuery(String cartId, List<String> appliedGiftCardIds,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (appliedGiftCardIds != null || fieldsSet.contains("appliedGiftCardIds")) {
        getInput().put("appliedGiftCardIds", appliedGiftCardIds);
    }
  }

  public CartGiftCardCodesRemoveGraphQLQuery(String cartId, List<String> appliedGiftCardIds,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (appliedGiftCardIds != null || fieldsSet.contains("appliedGiftCardIds")) {
        getInput().put("appliedGiftCardIds", appliedGiftCardIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartGiftCardCodesRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartGiftCardCodesRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String cartId;

    private List<String> appliedGiftCardIds;

    private String queryName;

    public CartGiftCardCodesRemoveGraphQLQuery build() {
      return new CartGiftCardCodesRemoveGraphQLQuery(cartId, appliedGiftCardIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The gift cards to remove.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder appliedGiftCardIds(List<String> appliedGiftCardIds) {
      this.appliedGiftCardIds = appliedGiftCardIds;
      this.fieldsSet.add("appliedGiftCardIds");
      return this;
    }

    /**
     * The gift cards to remove.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder appliedGiftCardIdsReference(String variableRef) {
      this.variableReferences.put("appliedGiftCardIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("appliedGiftCardIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
