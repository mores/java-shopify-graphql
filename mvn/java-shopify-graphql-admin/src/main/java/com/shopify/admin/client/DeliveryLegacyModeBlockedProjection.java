package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryLegacyModeBlockedProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryLegacyModeBlockedProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryLegacyModeBlocked"));
  }

  public DeliveryLegacyModeBlockedProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryLegacyModeBlockedReasonProjection<DeliveryLegacyModeBlockedProjection<PARENT, ROOT>, ROOT> reasons(
      ) {
     DeliveryLegacyModeBlockedReasonProjection<DeliveryLegacyModeBlockedProjection<PARENT, ROOT>, ROOT> projection = new DeliveryLegacyModeBlockedReasonProjection<>(this, getRoot());
     getFields().put("reasons", projection);
     return projection;
  }

  public DeliveryLegacyModeBlockedProjection<PARENT, ROOT> blocked() {
    getFields().put("blocked", null);
    return this;
  }
}
