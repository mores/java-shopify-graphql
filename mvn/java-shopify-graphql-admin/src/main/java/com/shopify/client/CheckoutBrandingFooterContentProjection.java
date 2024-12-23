package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingFooterContentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingFooterContentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingFooterContent"));
  }

  public CheckoutBrandingFooterContentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingVisibilityProjection<CheckoutBrandingFooterContentProjection<PARENT, ROOT>, ROOT> visibility(
      ) {
     CheckoutBrandingVisibilityProjection<CheckoutBrandingFooterContentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingVisibilityProjection<>(this, getRoot());
     getFields().put("visibility", projection);
     return projection;
  }
}
