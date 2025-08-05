package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class URLProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public URLProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("URL"));
  }

  public URLProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
