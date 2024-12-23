package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardEdge"));
  }

  public GiftCardEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardProjection<GiftCardEdgeProjection<PARENT, ROOT>, ROOT> node() {
     GiftCardProjection<GiftCardEdgeProjection<PARENT, ROOT>, ROOT> projection = new GiftCardProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public GiftCardEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
