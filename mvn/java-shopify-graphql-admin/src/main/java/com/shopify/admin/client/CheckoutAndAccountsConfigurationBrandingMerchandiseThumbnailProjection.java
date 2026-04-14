package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnail"));
  }

  public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeProjection<CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> badge(
      ) {
     CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeProjection<CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeProjection<>(this, getRoot());
     getFields().put("badge", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingObjectFitProjection<CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> fit(
      ) {
     CheckoutAndAccountsConfigurationBrandingObjectFitProjection<CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingObjectFitProjection<>(this, getRoot());
     getFields().put("fit", projection);
     return projection;
  }
}
