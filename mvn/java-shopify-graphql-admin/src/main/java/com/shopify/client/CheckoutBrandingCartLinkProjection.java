package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingCartLinkProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingCartLinkProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingCartLink"));
  }

  public CheckoutBrandingCartLinkProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingVisibilityProjection<CheckoutBrandingCartLinkProjection<PARENT, ROOT>, ROOT> visibility(
      ) {
     CheckoutBrandingVisibilityProjection<CheckoutBrandingCartLinkProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingVisibilityProjection<>(this, getRoot());
     getFields().put("visibility", projection);
     return projection;
  }
}
