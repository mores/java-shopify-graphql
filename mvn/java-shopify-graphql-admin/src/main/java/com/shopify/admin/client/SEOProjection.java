package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SEOProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SEOProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SEO"));
  }

  public SEOProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SEOProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SEOProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
