package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDeliveryGroupEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDeliveryGroupEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartDeliveryGroupEdge"));
  }

  public CartDeliveryGroupEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartDeliveryGroupProjection<CartDeliveryGroupEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CartDeliveryGroupProjection<CartDeliveryGroupEdgeProjection<PARENT, ROOT>, ROOT> projection = new CartDeliveryGroupProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CartDeliveryGroupEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
