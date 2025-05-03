package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SitemapResourceInterfaceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SitemapResourceInterfaceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SitemapResourceInterface"));
  }

  public SitemapResourceInterfaceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SitemapResourceInterfaceProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public SitemapResourceInterfaceProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public SitemapResourceFragmentProjection<SitemapResourceInterfaceProjection<PARENT, ROOT>, ROOT> onSitemapResource(
      ) {
    SitemapResourceFragmentProjection<SitemapResourceInterfaceProjection<PARENT, ROOT>, ROOT> fragment = new SitemapResourceFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SitemapResourceMetaobjectFragmentProjection<SitemapResourceInterfaceProjection<PARENT, ROOT>, ROOT> onSitemapResourceMetaobject(
      ) {
    SitemapResourceMetaobjectFragmentProjection<SitemapResourceInterfaceProjection<PARENT, ROOT>, ROOT> fragment = new SitemapResourceMetaobjectFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
