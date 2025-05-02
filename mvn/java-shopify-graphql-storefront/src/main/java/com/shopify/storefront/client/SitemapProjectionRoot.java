package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.util.ArrayList;

public class SitemapProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SitemapProjectionRoot() {
    super(null, null, java.util.Optional.of("Sitemap"));
  }

  public SitemapProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<SitemapProjectionRoot<PARENT, ROOT>, SitemapProjectionRoot<PARENT, ROOT>> pagesCount(
      ) {
    CountProjection<SitemapProjectionRoot<PARENT, ROOT>, SitemapProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("pagesCount", projection);
    return projection;
  }

  public PaginatedSitemapResourcesProjection<SitemapProjectionRoot<PARENT, ROOT>, SitemapProjectionRoot<PARENT, ROOT>> resources(
      ) {
    PaginatedSitemapResourcesProjection<SitemapProjectionRoot<PARENT, ROOT>, SitemapProjectionRoot<PARENT, ROOT>> projection = new PaginatedSitemapResourcesProjection<>(this, this);    
    getFields().put("resources", projection);
    return projection;
  }

  public PaginatedSitemapResourcesProjection<SitemapProjectionRoot<PARENT, ROOT>, SitemapProjectionRoot<PARENT, ROOT>> resources(
      int page) {
    PaginatedSitemapResourcesProjection<SitemapProjectionRoot<PARENT, ROOT>, SitemapProjectionRoot<PARENT, ROOT>> projection = new PaginatedSitemapResourcesProjection<>(this, this);    
    getFields().put("resources", projection);
    getInputArguments().computeIfAbsent("resources", k -> new ArrayList<>());                      
    InputArgument pageArg = new InputArgument("page", page);
    getInputArguments().get("resources").add(pageArg);
    return projection;
  }
}
