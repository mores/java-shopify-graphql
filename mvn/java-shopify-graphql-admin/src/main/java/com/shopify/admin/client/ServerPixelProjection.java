package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ServerPixelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ServerPixelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ServerPixel"));
  }

  public ServerPixelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ServerPixelStatusProjection<ServerPixelProjection<PARENT, ROOT>, ROOT> status() {
     ServerPixelStatusProjection<ServerPixelProjection<PARENT, ROOT>, ROOT> projection = new ServerPixelStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ServerPixelProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ServerPixelProjection<PARENT, ROOT> webhookEndpointAddress() {
    getFields().put("webhookEndpointAddress", null);
    return this;
  }
}
