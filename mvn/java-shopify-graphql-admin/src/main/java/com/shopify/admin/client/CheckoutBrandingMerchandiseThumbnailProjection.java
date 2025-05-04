package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingMerchandiseThumbnailProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingMerchandiseThumbnailProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingMerchandiseThumbnail"));
  }

  public CheckoutBrandingMerchandiseThumbnailProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingMerchandiseThumbnailBadgeProjection<CheckoutBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> badge(
      ) {
     CheckoutBrandingMerchandiseThumbnailBadgeProjection<CheckoutBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingMerchandiseThumbnailBadgeProjection<>(this, getRoot());
     getFields().put("badge", projection);
     return projection;
  }

  public CheckoutBrandingSimpleBorderProjection<CheckoutBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutBrandingSimpleBorderProjection<CheckoutBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSimpleBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutBrandingCornerRadiusProjection<CheckoutBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutBrandingCornerRadiusProjection<CheckoutBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutBrandingObjectFitProjection<CheckoutBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> fit(
      ) {
     CheckoutBrandingObjectFitProjection<CheckoutBrandingMerchandiseThumbnailProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingObjectFitProjection<>(this, getRoot());
     getFields().put("fit", projection);
     return projection;
  }
}
