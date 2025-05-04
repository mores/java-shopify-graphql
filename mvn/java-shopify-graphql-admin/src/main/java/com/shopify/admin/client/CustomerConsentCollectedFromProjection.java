package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerConsentCollectedFromProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerConsentCollectedFromProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerConsentCollectedFrom"));
  }

  public CustomerConsentCollectedFromProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
