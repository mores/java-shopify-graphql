package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliverySettingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliverySettingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliverySetting"));
  }

  public DeliverySettingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryLegacyModeBlockedProjection<DeliverySettingProjection<PARENT, ROOT>, ROOT> legacyModeBlocked(
      ) {
     DeliveryLegacyModeBlockedProjection<DeliverySettingProjection<PARENT, ROOT>, ROOT> projection = new DeliveryLegacyModeBlockedProjection<>(this, getRoot());
     getFields().put("legacyModeBlocked", projection);
     return projection;
  }

  public DeliverySettingProjection<PARENT, ROOT> legacyModeProfiles() {
    getFields().put("legacyModeProfiles", null);
    return this;
  }
}
