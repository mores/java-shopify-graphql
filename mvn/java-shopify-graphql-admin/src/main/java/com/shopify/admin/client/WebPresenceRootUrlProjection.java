package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class WebPresenceRootUrlProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public WebPresenceRootUrlProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("WebPresenceRootUrl"));
  }

  public WebPresenceRootUrlProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WebPresenceRootUrlProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public WebPresenceRootUrlProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
