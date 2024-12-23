package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ChannelEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ChannelEdge"));
  }

  public ChannelEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelProjection<ChannelEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ChannelProjection<ChannelEdgeProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ChannelEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
