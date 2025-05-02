package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDeliveryGroupConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDeliveryGroupConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartDeliveryGroupConnection"));
  }

  public CartDeliveryGroupConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartDeliveryGroupEdgeProjection<CartDeliveryGroupConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CartDeliveryGroupEdgeProjection<CartDeliveryGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryGroupEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CartDeliveryGroupProjection<CartDeliveryGroupConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CartDeliveryGroupProjection<CartDeliveryGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryGroupProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CartDeliveryGroupConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CartDeliveryGroupConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
