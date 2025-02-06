package com.shopify.client;

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

  public AbandonedCheckoutFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAbandonedCheckout(
      ) {
    AbandonedCheckoutFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AbandonedCheckoutFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AbandonedCheckoutLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAbandonedCheckoutLineItem(
      ) {
    AbandonedCheckoutLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AbandonedCheckoutLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AbandonmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAbandonment(
      ) {
    AbandonmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AbandonmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AddAllProductsOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAddAllProductsOperation(
      ) {
    AddAllProductsOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AddAllProductsOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AdditionalFeeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAdditionalFee(
      ) {
    AdditionalFeeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AdditionalFeeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onApp(
      ) {
    AppFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AppFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppCatalogFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAppCatalog(
      ) {
    AppCatalogFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AppCatalogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppCreditFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAppCredit(
      ) {
    AppCreditFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AppCreditFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppInstallationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAppInstallation(
      ) {
    AppInstallationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AppInstallationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppPurchaseOneTimeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAppPurchaseOneTime(
      ) {
    AppPurchaseOneTimeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AppPurchaseOneTimeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppRevenueAttributionRecordFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAppRevenueAttributionRecord(
      ) {
    AppRevenueAttributionRecordFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AppRevenueAttributionRecordFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppSubscriptionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAppSubscription(
      ) {
    AppSubscriptionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AppSubscriptionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public AppUsageRecordFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onAppUsageRecord(
      ) {
    AppUsageRecordFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new AppUsageRecordFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ArticleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onArticle(
      ) {
    ArticleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ArticleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public BasicEventFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onBasicEvent(
      ) {
    BasicEventFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new BasicEventFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public BlogFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onBlog(
      ) {
    BlogFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new BlogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public BulkOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onBulkOperation(
      ) {
    BulkOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new BulkOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public BusinessEntityFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onBusinessEntity(
      ) {
    BusinessEntityFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new BusinessEntityFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CalculatedOrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCalculatedOrder(
      ) {
    CalculatedOrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CalculatedOrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CartTransformFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCartTransform(
      ) {
    CartTransformFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CartTransformFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CashTrackingAdjustmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCashTrackingAdjustment(
      ) {
    CashTrackingAdjustmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CashTrackingAdjustmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CashTrackingSessionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCashTrackingSession(
      ) {
    CashTrackingSessionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CashTrackingSessionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CatalogCsvOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCatalogCsvOperation(
      ) {
    CatalogCsvOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CatalogCsvOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ChannelFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onChannel(
      ) {
    ChannelFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ChannelFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ChannelDefinitionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onChannelDefinition(
      ) {
    ChannelDefinitionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ChannelDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ChannelInformationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onChannelInformation(
      ) {
    ChannelInformationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ChannelInformationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CheckoutProfileFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCheckoutProfile(
      ) {
    CheckoutProfileFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CheckoutProfileFragmentProjection<>(this, this);
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

  public CommentEventFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCommentEvent(
      ) {
    CommentEventFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CommentEventFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCompany(
      ) {
    CompanyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CompanyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyAddressFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCompanyAddress(
      ) {
    CompanyAddressFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CompanyAddressFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyContactFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCompanyContact(
      ) {
    CompanyContactFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CompanyContactFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyContactRoleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCompanyContactRole(
      ) {
    CompanyContactRoleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CompanyContactRoleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyContactRoleAssignmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCompanyContactRoleAssignment(
      ) {
    CompanyContactRoleAssignmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CompanyContactRoleAssignmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCompanyLocation(
      ) {
    CompanyLocationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CompanyLocationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationCatalogFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCompanyLocationCatalog(
      ) {
    CompanyLocationCatalogFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CompanyLocationCatalogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CompanyLocationStaffMemberAssignmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCompanyLocationStaffMemberAssignment(
      ) {
    CompanyLocationStaffMemberAssignmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CompanyLocationStaffMemberAssignmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCustomer(
      ) {
    CustomerFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CustomerFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerAccountAppExtensionPageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCustomerAccountAppExtensionPage(
      ) {
    CustomerAccountAppExtensionPageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CustomerAccountAppExtensionPageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerAccountNativePageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCustomerAccountNativePage(
      ) {
    CustomerAccountNativePageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CustomerAccountNativePageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerPaymentMethodFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCustomerPaymentMethod(
      ) {
    CustomerPaymentMethodFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CustomerPaymentMethodFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerSegmentMembersQueryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCustomerSegmentMembersQuery(
      ) {
    CustomerSegmentMembersQueryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CustomerSegmentMembersQueryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CustomerVisitFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onCustomerVisit(
      ) {
    CustomerVisitFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new CustomerVisitFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryCarrierServiceFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryCarrierService(
      ) {
    DeliveryCarrierServiceFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryCarrierServiceFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryConditionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryCondition(
      ) {
    DeliveryConditionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryConditionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryCountryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryCountry(
      ) {
    DeliveryCountryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryCountryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryCustomizationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryCustomization(
      ) {
    DeliveryCustomizationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryCustomizationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryLocationGroupFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryLocationGroup(
      ) {
    DeliveryLocationGroupFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryLocationGroupFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryMethodFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryMethod(
      ) {
    DeliveryMethodFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryMethodFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryMethodDefinitionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryMethodDefinition(
      ) {
    DeliveryMethodDefinitionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryMethodDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryParticipantFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryParticipant(
      ) {
    DeliveryParticipantFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryParticipantFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryProfileFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryProfile(
      ) {
    DeliveryProfileFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryProfileFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryProfileItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryProfileItem(
      ) {
    DeliveryProfileItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryProfileItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryPromiseProviderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryPromiseProvider(
      ) {
    DeliveryPromiseProviderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryPromiseProviderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryProvinceFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryProvince(
      ) {
    DeliveryProvinceFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryProvinceFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryRateDefinitionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryRateDefinition(
      ) {
    DeliveryRateDefinitionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryRateDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryZoneFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDeliveryZone(
      ) {
    DeliveryZoneFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DeliveryZoneFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticBxgyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDiscountAutomaticBxgy(
      ) {
    DiscountAutomaticBxgyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DiscountAutomaticBxgyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticNodeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDiscountAutomaticNode(
      ) {
    DiscountAutomaticNodeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DiscountAutomaticNodeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeNodeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDiscountCodeNode(
      ) {
    DiscountCodeNodeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DiscountCodeNodeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountNodeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDiscountNode(
      ) {
    DiscountNodeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DiscountNodeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountRedeemCodeBulkCreationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDiscountRedeemCodeBulkCreation(
      ) {
    DiscountRedeemCodeBulkCreationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DiscountRedeemCodeBulkCreationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DomainFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDomain(
      ) {
    DomainFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DomainFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDraftOrder(
      ) {
    DraftOrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DraftOrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDraftOrderLineItem(
      ) {
    DraftOrderLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DraftOrderLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderTagFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDraftOrderTag(
      ) {
    DraftOrderTagFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DraftOrderTagFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DutyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onDuty(
      ) {
    DutyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new DutyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ExchangeLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onExchangeLineItem(
      ) {
    ExchangeLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ExchangeLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ExchangeV2FragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onExchangeV2(
      ) {
    ExchangeV2FragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ExchangeV2FragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ExternalVideoFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onExternalVideo(
      ) {
    ExternalVideoFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ExternalVideoFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onFulfillment(
      ) {
    FulfillmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentConstraintRuleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onFulfillmentConstraintRule(
      ) {
    FulfillmentConstraintRuleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentConstraintRuleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentEventFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onFulfillmentEvent(
      ) {
    FulfillmentEventFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentEventFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentHoldFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onFulfillmentHold(
      ) {
    FulfillmentHoldFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentHoldFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onFulfillmentLineItem(
      ) {
    FulfillmentLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onFulfillmentOrder(
      ) {
    FulfillmentOrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentOrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderDestinationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onFulfillmentOrderDestination(
      ) {
    FulfillmentOrderDestinationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentOrderDestinationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onFulfillmentOrderLineItem(
      ) {
    FulfillmentOrderLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentOrderLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public FulfillmentOrderMerchantRequestFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onFulfillmentOrderMerchantRequest(
      ) {
    FulfillmentOrderMerchantRequestFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new FulfillmentOrderMerchantRequestFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public GenericFileFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onGenericFile(
      ) {
    GenericFileFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new GenericFileFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onGiftCard(
      ) {
    GiftCardFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new GiftCardFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardCreditTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onGiftCardCreditTransaction(
      ) {
    GiftCardCreditTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new GiftCardCreditTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardDebitTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onGiftCardDebitTransaction(
      ) {
    GiftCardDebitTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new GiftCardDebitTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryAdjustmentGroupFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onInventoryAdjustmentGroup(
      ) {
    InventoryAdjustmentGroupFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new InventoryAdjustmentGroupFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onInventoryItem(
      ) {
    InventoryItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new InventoryItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryItemMeasurementFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onInventoryItemMeasurement(
      ) {
    InventoryItemMeasurementFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new InventoryItemMeasurementFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryLevelFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onInventoryLevel(
      ) {
    InventoryLevelFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new InventoryLevelFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public InventoryQuantityFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onInventoryQuantity(
      ) {
    InventoryQuantityFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new InventoryQuantityFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public LineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onLineItem(
      ) {
    LineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new LineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public LineItemGroupFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onLineItemGroup(
      ) {
    LineItemGroupFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new LineItemGroupFragmentProjection<>(this, this);
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

  public MarketCatalogFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMarketCatalog(
      ) {
    MarketCatalogFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MarketCatalogFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MarketingActivityFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMarketingActivity(
      ) {
    MarketingActivityFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MarketingActivityFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MarketingEventFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMarketingEvent(
      ) {
    MarketingEventFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MarketingEventFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MarketRegionCountryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMarketRegionCountry(
      ) {
    MarketRegionCountryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MarketRegionCountryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MarketWebPresenceFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMarketWebPresence(
      ) {
    MarketWebPresenceFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MarketWebPresenceFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MediaImageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMediaImage(
      ) {
    MediaImageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MediaImageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MenuFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMenu(
      ) {
    MenuFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MenuFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetafieldFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMetafield(
      ) {
    MetafieldFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MetafieldFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetafieldDefinitionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMetafieldDefinition(
      ) {
    MetafieldDefinitionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MetafieldDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetaobjectFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMetaobject(
      ) {
    MetaobjectFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MetaobjectFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public MetaobjectDefinitionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onMetaobjectDefinition(
      ) {
    MetaobjectDefinitionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new MetaobjectDefinitionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public Model3dFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onModel3d(
      ) {
    Model3dFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new Model3dFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OnlineStoreThemeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onOnlineStoreTheme(
      ) {
    OnlineStoreThemeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new OnlineStoreThemeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onOrder(
      ) {
    OrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new OrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OrderAdjustmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onOrderAdjustment(
      ) {
    OrderAdjustmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new OrderAdjustmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OrderDisputeSummaryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onOrderDisputeSummary(
      ) {
    OrderDisputeSummaryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new OrderDisputeSummaryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public OrderTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onOrderTransaction(
      ) {
    OrderTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new OrderTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPage(
      ) {
    PageFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PageFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentCustomizationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPaymentCustomization(
      ) {
    PaymentCustomizationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PaymentCustomizationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentMandateFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPaymentMandate(
      ) {
    PaymentMandateFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PaymentMandateFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentScheduleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPaymentSchedule(
      ) {
    PaymentScheduleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PaymentScheduleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentTermsFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPaymentTerms(
      ) {
    PaymentTermsFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PaymentTermsFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PaymentTermsTemplateFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPaymentTermsTemplate(
      ) {
    PaymentTermsTemplateFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PaymentTermsTemplateFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PriceListFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPriceList(
      ) {
    PriceListFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PriceListFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PriceRuleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPriceRule(
      ) {
    PriceRuleFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PriceRuleFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PriceRuleDiscountCodeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPriceRuleDiscountCode(
      ) {
    PriceRuleDiscountCodeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PriceRuleDiscountCodeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProduct(
      ) {
    ProductFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductBundleOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProductBundleOperation(
      ) {
    ProductBundleOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductBundleOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductDeleteOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProductDeleteOperation(
      ) {
    ProductDeleteOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductDeleteOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductDuplicateOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProductDuplicateOperation(
      ) {
    ProductDuplicateOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductDuplicateOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductFeedFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProductFeed(
      ) {
    ProductFeedFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductFeedFragmentProjection<>(this, this);
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

  public ProductSetOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProductSetOperation(
      ) {
    ProductSetOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductSetOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductTaxonomyNodeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProductTaxonomyNode(
      ) {
    ProductTaxonomyNodeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductTaxonomyNodeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProductVariant(
      ) {
    ProductVariantFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductVariantFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ProductVariantComponentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onProductVariantComponent(
      ) {
    ProductVariantComponentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ProductVariantComponentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PromiseParticipantFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPromiseParticipant(
      ) {
    PromiseParticipantFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PromiseParticipantFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PublicationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPublication(
      ) {
    PublicationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PublicationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public PublicationResourceOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onPublicationResourceOperation(
      ) {
    PublicationResourceOperationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new PublicationResourceOperationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public QuantityPriceBreakFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onQuantityPriceBreak(
      ) {
    QuantityPriceBreakFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new QuantityPriceBreakFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public RefundFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onRefund(
      ) {
    RefundFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new RefundFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public RefundShippingLineFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onRefundShippingLine(
      ) {
    RefundShippingLineFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new RefundShippingLineFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReturnFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onReturn(
      ) {
    ReturnFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ReturnFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReturnableFulfillmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onReturnableFulfillment(
      ) {
    ReturnableFulfillmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ReturnableFulfillmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReturnLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onReturnLineItem(
      ) {
    ReturnLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ReturnLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseDeliveryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onReverseDelivery(
      ) {
    ReverseDeliveryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ReverseDeliveryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseDeliveryLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onReverseDeliveryLineItem(
      ) {
    ReverseDeliveryLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ReverseDeliveryLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseFulfillmentOrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onReverseFulfillmentOrder(
      ) {
    ReverseFulfillmentOrderFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ReverseFulfillmentOrderFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseFulfillmentOrderDispositionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onReverseFulfillmentOrderDisposition(
      ) {
    ReverseFulfillmentOrderDispositionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ReverseFulfillmentOrderDispositionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ReverseFulfillmentOrderLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onReverseFulfillmentOrderLineItem(
      ) {
    ReverseFulfillmentOrderLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ReverseFulfillmentOrderLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SaleAdditionalFeeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onSaleAdditionalFee(
      ) {
    SaleAdditionalFeeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new SaleAdditionalFeeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SavedSearchFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onSavedSearch(
      ) {
    SavedSearchFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new SavedSearchFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ScriptTagFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onScriptTag(
      ) {
    ScriptTagFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ScriptTagFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SegmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onSegment(
      ) {
    SegmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new SegmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onSellingPlan(
      ) {
    SellingPlanFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new SellingPlanFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanGroupFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onSellingPlanGroup(
      ) {
    SellingPlanGroupFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new SellingPlanGroupFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ServerPixelFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onServerPixel(
      ) {
    ServerPixelFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ServerPixelFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShop(
      ) {
    ShopFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopAddressFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopAddress(
      ) {
    ShopAddressFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopAddressFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsAccountFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopifyPaymentsAccount(
      ) {
    ShopifyPaymentsAccountFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsAccountFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopifyPaymentsBalanceTransaction(
      ) {
    ShopifyPaymentsBalanceTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsBalanceTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsBankAccountFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopifyPaymentsBankAccount(
      ) {
    ShopifyPaymentsBankAccountFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsBankAccountFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopifyPaymentsDispute(
      ) {
    ShopifyPaymentsDisputeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsDisputeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeEvidenceFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopifyPaymentsDisputeEvidence(
      ) {
    ShopifyPaymentsDisputeEvidenceFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsDisputeEvidenceFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeFileUploadFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopifyPaymentsDisputeFileUpload(
      ) {
    ShopifyPaymentsDisputeFileUploadFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsDisputeFileUploadFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsDisputeFulfillmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopifyPaymentsDisputeFulfillment(
      ) {
    ShopifyPaymentsDisputeFulfillmentFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsDisputeFulfillmentFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsPayoutFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopifyPaymentsPayout(
      ) {
    ShopifyPaymentsPayoutFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsPayoutFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopifyPaymentsVerificationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopifyPaymentsVerification(
      ) {
    ShopifyPaymentsVerificationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopifyPaymentsVerificationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ShopPolicyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onShopPolicy(
      ) {
    ShopPolicyFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ShopPolicyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StaffMemberFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onStaffMember(
      ) {
    StaffMemberFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new StaffMemberFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StandardMetafieldDefinitionTemplateFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onStandardMetafieldDefinitionTemplate(
      ) {
    StandardMetafieldDefinitionTemplateFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new StandardMetafieldDefinitionTemplateFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onStoreCreditAccount(
      ) {
    StoreCreditAccountFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new StoreCreditAccountFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountCreditTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onStoreCreditAccountCreditTransaction(
      ) {
    StoreCreditAccountCreditTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new StoreCreditAccountCreditTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountDebitRevertTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onStoreCreditAccountDebitRevertTransaction(
      ) {
    StoreCreditAccountDebitRevertTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new StoreCreditAccountDebitRevertTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StoreCreditAccountDebitTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onStoreCreditAccountDebitTransaction(
      ) {
    StoreCreditAccountDebitTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new StoreCreditAccountDebitTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public StorefrontAccessTokenFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onStorefrontAccessToken(
      ) {
    StorefrontAccessTokenFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new StorefrontAccessTokenFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionBillingAttemptFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onSubscriptionBillingAttempt(
      ) {
    SubscriptionBillingAttemptFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new SubscriptionBillingAttemptFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionContractFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onSubscriptionContract(
      ) {
    SubscriptionContractFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new SubscriptionContractFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionDraftFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onSubscriptionDraft(
      ) {
    SubscriptionDraftFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new SubscriptionDraftFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyAttributeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onTaxonomyAttribute(
      ) {
    TaxonomyAttributeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyAttributeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyCategoryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onTaxonomyCategory(
      ) {
    TaxonomyCategoryFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyCategoryFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyChoiceListAttributeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onTaxonomyChoiceListAttribute(
      ) {
    TaxonomyChoiceListAttributeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyChoiceListAttributeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyMeasurementAttributeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onTaxonomyMeasurementAttribute(
      ) {
    TaxonomyMeasurementAttributeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyMeasurementAttributeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TaxonomyValueFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onTaxonomyValue(
      ) {
    TaxonomyValueFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new TaxonomyValueFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TenderTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onTenderTransaction(
      ) {
    TenderTransactionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new TenderTransactionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public TransactionFeeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onTransactionFee(
      ) {
    TransactionFeeFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new TransactionFeeFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public UnverifiedReturnLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onUnverifiedReturnLineItem(
      ) {
    UnverifiedReturnLineItemFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new UnverifiedReturnLineItemFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public UrlRedirectFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onUrlRedirect(
      ) {
    UrlRedirectFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new UrlRedirectFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public UrlRedirectImportFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onUrlRedirectImport(
      ) {
    UrlRedirectImportFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new UrlRedirectImportFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public ValidationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onValidation(
      ) {
    ValidationFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new ValidationFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public VideoFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onVideo(
      ) {
    VideoFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new VideoFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public WebhookSubscriptionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onWebhookSubscription(
      ) {
    WebhookSubscriptionFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new WebhookSubscriptionFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public WebPixelFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> onWebPixel(
      ) {
    WebPixelFragmentProjection<NodesProjectionRoot<PARENT, ROOT>, NodesProjectionRoot<PARENT, ROOT>> fragment = new WebPixelFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
