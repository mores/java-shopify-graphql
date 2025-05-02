package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CartSelectedDeliveryOptionInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Update the selected delivery options for a delivery group.
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

    private String cartId;

    private List<CartSelectedDeliveryOptionInput> selectedDeliveryOptions;

    private String queryName;

    public CartSelectedDeliveryOptionsUpdateGraphQLQuery build() {
      return new CartSelectedDeliveryOptionsUpdateGraphQLQuery(cartId, selectedDeliveryOptions, queryName, fieldsSet);
               
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
