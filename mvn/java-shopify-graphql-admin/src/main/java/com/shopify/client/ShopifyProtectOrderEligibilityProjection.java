package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyProtectOrderEligibilityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyProtectOrderEligibilityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyProtectOrderEligibility"));
  }

  public ShopifyProtectOrderEligibilityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyProtectEligibilityStatusProjection<ShopifyProtectOrderEligibilityProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ShopifyProtectEligibilityStatusProjection<ShopifyProtectOrderEligibilityProjection<PARENT, ROOT>, ROOT> projection = new ShopifyProtectEligibilityStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }
}
