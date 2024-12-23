package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingGlobalProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingGlobalProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingGlobal"));
  }

  public CheckoutBrandingGlobalProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingGlobalCornerRadiusProjection<CheckoutBrandingGlobalProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutBrandingGlobalCornerRadiusProjection<CheckoutBrandingGlobalProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingGlobalCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutBrandingTypographyStyleGlobalProjection<CheckoutBrandingGlobalProjection<PARENT, ROOT>, ROOT> typography(
      ) {
     CheckoutBrandingTypographyStyleGlobalProjection<CheckoutBrandingGlobalProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyStyleGlobalProjection<>(this, getRoot());
     getFields().put("typography", projection);
     return projection;
  }
}
