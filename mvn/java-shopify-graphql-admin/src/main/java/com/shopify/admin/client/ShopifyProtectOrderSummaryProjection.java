package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyProtectOrderSummaryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyProtectOrderSummaryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyProtectOrderSummary"));
  }

  public ShopifyProtectOrderSummaryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyProtectOrderEligibilityProjection<ShopifyProtectOrderSummaryProjection<PARENT, ROOT>, ROOT> eligibility(
      ) {
     ShopifyProtectOrderEligibilityProjection<ShopifyProtectOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyProtectOrderEligibilityProjection<>(this, getRoot());
     getFields().put("eligibility", projection);
     return projection;
  }

  public ShopifyProtectStatusProjection<ShopifyProtectOrderSummaryProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ShopifyProtectStatusProjection<ShopifyProtectOrderSummaryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyProtectStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }
}
