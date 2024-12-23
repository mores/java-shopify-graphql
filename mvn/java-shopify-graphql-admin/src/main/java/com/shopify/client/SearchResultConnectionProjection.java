package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SearchResultConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SearchResultConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SearchResultConnection"));
  }

  public SearchResultConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SearchResultEdgeProjection<SearchResultConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     SearchResultEdgeProjection<SearchResultConnectionProjection<PARENT, ROOT>, ROOT> projection = new SearchResultEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PageInfoProjection<SearchResultConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<SearchResultConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }

  public SearchResultConnectionProjection<PARENT, ROOT> resultsAfterCount() {
    getFields().put("resultsAfterCount", null);
    return this;
  }
}
