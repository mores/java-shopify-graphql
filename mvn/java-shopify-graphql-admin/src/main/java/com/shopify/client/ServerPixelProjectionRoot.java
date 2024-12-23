package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ServerPixelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ServerPixelProjectionRoot() {
    super(null, null, java.util.Optional.of("ServerPixel"));
  }

  public ServerPixelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ServerPixelStatusProjection<ServerPixelProjectionRoot<PARENT, ROOT>, ServerPixelProjectionRoot<PARENT, ROOT>> status(
      ) {
    ServerPixelStatusProjection<ServerPixelProjectionRoot<PARENT, ROOT>, ServerPixelProjectionRoot<PARENT, ROOT>> projection = new ServerPixelStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public ServerPixelProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ServerPixelProjectionRoot<PARENT, ROOT> webhookEndpointAddress() {
    getFields().put("webhookEndpointAddress", null);
    return this;
  }
}
