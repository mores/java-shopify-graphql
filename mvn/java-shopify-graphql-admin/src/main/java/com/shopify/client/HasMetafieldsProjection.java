package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class HasMetafieldsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public HasMetafieldsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("HasMetafields"));
  }

  public HasMetafieldsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public AppInstallationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onAppInstallation(
      ) {
    AppInstallationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new AppInstallationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ArticleFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onArticle() {
    ArticleFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new ArticleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public BlogFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onBlog() {
    BlogFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new BlogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CartTransformFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onCartTransform(
      ) {
    CartTransformFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new CartTransformFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onCollection() {
    CollectionFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new CollectionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onCompany() {
    CompanyFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new CompanyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onCompanyLocation(
      ) {
    CompanyLocationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new CompanyLocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onCustomer() {
    CustomerFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new CustomerFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerSegmentMemberFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onCustomerSegmentMember(
      ) {
    CustomerSegmentMemberFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new CustomerSegmentMemberFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryCustomizationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onDeliveryCustomization(
      ) {
    DeliveryCustomizationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryCustomizationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticNodeFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticNode(
      ) {
    DiscountAutomaticNodeFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeNodeFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onDiscountCodeNode(
      ) {
    DiscountCodeNodeFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountNodeFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onDiscountNode(
      ) {
    DiscountNodeFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new DiscountNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onDraftOrder() {
    DraftOrderFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new DraftOrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentConstraintRuleFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onFulfillmentConstraintRule(
      ) {
    FulfillmentConstraintRuleFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new FulfillmentConstraintRuleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardCreditTransactionFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onGiftCardCreditTransaction(
      ) {
    GiftCardCreditTransactionFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new GiftCardCreditTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardDebitTransactionFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onGiftCardDebitTransaction(
      ) {
    GiftCardDebitTransactionFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new GiftCardDebitTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ImageFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onImage() {
    ImageFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new ImageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public LocationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onLocation() {
    LocationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new LocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MarketFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onMarket() {
    MarketFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new MarketFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MediaImageFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onMediaImage() {
    MediaImageFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new MediaImageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onOrder() {
    OrderFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new OrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PageFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onPage() {
    PageFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new PageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentCustomizationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onPaymentCustomization(
      ) {
    PaymentCustomizationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new PaymentCustomizationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onProduct() {
    ProductFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new ProductFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onProductVariant(
      ) {
    ProductVariantFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new ProductVariantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onSellingPlan(
      ) {
    SellingPlanFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onShop() {
    ShopFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new ShopFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ValidationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> onValidation() {
    ValidationFragmentProjection<HasMetafieldsProjection<PARENT, ROOT>, ROOT> fragment = new ValidationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
