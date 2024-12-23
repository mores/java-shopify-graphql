package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliverySettingsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliverySettingsProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliverySetting"));
  }

  public DeliverySettingsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryLegacyModeBlockedProjection<DeliverySettingsProjectionRoot<PARENT, ROOT>, DeliverySettingsProjectionRoot<PARENT, ROOT>> legacyModeBlocked(
      ) {
    DeliveryLegacyModeBlockedProjection<DeliverySettingsProjectionRoot<PARENT, ROOT>, DeliverySettingsProjectionRoot<PARENT, ROOT>> projection = new DeliveryLegacyModeBlockedProjection<>(this, this);    
    getFields().put("legacyModeBlocked", projection);
    return projection;
  }

  public DeliverySettingsProjectionRoot<PARENT, ROOT> legacyModeProfiles() {
    getFields().put("legacyModeProfiles", null);
    return this;
  }
}
