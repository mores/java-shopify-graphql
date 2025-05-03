package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MenuItemResourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MenuItemResourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MenuItemResource"));
  }

  public MenuItemResourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> onArticle() {
    ArticleFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> fragment = new ArticleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public BlogFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> onBlog() {
    BlogFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> fragment = new BlogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> onCollection(
      ) {
    CollectionFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> fragment = new CollectionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MetaobjectFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> onMetaobject(
      ) {
    MetaobjectFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> fragment = new MetaobjectFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PageFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> onPage() {
    PageFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> fragment = new PageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> onProduct() {
    ProductFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> fragment = new ProductFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPolicyFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> onShopPolicy(
      ) {
    ShopPolicyFragmentProjection<MenuItemResourceProjection<PARENT, ROOT>, ROOT> fragment = new ShopPolicyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
