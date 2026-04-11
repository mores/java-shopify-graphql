package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashDrawerConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashDrawerConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashDrawerConnection"));
  }

  public CashDrawerConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashDrawerEdgeProjection<CashDrawerConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     CashDrawerEdgeProjection<CashDrawerConnectionProjection<PARENT, ROOT>, ROOT> projection = new CashDrawerEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CashDrawerProjection<CashDrawerConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     CashDrawerProjection<CashDrawerConnectionProjection<PARENT, ROOT>, ROOT> projection = new CashDrawerProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CashDrawerConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CashDrawerConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
