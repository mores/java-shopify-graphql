package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketUserError"));
  }

  public MarketUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketUserErrorCodeProjection<MarketUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     MarketUserErrorCodeProjection<MarketUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MarketUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MarketUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MarketUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
