package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TenderTransactionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TenderTransactionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TenderTransactionEdge"));
  }

  public TenderTransactionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TenderTransactionProjection<TenderTransactionEdgeProjection<PARENT, ROOT>, ROOT> node() {
     TenderTransactionProjection<TenderTransactionEdgeProjection<PARENT, ROOT>, ROOT> projection = new TenderTransactionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public TenderTransactionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
