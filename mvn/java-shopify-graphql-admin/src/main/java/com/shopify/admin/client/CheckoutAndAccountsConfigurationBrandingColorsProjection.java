package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingColorsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingColorsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingColors"));
  }

  public CheckoutAndAccountsConfigurationBrandingColorsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection<CheckoutAndAccountsConfigurationBrandingColorsProjection<PARENT, ROOT>, ROOT> base(
      ) {
     CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection<CheckoutAndAccountsConfigurationBrandingColorsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection<>(this, getRoot());
     getFields().put("base", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<CheckoutAndAccountsConfigurationBrandingColorsProjection<PARENT, ROOT>, ROOT> control(
      ) {
     CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<CheckoutAndAccountsConfigurationBrandingColorsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<>(this, getRoot());
     getFields().put("control", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<CheckoutAndAccountsConfigurationBrandingColorsProjection<PARENT, ROOT>, ROOT> primaryButton(
      ) {
     CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<CheckoutAndAccountsConfigurationBrandingColorsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<>(this, getRoot());
     getFields().put("primaryButton", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<CheckoutAndAccountsConfigurationBrandingColorsProjection<PARENT, ROOT>, ROOT> secondaryButton(
      ) {
     CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<CheckoutAndAccountsConfigurationBrandingColorsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<>(this, getRoot());
     getFields().put("secondaryButton", projection);
     return projection;
  }
}
