package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingDividerStyleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingDividerStyleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingDividerStyle"));
  }

  public CheckoutBrandingDividerStyleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingBorderStyleProjection<CheckoutBrandingDividerStyleProjection<PARENT, ROOT>, ROOT> borderStyle(
      ) {
     CheckoutBrandingBorderStyleProjection<CheckoutBrandingDividerStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBorderStyleProjection<>(this, getRoot());
     getFields().put("borderStyle", projection);
     return projection;
  }

  public CheckoutBrandingBorderWidthProjection<CheckoutBrandingDividerStyleProjection<PARENT, ROOT>, ROOT> borderWidth(
      ) {
     CheckoutBrandingBorderWidthProjection<CheckoutBrandingDividerStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBorderWidthProjection<>(this, getRoot());
     getFields().put("borderWidth", projection);
     return projection;
  }
}
