package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingBaseColorRoles"));
  }

  public CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection<PARENT, ROOT> accent() {
    getFields().put("accent", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection<PARENT, ROOT> background(
      ) {
    getFields().put("background", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection<PARENT, ROOT> border() {
    getFields().put("border", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection<PARENT, ROOT> decorative(
      ) {
    getFields().put("decorative", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection<PARENT, ROOT> icon() {
    getFields().put("icon", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBaseColorRolesProjection<PARENT, ROOT> text() {
    getFields().put("text", null);
    return this;
  }
}
