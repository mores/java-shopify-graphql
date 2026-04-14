package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ChannelCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ChannelCreatePayload"));
  }

  public ChannelCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelProjection<ChannelCreateProjectionRoot<PARENT, ROOT>, ChannelCreateProjectionRoot<PARENT, ROOT>> channel(
      ) {
    ChannelProjection<ChannelCreateProjectionRoot<PARENT, ROOT>, ChannelCreateProjectionRoot<PARENT, ROOT>> projection = new ChannelProjection<>(this, this);    
    getFields().put("channel", projection);
    return projection;
  }

  public ChannelCreateUserErrorProjection<ChannelCreateProjectionRoot<PARENT, ROOT>, ChannelCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ChannelCreateUserErrorProjection<ChannelCreateProjectionRoot<PARENT, ROOT>, ChannelCreateProjectionRoot<PARENT, ROOT>> projection = new ChannelCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
