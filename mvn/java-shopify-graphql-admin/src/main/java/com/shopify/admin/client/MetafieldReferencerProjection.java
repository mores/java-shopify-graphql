package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldReferencerProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldReferencerProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldReferencer"));
  }

  public MetafieldReferencerProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppInstallationFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onAppInstallation(
      ) {
    AppInstallationFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new AppInstallationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ArticleFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onArticle() {
    ArticleFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new ArticleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public BlogFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onBlog() {
    BlogFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new BlogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onCollection(
      ) {
    CollectionFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new CollectionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onCompany() {
    CompanyFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new CompanyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onCompanyLocation(
      ) {
    CompanyLocationFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new CompanyLocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onCustomer(
      ) {
    CustomerFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new CustomerFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryCustomizationFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onDeliveryCustomization(
      ) {
    DeliveryCustomizationFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryCustomizationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticNodeFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticNode(
      ) {
    DiscountAutomaticNodeFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeNodeFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onDiscountCodeNode(
      ) {
    DiscountCodeNodeFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountNodeFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onDiscountNode(
      ) {
    DiscountNodeFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new DiscountNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onDraftOrder(
      ) {
    DraftOrderFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new DraftOrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onFulfillmentOrder(
      ) {
    FulfillmentOrderFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new FulfillmentOrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public LocationFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onLocation(
      ) {
    LocationFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new LocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MarketFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onMarket() {
    MarketFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new MarketFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MetaobjectFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onMetaobject(
      ) {
    MetaobjectFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new MetaobjectFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onOrder() {
    OrderFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new OrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PageFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onPage() {
    PageFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new PageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentCustomizationFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onPaymentCustomization(
      ) {
    PaymentCustomizationFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new PaymentCustomizationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onProduct() {
    ProductFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new ProductFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onProductVariant(
      ) {
    ProductVariantFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new ProductVariantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> onShop() {
    ShopFragmentProjection<MetafieldReferencerProjection<PARENT, ROOT>, ROOT> fragment = new ShopFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
