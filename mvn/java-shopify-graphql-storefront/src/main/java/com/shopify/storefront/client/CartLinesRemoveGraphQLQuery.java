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
 * Removes one or more merchandise lines from a
 * [`Cart`](https://shopify.dev/docs/api/storefront/current/objects/Cart).
 * Accepts up to 250 line IDs per request. Returns the updated cart along with
 * any errors or warnings.
 */
public class CartLinesRemoveGraphQLQuery extends GraphQLQuery {
  public CartLinesRemoveGraphQLQuery(String cartId, List<String> lineIds, List<String> viewKeys,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (lineIds != null || fieldsSet.contains("lineIds")) {
        getInput().put("lineIds", lineIds);
    }if (viewKeys != null || fieldsSet.contains("viewKeys")) {
        getInput().put("viewKeys", viewKeys);
    }
  }

  public CartLinesRemoveGraphQLQuery(String cartId, List<String> lineIds, List<String> viewKeys,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (lineIds != null || fieldsSet.contains("lineIds")) {
        getInput().put("lineIds", lineIds);
    }if (viewKeys != null || fieldsSet.contains("viewKeys")) {
        getInput().put("viewKeys", viewKeys);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartLinesRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartLinesRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String cartId;

    private List<String> lineIds;

    private List<String> viewKeys;

    private String queryName;

    public CartLinesRemoveGraphQLQuery build() {
      return new CartLinesRemoveGraphQLQuery(cartId, lineIds, viewKeys, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The merchandise line IDs to remove. Mutually exclusive with `viewKeys`.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder lineIds(List<String> lineIds) {
      this.lineIds = lineIds;
      this.fieldsSet.add("lineIds");
      return this;
    }

    /**
     * The merchandise line IDs to remove. Mutually exclusive with `viewKeys`.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder lineIdsReference(String variableRef) {
      this.variableReferences.put("lineIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID")))).build());
      this.fieldsSet.add("lineIds");
      return this;
    }

    /**
     * The merchandise line `view_key` values to remove, as exposed in Liquid via
     * the cart line `view_key` filter. Mutually exclusive with `lineIds`.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder viewKeys(List<String> viewKeys) {
      this.viewKeys = viewKeys;
      this.fieldsSet.add("viewKeys");
      return this;
    }

    /**
     * The merchandise line `view_key` values to remove, as exposed in Liquid via
     * the cart line `view_key` filter. Mutually exclusive with `lineIds`.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder viewKeysReference(String variableRef) {
      this.variableReferences.put("viewKeys", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String")))).build());
      this.fieldsSet.add("viewKeys");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
