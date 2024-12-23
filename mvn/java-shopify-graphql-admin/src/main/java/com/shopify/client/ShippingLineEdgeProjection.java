package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingLineEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingLineEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLineEdge"));
  }

  public ShippingLineEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingLineProjection<ShippingLineEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ShippingLineProjection<ShippingLineEdgeProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ShippingLineEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
