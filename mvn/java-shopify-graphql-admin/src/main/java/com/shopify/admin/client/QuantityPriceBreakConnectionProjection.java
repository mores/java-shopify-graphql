package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityPriceBreakConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityPriceBreakConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QuantityPriceBreakConnection"));
  }

  public QuantityPriceBreakConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QuantityPriceBreakEdgeProjection<QuantityPriceBreakConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     QuantityPriceBreakEdgeProjection<QuantityPriceBreakConnectionProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public QuantityPriceBreakProjection<QuantityPriceBreakConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     QuantityPriceBreakProjection<QuantityPriceBreakConnectionProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<QuantityPriceBreakConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<QuantityPriceBreakConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
