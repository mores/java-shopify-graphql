package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsPayoutEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsPayoutEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsPayoutEdge"));
  }

  public ShopifyPaymentsPayoutEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsPayoutProjection<ShopifyPaymentsPayoutEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ShopifyPaymentsPayoutProjection<ShopifyPaymentsPayoutEdgeProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
