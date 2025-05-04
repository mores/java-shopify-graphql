package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ChannelsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelsProjectionRoot() {
    super(null, null, java.util.Optional.of("ChannelConnection"));
  }

  public ChannelsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelEdgeProjection<ChannelsProjectionRoot<PARENT, ROOT>, ChannelsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ChannelEdgeProjection<ChannelsProjectionRoot<PARENT, ROOT>, ChannelsProjectionRoot<PARENT, ROOT>> projection = new ChannelEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ChannelProjection<ChannelsProjectionRoot<PARENT, ROOT>, ChannelsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ChannelProjection<ChannelsProjectionRoot<PARENT, ROOT>, ChannelsProjectionRoot<PARENT, ROOT>> projection = new ChannelProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ChannelsProjectionRoot<PARENT, ROOT>, ChannelsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ChannelsProjectionRoot<PARENT, ROOT>, ChannelsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
