package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CartPaymentInput;
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
 * Update the customer's payment method that will be used to checkout.
 */
public class CartPaymentUpdateGraphQLQuery extends GraphQLQuery {
  public CartPaymentUpdateGraphQLQuery(String cartId, CartPaymentInput payment, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (payment != null || fieldsSet.contains("payment")) {
        getInput().put("payment", payment);
    }
  }

  public CartPaymentUpdateGraphQLQuery(String cartId, CartPaymentInput payment, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (payment != null || fieldsSet.contains("payment")) {
        getInput().put("payment", payment);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartPaymentUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartPaymentUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String cartId;

    private CartPaymentInput payment;

    private String queryName;

    public CartPaymentUpdateGraphQLQuery build() {
      return new CartPaymentUpdateGraphQLQuery(cartId, payment, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The payment information for the cart that will be used at checkout.
     */
    public Builder payment(CartPaymentInput payment) {
      this.payment = payment;
      this.fieldsSet.add("payment");
      return this;
    }

    /**
     * The payment information for the cart that will be used at checkout.
     */
    public Builder paymentReference(String variableRef) {
      this.variableReferences.put("payment", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CartPaymentInput"))).build());
      this.fieldsSet.add("payment");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
