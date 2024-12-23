package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class WebhookEventBridgeEndpointFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public WebhookEventBridgeEndpointFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebhookEventBridgeEndpoint"));
  }

  public WebhookEventBridgeEndpointFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WebhookEventBridgeEndpointFragmentProjection<PARENT, ROOT> arn() {
    getFields().put("arn", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on WebhookEventBridgeEndpoint {");
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
