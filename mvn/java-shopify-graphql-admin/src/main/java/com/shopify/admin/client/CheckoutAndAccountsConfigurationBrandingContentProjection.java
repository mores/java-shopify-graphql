package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingContentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingContentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingContent"));
  }

  public CheckoutAndAccountsConfigurationBrandingContentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<CheckoutAndAccountsConfigurationBrandingContentProjection<PARENT, ROOT>, ROOT> divider(
      ) {
     CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<CheckoutAndAccountsConfigurationBrandingContentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<>(this, getRoot());
     getFields().put("divider", projection);
     return projection;
  }
}
