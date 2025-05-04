package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListConnection"));
  }

  public PriceListConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListEdgeProjection<PriceListConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     PriceListEdgeProjection<PriceListConnectionProjection<PARENT, ROOT>, ROOT> projection = new PriceListEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PriceListProjection<PriceListConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     PriceListProjection<PriceListConnectionProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PriceListConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<PriceListConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
