package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentServiceDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentServiceDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentServiceDeletePayload"));
  }

  public FulfillmentServiceDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<FulfillmentServiceDeleteProjectionRoot<PARENT, ROOT>, FulfillmentServiceDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FulfillmentServiceDeleteProjectionRoot<PARENT, ROOT>, FulfillmentServiceDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public FulfillmentServiceDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
