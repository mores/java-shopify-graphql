package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCornerRadiusVariables"));
  }

  public CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesProjection<PARENT, ROOT> base(
      ) {
    getFields().put("base", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesProjection<PARENT, ROOT> large(
      ) {
    getFields().put("large", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesProjection<PARENT, ROOT> small(
      ) {
    getFields().put("small", null);
    return this;
  }
}
