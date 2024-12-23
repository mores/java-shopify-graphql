package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsDisputeFulfillmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsDisputeFulfillmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDisputeFulfillment"));
  }

  public ShopifyPaymentsDisputeFulfillmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsDisputeFulfillmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsDisputeFulfillmentProjection<PARENT, ROOT> shippingCarrier() {
    getFields().put("shippingCarrier", null);
    return this;
  }

  public ShopifyPaymentsDisputeFulfillmentProjection<PARENT, ROOT> shippingDate() {
    getFields().put("shippingDate", null);
    return this;
  }

  public ShopifyPaymentsDisputeFulfillmentProjection<PARENT, ROOT> shippingTrackingNumber() {
    getFields().put("shippingTrackingNumber", null);
    return this;
  }
}
