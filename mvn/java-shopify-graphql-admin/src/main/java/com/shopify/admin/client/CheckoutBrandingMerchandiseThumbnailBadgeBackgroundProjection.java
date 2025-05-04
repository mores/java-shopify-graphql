package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingMerchandiseThumbnailBadgeBackgroundProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingMerchandiseThumbnailBadgeBackgroundProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingMerchandiseThumbnailBadgeBackground"));
  }

  public CheckoutBrandingMerchandiseThumbnailBadgeBackgroundProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
