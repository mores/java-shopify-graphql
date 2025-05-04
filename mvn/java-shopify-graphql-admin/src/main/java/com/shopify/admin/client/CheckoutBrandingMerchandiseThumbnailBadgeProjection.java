package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingMerchandiseThumbnailBadgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingMerchandiseThumbnailBadgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingMerchandiseThumbnailBadge"));
  }

  public CheckoutBrandingMerchandiseThumbnailBadgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingMerchandiseThumbnailBadgeBackgroundProjection<CheckoutBrandingMerchandiseThumbnailBadgeProjection<PARENT, ROOT>, ROOT> background(
      ) {
     CheckoutBrandingMerchandiseThumbnailBadgeBackgroundProjection<CheckoutBrandingMerchandiseThumbnailBadgeProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingMerchandiseThumbnailBadgeBackgroundProjection<>(this, getRoot());
     getFields().put("background", projection);
     return projection;
  }
}
