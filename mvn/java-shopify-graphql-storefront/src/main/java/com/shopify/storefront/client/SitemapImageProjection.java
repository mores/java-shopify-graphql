package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SitemapImageProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SitemapImageProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SitemapImage"));
  }

  public SitemapImageProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SitemapImageProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public SitemapImageProjection<PARENT, ROOT> filepath() {
    getFields().put("filepath", null);
    return this;
  }

  public SitemapImageProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
