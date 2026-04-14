package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ChannelFullSyncProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelFullSyncProjectionRoot() {
    super(null, null, java.util.Optional.of("ChannelFullSyncPayload"));
  }

  public ChannelFullSyncProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FullSyncTraceInfoProjection<ChannelFullSyncProjectionRoot<PARENT, ROOT>, ChannelFullSyncProjectionRoot<PARENT, ROOT>> fullSyncTraceInfo(
      ) {
    FullSyncTraceInfoProjection<ChannelFullSyncProjectionRoot<PARENT, ROOT>, ChannelFullSyncProjectionRoot<PARENT, ROOT>> projection = new FullSyncTraceInfoProjection<>(this, this);    
    getFields().put("fullSyncTraceInfo", projection);
    return projection;
  }

  public ChannelFullSyncUserErrorProjection<ChannelFullSyncProjectionRoot<PARENT, ROOT>, ChannelFullSyncProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ChannelFullSyncUserErrorProjection<ChannelFullSyncProjectionRoot<PARENT, ROOT>, ChannelFullSyncProjectionRoot<PARENT, ROOT>> projection = new ChannelFullSyncUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
