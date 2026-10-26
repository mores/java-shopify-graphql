package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCarrierCalculatedRateGroupServiceStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCarrierCalculatedRateGroupServiceStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCarrierCalculatedRateGroupServiceStatus"));
  }

  public DeliveryCarrierCalculatedRateGroupServiceStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
