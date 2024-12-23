package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListPriceUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListPriceUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListPriceUserError"));
  }

  public PriceListPriceUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListPriceUserErrorCodeProjection<PriceListPriceUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PriceListPriceUserErrorCodeProjection<PriceListPriceUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PriceListPriceUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PriceListPriceUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PriceListPriceUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
