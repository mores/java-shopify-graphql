package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListPriceConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListPriceConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListPriceConnection"));
  }

  public PriceListPriceConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListPriceEdgeProjection<PriceListPriceConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     PriceListPriceEdgeProjection<PriceListPriceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PriceListPriceEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PriceListPriceProjection<PriceListPriceConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     PriceListPriceProjection<PriceListPriceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PriceListPriceProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PriceListPriceConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<PriceListPriceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
