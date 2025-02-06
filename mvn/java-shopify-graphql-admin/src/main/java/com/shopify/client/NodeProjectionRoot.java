package com.shopify.client;

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

  public AbandonedCheckoutFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAbandonedCheckout(
      ) {
    AbandonedCheckoutFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AbandonedCheckoutFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AbandonedCheckoutLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAbandonedCheckoutLineItem(
      ) {
    AbandonedCheckoutLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AbandonedCheckoutLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AbandonmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAbandonment(
      ) {
    AbandonmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AbandonmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AddAllProductsOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAddAllProductsOperation(
      ) {
    AddAllProductsOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AddAllProductsOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AdditionalFeeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAdditionalFee(
      ) {
    AdditionalFeeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AdditionalFeeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onApp(
      ) {
    AppFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AppFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppCatalogFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAppCatalog(
      ) {
    AppCatalogFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AppCatalogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppCreditFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAppCredit(
      ) {
    AppCreditFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AppCreditFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppInstallationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAppInstallation(
      ) {
    AppInstallationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AppInstallationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppPurchaseOneTimeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAppPurchaseOneTime(
      ) {
    AppPurchaseOneTimeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AppPurchaseOneTimeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppRevenueAttributionRecordFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAppRevenueAttributionRecord(
      ) {
    AppRevenueAttributionRecordFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AppRevenueAttributionRecordFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppSubscriptionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAppSubscription(
      ) {
    AppSubscriptionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AppSubscriptionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppUsageRecordFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onAppUsageRecord(
      ) {
    AppUsageRecordFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new AppUsageRecordFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ArticleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onArticle(
      ) {
    ArticleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ArticleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public BasicEventFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onBasicEvent(
      ) {
    BasicEventFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new BasicEventFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public BlogFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onBlog(
      ) {
    BlogFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new BlogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public BulkOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onBulkOperation(
      ) {
    BulkOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new BulkOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public BusinessEntityFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onBusinessEntity(
      ) {
    BusinessEntityFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new BusinessEntityFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CalculatedOrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCalculatedOrder(
      ) {
    CalculatedOrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CalculatedOrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CartTransformFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCartTransform(
      ) {
    CartTransformFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CartTransformFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CashTrackingAdjustmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCashTrackingAdjustment(
      ) {
    CashTrackingAdjustmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CashTrackingAdjustmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CashTrackingSessionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCashTrackingSession(
      ) {
    CashTrackingSessionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CashTrackingSessionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CatalogCsvOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCatalogCsvOperation(
      ) {
    CatalogCsvOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CatalogCsvOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ChannelFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onChannel(
      ) {
    ChannelFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ChannelFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ChannelDefinitionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onChannelDefinition(
      ) {
    ChannelDefinitionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ChannelDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ChannelInformationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onChannelInformation(
      ) {
    ChannelInformationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ChannelInformationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CheckoutProfileFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCheckoutProfile(
      ) {
    CheckoutProfileFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CheckoutProfileFragmentProjection<>(this, this);
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

  public CommentEventFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCommentEvent(
      ) {
    CommentEventFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CommentEventFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCompany(
      ) {
    CompanyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CompanyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyAddressFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCompanyAddress(
      ) {
    CompanyAddressFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CompanyAddressFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyContactFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCompanyContact(
      ) {
    CompanyContactFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CompanyContactFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyContactRoleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCompanyContactRole(
      ) {
    CompanyContactRoleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CompanyContactRoleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyContactRoleAssignmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCompanyContactRoleAssignment(
      ) {
    CompanyContactRoleAssignmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CompanyContactRoleAssignmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCompanyLocation(
      ) {
    CompanyLocationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CompanyLocationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationCatalogFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCompanyLocationCatalog(
      ) {
    CompanyLocationCatalogFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CompanyLocationCatalogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationStaffMemberAssignmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCompanyLocationStaffMemberAssignment(
      ) {
    CompanyLocationStaffMemberAssignmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CompanyLocationStaffMemberAssignmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCustomer(
      ) {
    CustomerFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CustomerFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerAccountAppExtensionPageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCustomerAccountAppExtensionPage(
      ) {
    CustomerAccountAppExtensionPageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CustomerAccountAppExtensionPageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerAccountNativePageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCustomerAccountNativePage(
      ) {
    CustomerAccountNativePageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CustomerAccountNativePageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerPaymentMethodFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCustomerPaymentMethod(
      ) {
    CustomerPaymentMethodFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CustomerPaymentMethodFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerSegmentMembersQueryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCustomerSegmentMembersQuery(
      ) {
    CustomerSegmentMembersQueryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CustomerSegmentMembersQueryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerVisitFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onCustomerVisit(
      ) {
    CustomerVisitFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new CustomerVisitFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryCarrierServiceFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryCarrierService(
      ) {
    DeliveryCarrierServiceFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryCarrierServiceFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryConditionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryCondition(
      ) {
    DeliveryConditionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryConditionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryCountryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryCountry(
      ) {
    DeliveryCountryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryCountryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryCustomizationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryCustomization(
      ) {
    DeliveryCustomizationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryCustomizationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryLocationGroupFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryLocationGroup(
      ) {
    DeliveryLocationGroupFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryLocationGroupFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryMethodFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryMethod(
      ) {
    DeliveryMethodFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryMethodFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryMethodDefinitionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryMethodDefinition(
      ) {
    DeliveryMethodDefinitionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryMethodDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryParticipantFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryParticipant(
      ) {
    DeliveryParticipantFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryParticipantFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryProfileFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryProfile(
      ) {
    DeliveryProfileFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryProfileFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryProfileItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryProfileItem(
      ) {
    DeliveryProfileItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryProfileItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryPromiseProviderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryPromiseProvider(
      ) {
    DeliveryPromiseProviderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryPromiseProviderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryProvinceFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryProvince(
      ) {
    DeliveryProvinceFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryProvinceFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryRateDefinitionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryRateDefinition(
      ) {
    DeliveryRateDefinitionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryRateDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryZoneFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDeliveryZone(
      ) {
    DeliveryZoneFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DeliveryZoneFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticBxgyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDiscountAutomaticBxgy(
      ) {
    DiscountAutomaticBxgyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DiscountAutomaticBxgyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticNodeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDiscountAutomaticNode(
      ) {
    DiscountAutomaticNodeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DiscountAutomaticNodeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeNodeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDiscountCodeNode(
      ) {
    DiscountCodeNodeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DiscountCodeNodeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountNodeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDiscountNode(
      ) {
    DiscountNodeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DiscountNodeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountRedeemCodeBulkCreationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDiscountRedeemCodeBulkCreation(
      ) {
    DiscountRedeemCodeBulkCreationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DiscountRedeemCodeBulkCreationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DomainFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDomain(
      ) {
    DomainFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DomainFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDraftOrder(
      ) {
    DraftOrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DraftOrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDraftOrderLineItem(
      ) {
    DraftOrderLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DraftOrderLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderTagFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDraftOrderTag(
      ) {
    DraftOrderTagFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DraftOrderTagFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DutyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onDuty(
      ) {
    DutyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new DutyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ExchangeLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onExchangeLineItem(
      ) {
    ExchangeLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ExchangeLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ExchangeV2FragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onExchangeV2(
      ) {
    ExchangeV2FragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ExchangeV2FragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ExternalVideoFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onExternalVideo(
      ) {
    ExternalVideoFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ExternalVideoFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onFulfillment(
      ) {
    FulfillmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentConstraintRuleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onFulfillmentConstraintRule(
      ) {
    FulfillmentConstraintRuleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentConstraintRuleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentEventFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onFulfillmentEvent(
      ) {
    FulfillmentEventFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentEventFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentHoldFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onFulfillmentHold(
      ) {
    FulfillmentHoldFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentHoldFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onFulfillmentLineItem(
      ) {
    FulfillmentLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onFulfillmentOrder(
      ) {
    FulfillmentOrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentOrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderDestinationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onFulfillmentOrderDestination(
      ) {
    FulfillmentOrderDestinationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentOrderDestinationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onFulfillmentOrderLineItem(
      ) {
    FulfillmentOrderLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentOrderLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderMerchantRequestFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onFulfillmentOrderMerchantRequest(
      ) {
    FulfillmentOrderMerchantRequestFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentOrderMerchantRequestFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public GenericFileFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onGenericFile(
      ) {
    GenericFileFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new GenericFileFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onGiftCard(
      ) {
    GiftCardFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new GiftCardFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardCreditTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onGiftCardCreditTransaction(
      ) {
    GiftCardCreditTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new GiftCardCreditTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardDebitTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onGiftCardDebitTransaction(
      ) {
    GiftCardDebitTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new GiftCardDebitTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryAdjustmentGroupFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onInventoryAdjustmentGroup(
      ) {
    InventoryAdjustmentGroupFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new InventoryAdjustmentGroupFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onInventoryItem(
      ) {
    InventoryItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new InventoryItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryItemMeasurementFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onInventoryItemMeasurement(
      ) {
    InventoryItemMeasurementFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new InventoryItemMeasurementFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryLevelFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onInventoryLevel(
      ) {
    InventoryLevelFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new InventoryLevelFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryQuantityFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onInventoryQuantity(
      ) {
    InventoryQuantityFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new InventoryQuantityFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public LineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onLineItem(
      ) {
    LineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new LineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public LineItemGroupFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onLineItemGroup(
      ) {
    LineItemGroupFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new LineItemGroupFragmentProjection<>(this, this);
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

  public MarketCatalogFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMarketCatalog(
      ) {
    MarketCatalogFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MarketCatalogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MarketingActivityFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMarketingActivity(
      ) {
    MarketingActivityFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MarketingActivityFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MarketingEventFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMarketingEvent(
      ) {
    MarketingEventFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MarketingEventFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MarketRegionCountryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMarketRegionCountry(
      ) {
    MarketRegionCountryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MarketRegionCountryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MarketWebPresenceFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMarketWebPresence(
      ) {
    MarketWebPresenceFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MarketWebPresenceFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MediaImageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMediaImage(
      ) {
    MediaImageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MediaImageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MenuFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMenu(
      ) {
    MenuFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MenuFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetafieldFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMetafield(
      ) {
    MetafieldFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MetafieldFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetafieldDefinitionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMetafieldDefinition(
      ) {
    MetafieldDefinitionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MetafieldDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetaobjectFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMetaobject(
      ) {
    MetaobjectFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MetaobjectFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetaobjectDefinitionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onMetaobjectDefinition(
      ) {
    MetaobjectDefinitionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new MetaobjectDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public Model3dFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onModel3d(
      ) {
    Model3dFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new Model3dFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OnlineStoreThemeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onOnlineStoreTheme(
      ) {
    OnlineStoreThemeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new OnlineStoreThemeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onOrder(
      ) {
    OrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new OrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OrderAdjustmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onOrderAdjustment(
      ) {
    OrderAdjustmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new OrderAdjustmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OrderDisputeSummaryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onOrderDisputeSummary(
      ) {
    OrderDisputeSummaryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new OrderDisputeSummaryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OrderTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onOrderTransaction(
      ) {
    OrderTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new OrderTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPage(
      ) {
    PageFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentCustomizationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPaymentCustomization(
      ) {
    PaymentCustomizationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PaymentCustomizationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentMandateFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPaymentMandate(
      ) {
    PaymentMandateFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PaymentMandateFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentScheduleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPaymentSchedule(
      ) {
    PaymentScheduleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PaymentScheduleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentTermsFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPaymentTerms(
      ) {
    PaymentTermsFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PaymentTermsFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentTermsTemplateFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPaymentTermsTemplate(
      ) {
    PaymentTermsTemplateFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PaymentTermsTemplateFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PriceListFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPriceList(
      ) {
    PriceListFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PriceListFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PriceRuleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPriceRule(
      ) {
    PriceRuleFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PriceRuleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PriceRuleDiscountCodeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPriceRuleDiscountCode(
      ) {
    PriceRuleDiscountCodeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PriceRuleDiscountCodeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProduct(
      ) {
    ProductFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductBundleOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProductBundleOperation(
      ) {
    ProductBundleOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductBundleOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductDeleteOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProductDeleteOperation(
      ) {
    ProductDeleteOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductDeleteOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductDuplicateOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProductDuplicateOperation(
      ) {
    ProductDuplicateOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductDuplicateOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFeedFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProductFeed(
      ) {
    ProductFeedFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductFeedFragmentProjection<>(this, this);
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

  public ProductSetOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProductSetOperation(
      ) {
    ProductSetOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductSetOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductTaxonomyNodeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProductTaxonomyNode(
      ) {
    ProductTaxonomyNodeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductTaxonomyNodeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProductVariant(
      ) {
    ProductVariantFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductVariantFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantComponentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onProductVariantComponent(
      ) {
    ProductVariantComponentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ProductVariantComponentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PromiseParticipantFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPromiseParticipant(
      ) {
    PromiseParticipantFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PromiseParticipantFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PublicationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPublication(
      ) {
    PublicationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PublicationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PublicationResourceOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onPublicationResourceOperation(
      ) {
    PublicationResourceOperationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new PublicationResourceOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public QuantityPriceBreakFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onQuantityPriceBreak(
      ) {
    QuantityPriceBreakFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new QuantityPriceBreakFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public RefundFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onRefund(
      ) {
    RefundFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new RefundFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public RefundShippingLineFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onRefundShippingLine(
      ) {
    RefundShippingLineFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new RefundShippingLineFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReturnFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onReturn(
      ) {
    ReturnFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ReturnFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReturnableFulfillmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onReturnableFulfillment(
      ) {
    ReturnableFulfillmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ReturnableFulfillmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReturnLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onReturnLineItem(
      ) {
    ReturnLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ReturnLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseDeliveryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onReverseDelivery(
      ) {
    ReverseDeliveryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ReverseDeliveryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseDeliveryLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onReverseDeliveryLineItem(
      ) {
    ReverseDeliveryLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ReverseDeliveryLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseFulfillmentOrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onReverseFulfillmentOrder(
      ) {
    ReverseFulfillmentOrderFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ReverseFulfillmentOrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseFulfillmentOrderDispositionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onReverseFulfillmentOrderDisposition(
      ) {
    ReverseFulfillmentOrderDispositionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ReverseFulfillmentOrderDispositionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseFulfillmentOrderLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onReverseFulfillmentOrderLineItem(
      ) {
    ReverseFulfillmentOrderLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ReverseFulfillmentOrderLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SaleAdditionalFeeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onSaleAdditionalFee(
      ) {
    SaleAdditionalFeeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new SaleAdditionalFeeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SavedSearchFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onSavedSearch(
      ) {
    SavedSearchFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new SavedSearchFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ScriptTagFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onScriptTag(
      ) {
    ScriptTagFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ScriptTagFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SegmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onSegment(
      ) {
    SegmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new SegmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onSellingPlan(
      ) {
    SellingPlanFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new SellingPlanFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanGroupFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onSellingPlanGroup(
      ) {
    SellingPlanGroupFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new SellingPlanGroupFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ServerPixelFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onServerPixel(
      ) {
    ServerPixelFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ServerPixelFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShop(
      ) {
    ShopFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopAddressFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopAddress(
      ) {
    ShopAddressFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopAddressFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsAccountFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopifyPaymentsAccount(
      ) {
    ShopifyPaymentsAccountFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsAccountFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopifyPaymentsBalanceTransaction(
      ) {
    ShopifyPaymentsBalanceTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsBalanceTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsBankAccountFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopifyPaymentsBankAccount(
      ) {
    ShopifyPaymentsBankAccountFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsBankAccountFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopifyPaymentsDispute(
      ) {
    ShopifyPaymentsDisputeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsDisputeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopifyPaymentsDisputeEvidence(
      ) {
    ShopifyPaymentsDisputeEvidenceFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsDisputeEvidenceFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeFileUploadFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopifyPaymentsDisputeFileUpload(
      ) {
    ShopifyPaymentsDisputeFileUploadFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsDisputeFileUploadFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeFulfillmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopifyPaymentsDisputeFulfillment(
      ) {
    ShopifyPaymentsDisputeFulfillmentFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsDisputeFulfillmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsPayoutFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopifyPaymentsPayout(
      ) {
    ShopifyPaymentsPayoutFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsPayoutFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsVerificationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopifyPaymentsVerification(
      ) {
    ShopifyPaymentsVerificationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsVerificationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPolicyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onShopPolicy(
      ) {
    ShopPolicyFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ShopPolicyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StaffMemberFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onStaffMember(
      ) {
    StaffMemberFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new StaffMemberFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StandardMetafieldDefinitionTemplateFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onStandardMetafieldDefinitionTemplate(
      ) {
    StandardMetafieldDefinitionTemplateFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new StandardMetafieldDefinitionTemplateFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onStoreCreditAccount(
      ) {
    StoreCreditAccountFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new StoreCreditAccountFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountCreditTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onStoreCreditAccountCreditTransaction(
      ) {
    StoreCreditAccountCreditTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new StoreCreditAccountCreditTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountDebitRevertTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onStoreCreditAccountDebitRevertTransaction(
      ) {
    StoreCreditAccountDebitRevertTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new StoreCreditAccountDebitRevertTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountDebitTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onStoreCreditAccountDebitTransaction(
      ) {
    StoreCreditAccountDebitTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new StoreCreditAccountDebitTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StorefrontAccessTokenFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onStorefrontAccessToken(
      ) {
    StorefrontAccessTokenFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new StorefrontAccessTokenFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionBillingAttemptFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onSubscriptionBillingAttempt(
      ) {
    SubscriptionBillingAttemptFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new SubscriptionBillingAttemptFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionContractFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onSubscriptionContract(
      ) {
    SubscriptionContractFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new SubscriptionContractFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionDraftFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onSubscriptionDraft(
      ) {
    SubscriptionDraftFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new SubscriptionDraftFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyAttributeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onTaxonomyAttribute(
      ) {
    TaxonomyAttributeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyAttributeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyCategoryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onTaxonomyCategory(
      ) {
    TaxonomyCategoryFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyCategoryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyChoiceListAttributeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onTaxonomyChoiceListAttribute(
      ) {
    TaxonomyChoiceListAttributeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyChoiceListAttributeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyMeasurementAttributeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onTaxonomyMeasurementAttribute(
      ) {
    TaxonomyMeasurementAttributeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyMeasurementAttributeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyValueFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onTaxonomyValue(
      ) {
    TaxonomyValueFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyValueFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TenderTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onTenderTransaction(
      ) {
    TenderTransactionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new TenderTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TransactionFeeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onTransactionFee(
      ) {
    TransactionFeeFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new TransactionFeeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public UnverifiedReturnLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onUnverifiedReturnLineItem(
      ) {
    UnverifiedReturnLineItemFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new UnverifiedReturnLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public UrlRedirectFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onUrlRedirect(
      ) {
    UrlRedirectFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new UrlRedirectFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public UrlRedirectImportFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onUrlRedirectImport(
      ) {
    UrlRedirectImportFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new UrlRedirectImportFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ValidationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onValidation(
      ) {
    ValidationFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new ValidationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public VideoFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onVideo(
      ) {
    VideoFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new VideoFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public WebhookSubscriptionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onWebhookSubscription(
      ) {
    WebhookSubscriptionFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new WebhookSubscriptionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public WebPixelFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> onWebPixel(
      ) {
    WebPixelFragmentProjection<NodeProjectionRoot<PARENT, ROOT>, NodeProjectionRoot<PARENT, ROOT>> fragment = new WebPixelFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
