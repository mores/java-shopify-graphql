package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingLogoProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingLogoProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingLogo"));
  }

  public CheckoutBrandingLogoProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ImageProjection<CheckoutBrandingLogoProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<CheckoutBrandingLogoProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public CheckoutBrandingVisibilityProjection<CheckoutBrandingLogoProjection<PARENT, ROOT>, ROOT> visibility(
      ) {
     CheckoutBrandingVisibilityProjection<CheckoutBrandingLogoProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingVisibilityProjection<>(this, getRoot());
     getFields().put("visibility", projection);
     return projection;
  }

  public CheckoutBrandingLogoProjection<PARENT, ROOT> maxWidth() {
    getFields().put("maxWidth", null);
    return this;
  }
}
