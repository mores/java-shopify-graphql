package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingChoiceListProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingChoiceListProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingChoiceList"));
  }

  public CheckoutAndAccountsConfigurationBrandingChoiceListProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingChoiceListGroupProjection<CheckoutAndAccountsConfigurationBrandingChoiceListProjection<PARENT, ROOT>, ROOT> group(
      ) {
     CheckoutAndAccountsConfigurationBrandingChoiceListGroupProjection<CheckoutAndAccountsConfigurationBrandingChoiceListProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingChoiceListGroupProjection<>(this, getRoot());
     getFields().put("group", projection);
     return projection;
  }
}
