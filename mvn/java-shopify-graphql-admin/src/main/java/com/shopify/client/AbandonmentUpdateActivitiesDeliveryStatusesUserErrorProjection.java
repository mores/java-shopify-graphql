package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonmentUpdateActivitiesDeliveryStatusesUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonmentUpdateActivitiesDeliveryStatusesUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonmentUpdateActivitiesDeliveryStatusesUserError"));
  }

  public AbandonmentUpdateActivitiesDeliveryStatusesUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonmentUpdateActivitiesDeliveryStatusesUserErrorCodeProjection<AbandonmentUpdateActivitiesDeliveryStatusesUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     AbandonmentUpdateActivitiesDeliveryStatusesUserErrorCodeProjection<AbandonmentUpdateActivitiesDeliveryStatusesUserErrorProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentUpdateActivitiesDeliveryStatusesUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public AbandonmentUpdateActivitiesDeliveryStatusesUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public AbandonmentUpdateActivitiesDeliveryStatusesUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
