package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourceAlertActionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourceAlertActionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourceAlertAction"));
  }

  public ResourceAlertActionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResourceAlertActionProjection<PARENT, ROOT> primary() {
    getFields().put("primary", null);
    return this;
  }

  public ResourceAlertActionProjection<PARENT, ROOT> show() {
    getFields().put("show", null);
    return this;
  }

  public ResourceAlertActionProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public ResourceAlertActionProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
