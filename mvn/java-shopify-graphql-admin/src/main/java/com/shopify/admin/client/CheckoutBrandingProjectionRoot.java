package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingProjectionRoot() {
    super(null, null, java.util.Optional.of("CheckoutBranding"));
  }

  public CheckoutBrandingProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingCustomizationsProjection<CheckoutBrandingProjectionRoot<PARENT, ROOT>, CheckoutBrandingProjectionRoot<PARENT, ROOT>> customizations(
      ) {
    CheckoutBrandingCustomizationsProjection<CheckoutBrandingProjectionRoot<PARENT, ROOT>, CheckoutBrandingProjectionRoot<PARENT, ROOT>> projection = new CheckoutBrandingCustomizationsProjection<>(this, this);    
    getFields().put("customizations", projection);
    return projection;
  }

  public CheckoutBrandingDesignSystemProjection<CheckoutBrandingProjectionRoot<PARENT, ROOT>, CheckoutBrandingProjectionRoot<PARENT, ROOT>> designSystem(
      ) {
    CheckoutBrandingDesignSystemProjection<CheckoutBrandingProjectionRoot<PARENT, ROOT>, CheckoutBrandingProjectionRoot<PARENT, ROOT>> projection = new CheckoutBrandingDesignSystemProjection<>(this, this);    
    getFields().put("designSystem", projection);
    return projection;
  }
}
