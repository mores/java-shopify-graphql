package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CartSelectableAddressInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Replaces all delivery addresses on a
 * [`Cart`](https://shopify.dev/docs/api/storefront/current/objects/Cart) with a
 * new set of addresses in a single operation. Unlike [`cartDeliveryAddressesUpdate`](https://shopify.dev/docs/api/storefront/current/mutations/cartDeliveryAddressesUpdate),
 * which modifies existing addresses, this mutation removes all current addresses
 * and sets the provided list as the new delivery addresses.
 *   
 * One address can be marked as selected, and each address can be flagged for
 * one-time use or configured with a specific validation strategy.
 */
public class CartDeliveryAddressesReplaceGraphQLQuery extends GraphQLQuery {
  public CartDeliveryAddressesReplaceGraphQLQuery(String cartId,
      List<CartSelectableAddressInput> addresses, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (addresses != null || fieldsSet.contains("addresses")) {
        getInput().put("addresses", addresses);
    }
  }

  public CartDeliveryAddressesReplaceGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartDeliveryAddressesReplace";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String cartId;

    private List<CartSelectableAddressInput> addresses;

    private String queryName;

    public CartDeliveryAddressesReplaceGraphQLQuery build() {
      return new CartDeliveryAddressesReplaceGraphQLQuery(cartId, addresses, queryName, fieldsSet);
               
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
     * A list of delivery addresses to replace on the cart.
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
