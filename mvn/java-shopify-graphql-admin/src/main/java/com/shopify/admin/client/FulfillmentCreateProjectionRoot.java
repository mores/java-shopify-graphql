package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentCreatePayload"));
  }

  public FulfillmentCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentProjection<FulfillmentCreateProjectionRoot<PARENT, ROOT>, FulfillmentCreateProjectionRoot<PARENT, ROOT>> fulfillment(
      ) {
    FulfillmentProjection<FulfillmentCreateProjectionRoot<PARENT, ROOT>, FulfillmentCreateProjectionRoot<PARENT, ROOT>> projection = new FulfillmentProjection<>(this, this);    
    getFields().put("fulfillment", projection);
    return projection;
  }

  public UserErrorProjection<FulfillmentCreateProjectionRoot<PARENT, ROOT>, FulfillmentCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentCreateProjectionRoot<PARENT, ROOT>, FulfillmentCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
