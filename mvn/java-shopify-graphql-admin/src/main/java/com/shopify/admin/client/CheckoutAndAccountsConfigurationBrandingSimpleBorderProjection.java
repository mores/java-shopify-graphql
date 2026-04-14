package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingSimpleBorder"));
  }

  public CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
