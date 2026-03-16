package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ChannelInformationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ChannelInformationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ChannelInformation"));
  }

  public ChannelInformationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<ChannelInformationFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<ChannelInformationFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public ChannelDefinitionProjection<ChannelInformationFragmentProjection<PARENT, ROOT>, ROOT> channelDefinition(
      ) {
     ChannelDefinitionProjection<ChannelInformationFragmentProjection<PARENT, ROOT>, ROOT> projection = new ChannelDefinitionProjection<>(this, getRoot());
     getFields().put("channelDefinition", projection);
     return projection;
  }

  public ChannelInformationFragmentProjection<PARENT, ROOT> channelId() {
    getFields().put("channelId", null);
    return this;
  }

  public ChannelInformationFragmentProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public ChannelInformationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ChannelInformation {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
