package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCustomFontProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCustomFontProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCustomFont"));
  }

  public CheckoutAndAccountsConfigurationBrandingCustomFontProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomFontProjection<PARENT, ROOT> genericFileId(
      ) {
    getFields().put("genericFileId", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomFontProjection<PARENT, ROOT> sources() {
    getFields().put("sources", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomFontProjection<PARENT, ROOT> weight() {
    getFields().put("weight", null);
    return this;
  }
}
