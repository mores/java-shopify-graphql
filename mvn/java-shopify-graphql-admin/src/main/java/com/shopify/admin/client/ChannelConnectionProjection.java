package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ChannelConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ChannelConnection"));
  }

  public ChannelConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelEdgeProjection<ChannelConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     ChannelEdgeProjection<ChannelConnectionProjection<PARENT, ROOT>, ROOT> projection = new ChannelEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ChannelProjection<ChannelConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ChannelProjection<ChannelConnectionProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ChannelConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ChannelConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
