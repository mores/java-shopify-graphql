package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashDrawerEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashDrawerEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashDrawerEdge"));
  }

  public CashDrawerEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashDrawerProjection<CashDrawerEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CashDrawerProjection<CashDrawerEdgeProjection<PARENT, ROOT>, ROOT> projection = new CashDrawerProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CashDrawerEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
