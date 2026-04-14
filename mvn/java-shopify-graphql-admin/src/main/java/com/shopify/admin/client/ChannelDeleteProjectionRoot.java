package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ChannelDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ChannelDeletePayload"));
  }

  public ChannelDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelDeleteUserErrorProjection<ChannelDeleteProjectionRoot<PARENT, ROOT>, ChannelDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ChannelDeleteUserErrorProjection<ChannelDeleteProjectionRoot<PARENT, ROOT>, ChannelDeleteProjectionRoot<PARENT, ROOT>> projection = new ChannelDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ChannelDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
