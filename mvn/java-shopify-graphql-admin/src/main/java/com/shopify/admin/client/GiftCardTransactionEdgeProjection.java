package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardTransactionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardTransactionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardTransactionEdge"));
  }

  public GiftCardTransactionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardTransactionProjection<GiftCardTransactionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     GiftCardTransactionProjection<GiftCardTransactionEdgeProjection<PARENT, ROOT>, ROOT> projection = new GiftCardTransactionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public GiftCardTransactionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
