package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingExpressCheckoutProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingExpressCheckoutProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingExpressCheckout"));
  }

  public CheckoutBrandingExpressCheckoutProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingExpressCheckoutButtonProjection<CheckoutBrandingExpressCheckoutProjection<PARENT, ROOT>, ROOT> button(
      ) {
     CheckoutBrandingExpressCheckoutButtonProjection<CheckoutBrandingExpressCheckoutProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingExpressCheckoutButtonProjection<>(this, getRoot());
     getFields().put("button", projection);
     return projection;
  }
}
