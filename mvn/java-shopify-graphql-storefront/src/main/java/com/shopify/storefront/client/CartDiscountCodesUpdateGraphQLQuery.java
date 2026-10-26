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
 * Updates the discount codes applied to a
 * [`Cart`](https://shopify.dev/docs/api/storefront/current/objects/Cart). This
 * mutation replaces all existing discount codes with the provided list, so pass
 * an empty array to remove all codes. Discount codes are case-insensitive.
 *   
 * After updating, check each [`CartDiscountCode`](https://shopify.dev/docs/api/storefront/current/objects/CartDiscountCode) in the cart's [`discountCodes`](https://shopify.dev/docs/api/storefront/current/objects/Cart#field-Cart.fields.discountCodes)
 * field to see whether the code is applicable to the cart's current contents.
 */
public class CartDiscountCodesUpdateGraphQLQuery extends GraphQLQuery {
  public CartDiscountCodesUpdateGraphQLQuery(String cartId, List<String> discountCodes,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (discountCodes != null || fieldsSet.contains("discountCodes")) {
        getInput().put("discountCodes", discountCodes);
    }
  }

  public CartDiscountCodesUpdateGraphQLQuery(String cartId, List<String> discountCodes,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (discountCodes != null || fieldsSet.contains("discountCodes")) {
        getInput().put("discountCodes", discountCodes);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartDiscountCodesUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartDiscountCodesUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String cartId;

    private List<String> discountCodes;

    private String queryName;

    public CartDiscountCodesUpdateGraphQLQuery build() {
      return new CartDiscountCodesUpdateGraphQLQuery(cartId, discountCodes, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The case-insensitive discount codes that the customer added at checkout.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      this.fieldsSet.add("discountCodes");
      return this;
    }

    /**
     * The case-insensitive discount codes that the customer added at checkout.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder discountCodesReference(String variableRef) {
      this.variableReferences.put("discountCodes", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))))).build());
      this.fieldsSet.add("discountCodes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
