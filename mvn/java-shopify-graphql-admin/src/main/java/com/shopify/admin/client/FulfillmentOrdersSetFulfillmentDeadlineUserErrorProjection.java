package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrdersSetFulfillmentDeadlineUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrdersSetFulfillmentDeadlineUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrdersSetFulfillmentDeadlineUserError"));
  }

  public FulfillmentOrdersSetFulfillmentDeadlineUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrdersSetFulfillmentDeadlineUserErrorCodeProjection<FulfillmentOrdersSetFulfillmentDeadlineUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     FulfillmentOrdersSetFulfillmentDeadlineUserErrorCodeProjection<FulfillmentOrdersSetFulfillmentDeadlineUserErrorProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrdersSetFulfillmentDeadlineUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public FulfillmentOrdersSetFulfillmentDeadlineUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public FulfillmentOrdersSetFulfillmentDeadlineUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
