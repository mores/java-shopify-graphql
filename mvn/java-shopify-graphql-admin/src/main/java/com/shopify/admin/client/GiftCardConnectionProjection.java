package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardConnection"));
  }

  public GiftCardConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardEdgeProjection<GiftCardConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     GiftCardEdgeProjection<GiftCardConnectionProjection<PARENT, ROOT>, ROOT> projection = new GiftCardEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public GiftCardProjection<GiftCardConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     GiftCardProjection<GiftCardConnectionProjection<PARENT, ROOT>, ROOT> projection = new GiftCardProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<GiftCardConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<GiftCardConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
