package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SaleConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SaleConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SaleConnection"));
  }

  public SaleConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SaleEdgeProjection<SaleConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     SaleEdgeProjection<SaleConnectionProjection<PARENT, ROOT>, ROOT> projection = new SaleEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SaleProjection<SaleConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     SaleProjection<SaleConnectionProjection<PARENT, ROOT>, ROOT> projection = new SaleProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SaleConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<SaleConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
