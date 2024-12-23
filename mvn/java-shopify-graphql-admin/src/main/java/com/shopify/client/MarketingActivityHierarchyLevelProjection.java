package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityHierarchyLevelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityHierarchyLevelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingActivityHierarchyLevel"));
  }

  public MarketingActivityHierarchyLevelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
