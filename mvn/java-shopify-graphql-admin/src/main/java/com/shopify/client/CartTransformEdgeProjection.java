package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartTransformEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartTransformEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartTransformEdge"));
  }

  public CartTransformEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartTransformProjection<CartTransformEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CartTransformProjection<CartTransformEdgeProjection<PARENT, ROOT>, ROOT> projection = new CartTransformProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CartTransformEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
