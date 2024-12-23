package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SearchFilterOptionsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SearchFilterOptionsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SearchFilterOptions"));
  }

  public SearchFilterOptionsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FilterOptionProjection<SearchFilterOptionsProjection<PARENT, ROOT>, ROOT> productAvailability(
      ) {
     FilterOptionProjection<SearchFilterOptionsProjection<PARENT, ROOT>, ROOT> projection = new FilterOptionProjection<>(this, getRoot());
     getFields().put("productAvailability", projection);
     return projection;
  }
}
