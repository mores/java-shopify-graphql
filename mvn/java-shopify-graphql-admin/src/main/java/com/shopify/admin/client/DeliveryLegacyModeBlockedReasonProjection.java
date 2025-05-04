package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryLegacyModeBlockedReasonProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryLegacyModeBlockedReasonProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryLegacyModeBlockedReason"));
  }

  public DeliveryLegacyModeBlockedReasonProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
