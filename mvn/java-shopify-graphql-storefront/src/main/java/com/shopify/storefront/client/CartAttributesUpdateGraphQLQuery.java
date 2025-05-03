package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.AttributeInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates the attributes on a cart.
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

    private List<AttributeInput> attributes;

    private String cartId;

    private String queryName;

    public CartAttributesUpdateGraphQLQuery build() {
      return new CartAttributesUpdateGraphQLQuery(attributes, cartId, queryName, fieldsSet);
               
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
     * The ID of the cart.
     */
    public Builder cartId(String cartId) {
      this.cartId = cartId;
      this.fieldsSet.add("cartId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
