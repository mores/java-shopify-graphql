package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SearchResultItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SearchResultItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SearchResultItem"));
  }

  public SearchResultItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleFragmentProjection<SearchResultItemProjection<PARENT, ROOT>, ROOT> onArticle() {
    ArticleFragmentProjection<SearchResultItemProjection<PARENT, ROOT>, ROOT> fragment = new ArticleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PageFragmentProjection<SearchResultItemProjection<PARENT, ROOT>, ROOT> onPage() {
    PageFragmentProjection<SearchResultItemProjection<PARENT, ROOT>, ROOT> fragment = new PageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<SearchResultItemProjection<PARENT, ROOT>, ROOT> onProduct() {
    ProductFragmentProjection<SearchResultItemProjection<PARENT, ROOT>, ROOT> fragment = new ProductFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
