package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMarketingConsentErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMarketingConsentErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMarketingConsentErrorCode"));
  }

  public CustomerMarketingConsentErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
