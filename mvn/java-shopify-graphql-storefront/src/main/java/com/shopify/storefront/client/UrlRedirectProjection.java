package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UrlRedirectProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UrlRedirectProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UrlRedirect"));
  }

  public UrlRedirectProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UrlRedirectProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public UrlRedirectProjection<PARENT, ROOT> path() {
    getFields().put("path", null);
    return this;
  }

  public UrlRedirectProjection<PARENT, ROOT> target() {
    getFields().put("target", null);
    return this;
  }
}
