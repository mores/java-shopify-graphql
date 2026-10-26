package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CartSelectableAddressUpdateInput;
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
 * Updates one or more delivery addresses on a
 * [`Cart`](https://shopify.dev/docs/api/storefront/current/objects/Cart). Each
 * address can be modified to change its details, set it as the pre-selected
 * address for checkout, or mark it for one-time use so it isn't saved to the
 * customer's account.
 */
public class CartDeliveryAddressesUpdateGraphQLQuery extends GraphQLQuery {
  public CartDeliveryAddressesUpdateGraphQLQuery(String cartId,
      List<CartSelectableAddressUpdateInput> addresses, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (addresses != null || fieldsSet.contains("addresses")) {
        getInput().put("addresses", addresses);
    }
  }

  public CartDeliveryAddressesUpdateGraphQLQuery(String cartId,
      List<CartSelectableAddressUpdateInput> addresses, String queryName, Set<String> fieldsSet,
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

  public CartDeliveryAddressesUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartDeliveryAddressesUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String cartId;

    private List<CartSelectableAddressUpdateInput> addresses;

    private String queryName;

    public CartDeliveryAddressesUpdateGraphQLQuery build() {
      return new CartDeliveryAddressesUpdateGraphQLQuery(cartId, addresses, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The delivery addresses to update.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder addresses(List<CartSelectableAddressUpdateInput> addresses) {
      this.addresses = addresses;
      this.fieldsSet.add("addresses");
      return this;
    }

    /**
     * The delivery addresses to update.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder addressesReference(String variableRef) {
      this.variableReferences.put("addresses", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("CartSelectableAddressUpdateInput"))))).build());
      this.fieldsSet.add("addresses");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
