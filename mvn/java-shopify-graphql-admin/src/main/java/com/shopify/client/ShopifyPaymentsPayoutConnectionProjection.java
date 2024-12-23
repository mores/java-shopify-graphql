package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsPayoutConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsPayoutConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsPayoutConnection"));
  }

  public ShopifyPaymentsPayoutConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsPayoutEdgeProjection<ShopifyPaymentsPayoutConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ShopifyPaymentsPayoutEdgeProjection<ShopifyPaymentsPayoutConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutProjection<ShopifyPaymentsPayoutConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ShopifyPaymentsPayoutProjection<ShopifyPaymentsPayoutConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ShopifyPaymentsPayoutConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ShopifyPaymentsPayoutConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
