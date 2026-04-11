package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashActivityConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashActivityConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashActivityConnection"));
  }

  public CashActivityConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashActivityEdgeProjection<CashActivityConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     CashActivityEdgeProjection<CashActivityConnectionProjection<PARENT, ROOT>, ROOT> projection = new CashActivityEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CashActivityProjection<CashActivityConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     CashActivityProjection<CashActivityConnectionProjection<PARENT, ROOT>, ROOT> projection = new CashActivityProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CashActivityConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CashActivityConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
