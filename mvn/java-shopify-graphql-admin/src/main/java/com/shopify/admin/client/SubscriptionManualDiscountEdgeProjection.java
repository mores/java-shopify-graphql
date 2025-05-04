package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionManualDiscountEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionManualDiscountEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionManualDiscountEdge"));
  }

  public SubscriptionManualDiscountEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionManualDiscountProjection<SubscriptionManualDiscountEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     SubscriptionManualDiscountProjection<SubscriptionManualDiscountEdgeProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionManualDiscountProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SubscriptionManualDiscountEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
