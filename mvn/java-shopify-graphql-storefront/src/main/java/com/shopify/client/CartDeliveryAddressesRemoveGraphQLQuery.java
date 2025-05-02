package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Removes delivery addresses from the cart.
 */
public class CartDeliveryAddressesRemoveGraphQLQuery extends GraphQLQuery {
  public CartDeliveryAddressesRemoveGraphQLQuery(List<String> addressIds, String cartId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (addressIds != null || fieldsSet.contains("addressIds")) {
        getInput().put("addressIds", addressIds);
    }if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
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

    private List<String> addressIds;

    private String cartId;

    private String queryName;

    public CartDeliveryAddressesRemoveGraphQLQuery build() {
      return new CartDeliveryAddressesRemoveGraphQLQuery(addressIds, cartId, queryName, fieldsSet);
               
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
