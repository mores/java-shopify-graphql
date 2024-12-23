package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardTransactionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardTransactionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardTransactionConnection"));
  }

  public GiftCardTransactionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardTransactionEdgeProjection<GiftCardTransactionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     GiftCardTransactionEdgeProjection<GiftCardTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new GiftCardTransactionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public GiftCardTransactionProjection<GiftCardTransactionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     GiftCardTransactionProjection<GiftCardTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new GiftCardTransactionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<GiftCardTransactionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<GiftCardTransactionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
