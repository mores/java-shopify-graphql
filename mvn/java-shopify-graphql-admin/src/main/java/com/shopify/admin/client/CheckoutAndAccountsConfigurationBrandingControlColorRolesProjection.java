package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingControlColorRoles"));
  }

  public CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingColorRolesProjection<CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<PARENT, ROOT>, ROOT> selected(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorRolesProjection<CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorRolesProjection<>(this, getRoot());
     getFields().put("selected", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<PARENT, ROOT> accent(
      ) {
    getFields().put("accent", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<PARENT, ROOT> background(
      ) {
    getFields().put("background", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<PARENT, ROOT> border(
      ) {
    getFields().put("border", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<PARENT, ROOT> decorative(
      ) {
    getFields().put("decorative", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<PARENT, ROOT> icon() {
    getFields().put("icon", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingControlColorRolesProjection<PARENT, ROOT> text() {
    getFields().put("text", null);
    return this;
  }
}
