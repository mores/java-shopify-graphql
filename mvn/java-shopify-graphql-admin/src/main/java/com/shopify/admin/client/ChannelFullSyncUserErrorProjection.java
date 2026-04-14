package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ChannelFullSyncUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelFullSyncUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ChannelFullSyncUserError"));
  }

  public ChannelFullSyncUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelFullSyncUserErrorCodeProjection<ChannelFullSyncUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ChannelFullSyncUserErrorCodeProjection<ChannelFullSyncUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ChannelFullSyncUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ChannelFullSyncUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ChannelFullSyncUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
