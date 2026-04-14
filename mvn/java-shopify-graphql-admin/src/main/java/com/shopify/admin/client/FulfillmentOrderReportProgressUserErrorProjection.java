package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderReportProgressUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderReportProgressUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderReportProgressUserError"));
  }

  public FulfillmentOrderReportProgressUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderReportProgressUserErrorCodeProjection<FulfillmentOrderReportProgressUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrderReportProgressUserErrorCodeProjection<FulfillmentOrderReportProgressUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderReportProgressUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrderReportProgressUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrderReportProgressUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
