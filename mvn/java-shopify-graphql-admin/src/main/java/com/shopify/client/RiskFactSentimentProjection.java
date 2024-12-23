package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RiskFactSentimentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RiskFactSentimentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RiskFactSentiment"));
  }

  public RiskFactSentimentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
