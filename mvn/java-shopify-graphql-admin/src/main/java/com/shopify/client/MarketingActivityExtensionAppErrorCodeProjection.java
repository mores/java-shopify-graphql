package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityExtensionAppErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityExtensionAppErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingActivityExtensionAppErrorCode"));
  }

  public MarketingActivityExtensionAppErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
