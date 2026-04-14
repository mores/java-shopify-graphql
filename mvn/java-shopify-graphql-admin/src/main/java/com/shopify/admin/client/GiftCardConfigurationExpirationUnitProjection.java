package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardConfigurationExpirationUnitProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardConfigurationExpirationUnitProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardConfigurationExpirationUnit"));
  }

  public GiftCardConfigurationExpirationUnitProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
