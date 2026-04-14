package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingChoiceListGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingChoiceListGroupProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingChoiceListGroup"));
  }

  public CheckoutAndAccountsConfigurationBrandingChoiceListGroupProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingChoiceListGroupProjection<PARENT, ROOT>, ROOT> spacing(
      ) {
     CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingChoiceListGroupProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("spacing", projection);
     return projection;
  }
}
