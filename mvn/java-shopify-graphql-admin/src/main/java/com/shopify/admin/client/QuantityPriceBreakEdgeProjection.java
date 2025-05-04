package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class QuantityPriceBreakEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QuantityPriceBreakEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("QuantityPriceBreakEdge"));
  }

  public QuantityPriceBreakEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public QuantityPriceBreakProjection<QuantityPriceBreakEdgeProjection<PARENT, ROOT>, ROOT> node() {
     QuantityPriceBreakProjection<QuantityPriceBreakEdgeProjection<PARENT, ROOT>, ROOT> projection = new QuantityPriceBreakProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public QuantityPriceBreakEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
