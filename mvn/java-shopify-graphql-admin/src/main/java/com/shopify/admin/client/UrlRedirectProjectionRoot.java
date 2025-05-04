package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectProjectionRoot() {
    super(null, null, java.util.Optional.of("UrlRedirect"));
  }

  public UrlRedirectProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public UrlRedirectProjectionRoot<PARENT, ROOT> path() {
    getFields().put("path", null);
    return this;
  }

  public UrlRedirectProjectionRoot<PARENT, ROOT> target() {
    getFields().put("target", null);
    return this;
  }
}
