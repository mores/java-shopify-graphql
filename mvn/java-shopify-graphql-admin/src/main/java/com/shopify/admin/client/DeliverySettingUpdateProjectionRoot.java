package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliverySettingUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliverySettingUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliverySettingUpdatePayload"));
  }

  public DeliverySettingUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliverySettingProjection<DeliverySettingUpdateProjectionRoot<PARENT, ROOT>, DeliverySettingUpdateProjectionRoot<PARENT, ROOT>> setting(
      ) {
    DeliverySettingProjection<DeliverySettingUpdateProjectionRoot<PARENT, ROOT>, DeliverySettingUpdateProjectionRoot<PARENT, ROOT>> projection = new DeliverySettingProjection<>(this, this);    
    getFields().put("setting", projection);
    return projection;
  }

  public UserErrorProjection<DeliverySettingUpdateProjectionRoot<PARENT, ROOT>, DeliverySettingUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DeliverySettingUpdateProjectionRoot<PARENT, ROOT>, DeliverySettingUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
