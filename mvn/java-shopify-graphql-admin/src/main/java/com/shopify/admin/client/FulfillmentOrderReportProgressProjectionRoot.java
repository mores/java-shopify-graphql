package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderReportProgressProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderReportProgressProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderReportProgressPayload"));
  }

  public FulfillmentOrderReportProgressProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderReportProgressProjectionRoot<PARENT, ROOT>, FulfillmentOrderReportProgressProjectionRoot<PARENT, ROOT>> fulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderReportProgressProjectionRoot<PARENT, ROOT>, FulfillmentOrderReportProgressProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("fulfillmentOrder", projection);
    return projection;
  }

  public FulfillmentOrderReportProgressUserErrorProjection<FulfillmentOrderReportProgressProjectionRoot<PARENT, ROOT>, FulfillmentOrderReportProgressProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentOrderReportProgressUserErrorProjection<FulfillmentOrderReportProgressProjectionRoot<PARENT, ROOT>, FulfillmentOrderReportProgressProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderReportProgressUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
