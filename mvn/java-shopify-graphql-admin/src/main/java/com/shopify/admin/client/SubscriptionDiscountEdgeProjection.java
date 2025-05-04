package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDiscountEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDiscountEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDiscountEdge"));
  }

  public SubscriptionDiscountEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDiscountProjection<SubscriptionDiscountEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     SubscriptionDiscountProjection<SubscriptionDiscountEdgeProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDiscountProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SubscriptionDiscountEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
