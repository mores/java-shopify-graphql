package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CartSelectableAddressInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Adds delivery addresses to the cart.
 */
public class CartDeliveryAddressesAddGraphQLQuery extends GraphQLQuery {
  public CartDeliveryAddressesAddGraphQLQuery(String cartId,
      List<CartSelectableAddressInput> addresses, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (addresses != null || fieldsSet.contains("addresses")) {
        getInput().put("addresses", addresses);
    }
  }

  public CartDeliveryAddressesAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartDeliveryAddressesAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String cartId;

    private List<CartSelectableAddressInput> addresses;

    private String queryName;

    public CartDeliveryAddressesAddGraphQLQuery build() {
      return new CartDeliveryAddressesAddGraphQLQuery(cartId, addresses, queryName, fieldsSet);
               
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
     * A list of delivery addresses to add to the cart.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder addresses(List<CartSelectableAddressInput> addresses) {
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
