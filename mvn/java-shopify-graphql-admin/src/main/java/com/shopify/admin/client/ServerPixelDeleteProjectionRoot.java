package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ServerPixelDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ServerPixelDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ServerPixelDeletePayload"));
  }

  public ServerPixelDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ErrorsServerPixelUserErrorProjection<ServerPixelDeleteProjectionRoot<PARENT, ROOT>, ServerPixelDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ErrorsServerPixelUserErrorProjection<ServerPixelDeleteProjectionRoot<PARENT, ROOT>, ServerPixelDeleteProjectionRoot<PARENT, ROOT>> projection = new ErrorsServerPixelUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ServerPixelDeleteProjectionRoot<PARENT, ROOT> deletedServerPixelId() {
    getFields().put("deletedServerPixelId", null);
    return this;
  }
}
