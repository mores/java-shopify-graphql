package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ChannelInformationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ChannelInformationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ChannelInformation"));
  }

  public ChannelInformationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<ChannelInformationProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<ChannelInformationProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public ChannelDefinitionProjection<ChannelInformationProjection<PARENT, ROOT>, ROOT> channelDefinition(
      ) {
     ChannelDefinitionProjection<ChannelInformationProjection<PARENT, ROOT>, ROOT> projection = new ChannelDefinitionProjection<>(this, getRoot());
     getFields().put("channelDefinition", projection);
     return projection;
  }

  public ChannelInformationProjection<PARENT, ROOT> channelId() {
    getFields().put("channelId", null);
    return this;
  }

  public ChannelInformationProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public ChannelInformationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
