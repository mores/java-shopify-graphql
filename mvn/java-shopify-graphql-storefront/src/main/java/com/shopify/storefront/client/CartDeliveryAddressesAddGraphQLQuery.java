package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CartSelectableAddressInput;
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
 * Adds delivery addresses to a
 * [`Cart`](https://shopify.dev/docs/api/storefront/current/objects/Cart). A cart
 * can have up to 20 delivery addresses. One address can be marked as selected
 * for checkout, and addresses can optionally be marked as one-time use so they
 * aren't saved to the customer's account.
 */
public class CartDeliveryAddressesAddGraphQLQuery extends GraphQLQuery {
  public CartDeliveryAddressesAddGraphQLQuery(String cartId,
      List<CartSelectableAddressInput> addresses, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (addresses != null || fieldsSet.contains("addresses")) {
        getInput().put("addresses", addresses);
    }
  }

  public CartDeliveryAddressesAddGraphQLQuery(String cartId,
      List<CartSelectableAddressInput> addresses, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (addresses != null || fieldsSet.contains("addresses")) {
        getInput().put("addresses", addresses);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartDeliveryAddressesAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartDeliveryAddressesAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String cartId;

    private List<CartSelectableAddressInput> addresses;

    private String queryName;

    public CartDeliveryAddressesAddGraphQLQuery build() {
      return new CartDeliveryAddressesAddGraphQLQuery(cartId, addresses, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * A list of delivery addresses to add to the cart.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder addresses(List<CartSelectableAddressInput> addresses) {
      this.addresses = addresses;
      this.fieldsSet.add("addresses");
      return this;
    }

    /**
     * A list of delivery addresses to add to the cart.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder addressesReference(String variableRef) {
      this.variableReferences.put("addresses", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("CartSelectableAddressInput"))))).build());
      this.fieldsSet.add("addresses");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
