package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRoles"));
  }

  public CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingColorRolesProjection<CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<PARENT, ROOT>, ROOT> hover(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorRolesProjection<CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorRolesProjection<>(this, getRoot());
     getFields().put("hover", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<PARENT, ROOT> accent(
      ) {
    getFields().put("accent", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<PARENT, ROOT> background(
      ) {
    getFields().put("background", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<PARENT, ROOT> border(
      ) {
    getFields().put("border", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<PARENT, ROOT> decorative(
      ) {
    getFields().put("decorative", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<PARENT, ROOT> icon(
      ) {
    getFields().put("icon", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingPrimaryButtonColorRolesProjection<PARENT, ROOT> text(
      ) {
    getFields().put("text", null);
    return this;
  }
}
