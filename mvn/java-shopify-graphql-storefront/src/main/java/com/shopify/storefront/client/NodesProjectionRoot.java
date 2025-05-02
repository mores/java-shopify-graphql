package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class NodesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public NodesProjectionRoot() {
    super(null, null, java.util.Optional.of("Node"));
  }

  public NodesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public NodesProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppliedGiftCardFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAppliedGiftCard(
      ) {
    AppliedGiftCardFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AppliedGiftCardFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ArticleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onArticle(
      ) {
    ArticleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ArticleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public BlogFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onBlog(
      ) {
    BlogFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new BlogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CartFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCart(
      ) {
    CartFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CartFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CartLineFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCartLine(
      ) {
    CartLineFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CartLineFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCollection(
      ) {
    CollectionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CollectionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CommentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onComment(
      ) {
    CommentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CommentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCompany(
      ) {
    CompanyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CompanyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyContactFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCompanyContact(
      ) {
    CompanyContactFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CompanyContactFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCompanyLocation(
      ) {
    CompanyLocationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CompanyLocationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ComponentizableCartLineFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onComponentizableCartLine(
      ) {
    ComponentizableCartLineFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ComponentizableCartLineFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ExternalVideoFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onExternalVideo(
      ) {
    ExternalVideoFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ExternalVideoFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public GenericFileFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onGenericFile(
      ) {
    GenericFileFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new GenericFileFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public LocationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onLocation(
      ) {
    LocationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new LocationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MailingAddressFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMailingAddress(
      ) {
    MailingAddressFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MailingAddressFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MarketFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMarket(
      ) {
    MarketFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MarketFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MediaImageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMediaImage(
      ) {
    MediaImageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MediaImageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MediaPresentationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMediaPresentation(
      ) {
    MediaPresentationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MediaPresentationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MenuFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMenu(
      ) {
    MenuFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MenuFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MenuItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMenuItem(
      ) {
    MenuItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MenuItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetafieldFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMetafield(
      ) {
    MetafieldFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MetafieldFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetaobjectFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMetaobject(
      ) {
    MetaobjectFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MetaobjectFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public Model3dFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onModel3d(
      ) {
    Model3dFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new Model3dFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onOrder(
      ) {
    OrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new OrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPage(
      ) {
    PageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProduct(
      ) {
    ProductFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductOptionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProductOption(
      ) {
    ProductOptionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductOptionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductOptionValueFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProductOptionValue(
      ) {
    ProductOptionValueFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductOptionValueFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProductVariant(
      ) {
    ProductVariantFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductVariantFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShop(
      ) {
    ShopFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPayInstallmentsFinancingPlanFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopPayInstallmentsFinancingPlan(
      ) {
    ShopPayInstallmentsFinancingPlanFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopPayInstallmentsFinancingPlanFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPayInstallmentsFinancingPlanTermFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopPayInstallmentsFinancingPlanTerm(
      ) {
    ShopPayInstallmentsFinancingPlanTermFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopPayInstallmentsFinancingPlanTermFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPayInstallmentsProductVariantPricingFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopPayInstallmentsProductVariantPricing(
      ) {
    ShopPayInstallmentsProductVariantPricingFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopPayInstallmentsProductVariantPricingFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPolicyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopPolicy(
      ) {
    ShopPolicyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopPolicyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyCategoryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onTaxonomyCategory(
      ) {
    TaxonomyCategoryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyCategoryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public UrlRedirectFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onUrlRedirect(
      ) {
    UrlRedirectFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new UrlRedirectFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public VideoFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onVideo(
      ) {
    VideoFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new VideoFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
