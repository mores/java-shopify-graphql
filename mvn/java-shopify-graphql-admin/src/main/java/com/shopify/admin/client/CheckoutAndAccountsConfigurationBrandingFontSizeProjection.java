package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingFontSizeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingFontSizeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingFontSize"));
  }

  public CheckoutAndAccountsConfigurationBrandingFontSizeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingFontSizeProjection<PARENT, ROOT> base() {
    getFields().put("base", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingFontSizeProjection<PARENT, ROOT> ratio() {
    getFields().put("ratio", null);
    return this;
  }
}
