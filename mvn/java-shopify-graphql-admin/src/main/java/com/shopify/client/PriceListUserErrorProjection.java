package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListUserError"));
  }

  public PriceListUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListUserErrorCodeProjection<PriceListUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     PriceListUserErrorCodeProjection<PriceListUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PriceListUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PriceListUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PriceListUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
