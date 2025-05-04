package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityStatusBadgeTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityStatusBadgeTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingActivityStatusBadgeType"));
  }

  public MarketingActivityStatusBadgeTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
