package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderOpenProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderOpenProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderOpenPayload"));
  }

  public FulfillmentOrderOpenProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderOpenProjectionRoot<PARENT, ROOT>, FulfillmentOrderOpenProjectionRoot<PARENT, ROOT>> fulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderOpenProjectionRoot<PARENT, ROOT>, FulfillmentOrderOpenProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("fulfillmentOrder", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentOrderOpenProjectionRoot<PARENT, ROOT>, FulfillmentOrderOpenProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentOrderOpenProjectionRoot<PARENT, ROOT>, FulfillmentOrderOpenProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
