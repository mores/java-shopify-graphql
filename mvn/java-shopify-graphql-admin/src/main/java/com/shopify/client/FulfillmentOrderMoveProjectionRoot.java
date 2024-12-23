package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderMoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderMoveProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderMovePayload"));
  }

  public FulfillmentOrderMoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>, FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>> movedFulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>, FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("movedFulfillmentOrder", projection);
    return projection;
  }

  public FulfillmentOrderProjection<FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>, FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>> originalFulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>, FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("originalFulfillmentOrder", projection);
    return projection;
  }

  public FulfillmentOrderProjection<FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>, FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>> remainingFulfillmentOrder(
      ) {
    FulfillmentOrderProjection<FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>, FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("remainingFulfillmentOrder", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>, FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>, FulfillmentOrderMoveProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
