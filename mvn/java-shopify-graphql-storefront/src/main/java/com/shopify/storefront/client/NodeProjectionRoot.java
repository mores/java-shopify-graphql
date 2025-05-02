package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class NodeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public NodeProjectionRoot() {
    super(null, null, java.util.Optional.of("Node"));
  }

  public NodeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public NodeProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppliedGiftCardFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAppliedGiftCard(
      ) {
    AppliedGiftCardFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AppliedGiftCardFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ArticleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onArticle(
      ) {
    ArticleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ArticleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public BlogFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onBlog(
      ) {
    BlogFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new BlogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CartFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCart(
      ) {
    CartFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CartFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CartLineFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCartLine(
      ) {
    CartLineFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CartLineFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCollection(
      ) {
    CollectionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CollectionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CommentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onComment(
      ) {
    CommentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CommentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCompany(
      ) {
    CompanyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CompanyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyContactFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCompanyContact(
      ) {
    CompanyContactFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CompanyContactFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCompanyLocation(
      ) {
    CompanyLocationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CompanyLocationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ComponentizableCartLineFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onComponentizableCartLine(
      ) {
    ComponentizableCartLineFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ComponentizableCartLineFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ExternalVideoFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onExternalVideo(
      ) {
    ExternalVideoFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ExternalVideoFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public GenericFileFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onGenericFile(
      ) {
    GenericFileFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new GenericFileFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public LocationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onLocation(
      ) {
    LocationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new LocationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MailingAddressFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMailingAddress(
      ) {
    MailingAddressFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MailingAddressFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MarketFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMarket(
      ) {
    MarketFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MarketFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MediaImageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMediaImage(
      ) {
    MediaImageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MediaImageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MediaPresentationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMediaPresentation(
      ) {
    MediaPresentationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MediaPresentationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MenuFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMenu(
      ) {
    MenuFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MenuFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MenuItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMenuItem(
      ) {
    MenuItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MenuItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetafieldFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMetafield(
      ) {
    MetafieldFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MetafieldFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetaobjectFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMetaobject(
      ) {
    MetaobjectFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MetaobjectFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public Model3dFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onModel3d(
      ) {
    Model3dFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new Model3dFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onOrder(
      ) {
    OrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new OrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPage(
      ) {
    PageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProduct(
      ) {
    ProductFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductOptionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProductOption(
      ) {
    ProductOptionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductOptionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductOptionValueFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProductOptionValue(
      ) {
    ProductOptionValueFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductOptionValueFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProductVariant(
      ) {
    ProductVariantFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductVariantFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShop(
      ) {
    ShopFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPayInstallmentsFinancingPlanFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopPayInstallmentsFinancingPlan(
      ) {
    ShopPayInstallmentsFinancingPlanFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopPayInstallmentsFinancingPlanFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPayInstallmentsFinancingPlanTermFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopPayInstallmentsFinancingPlanTerm(
      ) {
    ShopPayInstallmentsFinancingPlanTermFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopPayInstallmentsFinancingPlanTermFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPayInstallmentsProductVariantPricingFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopPayInstallmentsProductVariantPricing(
      ) {
    ShopPayInstallmentsProductVariantPricingFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopPayInstallmentsProductVariantPricingFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPolicyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopPolicy(
      ) {
    ShopPolicyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopPolicyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyCategoryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onTaxonomyCategory(
      ) {
    TaxonomyCategoryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyCategoryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public UrlRedirectFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onUrlRedirect(
      ) {
    UrlRedirectFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new UrlRedirectFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public VideoFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onVideo(
      ) {
    VideoFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new VideoFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
