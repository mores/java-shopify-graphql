package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsDisputeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsDisputeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDisputeConnection"));
  }

  public ShopifyPaymentsDisputeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsDisputeEdgeProjection<ShopifyPaymentsDisputeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ShopifyPaymentsDisputeEdgeProjection<ShopifyPaymentsDisputeConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeProjection<ShopifyPaymentsDisputeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ShopifyPaymentsDisputeProjection<ShopifyPaymentsDisputeConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ShopifyPaymentsDisputeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ShopifyPaymentsDisputeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
