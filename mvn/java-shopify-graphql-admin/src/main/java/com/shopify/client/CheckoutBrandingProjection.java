package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBranding"));
  }

  public CheckoutBrandingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingCustomizationsProjection<CheckoutBrandingProjection<PARENT, ROOT>, ROOT> customizations(
      ) {
     CheckoutBrandingCustomizationsProjection<CheckoutBrandingProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingCustomizationsProjection<>(this, getRoot());
     getFields().put("customizations", projection);
     return projection;
  }

  public CheckoutBrandingDesignSystemProjection<CheckoutBrandingProjection<PARENT, ROOT>, ROOT> designSystem(
      ) {
     CheckoutBrandingDesignSystemProjection<CheckoutBrandingProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingDesignSystemProjection<>(this, getRoot());
     getFields().put("designSystem", projection);
     return projection;
  }
}
