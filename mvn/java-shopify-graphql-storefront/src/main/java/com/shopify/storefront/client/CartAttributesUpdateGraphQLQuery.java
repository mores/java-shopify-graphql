package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.AttributeInput;
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
 * Updates the attributes on a
 * [`Cart`](https://shopify.dev/docs/api/storefront/current/objects/Cart).
 * Attributes are custom key-value pairs that store additional information, such
 * as gift messages, special instructions, or order notes.
 */
public class CartAttributesUpdateGraphQLQuery extends GraphQLQuery {
  public CartAttributesUpdateGraphQLQuery(List<AttributeInput> attributes, String cartId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (attributes != null || fieldsSet.contains("attributes")) {
        getInput().put("attributes", attributes);
    }if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }
  }

  public CartAttributesUpdateGraphQLQuery(List<AttributeInput> attributes, String cartId,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (attributes != null || fieldsSet.contains("attributes")) {
        getInput().put("attributes", attributes);
    }if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CartAttributesUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartAttributesUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<AttributeInput> attributes;

    private String cartId;

    private String queryName;

    public CartAttributesUpdateGraphQLQuery build() {
      return new CartAttributesUpdateGraphQLQuery(attributes, cartId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * An array of key-value pairs that contains additional information about the cart.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder attributes(List<AttributeInput> attributes) {
      this.attributes = attributes;
      this.fieldsSet.add("attributes");
      return this;
    }

    /**
     * An array of key-value pairs that contains additional information about the cart.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder attributesReference(String variableRef) {
      this.variableReferences.put("attributes", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("AttributeInput"))))).build());
      this.fieldsSet.add("attributes");
      return this;
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
