package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CartSelectedDeliveryOptionInput;
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
 * Updates the selected delivery option for one or more [`CartDeliveryGroup`](https://shopify.dev/docs/api/storefront/current/objects/CartDeliveryGroup)
 * objects in a cart. Each delivery group represents items shipping to a specific
 * address and offers multiple delivery options with different costs and methods.
 *   
 * Use this mutation when a customer chooses their preferred shipping method
 * during checkout. The [`deliveryOptionHandle`](https://shopify.dev/docs/api/storefront/current/input-objects/CartSelectedDeliveryOptionInput#field-CartSelectedDeliveryOptionInput.fields.deliveryOptionHandle)
 * identifies which [`CartDeliveryOption`](https://shopify.dev/docs/api/storefront/current/objects/CartDeliveryOption)
 * to select for each delivery group.
 */
public class CartSelectedDeliveryOptionsUpdateGraphQLQuery extends GraphQLQuery {
  public CartSelectedDeliveryOptionsUpdateGraphQLQuery(String cartId,
      List<CartSelectedDeliveryOptionInput> selectedDeliveryOptions, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (selectedDeliveryOptions != null || fieldsSet.contains("selectedDeliveryOptions")) {
        getInput().put("selectedDeliveryOptions", selectedDeliveryOptions);
    }
  }

  public CartSelectedDeliveryOptionsUpdateGraphQLQuery(String cartId,
      List<CartSelectedDeliveryOptionInput> selectedDeliveryOptions, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (selectedDeliveryOptions != null || fieldsSet.contains("selectedDeliveryOptions")) {
        getInput().put("selectedDeliveryOptions", selectedDeliveryOptions);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartSelectedDeliveryOptionsUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartSelectedDeliveryOptionsUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String cartId;

    private List<CartSelectedDeliveryOptionInput> selectedDeliveryOptions;

    private String queryName;

    public CartSelectedDeliveryOptionsUpdateGraphQLQuery build() {
      return new CartSelectedDeliveryOptionsUpdateGraphQLQuery(cartId, selectedDeliveryOptions, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The selected delivery options.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder selectedDeliveryOptions(
        List<CartSelectedDeliveryOptionInput> selectedDeliveryOptions) {
      this.selectedDeliveryOptions = selectedDeliveryOptions;
      this.fieldsSet.add("selectedDeliveryOptions");
      return this;
    }

    /**
     * The selected delivery options.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder selectedDeliveryOptionsReference(String variableRef) {
      this.variableReferences.put("selectedDeliveryOptions", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("CartSelectedDeliveryOptionInput"))))).build());
      this.fieldsSet.add("selectedDeliveryOptions");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
