package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaypalExpressSubscriptionsGatewayStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaypalExpressSubscriptionsGatewayStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaypalExpressSubscriptionsGatewayStatus"));
  }

  public PaypalExpressSubscriptionsGatewayStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}