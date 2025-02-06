package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class NodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public NodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Node"));
  }

  public NodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public NodeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AbandonedCheckoutFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAbandonedCheckout(
      ) {
    AbandonedCheckoutFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AbandonedCheckoutFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AbandonedCheckoutLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAbandonedCheckoutLineItem(
      ) {
    AbandonedCheckoutLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AbandonedCheckoutLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AbandonmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAbandonment() {
    AbandonmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AbandonmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AddAllProductsOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAddAllProductsOperation(
      ) {
    AddAllProductsOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AddAllProductsOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AdditionalFeeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAdditionalFee() {
    AdditionalFeeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AdditionalFeeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AppFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onApp() {
    AppFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AppFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AppCatalogFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAppCatalog() {
    AppCatalogFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AppCatalogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AppCreditFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAppCredit() {
    AppCreditFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AppCreditFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AppInstallationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAppInstallation() {
    AppInstallationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AppInstallationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AppPurchaseOneTimeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAppPurchaseOneTime(
      ) {
    AppPurchaseOneTimeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AppPurchaseOneTimeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AppRevenueAttributionRecordFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAppRevenueAttributionRecord(
      ) {
    AppRevenueAttributionRecordFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AppRevenueAttributionRecordFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AppSubscriptionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAppSubscription() {
    AppSubscriptionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AppSubscriptionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AppUsageRecordFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onAppUsageRecord() {
    AppUsageRecordFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new AppUsageRecordFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ArticleFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onArticle() {
    ArticleFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ArticleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public BasicEventFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onBasicEvent() {
    BasicEventFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new BasicEventFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public BlogFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onBlog() {
    BlogFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new BlogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public BulkOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onBulkOperation() {
    BulkOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new BulkOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public BusinessEntityFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onBusinessEntity() {
    BusinessEntityFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new BusinessEntityFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CalculatedOrderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCalculatedOrder() {
    CalculatedOrderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CalculatedOrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CartTransformFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCartTransform() {
    CartTransformFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CartTransformFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CashTrackingAdjustmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCashTrackingAdjustment(
      ) {
    CashTrackingAdjustmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CashTrackingAdjustmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CashTrackingSessionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCashTrackingSession(
      ) {
    CashTrackingSessionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CashTrackingSessionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CatalogCsvOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCatalogCsvOperation(
      ) {
    CatalogCsvOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CatalogCsvOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ChannelFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onChannel() {
    ChannelFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ChannelFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ChannelDefinitionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onChannelDefinition(
      ) {
    ChannelDefinitionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ChannelDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ChannelInformationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onChannelInformation(
      ) {
    ChannelInformationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ChannelInformationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CheckoutProfileFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCheckoutProfile() {
    CheckoutProfileFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CheckoutProfileFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCollection() {
    CollectionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CollectionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CommentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onComment() {
    CommentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CommentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CommentEventFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCommentEvent() {
    CommentEventFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CommentEventFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCompany() {
    CompanyFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CompanyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyAddressFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCompanyAddress() {
    CompanyAddressFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CompanyAddressFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyContactFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCompanyContact() {
    CompanyContactFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CompanyContactFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyContactRoleFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCompanyContactRole(
      ) {
    CompanyContactRoleFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CompanyContactRoleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyContactRoleAssignmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCompanyContactRoleAssignment(
      ) {
    CompanyContactRoleAssignmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CompanyContactRoleAssignmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCompanyLocation() {
    CompanyLocationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CompanyLocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationCatalogFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCompanyLocationCatalog(
      ) {
    CompanyLocationCatalogFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CompanyLocationCatalogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationStaffMemberAssignmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCompanyLocationStaffMemberAssignment(
      ) {
    CompanyLocationStaffMemberAssignmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CompanyLocationStaffMemberAssignmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCustomer() {
    CustomerFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CustomerFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerAccountAppExtensionPageFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCustomerAccountAppExtensionPage(
      ) {
    CustomerAccountAppExtensionPageFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CustomerAccountAppExtensionPageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerAccountNativePageFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCustomerAccountNativePage(
      ) {
    CustomerAccountNativePageFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CustomerAccountNativePageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerPaymentMethodFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCustomerPaymentMethod(
      ) {
    CustomerPaymentMethodFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CustomerPaymentMethodFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerSegmentMembersQueryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCustomerSegmentMembersQuery(
      ) {
    CustomerSegmentMembersQueryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CustomerSegmentMembersQueryFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerVisitFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onCustomerVisit() {
    CustomerVisitFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new CustomerVisitFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryCarrierServiceFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryCarrierService(
      ) {
    DeliveryCarrierServiceFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryCarrierServiceFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryConditionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryCondition(
      ) {
    DeliveryConditionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryConditionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryCountryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryCountry() {
    DeliveryCountryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryCountryFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryCustomizationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryCustomization(
      ) {
    DeliveryCustomizationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryCustomizationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryLocationGroupFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryLocationGroup(
      ) {
    DeliveryLocationGroupFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryLocationGroupFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryMethodFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryMethod() {
    DeliveryMethodFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryMethodFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryMethodDefinitionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryMethodDefinition(
      ) {
    DeliveryMethodDefinitionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryMethodDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryParticipantFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryParticipant(
      ) {
    DeliveryParticipantFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryParticipantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryProfileFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryProfile() {
    DeliveryProfileFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryProfileFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryProfileItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryProfileItem(
      ) {
    DeliveryProfileItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryProfileItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryPromiseProviderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryPromiseProvider(
      ) {
    DeliveryPromiseProviderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryPromiseProviderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryProvinceFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryProvince(
      ) {
    DeliveryProvinceFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryProvinceFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryRateDefinitionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryRateDefinition(
      ) {
    DeliveryRateDefinitionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryRateDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryZoneFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDeliveryZone() {
    DeliveryZoneFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryZoneFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticBxgyFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticBxgy(
      ) {
    DiscountAutomaticBxgyFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticBxgyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticNodeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticNode(
      ) {
    DiscountAutomaticNodeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeNodeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDiscountCodeNode(
      ) {
    DiscountCodeNodeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountNodeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDiscountNode() {
    DiscountNodeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DiscountNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountRedeemCodeBulkCreationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDiscountRedeemCodeBulkCreation(
      ) {
    DiscountRedeemCodeBulkCreationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DiscountRedeemCodeBulkCreationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DomainFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDomain() {
    DomainFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DomainFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDraftOrder() {
    DraftOrderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DraftOrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDraftOrderLineItem(
      ) {
    DraftOrderLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DraftOrderLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderTagFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDraftOrderTag() {
    DraftOrderTagFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DraftOrderTagFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DutyFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onDuty() {
    DutyFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new DutyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ExchangeLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onExchangeLineItem(
      ) {
    ExchangeLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ExchangeLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ExchangeV2FragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onExchangeV2() {
    ExchangeV2FragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ExchangeV2FragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ExternalVideoFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onExternalVideo() {
    ExternalVideoFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ExternalVideoFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onFulfillment() {
    FulfillmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new FulfillmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentConstraintRuleFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onFulfillmentConstraintRule(
      ) {
    FulfillmentConstraintRuleFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new FulfillmentConstraintRuleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentEventFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onFulfillmentEvent(
      ) {
    FulfillmentEventFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new FulfillmentEventFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentHoldFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onFulfillmentHold() {
    FulfillmentHoldFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new FulfillmentHoldFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onFulfillmentLineItem(
      ) {
    FulfillmentLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new FulfillmentLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onFulfillmentOrder(
      ) {
    FulfillmentOrderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new FulfillmentOrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderDestinationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onFulfillmentOrderDestination(
      ) {
    FulfillmentOrderDestinationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new FulfillmentOrderDestinationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onFulfillmentOrderLineItem(
      ) {
    FulfillmentOrderLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new FulfillmentOrderLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderMerchantRequestFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onFulfillmentOrderMerchantRequest(
      ) {
    FulfillmentOrderMerchantRequestFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new FulfillmentOrderMerchantRequestFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public GenericFileFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onGenericFile() {
    GenericFileFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new GenericFileFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onGiftCard() {
    GiftCardFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new GiftCardFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardCreditTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onGiftCardCreditTransaction(
      ) {
    GiftCardCreditTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new GiftCardCreditTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardDebitTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onGiftCardDebitTransaction(
      ) {
    GiftCardDebitTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new GiftCardDebitTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryAdjustmentGroupFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onInventoryAdjustmentGroup(
      ) {
    InventoryAdjustmentGroupFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new InventoryAdjustmentGroupFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onInventoryItem() {
    InventoryItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new InventoryItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryItemMeasurementFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onInventoryItemMeasurement(
      ) {
    InventoryItemMeasurementFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new InventoryItemMeasurementFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryLevelFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onInventoryLevel() {
    InventoryLevelFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new InventoryLevelFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryQuantityFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onInventoryQuantity(
      ) {
    InventoryQuantityFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new InventoryQuantityFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public LineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onLineItem() {
    LineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new LineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public LineItemGroupFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onLineItemGroup() {
    LineItemGroupFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new LineItemGroupFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public LocationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onLocation() {
    LocationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new LocationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MailingAddressFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMailingAddress() {
    MailingAddressFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MailingAddressFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MarketFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMarket() {
    MarketFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MarketFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MarketCatalogFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMarketCatalog() {
    MarketCatalogFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MarketCatalogFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MarketingActivityFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMarketingActivity(
      ) {
    MarketingActivityFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MarketingActivityFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MarketingEventFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMarketingEvent() {
    MarketingEventFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MarketingEventFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MarketRegionCountryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMarketRegionCountry(
      ) {
    MarketRegionCountryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MarketRegionCountryFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MarketWebPresenceFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMarketWebPresence(
      ) {
    MarketWebPresenceFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MarketWebPresenceFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MediaImageFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMediaImage() {
    MediaImageFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MediaImageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MenuFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMenu() {
    MenuFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MenuFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MetafieldFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMetafield() {
    MetafieldFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MetafieldFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MetafieldDefinitionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMetafieldDefinition(
      ) {
    MetafieldDefinitionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MetafieldDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MetaobjectFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMetaobject() {
    MetaobjectFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MetaobjectFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public MetaobjectDefinitionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onMetaobjectDefinition(
      ) {
    MetaobjectDefinitionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new MetaobjectDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public Model3dFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onModel3d() {
    Model3dFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new Model3dFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OnlineStoreThemeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onOnlineStoreTheme(
      ) {
    OnlineStoreThemeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new OnlineStoreThemeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onOrder() {
    OrderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new OrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderAdjustmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onOrderAdjustment() {
    OrderAdjustmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new OrderAdjustmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderDisputeSummaryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onOrderDisputeSummary(
      ) {
    OrderDisputeSummaryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new OrderDisputeSummaryFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onOrderTransaction(
      ) {
    OrderTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new OrderTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PageFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPage() {
    PageFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentCustomizationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPaymentCustomization(
      ) {
    PaymentCustomizationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PaymentCustomizationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentMandateFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPaymentMandate() {
    PaymentMandateFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PaymentMandateFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentScheduleFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPaymentSchedule() {
    PaymentScheduleFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PaymentScheduleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentTermsFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPaymentTerms() {
    PaymentTermsFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PaymentTermsFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentTermsTemplateFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPaymentTermsTemplate(
      ) {
    PaymentTermsTemplateFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PaymentTermsTemplateFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PriceListFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPriceList() {
    PriceListFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PriceListFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PriceRuleFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPriceRule() {
    PriceRuleFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PriceRuleFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PriceRuleDiscountCodeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPriceRuleDiscountCode(
      ) {
    PriceRuleDiscountCodeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PriceRuleDiscountCodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onProduct() {
    ProductFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ProductFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductBundleOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onProductBundleOperation(
      ) {
    ProductBundleOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ProductBundleOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductDeleteOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onProductDeleteOperation(
      ) {
    ProductDeleteOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ProductDeleteOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductDuplicateOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onProductDuplicateOperation(
      ) {
    ProductDuplicateOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ProductDuplicateOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFeedFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onProductFeed() {
    ProductFeedFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ProductFeedFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductOptionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onProductOption() {
    ProductOptionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ProductOptionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductOptionValueFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onProductOptionValue(
      ) {
    ProductOptionValueFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ProductOptionValueFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductSetOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onProductSetOperation(
      ) {
    ProductSetOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ProductSetOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductTaxonomyNodeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onProductTaxonomyNode(
      ) {
    ProductTaxonomyNodeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ProductTaxonomyNodeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onProductVariant() {
    ProductVariantFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ProductVariantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantComponentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onProductVariantComponent(
      ) {
    ProductVariantComponentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ProductVariantComponentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PromiseParticipantFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPromiseParticipant(
      ) {
    PromiseParticipantFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PromiseParticipantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PublicationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPublication() {
    PublicationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PublicationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PublicationResourceOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onPublicationResourceOperation(
      ) {
    PublicationResourceOperationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new PublicationResourceOperationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public QuantityPriceBreakFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onQuantityPriceBreak(
      ) {
    QuantityPriceBreakFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new QuantityPriceBreakFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public RefundFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onRefund() {
    RefundFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new RefundFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public RefundShippingLineFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onRefundShippingLine(
      ) {
    RefundShippingLineFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new RefundShippingLineFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ReturnFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onReturn() {
    ReturnFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ReturnFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ReturnableFulfillmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onReturnableFulfillment(
      ) {
    ReturnableFulfillmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ReturnableFulfillmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ReturnLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onReturnLineItem() {
    ReturnLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ReturnLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseDeliveryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onReverseDelivery() {
    ReverseDeliveryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ReverseDeliveryFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseDeliveryLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onReverseDeliveryLineItem(
      ) {
    ReverseDeliveryLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ReverseDeliveryLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseFulfillmentOrderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onReverseFulfillmentOrder(
      ) {
    ReverseFulfillmentOrderFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ReverseFulfillmentOrderFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseFulfillmentOrderDispositionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onReverseFulfillmentOrderDisposition(
      ) {
    ReverseFulfillmentOrderDispositionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ReverseFulfillmentOrderDispositionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseFulfillmentOrderLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onReverseFulfillmentOrderLineItem(
      ) {
    ReverseFulfillmentOrderLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ReverseFulfillmentOrderLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SaleAdditionalFeeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onSaleAdditionalFee(
      ) {
    SaleAdditionalFeeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new SaleAdditionalFeeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SavedSearchFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onSavedSearch() {
    SavedSearchFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new SavedSearchFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ScriptTagFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onScriptTag() {
    ScriptTagFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ScriptTagFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SegmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onSegment() {
    SegmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new SegmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onSellingPlan() {
    SellingPlanFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanGroupFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onSellingPlanGroup(
      ) {
    SellingPlanGroupFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanGroupFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ServerPixelFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onServerPixel() {
    ServerPixelFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ServerPixelFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShop() {
    ShopFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopAddressFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShopAddress() {
    ShopAddressFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopAddressFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsAccountFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShopifyPaymentsAccount(
      ) {
    ShopifyPaymentsAccountFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopifyPaymentsAccountFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShopifyPaymentsBalanceTransaction(
      ) {
    ShopifyPaymentsBalanceTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopifyPaymentsBalanceTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsBankAccountFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShopifyPaymentsBankAccount(
      ) {
    ShopifyPaymentsBankAccountFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopifyPaymentsBankAccountFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShopifyPaymentsDispute(
      ) {
    ShopifyPaymentsDisputeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopifyPaymentsDisputeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShopifyPaymentsDisputeEvidence(
      ) {
    ShopifyPaymentsDisputeEvidenceFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopifyPaymentsDisputeEvidenceFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeFileUploadFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShopifyPaymentsDisputeFileUpload(
      ) {
    ShopifyPaymentsDisputeFileUploadFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopifyPaymentsDisputeFileUploadFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeFulfillmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShopifyPaymentsDisputeFulfillment(
      ) {
    ShopifyPaymentsDisputeFulfillmentFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopifyPaymentsDisputeFulfillmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsPayoutFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShopifyPaymentsPayout(
      ) {
    ShopifyPaymentsPayoutFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopifyPaymentsPayoutFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsVerificationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShopifyPaymentsVerification(
      ) {
    ShopifyPaymentsVerificationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopifyPaymentsVerificationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPolicyFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onShopPolicy() {
    ShopPolicyFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ShopPolicyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public StaffMemberFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onStaffMember() {
    StaffMemberFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new StaffMemberFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public StandardMetafieldDefinitionTemplateFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onStandardMetafieldDefinitionTemplate(
      ) {
    StandardMetafieldDefinitionTemplateFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new StandardMetafieldDefinitionTemplateFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onStoreCreditAccount(
      ) {
    StoreCreditAccountFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new StoreCreditAccountFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountCreditTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onStoreCreditAccountCreditTransaction(
      ) {
    StoreCreditAccountCreditTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new StoreCreditAccountCreditTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountDebitRevertTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onStoreCreditAccountDebitRevertTransaction(
      ) {
    StoreCreditAccountDebitRevertTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new StoreCreditAccountDebitRevertTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountDebitTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onStoreCreditAccountDebitTransaction(
      ) {
    StoreCreditAccountDebitTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new StoreCreditAccountDebitTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public StorefrontAccessTokenFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onStorefrontAccessToken(
      ) {
    StorefrontAccessTokenFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new StorefrontAccessTokenFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionBillingAttemptFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttempt(
      ) {
    SubscriptionBillingAttemptFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionContractFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onSubscriptionContract(
      ) {
    SubscriptionContractFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionContractFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionDraftFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onSubscriptionDraft(
      ) {
    SubscriptionDraftFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionDraftFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyAttributeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onTaxonomyAttribute(
      ) {
    TaxonomyAttributeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new TaxonomyAttributeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyCategoryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onTaxonomyCategory(
      ) {
    TaxonomyCategoryFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new TaxonomyCategoryFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyChoiceListAttributeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onTaxonomyChoiceListAttribute(
      ) {
    TaxonomyChoiceListAttributeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new TaxonomyChoiceListAttributeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyMeasurementAttributeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onTaxonomyMeasurementAttribute(
      ) {
    TaxonomyMeasurementAttributeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new TaxonomyMeasurementAttributeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyValueFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onTaxonomyValue() {
    TaxonomyValueFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new TaxonomyValueFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public TenderTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onTenderTransaction(
      ) {
    TenderTransactionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new TenderTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public TransactionFeeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onTransactionFee() {
    TransactionFeeFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new TransactionFeeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public UnverifiedReturnLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onUnverifiedReturnLineItem(
      ) {
    UnverifiedReturnLineItemFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new UnverifiedReturnLineItemFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public UrlRedirectFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onUrlRedirect() {
    UrlRedirectFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new UrlRedirectFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public UrlRedirectImportFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onUrlRedirectImport(
      ) {
    UrlRedirectImportFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new UrlRedirectImportFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ValidationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onValidation() {
    ValidationFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new ValidationFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public VideoFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onVideo() {
    VideoFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new VideoFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public WebhookSubscriptionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onWebhookSubscription(
      ) {
    WebhookSubscriptionFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new WebhookSubscriptionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public WebPixelFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> onWebPixel() {
    WebPixelFragmentProjection<NodeProjection<PARENT, ROOT>, ROOT> fragment = new WebPixelFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
