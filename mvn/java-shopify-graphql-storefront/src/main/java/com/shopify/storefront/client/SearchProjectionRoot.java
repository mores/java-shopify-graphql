package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SearchProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SearchProjectionRoot() {
    super(null, null, java.util.Optional.of("SearchResultItemConnection"));
  }

  public SearchProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SearchResultItemEdgeProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SearchResultItemEdgeProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> projection = new SearchResultItemEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SearchResultItemProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SearchResultItemProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> projection = new SearchResultItemProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }

  public FilterProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> productFilters(
      ) {
    FilterProjection<SearchProjectionRoot<PARENT, ROOT>, SearchProjectionRoot<PARENT, ROOT>> projection = new FilterProjection<>(this, this);    
    getFields().put("productFilters", projection);
    return projection;
  }

  public SearchProjectionRoot<PARENT, ROOT> totalCount() {
    getFields().put("totalCount", null);
    return this;
  }
}
