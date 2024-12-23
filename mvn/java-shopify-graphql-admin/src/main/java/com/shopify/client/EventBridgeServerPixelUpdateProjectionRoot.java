package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class EventBridgeServerPixelUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public EventBridgeServerPixelUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("EventBridgeServerPixelUpdatePayload"));
  }

  public EventBridgeServerPixelUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ServerPixelProjection<EventBridgeServerPixelUpdateProjectionRoot<PARENT, ROOT>, EventBridgeServerPixelUpdateProjectionRoot<PARENT, ROOT>> serverPixel(
      ) {
    ServerPixelProjection<EventBridgeServerPixelUpdateProjectionRoot<PARENT, ROOT>, EventBridgeServerPixelUpdateProjectionRoot<PARENT, ROOT>> projection = new ServerPixelProjection<>(this, this);    
    getFields().put("serverPixel", projection);
    return projection;
  }

  public ErrorsServerPixelUserErrorProjection<EventBridgeServerPixelUpdateProjectionRoot<PARENT, ROOT>, EventBridgeServerPixelUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ErrorsServerPixelUserErrorProjection<EventBridgeServerPixelUpdateProjectionRoot<PARENT, ROOT>, EventBridgeServerPixelUpdateProjectionRoot<PARENT, ROOT>> projection = new ErrorsServerPixelUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
