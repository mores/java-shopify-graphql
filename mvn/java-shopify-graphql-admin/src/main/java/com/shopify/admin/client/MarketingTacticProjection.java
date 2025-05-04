package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingTacticProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingTacticProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingTactic"));
  }

  public MarketingTacticProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
