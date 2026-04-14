package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingHeaderCartLinkProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingHeaderCartLinkProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingHeaderCartLink"));
  }

  public CheckoutAndAccountsConfigurationBrandingHeaderCartLinkProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCartLinkContentTypeProjection<CheckoutAndAccountsConfigurationBrandingHeaderCartLinkProjection<PARENT, ROOT>, ROOT> contentType(
      ) {
     CheckoutAndAccountsConfigurationBrandingCartLinkContentTypeProjection<CheckoutAndAccountsConfigurationBrandingHeaderCartLinkProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCartLinkContentTypeProjection<>(this, getRoot());
     getFields().put("contentType", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingHeaderCartLinkProjection<PARENT, ROOT>, ROOT> image(
      ) {
     CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingHeaderCartLinkProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingImageValueProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }
}
