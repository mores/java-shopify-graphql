package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionManualDiscountConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionManualDiscountConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionManualDiscountConnection"));
  }

  public SubscriptionManualDiscountConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionManualDiscountEdgeProjection<SubscriptionManualDiscountConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SubscriptionManualDiscountEdgeProjection<SubscriptionManualDiscountConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SubscriptionManualDiscountProjection<SubscriptionManualDiscountConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     SubscriptionManualDiscountProjection<SubscriptionManualDiscountConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SubscriptionManualDiscountConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<SubscriptionManualDiscountConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
