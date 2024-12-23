package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingActivityUserError"));
  }

  public MarketingActivityUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketingActivityUserErrorCodeProjection<MarketingActivityUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MarketingActivityUserErrorCodeProjection<MarketingActivityUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MarketingActivityUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MarketingActivityUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
