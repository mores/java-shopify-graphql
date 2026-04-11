package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingShopifyFontProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingShopifyFontProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingShopifyFont"));
  }

  public CheckoutAndAccountsConfigurationBrandingShopifyFontProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingShopifyFontProjection<PARENT, ROOT> sources() {
    getFields().put("sources", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingShopifyFontProjection<PARENT, ROOT> weight() {
    getFields().put("weight", null);
    return this;
  }
}
