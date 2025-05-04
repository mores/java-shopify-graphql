package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingExpressCheckoutButtonProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingExpressCheckoutButtonProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingExpressCheckoutButton"));
  }

  public CheckoutBrandingExpressCheckoutButtonProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingCornerRadiusProjection<CheckoutBrandingExpressCheckoutButtonProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutBrandingCornerRadiusProjection<CheckoutBrandingExpressCheckoutButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }
}
