package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PubSubServerPixelUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PubSubServerPixelUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("PubSubServerPixelUpdatePayload"));
  }

  public PubSubServerPixelUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ServerPixelProjection<PubSubServerPixelUpdateProjectionRoot<PARENT, ROOT>, PubSubServerPixelUpdateProjectionRoot<PARENT, ROOT>> serverPixel(
      ) {
    ServerPixelProjection<PubSubServerPixelUpdateProjectionRoot<PARENT, ROOT>, PubSubServerPixelUpdateProjectionRoot<PARENT, ROOT>> projection = new ServerPixelProjection<>(this, this);    
    getFields().put("serverPixel", projection);
    return projection;
  }

  public ErrorsServerPixelUserErrorProjection<PubSubServerPixelUpdateProjectionRoot<PARENT, ROOT>, PubSubServerPixelUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ErrorsServerPixelUserErrorProjection<PubSubServerPixelUpdateProjectionRoot<PARENT, ROOT>, PubSubServerPixelUpdateProjectionRoot<PARENT, ROOT>> projection = new ErrorsServerPixelUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
