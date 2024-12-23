package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerEmailMarketingStateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerEmailMarketingStateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerEmailMarketingState"));
  }

  public CustomerEmailMarketingStateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
