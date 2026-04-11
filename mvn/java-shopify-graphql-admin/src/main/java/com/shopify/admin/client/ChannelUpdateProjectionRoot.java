package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ChannelUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ChannelUpdatePayload"));
  }

  public ChannelUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelProjection<ChannelUpdateProjectionRoot<PARENT, ROOT>, ChannelUpdateProjectionRoot<PARENT, ROOT>> channel(
      ) {
    ChannelProjection<ChannelUpdateProjectionRoot<PARENT, ROOT>, ChannelUpdateProjectionRoot<PARENT, ROOT>> projection = new ChannelProjection<>(this, this);    
    getFields().put("channel", projection);
    return projection;
  }

  public ChannelUpdateUserErrorProjection<ChannelUpdateProjectionRoot<PARENT, ROOT>, ChannelUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ChannelUpdateUserErrorProjection<ChannelUpdateProjectionRoot<PARENT, ROOT>, ChannelUpdateProjectionRoot<PARENT, ROOT>> projection = new ChannelUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
