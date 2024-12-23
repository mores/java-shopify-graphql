package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ChannelDefinitionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelDefinitionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ChannelDefinition"));
  }

  public ChannelDefinitionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelDefinitionProjection<PARENT, ROOT> channelName() {
    getFields().put("channelName", null);
    return this;
  }

  public ChannelDefinitionProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ChannelDefinitionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ChannelDefinitionProjection<PARENT, ROOT> isMarketplace() {
    getFields().put("isMarketplace", null);
    return this;
  }

  public ChannelDefinitionProjection<PARENT, ROOT> subChannelName() {
    getFields().put("subChannelName", null);
    return this;
  }

  public ChannelDefinitionProjection<PARENT, ROOT> svgIcon() {
    getFields().put("svgIcon", null);
    return this;
  }
}
