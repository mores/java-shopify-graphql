package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class WebhookPubSubEndpointFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public WebhookPubSubEndpointFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebhookPubSubEndpoint"));
  }

  public WebhookPubSubEndpointFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WebhookPubSubEndpointFragmentProjection<PARENT, ROOT> pubSubProject() {
    getFields().put("pubSubProject", null);
    return this;
  }

  public WebhookPubSubEndpointFragmentProjection<PARENT, ROOT> pubSubTopic() {
    getFields().put("pubSubTopic", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on WebhookPubSubEndpoint {");
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
