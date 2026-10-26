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
 * Removes delivery addresses from a
 * [`Cart`](https://shopify.dev/docs/api/storefront/current/objects/Cart) by
 * their IDs, allowing batch removal in a single request.
 */
public class CartDeliveryAddressesRemoveGraphQLQuery extends GraphQLQuery {
  public CartDeliveryAddressesRemoveGraphQLQuery(String cartId, List<String> addressIds,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (addressIds != null || fieldsSet.contains("addressIds")) {
        getInput().put("addressIds", addressIds);
    }
  }

  public CartDeliveryAddressesRemoveGraphQLQuery(String cartId, List<String> addressIds,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (addressIds != null || fieldsSet.contains("addressIds")) {
        getInput().put("addressIds", addressIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartDeliveryAddressesRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartDeliveryAddressesRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String cartId;

    private List<String> addressIds;

    private String queryName;

    public CartDeliveryAddressesRemoveGraphQLQuery build() {
      return new CartDeliveryAddressesRemoveGraphQLQuery(cartId, addressIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * A list of delivery addresses by handle to remove from the cart.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder addressIds(List<String> addressIds) {
      this.addressIds = addressIds;
      this.fieldsSet.add("addressIds");
      return this;
    }

    /**
     * A list of delivery addresses by handle to remove from the cart.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder addressIdsReference(String variableRef) {
      this.variableReferences.put("addressIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("addressIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
