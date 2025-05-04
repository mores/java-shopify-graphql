package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonmentUpdateActivitiesDeliveryStatusesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonmentUpdateActivitiesDeliveryStatusesProjectionRoot() {
    super(null, null, java.util.Optional.of("AbandonmentUpdateActivitiesDeliveryStatusesPayload"));
  }

  public AbandonmentUpdateActivitiesDeliveryStatusesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonmentProjection<AbandonmentUpdateActivitiesDeliveryStatusesProjectionRoot<PARENT, ROOT>, AbandonmentUpdateActivitiesDeliveryStatusesProjectionRoot<PARENT, ROOT>> abandonment(
      ) {
    AbandonmentProjection<AbandonmentUpdateActivitiesDeliveryStatusesProjectionRoot<PARENT, ROOT>, AbandonmentUpdateActivitiesDeliveryStatusesProjectionRoot<PARENT, ROOT>> projection = new AbandonmentProjection<>(this, this);    
    getFields().put("abandonment", projection);
    return projection;
  }

  public AbandonmentUpdateActivitiesDeliveryStatusesUserErrorProjection<AbandonmentUpdateActivitiesDeliveryStatusesProjectionRoot<PARENT, ROOT>, AbandonmentUpdateActivitiesDeliveryStatusesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    AbandonmentUpdateActivitiesDeliveryStatusesUserErrorProjection<AbandonmentUpdateActivitiesDeliveryStatusesProjectionRoot<PARENT, ROOT>, AbandonmentUpdateActivitiesDeliveryStatusesProjectionRoot<PARENT, ROOT>> projection = new AbandonmentUpdateActivitiesDeliveryStatusesUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
