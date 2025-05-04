package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CartSelectableAddressUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates one or more delivery addresses on a cart.
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

    private String cartId;

    private List<CartSelectableAddressUpdateInput> addresses;

    private String queryName;

    public CartDeliveryAddressesUpdateGraphQLQuery build() {
      return new CartDeliveryAddressesUpdateGraphQLQuery(cartId, addresses, queryName, fieldsSet);
               
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
     * The delivery addresses to update.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder addresses(List<CartSelectableAddressUpdateInput> addresses) {
      this.addresses = addresses;
      this.fieldsSet.add("addresses");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
