package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AvailableChannelDefinitionsByChannelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AvailableChannelDefinitionsByChannelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AvailableChannelDefinitionsByChannel"));
  }

  public AvailableChannelDefinitionsByChannelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelDefinitionProjection<AvailableChannelDefinitionsByChannelProjection<PARENT, ROOT>, ROOT> channelDefinitions(
      ) {
     ChannelDefinitionProjection<AvailableChannelDefinitionsByChannelProjection<PARENT, ROOT>, ROOT> projection = new ChannelDefinitionProjection<>(this, getRoot());
     getFields().put("channelDefinitions", projection);
     return projection;
  }

  public AvailableChannelDefinitionsByChannelProjection<PARENT, ROOT> channelName() {
    getFields().put("channelName", null);
    return this;
  }
}
