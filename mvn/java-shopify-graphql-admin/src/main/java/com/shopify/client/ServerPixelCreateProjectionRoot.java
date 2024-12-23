package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ServerPixelCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ServerPixelCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ServerPixelCreatePayload"));
  }

  public ServerPixelCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ServerPixelProjection<ServerPixelCreateProjectionRoot<PARENT, ROOT>, ServerPixelCreateProjectionRoot<PARENT, ROOT>> serverPixel(
      ) {
    ServerPixelProjection<ServerPixelCreateProjectionRoot<PARENT, ROOT>, ServerPixelCreateProjectionRoot<PARENT, ROOT>> projection = new ServerPixelProjection<>(this, this);    
    getFields().put("serverPixel", projection);
    return projection;
  }

  public ErrorsServerPixelUserErrorProjection<ServerPixelCreateProjectionRoot<PARENT, ROOT>, ServerPixelCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ErrorsServerPixelUserErrorProjection<ServerPixelCreateProjectionRoot<PARENT, ROOT>, ServerPixelCreateProjectionRoot<PARENT, ROOT>> projection = new ErrorsServerPixelUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
