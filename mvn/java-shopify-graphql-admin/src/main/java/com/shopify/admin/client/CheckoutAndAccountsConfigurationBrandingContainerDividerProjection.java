package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingContainerDividerProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingContainerDivider"));
  }

  public CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> borderStyle(
      ) {
     CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<>(this, getRoot());
     getFields().put("borderStyle", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> borderWidth(
      ) {
     CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<>(this, getRoot());
     getFields().put("borderWidth", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingVisibilityProjection<CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> visibility(
      ) {
     CheckoutAndAccountsConfigurationBrandingVisibilityProjection<CheckoutAndAccountsConfigurationBrandingContainerDividerProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingVisibilityProjection<>(this, getRoot());
     getFields().put("visibility", projection);
     return projection;
  }
}
