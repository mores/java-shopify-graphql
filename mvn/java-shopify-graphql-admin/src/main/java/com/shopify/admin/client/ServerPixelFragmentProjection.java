package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ServerPixelFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ServerPixelFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ServerPixel"));
  }

  public ServerPixelFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ServerPixelStatusProjection<ServerPixelFragmentProjection<PARENT, ROOT>, ROOT> status() {
     ServerPixelStatusProjection<ServerPixelFragmentProjection<PARENT, ROOT>, ROOT> projection = new ServerPixelStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ServerPixelFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ServerPixelFragmentProjection<PARENT, ROOT> webhookEndpointAddress() {
    getFields().put("webhookEndpointAddress", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ServerPixel {");
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
