package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopifyPaymentsDisputeFulfillmentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsDisputeFulfillmentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsDisputeFulfillment"));
  }

  public ShopifyPaymentsDisputeFulfillmentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsDisputeFulfillmentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsDisputeFulfillmentFragmentProjection<PARENT, ROOT> shippingCarrier() {
    getFields().put("shippingCarrier", null);
    return this;
  }

  public ShopifyPaymentsDisputeFulfillmentFragmentProjection<PARENT, ROOT> shippingDate() {
    getFields().put("shippingDate", null);
    return this;
  }

  public ShopifyPaymentsDisputeFulfillmentFragmentProjection<PARENT, ROOT> shippingTrackingNumber(
      ) {
    getFields().put("shippingTrackingNumber", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsDisputeFulfillment {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
