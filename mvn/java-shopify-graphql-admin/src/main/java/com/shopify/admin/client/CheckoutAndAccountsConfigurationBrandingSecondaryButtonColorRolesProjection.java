package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRoles"));
  }

  public CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingColorRolesProjection<CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<PARENT, ROOT>, ROOT> hover(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorRolesProjection<CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorRolesProjection<>(this, getRoot());
     getFields().put("hover", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<PARENT, ROOT> accent(
      ) {
    getFields().put("accent", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<PARENT, ROOT> background(
      ) {
    getFields().put("background", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<PARENT, ROOT> border(
      ) {
    getFields().put("border", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<PARENT, ROOT> decorative(
      ) {
    getFields().put("decorative", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<PARENT, ROOT> icon(
      ) {
    getFields().put("icon", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingSecondaryButtonColorRolesProjection<PARENT, ROOT> text(
      ) {
    getFields().put("text", null);
    return this;
  }
}
