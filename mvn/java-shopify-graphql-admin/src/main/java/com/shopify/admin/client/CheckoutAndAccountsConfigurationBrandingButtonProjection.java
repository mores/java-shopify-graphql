package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingButtonProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingButton"));
  }

  public CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingSpacingProjection<CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT, ROOT>, ROOT> blockPadding(
      ) {
     CheckoutAndAccountsConfigurationBrandingSpacingProjection<CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSpacingProjection<>(this, getRoot());
     getFields().put("blockPadding", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSpacingProjection<CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT, ROOT>, ROOT> inlinePadding(
      ) {
     CheckoutAndAccountsConfigurationBrandingSpacingProjection<CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSpacingProjection<>(this, getRoot());
     getFields().put("inlinePadding", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT, ROOT>, ROOT> typography(
      ) {
     CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<CheckoutAndAccountsConfigurationBrandingButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<>(this, getRoot());
     getFields().put("typography", projection);
     return projection;
  }
}
