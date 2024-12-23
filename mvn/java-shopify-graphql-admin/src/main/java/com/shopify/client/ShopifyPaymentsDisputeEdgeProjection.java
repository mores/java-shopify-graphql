package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsDisputeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsDisputeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDisputeEdge"));
  }

  public ShopifyPaymentsDisputeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsDisputeProjection<ShopifyPaymentsDisputeEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ShopifyPaymentsDisputeProjection<ShopifyPaymentsDisputeEdgeProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
