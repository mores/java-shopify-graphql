package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsDisputeReasonDetailsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsDisputeReasonDetailsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDisputeReasonDetails"));
  }

  public ShopifyPaymentsDisputeReasonDetailsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsDisputeReasonProjection<ShopifyPaymentsDisputeReasonDetailsProjection<PARENT, ROOT>, ROOT> reason(
      ) {
     ShopifyPaymentsDisputeReasonProjection<ShopifyPaymentsDisputeReasonDetailsProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeReasonProjection<>(this, getRoot());
     getFields().put("reason", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeReasonDetailsProjection<PARENT, ROOT> networkReasonCode() {
    getFields().put("networkReasonCode", null);
    return this;
  }
}
