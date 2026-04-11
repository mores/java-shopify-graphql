package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashDrawersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashDrawersProjectionRoot() {
    super(null, null, java.util.Optional.of("CashDrawerConnection"));
  }

  public CashDrawersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashDrawerEdgeProjection<CashDrawersProjectionRoot<PARENT, ROOT>, CashDrawersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CashDrawerEdgeProjection<CashDrawersProjectionRoot<PARENT, ROOT>, CashDrawersProjectionRoot<PARENT, ROOT>> projection = new CashDrawerEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CashDrawerProjection<CashDrawersProjectionRoot<PARENT, ROOT>, CashDrawersProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CashDrawerProjection<CashDrawersProjectionRoot<PARENT, ROOT>, CashDrawersProjectionRoot<PARENT, ROOT>> projection = new CashDrawerProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CashDrawersProjectionRoot<PARENT, ROOT>, CashDrawersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CashDrawersProjectionRoot<PARENT, ROOT>, CashDrawersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
