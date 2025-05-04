package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ChannelDefinitionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ChannelDefinitionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ChannelDefinition"));
  }

  public ChannelDefinitionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelDefinitionFragmentProjection<PARENT, ROOT> channelName() {
    getFields().put("channelName", null);
    return this;
  }

  public ChannelDefinitionFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public ChannelDefinitionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ChannelDefinitionFragmentProjection<PARENT, ROOT> isMarketplace() {
    getFields().put("isMarketplace", null);
    return this;
  }

  public ChannelDefinitionFragmentProjection<PARENT, ROOT> subChannelName() {
    getFields().put("subChannelName", null);
    return this;
  }

  public ChannelDefinitionFragmentProjection<PARENT, ROOT> svgIcon() {
    getFields().put("svgIcon", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ChannelDefinition {");
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
