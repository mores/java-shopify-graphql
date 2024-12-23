package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingUpsertProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingUpsertProjectionRoot() {
    super(null, null, java.util.Optional.of("CheckoutBrandingUpsertPayload"));
  }

  public CheckoutBrandingUpsertProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingProjection<CheckoutBrandingUpsertProjectionRoot<PARENT, ROOT>, CheckoutBrandingUpsertProjectionRoot<PARENT, ROOT>> checkoutBranding(
      ) {
    CheckoutBrandingProjection<CheckoutBrandingUpsertProjectionRoot<PARENT, ROOT>, CheckoutBrandingUpsertProjectionRoot<PARENT, ROOT>> projection = new CheckoutBrandingProjection<>(this, this);    
    getFields().put("checkoutBranding", projection);
    return projection;
  }

  public CheckoutBrandingUpsertUserErrorProjection<CheckoutBrandingUpsertProjectionRoot<PARENT, ROOT>, CheckoutBrandingUpsertProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CheckoutBrandingUpsertUserErrorProjection<CheckoutBrandingUpsertProjectionRoot<PARENT, ROOT>, CheckoutBrandingUpsertProjectionRoot<PARENT, ROOT>> projection = new CheckoutBrandingUpsertUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
