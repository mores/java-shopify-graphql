package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingContainerDividerProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingContainerDividerProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingContainerDivider"));
  }

  public CheckoutBrandingContainerDividerProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingBorderStyleProjection<CheckoutBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> borderStyle(
      ) {
     CheckoutBrandingBorderStyleProjection<CheckoutBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBorderStyleProjection<>(this, getRoot());
     getFields().put("borderStyle", projection);
     return projection;
  }

  public CheckoutBrandingBorderWidthProjection<CheckoutBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> borderWidth(
      ) {
     CheckoutBrandingBorderWidthProjection<CheckoutBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBorderWidthProjection<>(this, getRoot());
     getFields().put("borderWidth", projection);
     return projection;
  }

  public CheckoutBrandingVisibilityProjection<CheckoutBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> visibility(
      ) {
     CheckoutBrandingVisibilityProjection<CheckoutBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingVisibilityProjection<>(this, getRoot());
     getFields().put("visibility", projection);
     return projection;
  }
}
