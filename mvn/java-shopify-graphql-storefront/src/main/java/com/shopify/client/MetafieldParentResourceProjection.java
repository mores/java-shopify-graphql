package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldParentResourceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldParentResourceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldParentResource"));
  }

  public MetafieldParentResourceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ArticleFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onArticle(
      ) {
    ArticleFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new ArticleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public BlogFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onBlog() {
    BlogFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new BlogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CartFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onCart() {
    CartFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new CartFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onCollection(
      ) {
    CollectionFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new CollectionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onCompany(
      ) {
    CompanyFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new CompanyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onCompanyLocation(
      ) {
    CompanyLocationFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new CompanyLocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onCustomer(
      ) {
    CustomerFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new CustomerFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public LocationFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onLocation(
      ) {
    LocationFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new LocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MarketFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onMarket(
      ) {
    MarketFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new MarketFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onOrder() {
    OrderFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new OrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PageFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onPage() {
    PageFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new PageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onProduct(
      ) {
    ProductFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new ProductFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onProductVariant(
      ) {
    ProductVariantFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new ProductVariantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onSellingPlan(
      ) {
    SellingPlanFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> onShop() {
    ShopFragmentProjection<MetafieldParentResourceProjection<PARENT, ROOT>, ROOT> fragment = new ShopFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
