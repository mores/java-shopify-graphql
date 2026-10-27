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
 * Updates the gift card codes applied to the cart. Unlike [`cartGiftCardCodesAdd`](https://shopify.dev/docs/api/storefront/current/mutations/cartGiftCardCodesAdd),
 * which adds codes without replacing existing ones, this mutation sets the gift
 * card codes for the cart. Gift card codes are case-insensitive.
 */
public class CartGiftCardCodesUpdateGraphQLQuery extends GraphQLQuery {
  public CartGiftCardCodesUpdateGraphQLQuery(String cartId, List<String> giftCardCodes,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (giftCardCodes != null || fieldsSet.contains("giftCardCodes")) {
        getInput().put("giftCardCodes", giftCardCodes);
    }
  }

  public CartGiftCardCodesUpdateGraphQLQuery(String cartId, List<String> giftCardCodes,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (giftCardCodes != null || fieldsSet.contains("giftCardCodes")) {
        getInput().put("giftCardCodes", giftCardCodes);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartGiftCardCodesUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartGiftCardCodesUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String cartId;

    private List<String> giftCardCodes;

    private String queryName;

    public CartGiftCardCodesUpdateGraphQLQuery build() {
      return new CartGiftCardCodesUpdateGraphQLQuery(cartId, giftCardCodes, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The case-insensitive gift card codes.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder giftCardCodes(List<String> giftCardCodes) {
      this.giftCardCodes = giftCardCodes;
      this.fieldsSet.add("giftCardCodes");
      return this;
    }

    /**
     * The case-insensitive gift card codes.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder giftCardCodesReference(String variableRef) {
      this.variableReferences.put("giftCardCodes", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))))).build());
      this.fieldsSet.add("giftCardCodes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
