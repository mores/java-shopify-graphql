package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonmentUpdateActivitiesDeliveryStatusesUserErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonmentUpdateActivitiesDeliveryStatusesUserErrorCodeProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonmentUpdateActivitiesDeliveryStatusesUserErrorCode"));
  }

  public AbandonmentUpdateActivitiesDeliveryStatusesUserErrorCodeProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }
}
