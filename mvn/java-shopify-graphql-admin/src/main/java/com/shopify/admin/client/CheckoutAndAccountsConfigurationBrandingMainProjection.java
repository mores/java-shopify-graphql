package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingMainProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingMainProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingMain"));
  }

  public CheckoutAndAccountsConfigurationBrandingMainProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingMainProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingMainProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<CheckoutAndAccountsConfigurationBrandingMainProjection<PARENT, ROOT>, ROOT> divider(
      ) {
     CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<CheckoutAndAccountsConfigurationBrandingMainProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<>(this, getRoot());
     getFields().put("divider", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingMainSectionProjection<CheckoutAndAccountsConfigurationBrandingMainProjection<PARENT, ROOT>, ROOT> section(
      ) {
     CheckoutAndAccountsConfigurationBrandingMainSectionProjection<CheckoutAndAccountsConfigurationBrandingMainProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingMainSectionProjection<>(this, getRoot());
     getFields().put("section", projection);
     return projection;
  }
}
