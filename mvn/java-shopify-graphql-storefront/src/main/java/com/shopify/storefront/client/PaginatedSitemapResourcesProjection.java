package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaginatedSitemapResourcesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaginatedSitemapResourcesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaginatedSitemapResources"));
  }

  public PaginatedSitemapResourcesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SitemapResourceInterfaceProjection<PaginatedSitemapResourcesProjection<PARENT, ROOT>, ROOT> items(
      ) {
     SitemapResourceInterfaceProjection<PaginatedSitemapResourcesProjection<PARENT, ROOT>, ROOT> projection = new SitemapResourceInterfaceProjection<>(this, getRoot());
     getFields().put("items", projection);
     return projection;
  }

  public PaginatedSitemapResourcesProjection<PARENT, ROOT> hasNextPage() {
    getFields().put("hasNextPage", null);
    return this;
  }
}
