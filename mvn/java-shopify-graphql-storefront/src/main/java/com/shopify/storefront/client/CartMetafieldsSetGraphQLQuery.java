package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CartMetafieldsSetInput;
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
 * Sets [`Metafield`](https://shopify.dev/docs/api/storefront/current/objects/Metafield) values on a cart, creating new metafields or updating existing ones. Accepts
 * up to 25 metafields per request.
 *   
 * Cart metafields can automatically copy to order metafields when an order is
 * created, if there's a matching order metafield definition with the [cart to order copyable](https://shopify.dev/docs/apps/build/metafields/use-metafield-capabilities#cart-to-order-copyable)
 * capability enabled.
 *   
 * > Note:
 * > This mutation doesn't trigger [Shopify
 * Functions](https://shopify.dev/docs/api/functions). Changes aren't available
 * to Shopify Functions until the buyer goes to checkout or performs another cart
 * interaction that triggers the functions.
 */
public class CartMetafieldsSetGraphQLQuery extends GraphQLQuery {
  public CartMetafieldsSetGraphQLQuery(List<CartMetafieldsSetInput> metafields, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
  }

  public CartMetafieldsSetGraphQLQuery(List<CartMetafieldsSetInput> metafields, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (metafields != null || fieldsSet.contains("metafields")) {
        getInput().put("metafields", metafields);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartMetafieldsSetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartMetafieldsSet";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<CartMetafieldsSetInput> metafields;

    private String queryName;

    public CartMetafieldsSetGraphQLQuery build() {
      return new CartMetafieldsSetGraphQLQuery(metafields, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The list of Cart metafield values to set. Maximum of 25.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder metafields(List<CartMetafieldsSetInput> metafields) {
      this.metafields = metafields;
      this.fieldsSet.add("metafields");
      return this;
    }

    /**
     * The list of Cart metafield values to set. Maximum of 25.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder metafieldsReference(String variableRef) {
      this.variableReferences.put("metafields", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("CartMetafieldsSetInput"))))).build());
      this.fieldsSet.add("metafields");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
