package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMarketingConsentStateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMarketingConsentStateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMarketingConsentState"));
  }

  public CustomerMarketingConsentStateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
