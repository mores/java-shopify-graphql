package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RiskFactProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RiskFactProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RiskFact"));
  }

  public RiskFactProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RiskFactSentimentProjection<RiskFactProjection<PARENT, ROOT>, ROOT> sentiment() {
     RiskFactSentimentProjection<RiskFactProjection<PARENT, ROOT>, ROOT> projection = new RiskFactSentimentProjection<>(this, getRoot());
     getFields().put("sentiment", projection);
     return projection;
  }

  public RiskFactProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }
}
