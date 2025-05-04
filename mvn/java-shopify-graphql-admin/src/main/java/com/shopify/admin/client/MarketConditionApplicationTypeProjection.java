package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketConditionApplicationTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketConditionApplicationTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketConditionApplicationType"));
  }

  public MarketConditionApplicationTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
