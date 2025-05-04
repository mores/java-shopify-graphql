package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerSmsMarketingStateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerSmsMarketingStateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerSmsMarketingState"));
  }

  public CustomerSmsMarketingStateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
