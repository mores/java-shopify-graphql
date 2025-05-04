package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListPriceOriginTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListPriceOriginTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListPriceOriginType"));
  }

  public PriceListPriceOriginTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
