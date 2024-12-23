package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDiscountConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDiscountConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDiscountConnection"));
  }

  public SubscriptionDiscountConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDiscountEdgeProjection<SubscriptionDiscountConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SubscriptionDiscountEdgeProjection<SubscriptionDiscountConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SubscriptionDiscountProjection<SubscriptionDiscountConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     SubscriptionDiscountProjection<SubscriptionDiscountConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SubscriptionDiscountConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<SubscriptionDiscountConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
