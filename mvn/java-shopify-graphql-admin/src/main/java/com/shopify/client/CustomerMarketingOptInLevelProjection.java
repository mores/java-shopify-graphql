package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMarketingOptInLevelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMarketingOptInLevelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMarketingOptInLevel"));
  }

  public CustomerMarketingOptInLevelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
