package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.AbandonedCheckoutSortKeys;
import com.shopify.admin.types.AppInstallationCategory;
import com.shopify.admin.types.AppInstallationPrivacy;
import com.shopify.admin.types.AppInstallationSortKeys;
import com.shopify.admin.types.ArticleSortKeys;
import com.shopify.admin.types.ArticleTagSort;
import com.shopify.admin.types.AutomaticDiscountSortKeys;
import com.shopify.admin.types.BlogSortKeys;
import com.shopify.admin.types.BulkOperationType;
import com.shopify.admin.types.BuyerSignalInput;
import com.shopify.admin.types.CalculateReturnInput;
import com.shopify.admin.types.CarrierServiceSortKeys;
import com.shopify.admin.types.CashTrackingSessionsSortKeys;
import com.shopify.admin.types.CatalogSortKeys;
import com.shopify.admin.types.CatalogType;
import com.shopify.admin.types.CheckoutProfileSortKeys;
import com.shopify.admin.types.CodeDiscountSortKeys;
import com.shopify.admin.types.CollectionIdentifierInput;
import com.shopify.admin.types.CollectionSortKeys;
import com.shopify.admin.types.CommentSortKeys;
import com.shopify.admin.types.CompanyLocationSortKeys;
import com.shopify.admin.types.CompanySortKeys;
import com.shopify.admin.types.CountryCode;
import com.shopify.admin.types.CustomerIdentifierInput;
import com.shopify.admin.types.CustomerMergeOverrideFields;
import com.shopify.admin.types.CustomerSavedSearchSortKeys;
import com.shopify.admin.types.CustomerSortKeys;
import com.shopify.admin.types.DeletionEventSortKeys;
import com.shopify.admin.types.DeletionEventSubjectType;
import com.shopify.admin.types.DiscountCodeSortKeys;
import com.shopify.admin.types.DiscountSortKeys;
import com.shopify.admin.types.DraftOrderAvailableDeliveryOptionsInput;
import com.shopify.admin.types.DraftOrderSortKeys;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.FileSortKeys;
import com.shopify.admin.types.FulfillmentOrderAssignmentStatus;
import com.shopify.admin.types.FulfillmentOrderSortKeys;
import com.shopify.admin.types.GiftCardSortKeys;
import com.shopify.admin.types.LocationIdentifierInput;
import com.shopify.admin.types.LocationSortKeys;
import com.shopify.admin.types.MarketLocalizableResourceType;
import com.shopify.admin.types.MarketType;
import com.shopify.admin.types.MarketingActivitySortKeys;
import com.shopify.admin.types.MarketingEventSortKeys;
import com.shopify.admin.types.MarketsSortKeys;
import com.shopify.admin.types.MenuSortKeys;
import com.shopify.admin.types.MetafieldDefinitionConstraintStatus;
import com.shopify.admin.types.MetafieldDefinitionConstraintSubtypeIdentifier;
import com.shopify.admin.types.MetafieldDefinitionIdentifierInput;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import com.shopify.admin.types.MetafieldOwnerType;
import com.shopify.admin.types.MetaobjectHandleInput;
import com.shopify.admin.types.OrderIdentifierInput;
import com.shopify.admin.types.OrderSortKeys;
import com.shopify.admin.types.PageSortKeys;
import com.shopify.admin.types.PaymentTermsType;
import com.shopify.admin.types.PriceListSortKeys;
import com.shopify.admin.types.PrivacyCountryCode;
import com.shopify.admin.types.ProductIdentifierInput;
import com.shopify.admin.types.ProductSortKeys;
import com.shopify.admin.types.ProductVariantIdentifierInput;
import com.shopify.admin.types.ProductVariantSortKeys;
import com.shopify.admin.types.SegmentSortKeys;
import com.shopify.admin.types.SellingPlanGroupSortKeys;
import com.shopify.admin.types.ShopPayPaymentRequestReceiptsSortKeys;
import com.shopify.admin.types.StaffMembersSortKeys;
import com.shopify.admin.types.SubscriptionBillingAttemptsSortKeys;
import com.shopify.admin.types.SubscriptionBillingCycleInput;
import com.shopify.admin.types.SubscriptionBillingCyclesDateRangeSelector;
import com.shopify.admin.types.SubscriptionBillingCyclesIndexRangeSelector;
import com.shopify.admin.types.SubscriptionBillingCyclesSortKeys;
import com.shopify.admin.types.SubscriptionContractsSortKeys;
import com.shopify.admin.types.ThemeRole;
import com.shopify.admin.types.TransferSortKeys;
import com.shopify.admin.types.TranslatableResourceType;
import com.shopify.admin.types.UTMInput;
import com.shopify.admin.types.UrlRedirectSortKeys;
import com.shopify.admin.types.ValidationSortKeys;
import com.shopify.admin.types.WebhookSubscriptionFormat;
import com.shopify.admin.types.WebhookSubscriptionSortKeys;
import com.shopify.admin.types.WebhookSubscriptionTopic;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class QueryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public QueryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Query"));
  }

  public QueryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> abandonedCheckouts(
      ) {
     AbandonedCheckoutConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutConnectionProjection<>(this, getRoot());
     getFields().put("abandonedCheckouts", projection);
     return projection;
  }

  public AbandonedCheckoutConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> abandonedCheckouts(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AbandonedCheckoutSortKeys sortKey, String query, String savedSearchId) {
    AbandonedCheckoutConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutConnectionProjection<>(this, getRoot());    
    getFields().put("abandonedCheckouts", projection);
    getInputArguments().computeIfAbsent("abandonedCheckouts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("abandonedCheckouts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("abandonedCheckouts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("abandonedCheckouts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("abandonedCheckouts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("abandonedCheckouts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("abandonedCheckouts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("abandonedCheckouts").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("abandonedCheckouts").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> abandonedCheckoutsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("abandonedCheckoutsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> abandonedCheckoutsCount(String query,
      String savedSearchId, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("abandonedCheckoutsCount", projection);
    getInputArguments().computeIfAbsent("abandonedCheckoutsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("abandonedCheckoutsCount").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("abandonedCheckoutsCount").add(savedSearchIdArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("abandonedCheckoutsCount").add(limitArg);
    return projection;
  }

  public AbandonmentProjection<QueryProjection<PARENT, ROOT>, ROOT> abandonment() {
     AbandonmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentProjection<>(this, getRoot());
     getFields().put("abandonment", projection);
     return projection;
  }

  public AbandonmentProjection<QueryProjection<PARENT, ROOT>, ROOT> abandonment(String id) {
    AbandonmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentProjection<>(this, getRoot());    
    getFields().put("abandonment", projection);
    getInputArguments().computeIfAbsent("abandonment", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("abandonment").add(idArg);
    return projection;
  }

  public AbandonmentProjection<QueryProjection<PARENT, ROOT>, ROOT> abandonmentByAbandonedCheckoutId(
      ) {
     AbandonmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentProjection<>(this, getRoot());
     getFields().put("abandonmentByAbandonedCheckoutId", projection);
     return projection;
  }

  public AbandonmentProjection<QueryProjection<PARENT, ROOT>, ROOT> abandonmentByAbandonedCheckoutId(
      String abandonedCheckoutId) {
    AbandonmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AbandonmentProjection<>(this, getRoot());    
    getFields().put("abandonmentByAbandonedCheckoutId", projection);
    getInputArguments().computeIfAbsent("abandonmentByAbandonedCheckoutId", k -> new ArrayList<>());                      
    InputArgument abandonedCheckoutIdArg = new InputArgument("abandonedCheckoutId", abandonedCheckoutId);
    getInputArguments().get("abandonmentByAbandonedCheckoutId").add(abandonedCheckoutIdArg);
    return projection;
  }

  public AppProjection<QueryProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public AppProjection<QueryProjection<PARENT, ROOT>, ROOT> app(String id) {
    AppProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());    
    getFields().put("app", projection);
    getInputArguments().computeIfAbsent("app", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("app").add(idArg);
    return projection;
  }

  public AppProjection<QueryProjection<PARENT, ROOT>, ROOT> appByHandle() {
     AppProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("appByHandle", projection);
     return projection;
  }

  public AppProjection<QueryProjection<PARENT, ROOT>, ROOT> appByHandle(String handle) {
    AppProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());    
    getFields().put("appByHandle", projection);
    getInputArguments().computeIfAbsent("appByHandle", k -> new ArrayList<>());                      
    InputArgument handleArg = new InputArgument("handle", handle);
    getInputArguments().get("appByHandle").add(handleArg);
    return projection;
  }

  public AppProjection<QueryProjection<PARENT, ROOT>, ROOT> appByKey() {
     AppProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("appByKey", projection);
     return projection;
  }

  public AppProjection<QueryProjection<PARENT, ROOT>, ROOT> appByKey(String apiKey) {
    AppProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());    
    getFields().put("appByKey", projection);
    getInputArguments().computeIfAbsent("appByKey", k -> new ArrayList<>());                      
    InputArgument apiKeyArg = new InputArgument("apiKey", apiKey);
    getInputArguments().get("appByKey").add(apiKeyArg);
    return projection;
  }

  public AppDiscountTypeProjection<QueryProjection<PARENT, ROOT>, ROOT> appDiscountType() {
     AppDiscountTypeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("appDiscountType", projection);
     return projection;
  }

  public AppDiscountTypeProjection<QueryProjection<PARENT, ROOT>, ROOT> appDiscountType(
      String functionId) {
    AppDiscountTypeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());    
    getFields().put("appDiscountType", projection);
    getInputArguments().computeIfAbsent("appDiscountType", k -> new ArrayList<>());                      
    InputArgument functionIdArg = new InputArgument("functionId", functionId);
    getInputArguments().get("appDiscountType").add(functionIdArg);
    return projection;
  }

  public AppDiscountTypeProjection<QueryProjection<PARENT, ROOT>, ROOT> appDiscountTypes() {
     AppDiscountTypeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("appDiscountTypes", projection);
     return projection;
  }

  public AppDiscountTypeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> appDiscountTypesNodes(
      ) {
     AppDiscountTypeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeConnectionProjection<>(this, getRoot());
     getFields().put("appDiscountTypesNodes", projection);
     return projection;
  }

  public AppDiscountTypeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> appDiscountTypesNodes(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    AppDiscountTypeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeConnectionProjection<>(this, getRoot());    
    getFields().put("appDiscountTypesNodes", projection);
    getInputArguments().computeIfAbsent("appDiscountTypesNodes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("appDiscountTypesNodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("appDiscountTypesNodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("appDiscountTypesNodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("appDiscountTypesNodes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("appDiscountTypesNodes").add(reverseArg);
    return projection;
  }

  public AppInstallationProjection<QueryProjection<PARENT, ROOT>, ROOT> appInstallation() {
     AppInstallationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationProjection<>(this, getRoot());
     getFields().put("appInstallation", projection);
     return projection;
  }

  public AppInstallationProjection<QueryProjection<PARENT, ROOT>, ROOT> appInstallation(String id) {
    AppInstallationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationProjection<>(this, getRoot());    
    getFields().put("appInstallation", projection);
    getInputArguments().computeIfAbsent("appInstallation", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("appInstallation").add(idArg);
    return projection;
  }

  public AppInstallationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> appInstallations(
      ) {
     AppInstallationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationConnectionProjection<>(this, getRoot());
     getFields().put("appInstallations", projection);
     return projection;
  }

  public AppInstallationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> appInstallations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppInstallationSortKeys sortKey, AppInstallationCategory category,
      AppInstallationPrivacy privacy) {
    AppInstallationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationConnectionProjection<>(this, getRoot());    
    getFields().put("appInstallations", projection);
    getInputArguments().computeIfAbsent("appInstallations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("appInstallations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("appInstallations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("appInstallations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("appInstallations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("appInstallations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("appInstallations").add(sortKeyArg);
    InputArgument categoryArg = new InputArgument("category", category);
    getInputArguments().get("appInstallations").add(categoryArg);
    InputArgument privacyArg = new InputArgument("privacy", privacy);
    getInputArguments().get("appInstallations").add(privacyArg);
    return projection;
  }

  public ArticleProjection<QueryProjection<PARENT, ROOT>, ROOT> article() {
     ArticleProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ArticleProjection<>(this, getRoot());
     getFields().put("article", projection);
     return projection;
  }

  public ArticleProjection<QueryProjection<PARENT, ROOT>, ROOT> article(String id) {
    ArticleProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ArticleProjection<>(this, getRoot());    
    getFields().put("article", projection);
    getInputArguments().computeIfAbsent("article", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("article").add(idArg);
    return projection;
  }

  public ArticleAuthorConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> articleAuthors() {
     ArticleAuthorConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorConnectionProjection<>(this, getRoot());
     getFields().put("articleAuthors", projection);
     return projection;
  }

  public ArticleAuthorConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> articleAuthors(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ArticleAuthorConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ArticleAuthorConnectionProjection<>(this, getRoot());    
    getFields().put("articleAuthors", projection);
    getInputArguments().computeIfAbsent("articleAuthors", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("articleAuthors").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("articleAuthors").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("articleAuthors").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("articleAuthors").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("articleAuthors").add(reverseArg);
    return projection;
  }

  public ArticleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> articles() {
     ArticleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ArticleConnectionProjection<>(this, getRoot());
     getFields().put("articles", projection);
     return projection;
  }

  public ArticleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> articles(Integer first,
      String after, Integer last, String before, Boolean reverse, ArticleSortKeys sortKey,
      String query) {
    ArticleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ArticleConnectionProjection<>(this, getRoot());    
    getFields().put("articles", projection);
    getInputArguments().computeIfAbsent("articles", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("articles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("articles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("articles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("articles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("articles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("articles").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("articles").add(queryArg);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> assignedFulfillmentOrders(
      ) {
     FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("assignedFulfillmentOrders", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> assignedFulfillmentOrders(
      FulfillmentOrderAssignmentStatus assignmentStatus, List<String> locationIds, Integer first,
      String after, Integer last, String before, Boolean reverse,
      FulfillmentOrderSortKeys sortKey) {
    FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("assignedFulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("assignedFulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument assignmentStatusArg = new InputArgument("assignmentStatus", assignmentStatus);
    getInputArguments().get("assignedFulfillmentOrders").add(assignmentStatusArg);
    InputArgument locationIdsArg = new InputArgument("locationIds", locationIds);
    getInputArguments().get("assignedFulfillmentOrders").add(locationIdsArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("assignedFulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("assignedFulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("assignedFulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("assignedFulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("assignedFulfillmentOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("assignedFulfillmentOrders").add(sortKeyArg);
    return projection;
  }

  public DiscountAutomaticProjection<QueryProjection<PARENT, ROOT>, ROOT> automaticDiscount() {
     DiscountAutomaticProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticProjection<>(this, getRoot());
     getFields().put("automaticDiscount", projection);
     return projection;
  }

  public DiscountAutomaticProjection<QueryProjection<PARENT, ROOT>, ROOT> automaticDiscount(
      String id) {
    DiscountAutomaticProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticProjection<>(this, getRoot());    
    getFields().put("automaticDiscount", projection);
    getInputArguments().computeIfAbsent("automaticDiscount", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("automaticDiscount").add(idArg);
    return projection;
  }

  public DiscountAutomaticNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> automaticDiscountNode(
      ) {
     DiscountAutomaticNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticNodeProjection<>(this, getRoot());
     getFields().put("automaticDiscountNode", projection);
     return projection;
  }

  public DiscountAutomaticNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> automaticDiscountNode(
      String id) {
    DiscountAutomaticNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticNodeProjection<>(this, getRoot());    
    getFields().put("automaticDiscountNode", projection);
    getInputArguments().computeIfAbsent("automaticDiscountNode", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("automaticDiscountNode").add(idArg);
    return projection;
  }

  public DiscountAutomaticNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> automaticDiscountNodes(
      ) {
     DiscountAutomaticNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticNodeConnectionProjection<>(this, getRoot());
     getFields().put("automaticDiscountNodes", projection);
     return projection;
  }

  public DiscountAutomaticNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> automaticDiscountNodes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AutomaticDiscountSortKeys sortKey, String query, String savedSearchId) {
    DiscountAutomaticNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticNodeConnectionProjection<>(this, getRoot());    
    getFields().put("automaticDiscountNodes", projection);
    getInputArguments().computeIfAbsent("automaticDiscountNodes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("automaticDiscountNodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("automaticDiscountNodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("automaticDiscountNodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("automaticDiscountNodes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("automaticDiscountNodes").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("automaticDiscountNodes").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("automaticDiscountNodes").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("automaticDiscountNodes").add(savedSearchIdArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> automaticDiscountSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("automaticDiscountSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> automaticDiscountSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("automaticDiscountSavedSearches", projection);
    getInputArguments().computeIfAbsent("automaticDiscountSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("automaticDiscountSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("automaticDiscountSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("automaticDiscountSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("automaticDiscountSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("automaticDiscountSavedSearches").add(reverseArg);
    return projection;
  }

  public DiscountAutomaticConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> automaticDiscounts(
      ) {
     DiscountAutomaticConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticConnectionProjection<>(this, getRoot());
     getFields().put("automaticDiscounts", projection);
     return projection;
  }

  public DiscountAutomaticConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> automaticDiscounts(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AutomaticDiscountSortKeys sortKey, String query, String savedSearchId) {
    DiscountAutomaticConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountAutomaticConnectionProjection<>(this, getRoot());    
    getFields().put("automaticDiscounts", projection);
    getInputArguments().computeIfAbsent("automaticDiscounts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("automaticDiscounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("automaticDiscounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("automaticDiscounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("automaticDiscounts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("automaticDiscounts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("automaticDiscounts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("automaticDiscounts").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("automaticDiscounts").add(savedSearchIdArg);
    return projection;
  }

  public MarketRegionProjection<QueryProjection<PARENT, ROOT>, ROOT> availableBackupRegions() {
     MarketRegionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionProjection<>(this, getRoot());
     getFields().put("availableBackupRegions", projection);
     return projection;
  }

  public DeliveryCarrierServiceAndLocationsProjection<QueryProjection<PARENT, ROOT>, ROOT> availableCarrierServices(
      ) {
     DeliveryCarrierServiceAndLocationsProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceAndLocationsProjection<>(this, getRoot());
     getFields().put("availableCarrierServices", projection);
     return projection;
  }

  public LocaleProjection<QueryProjection<PARENT, ROOT>, ROOT> availableLocales() {
     LocaleProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new LocaleProjection<>(this, getRoot());
     getFields().put("availableLocales", projection);
     return projection;
  }

  public MarketRegionProjection<QueryProjection<PARENT, ROOT>, ROOT> backupRegion() {
     MarketRegionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketRegionProjection<>(this, getRoot());
     getFields().put("backupRegion", projection);
     return projection;
  }

  public BlogProjection<QueryProjection<PARENT, ROOT>, ROOT> blog() {
     BlogProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new BlogProjection<>(this, getRoot());
     getFields().put("blog", projection);
     return projection;
  }

  public BlogProjection<QueryProjection<PARENT, ROOT>, ROOT> blog(String id) {
    BlogProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new BlogProjection<>(this, getRoot());    
    getFields().put("blog", projection);
    getInputArguments().computeIfAbsent("blog", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("blog").add(idArg);
    return projection;
  }

  public BlogConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> blogs() {
     BlogConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new BlogConnectionProjection<>(this, getRoot());
     getFields().put("blogs", projection);
     return projection;
  }

  public BlogConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> blogs(Integer first,
      String after, Integer last, String before, Boolean reverse, BlogSortKeys sortKey,
      String query) {
    BlogConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new BlogConnectionProjection<>(this, getRoot());    
    getFields().put("blogs", projection);
    getInputArguments().computeIfAbsent("blogs", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("blogs").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("blogs").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("blogs").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("blogs").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("blogs").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("blogs").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("blogs").add(queryArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> blogsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("blogsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> blogsCount(String query,
      Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("blogsCount", projection);
    getInputArguments().computeIfAbsent("blogsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("blogsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("blogsCount").add(limitArg);
    return projection;
  }

  public BusinessEntityProjection<QueryProjection<PARENT, ROOT>, ROOT> businessEntities() {
     BusinessEntityProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new BusinessEntityProjection<>(this, getRoot());
     getFields().put("businessEntities", projection);
     return projection;
  }

  public BusinessEntityProjection<QueryProjection<PARENT, ROOT>, ROOT> businessEntity() {
     BusinessEntityProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new BusinessEntityProjection<>(this, getRoot());
     getFields().put("businessEntity", projection);
     return projection;
  }

  public BusinessEntityProjection<QueryProjection<PARENT, ROOT>, ROOT> businessEntity(String id) {
    BusinessEntityProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new BusinessEntityProjection<>(this, getRoot());    
    getFields().put("businessEntity", projection);
    getInputArguments().computeIfAbsent("businessEntity", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("businessEntity").add(idArg);
    return projection;
  }

  public DeliveryCarrierServiceProjection<QueryProjection<PARENT, ROOT>, ROOT> carrierService() {
     DeliveryCarrierServiceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceProjection<>(this, getRoot());
     getFields().put("carrierService", projection);
     return projection;
  }

  public DeliveryCarrierServiceProjection<QueryProjection<PARENT, ROOT>, ROOT> carrierService(
      String id) {
    DeliveryCarrierServiceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceProjection<>(this, getRoot());    
    getFields().put("carrierService", projection);
    getInputArguments().computeIfAbsent("carrierService", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("carrierService").add(idArg);
    return projection;
  }

  public DeliveryCarrierServiceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> carrierServices(
      ) {
     DeliveryCarrierServiceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceConnectionProjection<>(this, getRoot());
     getFields().put("carrierServices", projection);
     return projection;
  }

  public DeliveryCarrierServiceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> carrierServices(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CarrierServiceSortKeys sortKey, String query) {
    DeliveryCarrierServiceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceConnectionProjection<>(this, getRoot());    
    getFields().put("carrierServices", projection);
    getInputArguments().computeIfAbsent("carrierServices", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("carrierServices").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("carrierServices").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("carrierServices").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("carrierServices").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("carrierServices").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("carrierServices").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("carrierServices").add(queryArg);
    return projection;
  }

  public CartTransformConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> cartTransforms() {
     CartTransformConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CartTransformConnectionProjection<>(this, getRoot());
     getFields().put("cartTransforms", projection);
     return projection;
  }

  public CartTransformConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> cartTransforms(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CartTransformConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CartTransformConnectionProjection<>(this, getRoot());    
    getFields().put("cartTransforms", projection);
    getInputArguments().computeIfAbsent("cartTransforms", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("cartTransforms").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("cartTransforms").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("cartTransforms").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("cartTransforms").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("cartTransforms").add(reverseArg);
    return projection;
  }

  public CashTrackingSessionProjection<QueryProjection<PARENT, ROOT>, ROOT> cashTrackingSession() {
     CashTrackingSessionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingSessionProjection<>(this, getRoot());
     getFields().put("cashTrackingSession", projection);
     return projection;
  }

  public CashTrackingSessionProjection<QueryProjection<PARENT, ROOT>, ROOT> cashTrackingSession(
      String id) {
    CashTrackingSessionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingSessionProjection<>(this, getRoot());    
    getFields().put("cashTrackingSession", projection);
    getInputArguments().computeIfAbsent("cashTrackingSession", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("cashTrackingSession").add(idArg);
    return projection;
  }

  public CashTrackingSessionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> cashTrackingSessions(
      ) {
     CashTrackingSessionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingSessionConnectionProjection<>(this, getRoot());
     getFields().put("cashTrackingSessions", projection);
     return projection;
  }

  public CashTrackingSessionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> cashTrackingSessions(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CashTrackingSessionsSortKeys sortKey, String query) {
    CashTrackingSessionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingSessionConnectionProjection<>(this, getRoot());    
    getFields().put("cashTrackingSessions", projection);
    getInputArguments().computeIfAbsent("cashTrackingSessions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("cashTrackingSessions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("cashTrackingSessions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("cashTrackingSessions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("cashTrackingSessions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("cashTrackingSessions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("cashTrackingSessions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("cashTrackingSessions").add(queryArg);
    return projection;
  }

  public CatalogProjection<QueryProjection<PARENT, ROOT>, ROOT> catalog() {
     CatalogProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CatalogProjection<>(this, getRoot());
     getFields().put("catalog", projection);
     return projection;
  }

  public CatalogProjection<QueryProjection<PARENT, ROOT>, ROOT> catalog(String id) {
    CatalogProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CatalogProjection<>(this, getRoot());    
    getFields().put("catalog", projection);
    getInputArguments().computeIfAbsent("catalog", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("catalog").add(idArg);
    return projection;
  }

  public ResourceOperationProjection<QueryProjection<PARENT, ROOT>, ROOT> catalogOperations() {
     ResourceOperationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ResourceOperationProjection<>(this, getRoot());
     getFields().put("catalogOperations", projection);
     return projection;
  }

  public CatalogConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> catalogs() {
     CatalogConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CatalogConnectionProjection<>(this, getRoot());
     getFields().put("catalogs", projection);
     return projection;
  }

  public CatalogConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> catalogs(CatalogType type,
      Integer first, String after, Integer last, String before, Boolean reverse,
      CatalogSortKeys sortKey, String query) {
    CatalogConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CatalogConnectionProjection<>(this, getRoot());    
    getFields().put("catalogs", projection);
    getInputArguments().computeIfAbsent("catalogs", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type);
    getInputArguments().get("catalogs").add(typeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("catalogs").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("catalogs").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("catalogs").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("catalogs").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("catalogs").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("catalogs").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("catalogs").add(queryArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> catalogsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("catalogsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> catalogsCount(CatalogType type,
      String query, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("catalogsCount", projection);
    getInputArguments().computeIfAbsent("catalogsCount", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type);
    getInputArguments().get("catalogsCount").add(typeArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("catalogsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("catalogsCount").add(limitArg);
    return projection;
  }

  public ChannelProjection<QueryProjection<PARENT, ROOT>, ROOT> channel() {
     ChannelProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());
     getFields().put("channel", projection);
     return projection;
  }

  public ChannelProjection<QueryProjection<PARENT, ROOT>, ROOT> channel(String id) {
    ChannelProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());    
    getFields().put("channel", projection);
    getInputArguments().computeIfAbsent("channel", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("channel").add(idArg);
    return projection;
  }

  public ChannelConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> channels() {
     ChannelConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());
     getFields().put("channels", projection);
     return projection;
  }

  public ChannelConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> channels(Integer first,
      String after, Integer last, String before, Boolean reverse) {
    ChannelConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ChannelConnectionProjection<>(this, getRoot());    
    getFields().put("channels", projection);
    getInputArguments().computeIfAbsent("channels", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("channels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("channels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("channels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("channels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("channels").add(reverseArg);
    return projection;
  }

  public CheckoutBrandingProjection<QueryProjection<PARENT, ROOT>, ROOT> checkoutBranding() {
     CheckoutBrandingProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingProjection<>(this, getRoot());
     getFields().put("checkoutBranding", projection);
     return projection;
  }

  public CheckoutBrandingProjection<QueryProjection<PARENT, ROOT>, ROOT> checkoutBranding(
      String checkoutProfileId) {
    CheckoutBrandingProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingProjection<>(this, getRoot());    
    getFields().put("checkoutBranding", projection);
    getInputArguments().computeIfAbsent("checkoutBranding", k -> new ArrayList<>());                      
    InputArgument checkoutProfileIdArg = new InputArgument("checkoutProfileId", checkoutProfileId);
    getInputArguments().get("checkoutBranding").add(checkoutProfileIdArg);
    return projection;
  }

  public CheckoutProfileProjection<QueryProjection<PARENT, ROOT>, ROOT> checkoutProfile() {
     CheckoutProfileProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutProfileProjection<>(this, getRoot());
     getFields().put("checkoutProfile", projection);
     return projection;
  }

  public CheckoutProfileProjection<QueryProjection<PARENT, ROOT>, ROOT> checkoutProfile(String id) {
    CheckoutProfileProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutProfileProjection<>(this, getRoot());    
    getFields().put("checkoutProfile", projection);
    getInputArguments().computeIfAbsent("checkoutProfile", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("checkoutProfile").add(idArg);
    return projection;
  }

  public CheckoutProfileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> checkoutProfiles(
      ) {
     CheckoutProfileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutProfileConnectionProjection<>(this, getRoot());
     getFields().put("checkoutProfiles", projection);
     return projection;
  }

  public CheckoutProfileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> checkoutProfiles(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CheckoutProfileSortKeys sortKey, String query) {
    CheckoutProfileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CheckoutProfileConnectionProjection<>(this, getRoot());    
    getFields().put("checkoutProfiles", projection);
    getInputArguments().computeIfAbsent("checkoutProfiles", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("checkoutProfiles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("checkoutProfiles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("checkoutProfiles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("checkoutProfiles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("checkoutProfiles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("checkoutProfiles").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("checkoutProfiles").add(queryArg);
    return projection;
  }

  public DiscountCodeNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> codeDiscountNode() {
     DiscountCodeNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeProjection<>(this, getRoot());
     getFields().put("codeDiscountNode", projection);
     return projection;
  }

  public DiscountCodeNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> codeDiscountNode(
      String id) {
    DiscountCodeNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeProjection<>(this, getRoot());    
    getFields().put("codeDiscountNode", projection);
    getInputArguments().computeIfAbsent("codeDiscountNode", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("codeDiscountNode").add(idArg);
    return projection;
  }

  public DiscountCodeNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> codeDiscountNodeByCode() {
     DiscountCodeNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeProjection<>(this, getRoot());
     getFields().put("codeDiscountNodeByCode", projection);
     return projection;
  }

  public DiscountCodeNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> codeDiscountNodeByCode(
      String code) {
    DiscountCodeNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeProjection<>(this, getRoot());    
    getFields().put("codeDiscountNodeByCode", projection);
    getInputArguments().computeIfAbsent("codeDiscountNodeByCode", k -> new ArrayList<>());                      
    InputArgument codeArg = new InputArgument("code", code);
    getInputArguments().get("codeDiscountNodeByCode").add(codeArg);
    return projection;
  }

  public DiscountCodeNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> codeDiscountNodes(
      ) {
     DiscountCodeNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeConnectionProjection<>(this, getRoot());
     getFields().put("codeDiscountNodes", projection);
     return projection;
  }

  public DiscountCodeNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> codeDiscountNodes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CodeDiscountSortKeys sortKey, String query, String savedSearchId) {
    DiscountCodeNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountCodeNodeConnectionProjection<>(this, getRoot());    
    getFields().put("codeDiscountNodes", projection);
    getInputArguments().computeIfAbsent("codeDiscountNodes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("codeDiscountNodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("codeDiscountNodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("codeDiscountNodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("codeDiscountNodes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("codeDiscountNodes").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("codeDiscountNodes").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("codeDiscountNodes").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("codeDiscountNodes").add(savedSearchIdArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> codeDiscountSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("codeDiscountSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> codeDiscountSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("codeDiscountSavedSearches", projection);
    getInputArguments().computeIfAbsent("codeDiscountSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("codeDiscountSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("codeDiscountSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("codeDiscountSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("codeDiscountSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("codeDiscountSavedSearches").add(reverseArg);
    return projection;
  }

  public CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> collection() {
     CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());
     getFields().put("collection", projection);
     return projection;
  }

  public CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> collection(String id) {
    CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());    
    getFields().put("collection", projection);
    getInputArguments().computeIfAbsent("collection", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("collection").add(idArg);
    return projection;
  }

  public CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> collectionByHandle() {
     CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());
     getFields().put("collectionByHandle", projection);
     return projection;
  }

  public CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> collectionByHandle(
      String handle) {
    CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());    
    getFields().put("collectionByHandle", projection);
    getInputArguments().computeIfAbsent("collectionByHandle", k -> new ArrayList<>());                      
    InputArgument handleArg = new InputArgument("handle", handle);
    getInputArguments().get("collectionByHandle").add(handleArg);
    return projection;
  }

  public CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> collectionByIdentifier() {
     CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());
     getFields().put("collectionByIdentifier", projection);
     return projection;
  }

  public CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> collectionByIdentifier(
      CollectionIdentifierInput identifier) {
    CollectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());    
    getFields().put("collectionByIdentifier", projection);
    getInputArguments().computeIfAbsent("collectionByIdentifier", k -> new ArrayList<>());                      
    InputArgument identifierArg = new InputArgument("identifier", identifier);
    getInputArguments().get("collectionByIdentifier").add(identifierArg);
    return projection;
  }

  public CollectionRuleConditionsProjection<QueryProjection<PARENT, ROOT>, ROOT> collectionRulesConditions(
      ) {
     CollectionRuleConditionsProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CollectionRuleConditionsProjection<>(this, getRoot());
     getFields().put("collectionRulesConditions", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> collectionSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("collectionSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> collectionSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("collectionSavedSearches", projection);
    getInputArguments().computeIfAbsent("collectionSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("collectionSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("collectionSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("collectionSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("collectionSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("collectionSavedSearches").add(reverseArg);
    return projection;
  }

  public CollectionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> collections() {
     CollectionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());
     getFields().put("collections", projection);
     return projection;
  }

  public CollectionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> collections(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CollectionSortKeys sortKey, String query, String savedSearchId) {
    CollectionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CollectionConnectionProjection<>(this, getRoot());    
    getFields().put("collections", projection);
    getInputArguments().computeIfAbsent("collections", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("collections").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("collections").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("collections").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("collections").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("collections").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("collections").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("collections").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("collections").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> collectionsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("collectionsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> collectionsCount(String query,
      String savedSearchId, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("collectionsCount", projection);
    getInputArguments().computeIfAbsent("collectionsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("collectionsCount").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("collectionsCount").add(savedSearchIdArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("collectionsCount").add(limitArg);
    return projection;
  }

  public CommentProjection<QueryProjection<PARENT, ROOT>, ROOT> comment() {
     CommentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CommentProjection<>(this, getRoot());
     getFields().put("comment", projection);
     return projection;
  }

  public CommentProjection<QueryProjection<PARENT, ROOT>, ROOT> comment(String id) {
    CommentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CommentProjection<>(this, getRoot());    
    getFields().put("comment", projection);
    getInputArguments().computeIfAbsent("comment", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("comment").add(idArg);
    return projection;
  }

  public CommentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> comments() {
     CommentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CommentConnectionProjection<>(this, getRoot());
     getFields().put("comments", projection);
     return projection;
  }

  public CommentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> comments(Integer first,
      String after, Integer last, String before, Boolean reverse, CommentSortKeys sortKey,
      String query) {
    CommentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CommentConnectionProjection<>(this, getRoot());    
    getFields().put("comments", projection);
    getInputArguments().computeIfAbsent("comments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("comments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("comments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("comments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("comments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("comments").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("comments").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("comments").add(queryArg);
    return projection;
  }

  public CompanyConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> companies() {
     CompanyConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyConnectionProjection<>(this, getRoot());
     getFields().put("companies", projection);
     return projection;
  }

  public CompanyConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> companies(Integer first,
      String after, Integer last, String before, Boolean reverse, CompanySortKeys sortKey,
      String query) {
    CompanyConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyConnectionProjection<>(this, getRoot());    
    getFields().put("companies", projection);
    getInputArguments().computeIfAbsent("companies", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("companies").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("companies").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("companies").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("companies").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("companies").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("companies").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("companies").add(queryArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> companiesCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("companiesCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> companiesCount(Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("companiesCount", projection);
    getInputArguments().computeIfAbsent("companiesCount", k -> new ArrayList<>());                      
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("companiesCount").add(limitArg);
    return projection;
  }

  public CompanyProjection<QueryProjection<PARENT, ROOT>, ROOT> company() {
     CompanyProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyProjection<>(this, getRoot());
     getFields().put("company", projection);
     return projection;
  }

  public CompanyProjection<QueryProjection<PARENT, ROOT>, ROOT> company(String id) {
    CompanyProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyProjection<>(this, getRoot());    
    getFields().put("company", projection);
    getInputArguments().computeIfAbsent("company", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("company").add(idArg);
    return projection;
  }

  public CompanyContactProjection<QueryProjection<PARENT, ROOT>, ROOT> companyContact() {
     CompanyContactProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());
     getFields().put("companyContact", projection);
     return projection;
  }

  public CompanyContactProjection<QueryProjection<PARENT, ROOT>, ROOT> companyContact(String id) {
    CompanyContactProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());    
    getFields().put("companyContact", projection);
    getInputArguments().computeIfAbsent("companyContact", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("companyContact").add(idArg);
    return projection;
  }

  public CompanyContactRoleProjection<QueryProjection<PARENT, ROOT>, ROOT> companyContactRole() {
     CompanyContactRoleProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleProjection<>(this, getRoot());
     getFields().put("companyContactRole", projection);
     return projection;
  }

  public CompanyContactRoleProjection<QueryProjection<PARENT, ROOT>, ROOT> companyContactRole(
      String id) {
    CompanyContactRoleProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleProjection<>(this, getRoot());    
    getFields().put("companyContactRole", projection);
    getInputArguments().computeIfAbsent("companyContactRole", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("companyContactRole").add(idArg);
    return projection;
  }

  public CompanyLocationProjection<QueryProjection<PARENT, ROOT>, ROOT> companyLocation() {
     CompanyLocationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());
     getFields().put("companyLocation", projection);
     return projection;
  }

  public CompanyLocationProjection<QueryProjection<PARENT, ROOT>, ROOT> companyLocation(String id) {
    CompanyLocationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());    
    getFields().put("companyLocation", projection);
    getInputArguments().computeIfAbsent("companyLocation", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("companyLocation").add(idArg);
    return projection;
  }

  public CompanyLocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> companyLocations(
      ) {
     CompanyLocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationConnectionProjection<>(this, getRoot());
     getFields().put("companyLocations", projection);
     return projection;
  }

  public CompanyLocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> companyLocations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyLocationSortKeys sortKey, String query) {
    CompanyLocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationConnectionProjection<>(this, getRoot());    
    getFields().put("companyLocations", projection);
    getInputArguments().computeIfAbsent("companyLocations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("companyLocations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("companyLocations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("companyLocations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("companyLocations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("companyLocations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("companyLocations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("companyLocations").add(queryArg);
    return projection;
  }

  public ConsentPolicyProjection<QueryProjection<PARENT, ROOT>, ROOT> consentPolicy() {
     ConsentPolicyProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ConsentPolicyProjection<>(this, getRoot());
     getFields().put("consentPolicy", projection);
     return projection;
  }

  public ConsentPolicyProjection<QueryProjection<PARENT, ROOT>, ROOT> consentPolicy(String id,
      PrivacyCountryCode countryCode, String regionCode, Boolean consentRequired,
      Boolean dataSaleOptOutRequired) {
    ConsentPolicyProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ConsentPolicyProjection<>(this, getRoot());    
    getFields().put("consentPolicy", projection);
    getInputArguments().computeIfAbsent("consentPolicy", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("consentPolicy").add(idArg);
    InputArgument countryCodeArg = new InputArgument("countryCode", countryCode);
    getInputArguments().get("consentPolicy").add(countryCodeArg);
    InputArgument regionCodeArg = new InputArgument("regionCode", regionCode);
    getInputArguments().get("consentPolicy").add(regionCodeArg);
    InputArgument consentRequiredArg = new InputArgument("consentRequired", consentRequired);
    getInputArguments().get("consentPolicy").add(consentRequiredArg);
    InputArgument dataSaleOptOutRequiredArg = new InputArgument("dataSaleOptOutRequired", dataSaleOptOutRequired);
    getInputArguments().get("consentPolicy").add(dataSaleOptOutRequiredArg);
    return projection;
  }

  public ConsentPolicyRegionProjection<QueryProjection<PARENT, ROOT>, ROOT> consentPolicyRegions() {
     ConsentPolicyRegionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ConsentPolicyRegionProjection<>(this, getRoot());
     getFields().put("consentPolicyRegions", projection);
     return projection;
  }

  public AppInstallationProjection<QueryProjection<PARENT, ROOT>, ROOT> currentAppInstallation() {
     AppInstallationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationProjection<>(this, getRoot());
     getFields().put("currentAppInstallation", projection);
     return projection;
  }

  public BulkOperationProjection<QueryProjection<PARENT, ROOT>, ROOT> currentBulkOperation() {
     BulkOperationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationProjection<>(this, getRoot());
     getFields().put("currentBulkOperation", projection);
     return projection;
  }

  public BulkOperationProjection<QueryProjection<PARENT, ROOT>, ROOT> currentBulkOperation(
      BulkOperationType type) {
    BulkOperationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new BulkOperationProjection<>(this, getRoot());    
    getFields().put("currentBulkOperation", projection);
    getInputArguments().computeIfAbsent("currentBulkOperation", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type);
    getInputArguments().get("currentBulkOperation").add(typeArg);
    return projection;
  }

  public StaffMemberProjection<QueryProjection<PARENT, ROOT>, ROOT> currentStaffMember() {
     StaffMemberProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("currentStaffMember", projection);
     return projection;
  }

  public CustomerProjection<QueryProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CustomerProjection<QueryProjection<PARENT, ROOT>, ROOT> customer(String id) {
    CustomerProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());    
    getFields().put("customer", projection);
    getInputArguments().computeIfAbsent("customer", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("customer").add(idArg);
    return projection;
  }

  public CustomerAccountPageProjection<QueryProjection<PARENT, ROOT>, ROOT> customerAccountPage() {
     CustomerAccountPageProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerAccountPageProjection<>(this, getRoot());
     getFields().put("customerAccountPage", projection);
     return projection;
  }

  public CustomerAccountPageProjection<QueryProjection<PARENT, ROOT>, ROOT> customerAccountPage(
      String id) {
    CustomerAccountPageProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerAccountPageProjection<>(this, getRoot());    
    getFields().put("customerAccountPage", projection);
    getInputArguments().computeIfAbsent("customerAccountPage", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("customerAccountPage").add(idArg);
    return projection;
  }

  public CustomerAccountPageConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> customerAccountPages(
      ) {
     CustomerAccountPageConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerAccountPageConnectionProjection<>(this, getRoot());
     getFields().put("customerAccountPages", projection);
     return projection;
  }

  public CustomerAccountPageConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> customerAccountPages(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CustomerAccountPageConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerAccountPageConnectionProjection<>(this, getRoot());    
    getFields().put("customerAccountPages", projection);
    getInputArguments().computeIfAbsent("customerAccountPages", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("customerAccountPages").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("customerAccountPages").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("customerAccountPages").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("customerAccountPages").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("customerAccountPages").add(reverseArg);
    return projection;
  }

  public CustomerProjection<QueryProjection<PARENT, ROOT>, ROOT> customerByIdentifier() {
     CustomerProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customerByIdentifier", projection);
     return projection;
  }

  public CustomerProjection<QueryProjection<PARENT, ROOT>, ROOT> customerByIdentifier(
      CustomerIdentifierInput identifier) {
    CustomerProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());    
    getFields().put("customerByIdentifier", projection);
    getInputArguments().computeIfAbsent("customerByIdentifier", k -> new ArrayList<>());                      
    InputArgument identifierArg = new InputArgument("identifier", identifier);
    getInputArguments().get("customerByIdentifier").add(identifierArg);
    return projection;
  }

  public CustomerMergeRequestProjection<QueryProjection<PARENT, ROOT>, ROOT> customerMergeJobStatus(
      ) {
     CustomerMergeRequestProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeRequestProjection<>(this, getRoot());
     getFields().put("customerMergeJobStatus", projection);
     return projection;
  }

  public CustomerMergeRequestProjection<QueryProjection<PARENT, ROOT>, ROOT> customerMergeJobStatus(
      String jobId) {
    CustomerMergeRequestProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeRequestProjection<>(this, getRoot());    
    getFields().put("customerMergeJobStatus", projection);
    getInputArguments().computeIfAbsent("customerMergeJobStatus", k -> new ArrayList<>());                      
    InputArgument jobIdArg = new InputArgument("jobId", jobId);
    getInputArguments().get("customerMergeJobStatus").add(jobIdArg);
    return projection;
  }

  public CustomerMergePreviewProjection<QueryProjection<PARENT, ROOT>, ROOT> customerMergePreview(
      ) {
     CustomerMergePreviewProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergePreviewProjection<>(this, getRoot());
     getFields().put("customerMergePreview", projection);
     return projection;
  }

  public CustomerMergePreviewProjection<QueryProjection<PARENT, ROOT>, ROOT> customerMergePreview(
      String customerOneId, String customerTwoId, CustomerMergeOverrideFields overrideFields) {
    CustomerMergePreviewProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergePreviewProjection<>(this, getRoot());    
    getFields().put("customerMergePreview", projection);
    getInputArguments().computeIfAbsent("customerMergePreview", k -> new ArrayList<>());                      
    InputArgument customerOneIdArg = new InputArgument("customerOneId", customerOneId);
    getInputArguments().get("customerMergePreview").add(customerOneIdArg);
    InputArgument customerTwoIdArg = new InputArgument("customerTwoId", customerTwoId);
    getInputArguments().get("customerMergePreview").add(customerTwoIdArg);
    InputArgument overrideFieldsArg = new InputArgument("overrideFields", overrideFields);
    getInputArguments().get("customerMergePreview").add(overrideFieldsArg);
    return projection;
  }

  public CustomerPaymentMethodProjection<QueryProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      ) {
     CustomerPaymentMethodProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());
     getFields().put("customerPaymentMethod", projection);
     return projection;
  }

  public CustomerPaymentMethodProjection<QueryProjection<PARENT, ROOT>, ROOT> customerPaymentMethod(
      String id, Boolean showRevoked) {
    CustomerPaymentMethodProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodProjection<>(this, getRoot());    
    getFields().put("customerPaymentMethod", projection);
    getInputArguments().computeIfAbsent("customerPaymentMethod", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("customerPaymentMethod").add(idArg);
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked);
    getInputArguments().get("customerPaymentMethod").add(showRevokedArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> customerSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("customerSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> customerSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CustomerSavedSearchSortKeys sortKey, String query) {
    SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("customerSavedSearches", projection);
    getInputArguments().computeIfAbsent("customerSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("customerSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("customerSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("customerSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("customerSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("customerSavedSearches").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("customerSavedSearches").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("customerSavedSearches").add(queryArg);
    return projection;
  }

  public CustomerSegmentMemberConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> customerSegmentMembers(
      ) {
     CustomerSegmentMemberConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerSegmentMemberConnectionProjection<>(this, getRoot());
     getFields().put("customerSegmentMembers", projection);
     return projection;
  }

  public CustomerSegmentMemberConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> customerSegmentMembers(
      String segmentId, String query, String queryId, String timezone, Boolean reverse,
      String sortKey, Integer first, String after, Integer last, String before) {
    CustomerSegmentMemberConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerSegmentMemberConnectionProjection<>(this, getRoot());    
    getFields().put("customerSegmentMembers", projection);
    getInputArguments().computeIfAbsent("customerSegmentMembers", k -> new ArrayList<>());                      
    InputArgument segmentIdArg = new InputArgument("segmentId", segmentId);
    getInputArguments().get("customerSegmentMembers").add(segmentIdArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("customerSegmentMembers").add(queryArg);
    InputArgument queryIdArg = new InputArgument("queryId", queryId);
    getInputArguments().get("customerSegmentMembers").add(queryIdArg);
    InputArgument timezoneArg = new InputArgument("timezone", timezone);
    getInputArguments().get("customerSegmentMembers").add(timezoneArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("customerSegmentMembers").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("customerSegmentMembers").add(sortKeyArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("customerSegmentMembers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("customerSegmentMembers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("customerSegmentMembers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("customerSegmentMembers").add(beforeArg);
    return projection;
  }

  public CustomerSegmentMembersQueryProjection<QueryProjection<PARENT, ROOT>, ROOT> customerSegmentMembersQuery(
      ) {
     CustomerSegmentMembersQueryProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerSegmentMembersQueryProjection<>(this, getRoot());
     getFields().put("customerSegmentMembersQuery", projection);
     return projection;
  }

  public CustomerSegmentMembersQueryProjection<QueryProjection<PARENT, ROOT>, ROOT> customerSegmentMembersQuery(
      String id) {
    CustomerSegmentMembersQueryProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerSegmentMembersQueryProjection<>(this, getRoot());    
    getFields().put("customerSegmentMembersQuery", projection);
    getInputArguments().computeIfAbsent("customerSegmentMembersQuery", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("customerSegmentMembersQuery").add(idArg);
    return projection;
  }

  public SegmentMembershipResponseProjection<QueryProjection<PARENT, ROOT>, ROOT> customerSegmentMembership(
      ) {
     SegmentMembershipResponseProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentMembershipResponseProjection<>(this, getRoot());
     getFields().put("customerSegmentMembership", projection);
     return projection;
  }

  public SegmentMembershipResponseProjection<QueryProjection<PARENT, ROOT>, ROOT> customerSegmentMembership(
      List<String> segmentIds, String customerId) {
    SegmentMembershipResponseProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentMembershipResponseProjection<>(this, getRoot());    
    getFields().put("customerSegmentMembership", projection);
    getInputArguments().computeIfAbsent("customerSegmentMembership", k -> new ArrayList<>());                      
    InputArgument segmentIdsArg = new InputArgument("segmentIds", segmentIds);
    getInputArguments().get("customerSegmentMembership").add(segmentIdsArg);
    InputArgument customerIdArg = new InputArgument("customerId", customerId);
    getInputArguments().get("customerSegmentMembership").add(customerIdArg);
    return projection;
  }

  public CustomerConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> customers() {
     CustomerConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerConnectionProjection<>(this, getRoot());
     getFields().put("customers", projection);
     return projection;
  }

  public CustomerConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> customers(Integer first,
      String after, Integer last, String before, Boolean reverse, CustomerSortKeys sortKey,
      String query) {
    CustomerConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CustomerConnectionProjection<>(this, getRoot());    
    getFields().put("customers", projection);
    getInputArguments().computeIfAbsent("customers", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("customers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("customers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("customers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("customers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("customers").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("customers").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("customers").add(queryArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> customersCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("customersCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> customersCount(String query,
      Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("customersCount", projection);
    getInputArguments().computeIfAbsent("customersCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("customersCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("customersCount").add(limitArg);
    return projection;
  }

  public DeletionEventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> deletionEvents() {
     DeletionEventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeletionEventConnectionProjection<>(this, getRoot());
     getFields().put("deletionEvents", projection);
     return projection;
  }

  public DeletionEventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> deletionEvents(
      List<DeletionEventSubjectType> subjectTypes, Integer first, String after, Integer last,
      String before, Boolean reverse, DeletionEventSortKeys sortKey, String query) {
    DeletionEventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeletionEventConnectionProjection<>(this, getRoot());    
    getFields().put("deletionEvents", projection);
    getInputArguments().computeIfAbsent("deletionEvents", k -> new ArrayList<>());                      
    InputArgument subjectTypesArg = new InputArgument("subjectTypes", subjectTypes);
    getInputArguments().get("deletionEvents").add(subjectTypesArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("deletionEvents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("deletionEvents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("deletionEvents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("deletionEvents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("deletionEvents").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("deletionEvents").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("deletionEvents").add(queryArg);
    return projection;
  }

  public DeliveryCustomizationProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryCustomization(
      ) {
     DeliveryCustomizationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationProjection<>(this, getRoot());
     getFields().put("deliveryCustomization", projection);
     return projection;
  }

  public DeliveryCustomizationProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryCustomization(
      String id) {
    DeliveryCustomizationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationProjection<>(this, getRoot());    
    getFields().put("deliveryCustomization", projection);
    getInputArguments().computeIfAbsent("deliveryCustomization", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("deliveryCustomization").add(idArg);
    return projection;
  }

  public DeliveryCustomizationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryCustomizations(
      ) {
     DeliveryCustomizationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationConnectionProjection<>(this, getRoot());
     getFields().put("deliveryCustomizations", projection);
     return projection;
  }

  public DeliveryCustomizationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryCustomizations(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    DeliveryCustomizationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCustomizationConnectionProjection<>(this, getRoot());    
    getFields().put("deliveryCustomizations", projection);
    getInputArguments().computeIfAbsent("deliveryCustomizations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("deliveryCustomizations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("deliveryCustomizations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("deliveryCustomizations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("deliveryCustomizations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("deliveryCustomizations").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("deliveryCustomizations").add(queryArg);
    return projection;
  }

  public DeliveryProfileProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryProfile() {
     DeliveryProfileProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileProjection<>(this, getRoot());
     getFields().put("deliveryProfile", projection);
     return projection;
  }

  public DeliveryProfileProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryProfile(String id) {
    DeliveryProfileProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileProjection<>(this, getRoot());    
    getFields().put("deliveryProfile", projection);
    getInputArguments().computeIfAbsent("deliveryProfile", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("deliveryProfile").add(idArg);
    return projection;
  }

  public DeliveryProfileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryProfiles(
      ) {
     DeliveryProfileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileConnectionProjection<>(this, getRoot());
     getFields().put("deliveryProfiles", projection);
     return projection;
  }

  public DeliveryProfileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryProfiles(
      Boolean merchantOwnedOnly, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    DeliveryProfileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileConnectionProjection<>(this, getRoot());    
    getFields().put("deliveryProfiles", projection);
    getInputArguments().computeIfAbsent("deliveryProfiles", k -> new ArrayList<>());                      
    InputArgument merchantOwnedOnlyArg = new InputArgument("merchantOwnedOnly", merchantOwnedOnly);
    getInputArguments().get("deliveryProfiles").add(merchantOwnedOnlyArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("deliveryProfiles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("deliveryProfiles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("deliveryProfiles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("deliveryProfiles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("deliveryProfiles").add(reverseArg);
    return projection;
  }

  public DeliveryPromiseParticipantConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryPromiseParticipants(
      ) {
     DeliveryPromiseParticipantConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseParticipantConnectionProjection<>(this, getRoot());
     getFields().put("deliveryPromiseParticipants", projection);
     return projection;
  }

  public DeliveryPromiseParticipantConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryPromiseParticipants(
      List<String> ownerIds, String brandedPromiseHandle, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    DeliveryPromiseParticipantConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseParticipantConnectionProjection<>(this, getRoot());    
    getFields().put("deliveryPromiseParticipants", projection);
    getInputArguments().computeIfAbsent("deliveryPromiseParticipants", k -> new ArrayList<>());                      
    InputArgument ownerIdsArg = new InputArgument("ownerIds", ownerIds);
    getInputArguments().get("deliveryPromiseParticipants").add(ownerIdsArg);
    InputArgument brandedPromiseHandleArg = new InputArgument("brandedPromiseHandle", brandedPromiseHandle);
    getInputArguments().get("deliveryPromiseParticipants").add(brandedPromiseHandleArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("deliveryPromiseParticipants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("deliveryPromiseParticipants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("deliveryPromiseParticipants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("deliveryPromiseParticipants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("deliveryPromiseParticipants").add(reverseArg);
    return projection;
  }

  public DeliveryPromiseProviderProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryPromiseProvider(
      ) {
     DeliveryPromiseProviderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseProviderProjection<>(this, getRoot());
     getFields().put("deliveryPromiseProvider", projection);
     return projection;
  }

  public DeliveryPromiseProviderProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryPromiseProvider(
      String locationId) {
    DeliveryPromiseProviderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseProviderProjection<>(this, getRoot());    
    getFields().put("deliveryPromiseProvider", projection);
    getInputArguments().computeIfAbsent("deliveryPromiseProvider", k -> new ArrayList<>());                      
    InputArgument locationIdArg = new InputArgument("locationId", locationId);
    getInputArguments().get("deliveryPromiseProvider").add(locationIdArg);
    return projection;
  }

  public DeliveryPromiseSettingProjection<QueryProjection<PARENT, ROOT>, ROOT> deliveryPromiseSettings(
      ) {
     DeliveryPromiseSettingProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseSettingProjection<>(this, getRoot());
     getFields().put("deliveryPromiseSettings", projection);
     return projection;
  }

  public DeliverySettingProjection<QueryProjection<PARENT, ROOT>, ROOT> deliverySettings() {
     DeliverySettingProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DeliverySettingProjection<>(this, getRoot());
     getFields().put("deliverySettings", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> discountCodesCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("discountCodesCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> discountCodesCount(String query,
      Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("discountCodesCount", projection);
    getInputArguments().computeIfAbsent("discountCodesCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("discountCodesCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("discountCodesCount").add(limitArg);
    return projection;
  }

  public DiscountNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> discountNode() {
     DiscountNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeProjection<>(this, getRoot());
     getFields().put("discountNode", projection);
     return projection;
  }

  public DiscountNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> discountNode(String id) {
    DiscountNodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeProjection<>(this, getRoot());    
    getFields().put("discountNode", projection);
    getInputArguments().computeIfAbsent("discountNode", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("discountNode").add(idArg);
    return projection;
  }

  public DiscountNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> discountNodes() {
     DiscountNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeConnectionProjection<>(this, getRoot());
     getFields().put("discountNodes", projection);
     return projection;
  }

  public DiscountNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> discountNodes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DiscountSortKeys sortKey, String query, String savedSearchId) {
    DiscountNodeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountNodeConnectionProjection<>(this, getRoot());    
    getFields().put("discountNodes", projection);
    getInputArguments().computeIfAbsent("discountNodes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountNodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountNodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountNodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountNodes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountNodes").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("discountNodes").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("discountNodes").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("discountNodes").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> discountNodesCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("discountNodesCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> discountNodesCount(String query,
      String savedSearchId, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("discountNodesCount", projection);
    getInputArguments().computeIfAbsent("discountNodesCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("discountNodesCount").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("discountNodesCount").add(savedSearchIdArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("discountNodesCount").add(limitArg);
    return projection;
  }

  public DiscountRedeemCodeBulkCreationProjection<QueryProjection<PARENT, ROOT>, ROOT> discountRedeemCodeBulkCreation(
      ) {
     DiscountRedeemCodeBulkCreationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeBulkCreationProjection<>(this, getRoot());
     getFields().put("discountRedeemCodeBulkCreation", projection);
     return projection;
  }

  public DiscountRedeemCodeBulkCreationProjection<QueryProjection<PARENT, ROOT>, ROOT> discountRedeemCodeBulkCreation(
      String id) {
    DiscountRedeemCodeBulkCreationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeBulkCreationProjection<>(this, getRoot());    
    getFields().put("discountRedeemCodeBulkCreation", projection);
    getInputArguments().computeIfAbsent("discountRedeemCodeBulkCreation", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("discountRedeemCodeBulkCreation").add(idArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> discountRedeemCodeSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("discountRedeemCodeSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> discountRedeemCodeSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DiscountCodeSortKeys sortKey, String query) {
    SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("discountRedeemCodeSavedSearches", projection);
    getInputArguments().computeIfAbsent("discountRedeemCodeSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("discountRedeemCodeSavedSearches").add(queryArg);
    return projection;
  }

  public ShopifyPaymentsDisputeProjection<QueryProjection<PARENT, ROOT>, ROOT> dispute() {
     ShopifyPaymentsDisputeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeProjection<>(this, getRoot());
     getFields().put("dispute", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeProjection<QueryProjection<PARENT, ROOT>, ROOT> dispute(String id) {
    ShopifyPaymentsDisputeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeProjection<>(this, getRoot());    
    getFields().put("dispute", projection);
    getInputArguments().computeIfAbsent("dispute", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("dispute").add(idArg);
    return projection;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<QueryProjection<PARENT, ROOT>, ROOT> disputeEvidence(
      ) {
     ShopifyPaymentsDisputeEvidenceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeEvidenceProjection<>(this, getRoot());
     getFields().put("disputeEvidence", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeEvidenceProjection<QueryProjection<PARENT, ROOT>, ROOT> disputeEvidence(
      String id) {
    ShopifyPaymentsDisputeEvidenceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeEvidenceProjection<>(this, getRoot());    
    getFields().put("disputeEvidence", projection);
    getInputArguments().computeIfAbsent("disputeEvidence", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("disputeEvidence").add(idArg);
    return projection;
  }

  public ShopifyPaymentsDisputeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> disputes(
      ) {
     ShopifyPaymentsDisputeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeConnectionProjection<>(this, getRoot());
     getFields().put("disputes", projection);
     return projection;
  }

  public ShopifyPaymentsDisputeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> disputes(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    ShopifyPaymentsDisputeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsDisputeConnectionProjection<>(this, getRoot());    
    getFields().put("disputes", projection);
    getInputArguments().computeIfAbsent("disputes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("disputes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("disputes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("disputes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("disputes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("disputes").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("disputes").add(queryArg);
    return projection;
  }

  public DomainProjection<QueryProjection<PARENT, ROOT>, ROOT> domain() {
     DomainProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DomainProjection<>(this, getRoot());
     getFields().put("domain", projection);
     return projection;
  }

  public DomainProjection<QueryProjection<PARENT, ROOT>, ROOT> domain(String id) {
    DomainProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DomainProjection<>(this, getRoot());    
    getFields().put("domain", projection);
    getInputArguments().computeIfAbsent("domain", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("domain").add(idArg);
    return projection;
  }

  public DraftOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrder() {
     DraftOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderProjection<>(this, getRoot());
     getFields().put("draftOrder", projection);
     return projection;
  }

  public DraftOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrder(String id) {
    DraftOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderProjection<>(this, getRoot());    
    getFields().put("draftOrder", projection);
    getInputArguments().computeIfAbsent("draftOrder", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("draftOrder").add(idArg);
    return projection;
  }

  public DraftOrderAvailableDeliveryOptionsProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrderAvailableDeliveryOptions(
      ) {
     DraftOrderAvailableDeliveryOptionsProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderAvailableDeliveryOptionsProjection<>(this, getRoot());
     getFields().put("draftOrderAvailableDeliveryOptions", projection);
     return projection;
  }

  public DraftOrderAvailableDeliveryOptionsProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrderAvailableDeliveryOptions(
      DraftOrderAvailableDeliveryOptionsInput input, String search, Integer localPickupFrom,
      Integer localPickupCount, String sessionToken) {
    DraftOrderAvailableDeliveryOptionsProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderAvailableDeliveryOptionsProjection<>(this, getRoot());    
    getFields().put("draftOrderAvailableDeliveryOptions", projection);
    getInputArguments().computeIfAbsent("draftOrderAvailableDeliveryOptions", k -> new ArrayList<>());                      
    InputArgument inputArg = new InputArgument("input", input);
    getInputArguments().get("draftOrderAvailableDeliveryOptions").add(inputArg);
    InputArgument searchArg = new InputArgument("search", search);
    getInputArguments().get("draftOrderAvailableDeliveryOptions").add(searchArg);
    InputArgument localPickupFromArg = new InputArgument("localPickupFrom", localPickupFrom);
    getInputArguments().get("draftOrderAvailableDeliveryOptions").add(localPickupFromArg);
    InputArgument localPickupCountArg = new InputArgument("localPickupCount", localPickupCount);
    getInputArguments().get("draftOrderAvailableDeliveryOptions").add(localPickupCountArg);
    InputArgument sessionTokenArg = new InputArgument("sessionToken", sessionToken);
    getInputArguments().get("draftOrderAvailableDeliveryOptions").add(sessionTokenArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrderSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("draftOrderSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrderSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("draftOrderSavedSearches", projection);
    getInputArguments().computeIfAbsent("draftOrderSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("draftOrderSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("draftOrderSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("draftOrderSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("draftOrderSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("draftOrderSavedSearches").add(reverseArg);
    return projection;
  }

  public DraftOrderTagProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrderTag() {
     DraftOrderTagProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderTagProjection<>(this, getRoot());
     getFields().put("draftOrderTag", projection);
     return projection;
  }

  public DraftOrderTagProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrderTag(String id) {
    DraftOrderTagProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderTagProjection<>(this, getRoot());    
    getFields().put("draftOrderTag", projection);
    getInputArguments().computeIfAbsent("draftOrderTag", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("draftOrderTag").add(idArg);
    return projection;
  }

  public DraftOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrders() {
     DraftOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());
     getFields().put("draftOrders", projection);
     return projection;
  }

  public DraftOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DraftOrderSortKeys sortKey, String query, String savedSearchId) {
    DraftOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());    
    getFields().put("draftOrders", projection);
    getInputArguments().computeIfAbsent("draftOrders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("draftOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("draftOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("draftOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("draftOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("draftOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("draftOrders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("draftOrders").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("draftOrders").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrdersCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("draftOrdersCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> draftOrdersCount(String query,
      String savedSearchId, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("draftOrdersCount", projection);
    getInputArguments().computeIfAbsent("draftOrdersCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("draftOrdersCount").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("draftOrdersCount").add(savedSearchIdArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("draftOrdersCount").add(limitArg);
    return projection;
  }

  public EventProjection<QueryProjection<PARENT, ROOT>, ROOT> event() {
     EventProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new EventProjection<>(this, getRoot());
     getFields().put("event", projection);
     return projection;
  }

  public EventProjection<QueryProjection<PARENT, ROOT>, ROOT> event(String id) {
    EventProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new EventProjection<>(this, getRoot());    
    getFields().put("event", projection);
    getInputArguments().computeIfAbsent("event", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("event").add(idArg);
    return projection;
  }

  public EventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> events(Integer first,
      String after, Integer last, String before, Boolean reverse, EventSortKeys sortKey,
      String query) {
    EventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> eventsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("eventsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> eventsCount(String query) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("eventsCount", projection);
    getInputArguments().computeIfAbsent("eventsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("eventsCount").add(queryArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> fileSavedSearches() {
     SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("fileSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> fileSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("fileSavedSearches", projection);
    getInputArguments().computeIfAbsent("fileSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fileSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("fileSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("fileSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("fileSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("fileSavedSearches").add(reverseArg);
    return projection;
  }

  public FileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> files() {
     FileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FileConnectionProjection<>(this, getRoot());
     getFields().put("files", projection);
     return projection;
  }

  public FileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> files(Integer first,
      String after, Integer last, String before, Boolean reverse, FileSortKeys sortKey,
      String query, String savedSearchId) {
    FileConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FileConnectionProjection<>(this, getRoot());    
    getFields().put("files", projection);
    getInputArguments().computeIfAbsent("files", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("files").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("files").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("files").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("files").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("files").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("files").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("files").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("files").add(savedSearchIdArg);
    return projection;
  }

  public FinanceAppAccessPolicyProjection<QueryProjection<PARENT, ROOT>, ROOT> financeAppAccessPolicy(
      ) {
     FinanceAppAccessPolicyProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FinanceAppAccessPolicyProjection<>(this, getRoot());
     getFields().put("financeAppAccessPolicy", projection);
     return projection;
  }

  public FinanceKycInformationProjection<QueryProjection<PARENT, ROOT>, ROOT> financeKycInformation(
      ) {
     FinanceKycInformationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FinanceKycInformationProjection<>(this, getRoot());
     getFields().put("financeKycInformation", projection);
     return projection;
  }

  public FulfillmentProjection<QueryProjection<PARENT, ROOT>, ROOT> fulfillment() {
     FulfillmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());
     getFields().put("fulfillment", projection);
     return projection;
  }

  public FulfillmentProjection<QueryProjection<PARENT, ROOT>, ROOT> fulfillment(String id) {
    FulfillmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());    
    getFields().put("fulfillment", projection);
    getInputArguments().computeIfAbsent("fulfillment", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("fulfillment").add(idArg);
    return projection;
  }

  public FulfillmentConstraintRuleProjection<QueryProjection<PARENT, ROOT>, ROOT> fulfillmentConstraintRules(
      ) {
     FulfillmentConstraintRuleProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentConstraintRuleProjection<>(this, getRoot());
     getFields().put("fulfillmentConstraintRules", projection);
     return projection;
  }

  public FulfillmentOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> fulfillmentOrder() {
     FulfillmentOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderProjection<>(this, getRoot());
     getFields().put("fulfillmentOrder", projection);
     return projection;
  }

  public FulfillmentOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> fulfillmentOrder(
      String id) {
    FulfillmentOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderProjection<>(this, getRoot());    
    getFields().put("fulfillmentOrder", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrder", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("fulfillmentOrder").add(idArg);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      ) {
     FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("fulfillmentOrders", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      Boolean includeClosed, Integer first, String after, Integer last, String before,
      Boolean reverse, FulfillmentOrderSortKeys sortKey, String query) {
    FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("fulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument includeClosedArg = new InputArgument("includeClosed", includeClosed);
    getInputArguments().get("fulfillmentOrders").add(includeClosedArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("fulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("fulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("fulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("fulfillmentOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("fulfillmentOrders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("fulfillmentOrders").add(queryArg);
    return projection;
  }

  public FulfillmentServiceProjection<QueryProjection<PARENT, ROOT>, ROOT> fulfillmentService() {
     FulfillmentServiceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public FulfillmentServiceProjection<QueryProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      String id) {
    FulfillmentServiceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());    
    getFields().put("fulfillmentService", projection);
    getInputArguments().computeIfAbsent("fulfillmentService", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("fulfillmentService").add(idArg);
    return projection;
  }

  public GiftCardProjection<QueryProjection<PARENT, ROOT>, ROOT> giftCard() {
     GiftCardProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new GiftCardProjection<>(this, getRoot());
     getFields().put("giftCard", projection);
     return projection;
  }

  public GiftCardProjection<QueryProjection<PARENT, ROOT>, ROOT> giftCard(String id) {
    GiftCardProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new GiftCardProjection<>(this, getRoot());    
    getFields().put("giftCard", projection);
    getInputArguments().computeIfAbsent("giftCard", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("giftCard").add(idArg);
    return projection;
  }

  public GiftCardConfigurationProjection<QueryProjection<PARENT, ROOT>, ROOT> giftCardConfiguration(
      ) {
     GiftCardConfigurationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new GiftCardConfigurationProjection<>(this, getRoot());
     getFields().put("giftCardConfiguration", projection);
     return projection;
  }

  public GiftCardConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> giftCards() {
     GiftCardConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new GiftCardConnectionProjection<>(this, getRoot());
     getFields().put("giftCards", projection);
     return projection;
  }

  public GiftCardConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> giftCards(Integer first,
      String after, Integer last, String before, Boolean reverse, GiftCardSortKeys sortKey,
      String query, String savedSearchId) {
    GiftCardConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new GiftCardConnectionProjection<>(this, getRoot());    
    getFields().put("giftCards", projection);
    getInputArguments().computeIfAbsent("giftCards", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("giftCards").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("giftCards").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("giftCards").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("giftCards").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("giftCards").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("giftCards").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("giftCards").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("giftCards").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> giftCardsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("giftCardsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> giftCardsCount(String query,
      String savedSearchId, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("giftCardsCount", projection);
    getInputArguments().computeIfAbsent("giftCardsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("giftCardsCount").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("giftCardsCount").add(savedSearchIdArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("giftCardsCount").add(limitArg);
    return projection;
  }

  public InventoryItemProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryItem() {
     InventoryItemProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("inventoryItem", projection);
     return projection;
  }

  public InventoryItemProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryItem(String id) {
    InventoryItemProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());    
    getFields().put("inventoryItem", projection);
    getInputArguments().computeIfAbsent("inventoryItem", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("inventoryItem").add(idArg);
    return projection;
  }

  public InventoryItemConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryItems() {
     InventoryItemConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemConnectionProjection<>(this, getRoot());
     getFields().put("inventoryItems", projection);
     return projection;
  }

  public InventoryItemConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryItems(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    InventoryItemConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemConnectionProjection<>(this, getRoot());    
    getFields().put("inventoryItems", projection);
    getInputArguments().computeIfAbsent("inventoryItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("inventoryItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("inventoryItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("inventoryItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("inventoryItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("inventoryItems").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("inventoryItems").add(queryArg);
    return projection;
  }

  public InventoryLevelProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryLevel() {
     InventoryLevelProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelProjection<>(this, getRoot());
     getFields().put("inventoryLevel", projection);
     return projection;
  }

  public InventoryLevelProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryLevel(String id) {
    InventoryLevelProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelProjection<>(this, getRoot());    
    getFields().put("inventoryLevel", projection);
    getInputArguments().computeIfAbsent("inventoryLevel", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("inventoryLevel").add(idArg);
    return projection;
  }

  public InventoryPropertiesProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryProperties() {
     InventoryPropertiesProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryPropertiesProjection<>(this, getRoot());
     getFields().put("inventoryProperties", projection);
     return projection;
  }

  public InventoryShipmentProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryShipment() {
     InventoryShipmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentProjection<>(this, getRoot());
     getFields().put("inventoryShipment", projection);
     return projection;
  }

  public InventoryShipmentProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryShipment(
      String id) {
    InventoryShipmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentProjection<>(this, getRoot());    
    getFields().put("inventoryShipment", projection);
    getInputArguments().computeIfAbsent("inventoryShipment", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("inventoryShipment").add(idArg);
    return projection;
  }

  public InventoryTransferProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryTransfer() {
     InventoryTransferProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferProjection<>(this, getRoot());
     getFields().put("inventoryTransfer", projection);
     return projection;
  }

  public InventoryTransferProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryTransfer(
      String id) {
    InventoryTransferProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferProjection<>(this, getRoot());    
    getFields().put("inventoryTransfer", projection);
    getInputArguments().computeIfAbsent("inventoryTransfer", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("inventoryTransfer").add(idArg);
    return projection;
  }

  public InventoryTransferConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryTransfers(
      ) {
     InventoryTransferConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferConnectionProjection<>(this, getRoot());
     getFields().put("inventoryTransfers", projection);
     return projection;
  }

  public InventoryTransferConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> inventoryTransfers(
      Integer first, String after, Integer last, String before, Boolean reverse,
      TransferSortKeys sortKey, String query, String savedSearchId) {
    InventoryTransferConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferConnectionProjection<>(this, getRoot());    
    getFields().put("inventoryTransfers", projection);
    getInputArguments().computeIfAbsent("inventoryTransfers", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("inventoryTransfers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("inventoryTransfers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("inventoryTransfers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("inventoryTransfers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("inventoryTransfers").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("inventoryTransfers").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("inventoryTransfers").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("inventoryTransfers").add(savedSearchIdArg);
    return projection;
  }

  public JobProjection<QueryProjection<PARENT, ROOT>, ROOT> job() {
     JobProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new JobProjection<>(this, getRoot());
     getFields().put("job", projection);
     return projection;
  }

  public JobProjection<QueryProjection<PARENT, ROOT>, ROOT> job(String id) {
    JobProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new JobProjection<>(this, getRoot());    
    getFields().put("job", projection);
    getInputArguments().computeIfAbsent("job", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("job").add(idArg);
    return projection;
  }

  public LocationProjection<QueryProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public LocationProjection<QueryProjection<PARENT, ROOT>, ROOT> location(String id) {
    LocationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());    
    getFields().put("location", projection);
    getInputArguments().computeIfAbsent("location", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("location").add(idArg);
    return projection;
  }

  public LocationProjection<QueryProjection<PARENT, ROOT>, ROOT> locationByIdentifier() {
     LocationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("locationByIdentifier", projection);
     return projection;
  }

  public LocationProjection<QueryProjection<PARENT, ROOT>, ROOT> locationByIdentifier(
      LocationIdentifierInput identifier) {
    LocationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());    
    getFields().put("locationByIdentifier", projection);
    getInputArguments().computeIfAbsent("locationByIdentifier", k -> new ArrayList<>());                      
    InputArgument identifierArg = new InputArgument("identifier", identifier);
    getInputArguments().get("locationByIdentifier").add(identifierArg);
    return projection;
  }

  public LocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> locations() {
     LocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());
     getFields().put("locations", projection);
     return projection;
  }

  public LocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> locations(Integer first,
      String after, Integer last, String before, Boolean reverse, LocationSortKeys sortKey,
      String query, Boolean includeLegacy, Boolean includeInactive) {
    LocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
    getFields().put("locations", projection);
    getInputArguments().computeIfAbsent("locations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("locations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("locations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("locations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("locations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("locations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("locations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("locations").add(queryArg);
    InputArgument includeLegacyArg = new InputArgument("includeLegacy", includeLegacy);
    getInputArguments().get("locations").add(includeLegacyArg);
    InputArgument includeInactiveArg = new InputArgument("includeInactive", includeInactive);
    getInputArguments().get("locations").add(includeInactiveArg);
    return projection;
  }

  public LocationProjection<QueryProjection<PARENT, ROOT>, ROOT> locationsAvailableForDeliveryProfiles(
      ) {
     LocationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("locationsAvailableForDeliveryProfiles", projection);
     return projection;
  }

  public LocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> locationsAvailableForDeliveryProfilesConnection(
      ) {
     LocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());
     getFields().put("locationsAvailableForDeliveryProfilesConnection", projection);
     return projection;
  }

  public LocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> locationsAvailableForDeliveryProfilesConnection(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    LocationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
    getFields().put("locationsAvailableForDeliveryProfilesConnection", projection);
    getInputArguments().computeIfAbsent("locationsAvailableForDeliveryProfilesConnection", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("locationsAvailableForDeliveryProfilesConnection").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("locationsAvailableForDeliveryProfilesConnection").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("locationsAvailableForDeliveryProfilesConnection").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("locationsAvailableForDeliveryProfilesConnection").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("locationsAvailableForDeliveryProfilesConnection").add(reverseArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> locationsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("locationsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> locationsCount(String query,
      Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("locationsCount", projection);
    getInputArguments().computeIfAbsent("locationsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("locationsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("locationsCount").add(limitArg);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> manualHoldsFulfillmentOrders(
      ) {
     FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("manualHoldsFulfillmentOrders", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> manualHoldsFulfillmentOrders(
      String query, Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("manualHoldsFulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("manualHoldsFulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(queryArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("manualHoldsFulfillmentOrders").add(reverseArg);
    return projection;
  }

  public MarketProjection<QueryProjection<PARENT, ROOT>, ROOT> market() {
     MarketProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("market", projection);
     return projection;
  }

  public MarketProjection<QueryProjection<PARENT, ROOT>, ROOT> market(String id) {
    MarketProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());    
    getFields().put("market", projection);
    getInputArguments().computeIfAbsent("market", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("market").add(idArg);
    return projection;
  }

  public MarketProjection<QueryProjection<PARENT, ROOT>, ROOT> marketByGeography() {
     MarketProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("marketByGeography", projection);
     return projection;
  }

  public MarketProjection<QueryProjection<PARENT, ROOT>, ROOT> marketByGeography(
      CountryCode countryCode) {
    MarketProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());    
    getFields().put("marketByGeography", projection);
    getInputArguments().computeIfAbsent("marketByGeography", k -> new ArrayList<>());                      
    InputArgument countryCodeArg = new InputArgument("countryCode", countryCode);
    getInputArguments().get("marketByGeography").add(countryCodeArg);
    return projection;
  }

  public MarketLocalizableResourceProjection<QueryProjection<PARENT, ROOT>, ROOT> marketLocalizableResource(
      ) {
     MarketLocalizableResourceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceProjection<>(this, getRoot());
     getFields().put("marketLocalizableResource", projection);
     return projection;
  }

  public MarketLocalizableResourceProjection<QueryProjection<PARENT, ROOT>, ROOT> marketLocalizableResource(
      String resourceId) {
    MarketLocalizableResourceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceProjection<>(this, getRoot());    
    getFields().put("marketLocalizableResource", projection);
    getInputArguments().computeIfAbsent("marketLocalizableResource", k -> new ArrayList<>());                      
    InputArgument resourceIdArg = new InputArgument("resourceId", resourceId);
    getInputArguments().get("marketLocalizableResource").add(resourceIdArg);
    return projection;
  }

  public MarketLocalizableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> marketLocalizableResources(
      ) {
     MarketLocalizableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceConnectionProjection<>(this, getRoot());
     getFields().put("marketLocalizableResources", projection);
     return projection;
  }

  public MarketLocalizableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> marketLocalizableResources(
      MarketLocalizableResourceType resourceType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    MarketLocalizableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceConnectionProjection<>(this, getRoot());    
    getFields().put("marketLocalizableResources", projection);
    getInputArguments().computeIfAbsent("marketLocalizableResources", k -> new ArrayList<>());                      
    InputArgument resourceTypeArg = new InputArgument("resourceType", resourceType);
    getInputArguments().get("marketLocalizableResources").add(resourceTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("marketLocalizableResources").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("marketLocalizableResources").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("marketLocalizableResources").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("marketLocalizableResources").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("marketLocalizableResources").add(reverseArg);
    return projection;
  }

  public MarketLocalizableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> marketLocalizableResourcesByIds(
      ) {
     MarketLocalizableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceConnectionProjection<>(this, getRoot());
     getFields().put("marketLocalizableResourcesByIds", projection);
     return projection;
  }

  public MarketLocalizableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> marketLocalizableResourcesByIds(
      List<String> resourceIds, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MarketLocalizableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketLocalizableResourceConnectionProjection<>(this, getRoot());    
    getFields().put("marketLocalizableResourcesByIds", projection);
    getInputArguments().computeIfAbsent("marketLocalizableResourcesByIds", k -> new ArrayList<>());                      
    InputArgument resourceIdsArg = new InputArgument("resourceIds", resourceIds);
    getInputArguments().get("marketLocalizableResourcesByIds").add(resourceIdsArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("marketLocalizableResourcesByIds").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("marketLocalizableResourcesByIds").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("marketLocalizableResourcesByIds").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("marketLocalizableResourcesByIds").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("marketLocalizableResourcesByIds").add(reverseArg);
    return projection;
  }

  public MarketingActivityConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> marketingActivities(
      ) {
     MarketingActivityConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityConnectionProjection<>(this, getRoot());
     getFields().put("marketingActivities", projection);
     return projection;
  }

  public MarketingActivityConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> marketingActivities(
      List<String> marketingActivityIds, List<String> remoteIds, UTMInput utm, Integer first,
      String after, Integer last, String before, Boolean reverse, MarketingActivitySortKeys sortKey,
      String query, String savedSearchId) {
    MarketingActivityConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityConnectionProjection<>(this, getRoot());    
    getFields().put("marketingActivities", projection);
    getInputArguments().computeIfAbsent("marketingActivities", k -> new ArrayList<>());                      
    InputArgument marketingActivityIdsArg = new InputArgument("marketingActivityIds", marketingActivityIds);
    getInputArguments().get("marketingActivities").add(marketingActivityIdsArg);
    InputArgument remoteIdsArg = new InputArgument("remoteIds", remoteIds);
    getInputArguments().get("marketingActivities").add(remoteIdsArg);
    InputArgument utmArg = new InputArgument("utm", utm);
    getInputArguments().get("marketingActivities").add(utmArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("marketingActivities").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("marketingActivities").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("marketingActivities").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("marketingActivities").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("marketingActivities").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("marketingActivities").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("marketingActivities").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("marketingActivities").add(savedSearchIdArg);
    return projection;
  }

  public MarketingActivityProjection<QueryProjection<PARENT, ROOT>, ROOT> marketingActivity() {
     MarketingActivityProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityProjection<>(this, getRoot());
     getFields().put("marketingActivity", projection);
     return projection;
  }

  public MarketingActivityProjection<QueryProjection<PARENT, ROOT>, ROOT> marketingActivity(
      String id) {
    MarketingActivityProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityProjection<>(this, getRoot());    
    getFields().put("marketingActivity", projection);
    getInputArguments().computeIfAbsent("marketingActivity", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("marketingActivity").add(idArg);
    return projection;
  }

  public MarketingEventProjection<QueryProjection<PARENT, ROOT>, ROOT> marketingEvent() {
     MarketingEventProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventProjection<>(this, getRoot());
     getFields().put("marketingEvent", projection);
     return projection;
  }

  public MarketingEventProjection<QueryProjection<PARENT, ROOT>, ROOT> marketingEvent(String id) {
    MarketingEventProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventProjection<>(this, getRoot());    
    getFields().put("marketingEvent", projection);
    getInputArguments().computeIfAbsent("marketingEvent", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("marketingEvent").add(idArg);
    return projection;
  }

  public MarketingEventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> marketingEvents() {
     MarketingEventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventConnectionProjection<>(this, getRoot());
     getFields().put("marketingEvents", projection);
     return projection;
  }

  public MarketingEventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> marketingEvents(
      Integer first, String after, Integer last, String before, Boolean reverse,
      MarketingEventSortKeys sortKey, String query) {
    MarketingEventConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventConnectionProjection<>(this, getRoot());    
    getFields().put("marketingEvents", projection);
    getInputArguments().computeIfAbsent("marketingEvents", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("marketingEvents").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("marketingEvents").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("marketingEvents").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("marketingEvents").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("marketingEvents").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("marketingEvents").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("marketingEvents").add(queryArg);
    return projection;
  }

  public MarketConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> markets() {
     MarketConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());
     getFields().put("markets", projection);
     return projection;
  }

  public MarketConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> markets(MarketType type,
      Integer first, String after, Integer last, String before, Boolean reverse,
      MarketsSortKeys sortKey, String query) {
    MarketConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketConnectionProjection<>(this, getRoot());    
    getFields().put("markets", projection);
    getInputArguments().computeIfAbsent("markets", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type);
    getInputArguments().get("markets").add(typeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("markets").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("markets").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("markets").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("markets").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("markets").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("markets").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("markets").add(queryArg);
    return projection;
  }

  public MarketsResolvedValuesProjection<QueryProjection<PARENT, ROOT>, ROOT> marketsResolvedValues(
      ) {
     MarketsResolvedValuesProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketsResolvedValuesProjection<>(this, getRoot());
     getFields().put("marketsResolvedValues", projection);
     return projection;
  }

  public MarketsResolvedValuesProjection<QueryProjection<PARENT, ROOT>, ROOT> marketsResolvedValues(
      BuyerSignalInput buyerSignal) {
    MarketsResolvedValuesProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketsResolvedValuesProjection<>(this, getRoot());    
    getFields().put("marketsResolvedValues", projection);
    getInputArguments().computeIfAbsent("marketsResolvedValues", k -> new ArrayList<>());                      
    InputArgument buyerSignalArg = new InputArgument("buyerSignal", buyerSignal);
    getInputArguments().get("marketsResolvedValues").add(buyerSignalArg);
    return projection;
  }

  public MenuProjection<QueryProjection<PARENT, ROOT>, ROOT> menu() {
     MenuProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MenuProjection<>(this, getRoot());
     getFields().put("menu", projection);
     return projection;
  }

  public MenuProjection<QueryProjection<PARENT, ROOT>, ROOT> menu(String id) {
    MenuProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MenuProjection<>(this, getRoot());    
    getFields().put("menu", projection);
    getInputArguments().computeIfAbsent("menu", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("menu").add(idArg);
    return projection;
  }

  public MenuConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> menus() {
     MenuConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MenuConnectionProjection<>(this, getRoot());
     getFields().put("menus", projection);
     return projection;
  }

  public MenuConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> menus(Integer first,
      String after, Integer last, String before, Boolean reverse, MenuSortKeys sortKey,
      String query) {
    MenuConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MenuConnectionProjection<>(this, getRoot());    
    getFields().put("menus", projection);
    getInputArguments().computeIfAbsent("menus", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("menus").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("menus").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("menus").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("menus").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("menus").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("menus").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("menus").add(queryArg);
    return projection;
  }

  public MetafieldDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> metafieldDefinition() {
     MetafieldDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());
     getFields().put("metafieldDefinition", projection);
     return projection;
  }

  public MetafieldDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> metafieldDefinition(
      MetafieldDefinitionIdentifierInput identifier) {
    MetafieldDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionProjection<>(this, getRoot());    
    getFields().put("metafieldDefinition", projection);
    getInputArguments().computeIfAbsent("metafieldDefinition", k -> new ArrayList<>());                      
    InputArgument identifierArg = new InputArgument("identifier", identifier);
    getInputArguments().get("metafieldDefinition").add(identifierArg);
    return projection;
  }

  public MetafieldDefinitionTypeProjection<QueryProjection<PARENT, ROOT>, ROOT> metafieldDefinitionTypes(
      ) {
     MetafieldDefinitionTypeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionTypeProjection<>(this, getRoot());
     getFields().put("metafieldDefinitionTypes", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String key, String namespace, MetafieldOwnerType ownerType,
      MetafieldDefinitionPinnedStatus pinnedStatus,
      MetafieldDefinitionConstraintSubtypeIdentifier constraintSubtype,
      MetafieldDefinitionConstraintStatus constraintStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafieldDefinitions").add(keyArg);
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument ownerTypeArg = new InputArgument("ownerType", ownerType);
    getInputArguments().get("metafieldDefinitions").add(ownerTypeArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument constraintSubtypeArg = new InputArgument("constraintSubtype", constraintSubtype);
    getInputArguments().get("metafieldDefinitions").add(constraintSubtypeArg);
    InputArgument constraintStatusArg = new InputArgument("constraintStatus", constraintStatus);
    getInputArguments().get("metafieldDefinitions").add(constraintStatusArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetaobjectProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobject() {
     MetaobjectProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());
     getFields().put("metaobject", projection);
     return projection;
  }

  public MetaobjectProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobject(String id) {
    MetaobjectProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());    
    getFields().put("metaobject", projection);
    getInputArguments().computeIfAbsent("metaobject", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("metaobject").add(idArg);
    return projection;
  }

  public MetaobjectProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobjectByHandle() {
     MetaobjectProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());
     getFields().put("metaobjectByHandle", projection);
     return projection;
  }

  public MetaobjectProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobjectByHandle(
      MetaobjectHandleInput handle) {
    MetaobjectProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectProjection<>(this, getRoot());    
    getFields().put("metaobjectByHandle", projection);
    getInputArguments().computeIfAbsent("metaobjectByHandle", k -> new ArrayList<>());                      
    InputArgument handleArg = new InputArgument("handle", handle);
    getInputArguments().get("metaobjectByHandle").add(handleArg);
    return projection;
  }

  public MetaobjectDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobjectDefinition(
      ) {
     MetaobjectDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());
     getFields().put("metaobjectDefinition", projection);
     return projection;
  }

  public MetaobjectDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobjectDefinition(
      String id) {
    MetaobjectDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());    
    getFields().put("metaobjectDefinition", projection);
    getInputArguments().computeIfAbsent("metaobjectDefinition", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("metaobjectDefinition").add(idArg);
    return projection;
  }

  public MetaobjectDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobjectDefinitionByType(
      ) {
     MetaobjectDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());
     getFields().put("metaobjectDefinitionByType", projection);
     return projection;
  }

  public MetaobjectDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobjectDefinitionByType(
      String type) {
    MetaobjectDefinitionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionProjection<>(this, getRoot());    
    getFields().put("metaobjectDefinitionByType", projection);
    getInputArguments().computeIfAbsent("metaobjectDefinitionByType", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type);
    getInputArguments().get("metaobjectDefinitionByType").add(typeArg);
    return projection;
  }

  public MetaobjectDefinitionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobjectDefinitions(
      ) {
     MetaobjectDefinitionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metaobjectDefinitions", projection);
     return projection;
  }

  public MetaobjectDefinitionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobjectDefinitions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MetaobjectDefinitionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("metaobjectDefinitions", projection);
    getInputArguments().computeIfAbsent("metaobjectDefinitions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metaobjectDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metaobjectDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metaobjectDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metaobjectDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metaobjectDefinitions").add(reverseArg);
    return projection;
  }

  public MetaobjectConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobjects() {
     MetaobjectConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectConnectionProjection<>(this, getRoot());
     getFields().put("metaobjects", projection);
     return projection;
  }

  public MetaobjectConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> metaobjects(
      String type, String sortKey, Integer first, String after, Integer last, String before,
      Boolean reverse, String query) {
    MetaobjectConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectConnectionProjection<>(this, getRoot());    
    getFields().put("metaobjects", projection);
    getInputArguments().computeIfAbsent("metaobjects", k -> new ArrayList<>());                      
    InputArgument typeArg = new InputArgument("type", type);
    getInputArguments().get("metaobjects").add(typeArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metaobjects").add(sortKeyArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metaobjects").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metaobjects").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metaobjects").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metaobjects").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metaobjects").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metaobjects").add(queryArg);
    return projection;
  }

  public MobilePlatformApplicationProjection<QueryProjection<PARENT, ROOT>, ROOT> mobilePlatformApplication(
      ) {
     MobilePlatformApplicationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MobilePlatformApplicationProjection<>(this, getRoot());
     getFields().put("mobilePlatformApplication", projection);
     return projection;
  }

  public MobilePlatformApplicationProjection<QueryProjection<PARENT, ROOT>, ROOT> mobilePlatformApplication(
      String id) {
    MobilePlatformApplicationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MobilePlatformApplicationProjection<>(this, getRoot());    
    getFields().put("mobilePlatformApplication", projection);
    getInputArguments().computeIfAbsent("mobilePlatformApplication", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("mobilePlatformApplication").add(idArg);
    return projection;
  }

  public MobilePlatformApplicationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> mobilePlatformApplications(
      ) {
     MobilePlatformApplicationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MobilePlatformApplicationConnectionProjection<>(this, getRoot());
     getFields().put("mobilePlatformApplications", projection);
     return projection;
  }

  public MobilePlatformApplicationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> mobilePlatformApplications(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MobilePlatformApplicationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MobilePlatformApplicationConnectionProjection<>(this, getRoot());    
    getFields().put("mobilePlatformApplications", projection);
    getInputArguments().computeIfAbsent("mobilePlatformApplications", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("mobilePlatformApplications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("mobilePlatformApplications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("mobilePlatformApplications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("mobilePlatformApplications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("mobilePlatformApplications").add(reverseArg);
    return projection;
  }

  public NodeProjection<QueryProjection<PARENT, ROOT>, ROOT> node() {
     NodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new NodeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public NodeProjection<QueryProjection<PARENT, ROOT>, ROOT> node(String id) {
    NodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new NodeProjection<>(this, getRoot());    
    getFields().put("node", projection);
    getInputArguments().computeIfAbsent("node", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("node").add(idArg);
    return projection;
  }

  public NodeProjection<QueryProjection<PARENT, ROOT>, ROOT> nodes() {
     NodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new NodeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public NodeProjection<QueryProjection<PARENT, ROOT>, ROOT> nodes(List<String> ids) {
    NodeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new NodeProjection<>(this, getRoot());    
    getFields().put("nodes", projection);
    getInputArguments().computeIfAbsent("nodes", k -> new ArrayList<>());                      
    InputArgument idsArg = new InputArgument("ids", ids);
    getInputArguments().get("nodes").add(idsArg);
    return projection;
  }

  public OnlineStoreProjection<QueryProjection<PARENT, ROOT>, ROOT> onlineStore() {
     OnlineStoreProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreProjection<>(this, getRoot());
     getFields().put("onlineStore", projection);
     return projection;
  }

  public OrderProjection<QueryProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public OrderProjection<QueryProjection<PARENT, ROOT>, ROOT> order(String id) {
    OrderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());    
    getFields().put("order", projection);
    getInputArguments().computeIfAbsent("order", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("order").add(idArg);
    return projection;
  }

  public OrderProjection<QueryProjection<PARENT, ROOT>, ROOT> orderByIdentifier() {
     OrderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("orderByIdentifier", projection);
     return projection;
  }

  public OrderProjection<QueryProjection<PARENT, ROOT>, ROOT> orderByIdentifier(
      OrderIdentifierInput identifier) {
    OrderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());    
    getFields().put("orderByIdentifier", projection);
    getInputArguments().computeIfAbsent("orderByIdentifier", k -> new ArrayList<>());                      
    InputArgument identifierArg = new InputArgument("identifier", identifier);
    getInputArguments().get("orderByIdentifier").add(identifierArg);
    return projection;
  }

  public OrderPaymentStatusProjection<QueryProjection<PARENT, ROOT>, ROOT> orderPaymentStatus() {
     OrderPaymentStatusProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OrderPaymentStatusProjection<>(this, getRoot());
     getFields().put("orderPaymentStatus", projection);
     return projection;
  }

  public OrderPaymentStatusProjection<QueryProjection<PARENT, ROOT>, ROOT> orderPaymentStatus(
      String paymentReferenceId, String orderId) {
    OrderPaymentStatusProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OrderPaymentStatusProjection<>(this, getRoot());    
    getFields().put("orderPaymentStatus", projection);
    getInputArguments().computeIfAbsent("orderPaymentStatus", k -> new ArrayList<>());                      
    InputArgument paymentReferenceIdArg = new InputArgument("paymentReferenceId", paymentReferenceId);
    getInputArguments().get("orderPaymentStatus").add(paymentReferenceIdArg);
    InputArgument orderIdArg = new InputArgument("orderId", orderId);
    getInputArguments().get("orderPaymentStatus").add(orderIdArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> orderSavedSearches() {
     SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("orderSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> orderSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("orderSavedSearches", projection);
    getInputArguments().computeIfAbsent("orderSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orderSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("orderSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("orderSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("orderSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("orderSavedSearches").add(reverseArg);
    return projection;
  }

  public OrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> orders() {
     OrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> orders(Integer first,
      String after, Integer last, String before, Boolean reverse, OrderSortKeys sortKey,
      String query, String savedSearchId) {
    OrderConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("orders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("orders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("orders").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("orders").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> ordersCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("ordersCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> ordersCount(String query,
      String savedSearchId, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("ordersCount", projection);
    getInputArguments().computeIfAbsent("ordersCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("ordersCount").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("ordersCount").add(savedSearchIdArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("ordersCount").add(limitArg);
    return projection;
  }

  public PageProjection<QueryProjection<PARENT, ROOT>, ROOT> page() {
     PageProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PageProjection<>(this, getRoot());
     getFields().put("page", projection);
     return projection;
  }

  public PageProjection<QueryProjection<PARENT, ROOT>, ROOT> page(String id) {
    PageProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PageProjection<>(this, getRoot());    
    getFields().put("page", projection);
    getInputArguments().computeIfAbsent("page", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("page").add(idArg);
    return projection;
  }

  public PageConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> pages() {
     PageConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PageConnectionProjection<>(this, getRoot());
     getFields().put("pages", projection);
     return projection;
  }

  public PageConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> pages(Integer first,
      String after, Integer last, String before, Boolean reverse, PageSortKeys sortKey,
      String query, String savedSearchId) {
    PageConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PageConnectionProjection<>(this, getRoot());    
    getFields().put("pages", projection);
    getInputArguments().computeIfAbsent("pages", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("pages").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("pages").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("pages").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("pages").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("pages").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("pages").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("pages").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("pages").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> pagesCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("pagesCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> pagesCount(Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("pagesCount", projection);
    getInputArguments().computeIfAbsent("pagesCount", k -> new ArrayList<>());                      
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("pagesCount").add(limitArg);
    return projection;
  }

  public PaymentCustomizationProjection<QueryProjection<PARENT, ROOT>, ROOT> paymentCustomization(
      ) {
     PaymentCustomizationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationProjection<>(this, getRoot());
     getFields().put("paymentCustomization", projection);
     return projection;
  }

  public PaymentCustomizationProjection<QueryProjection<PARENT, ROOT>, ROOT> paymentCustomization(
      String id) {
    PaymentCustomizationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationProjection<>(this, getRoot());    
    getFields().put("paymentCustomization", projection);
    getInputArguments().computeIfAbsent("paymentCustomization", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("paymentCustomization").add(idArg);
    return projection;
  }

  public PaymentCustomizationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> paymentCustomizations(
      ) {
     PaymentCustomizationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationConnectionProjection<>(this, getRoot());
     getFields().put("paymentCustomizations", projection);
     return projection;
  }

  public PaymentCustomizationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> paymentCustomizations(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    PaymentCustomizationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationConnectionProjection<>(this, getRoot());    
    getFields().put("paymentCustomizations", projection);
    getInputArguments().computeIfAbsent("paymentCustomizations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("paymentCustomizations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("paymentCustomizations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("paymentCustomizations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("paymentCustomizations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("paymentCustomizations").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("paymentCustomizations").add(queryArg);
    return projection;
  }

  public PaymentTermsTemplateProjection<QueryProjection<PARENT, ROOT>, ROOT> paymentTermsTemplates(
      ) {
     PaymentTermsTemplateProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsTemplateProjection<>(this, getRoot());
     getFields().put("paymentTermsTemplates", projection);
     return projection;
  }

  public PaymentTermsTemplateProjection<QueryProjection<PARENT, ROOT>, ROOT> paymentTermsTemplates(
      PaymentTermsType paymentTermsType) {
    PaymentTermsTemplateProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsTemplateProjection<>(this, getRoot());    
    getFields().put("paymentTermsTemplates", projection);
    getInputArguments().computeIfAbsent("paymentTermsTemplates", k -> new ArrayList<>());                      
    InputArgument paymentTermsTypeArg = new InputArgument("paymentTermsType", paymentTermsType);
    getInputArguments().get("paymentTermsTemplates").add(paymentTermsTypeArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> pendingOrdersCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("pendingOrdersCount", projection);
     return projection;
  }

  public PointOfSaleDeviceProjection<QueryProjection<PARENT, ROOT>, ROOT> pointOfSaleDevice() {
     PointOfSaleDeviceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDeviceProjection<>(this, getRoot());
     getFields().put("pointOfSaleDevice", projection);
     return projection;
  }

  public PointOfSaleDeviceProjection<QueryProjection<PARENT, ROOT>, ROOT> pointOfSaleDevice(
      String id) {
    PointOfSaleDeviceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDeviceProjection<>(this, getRoot());    
    getFields().put("pointOfSaleDevice", projection);
    getInputArguments().computeIfAbsent("pointOfSaleDevice", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("pointOfSaleDevice").add(idArg);
    return projection;
  }

  public PriceListProjection<QueryProjection<PARENT, ROOT>, ROOT> priceList() {
     PriceListProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());
     getFields().put("priceList", projection);
     return projection;
  }

  public PriceListProjection<QueryProjection<PARENT, ROOT>, ROOT> priceList(String id) {
    PriceListProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PriceListProjection<>(this, getRoot());    
    getFields().put("priceList", projection);
    getInputArguments().computeIfAbsent("priceList", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("priceList").add(idArg);
    return projection;
  }

  public PriceListConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> priceLists() {
     PriceListConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PriceListConnectionProjection<>(this, getRoot());
     getFields().put("priceLists", projection);
     return projection;
  }

  public PriceListConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> priceLists(
      Integer first, String after, Integer last, String before, Boolean reverse,
      PriceListSortKeys sortKey) {
    PriceListConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PriceListConnectionProjection<>(this, getRoot());    
    getFields().put("priceLists", projection);
    getInputArguments().computeIfAbsent("priceLists", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("priceLists").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("priceLists").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("priceLists").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("priceLists").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("priceLists").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("priceLists").add(sortKeyArg);
    return projection;
  }

  public MarketProjection<QueryProjection<PARENT, ROOT>, ROOT> primaryMarket() {
     MarketProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("primaryMarket", projection);
     return projection;
  }

  public PrivacySettingsProjection<QueryProjection<PARENT, ROOT>, ROOT> privacySettings() {
     PrivacySettingsProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PrivacySettingsProjection<>(this, getRoot());
     getFields().put("privacySettings", projection);
     return projection;
  }

  public ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> product(String id) {
    ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());    
    getFields().put("product", projection);
    getInputArguments().computeIfAbsent("product", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("product").add(idArg);
    return projection;
  }

  public ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> productByHandle() {
     ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("productByHandle", projection);
     return projection;
  }

  public ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> productByHandle(String handle) {
    ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());    
    getFields().put("productByHandle", projection);
    getInputArguments().computeIfAbsent("productByHandle", k -> new ArrayList<>());                      
    InputArgument handleArg = new InputArgument("handle", handle);
    getInputArguments().get("productByHandle").add(handleArg);
    return projection;
  }

  public ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> productByIdentifier() {
     ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("productByIdentifier", projection);
     return projection;
  }

  public ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> productByIdentifier(
      ProductIdentifierInput identifier) {
    ProductProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());    
    getFields().put("productByIdentifier", projection);
    getInputArguments().computeIfAbsent("productByIdentifier", k -> new ArrayList<>());                      
    InputArgument identifierArg = new InputArgument("identifier", identifier);
    getInputArguments().get("productByIdentifier").add(identifierArg);
    return projection;
  }

  public ProductDuplicateJobProjection<QueryProjection<PARENT, ROOT>, ROOT> productDuplicateJob() {
     ProductDuplicateJobProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductDuplicateJobProjection<>(this, getRoot());
     getFields().put("productDuplicateJob", projection);
     return projection;
  }

  public ProductDuplicateJobProjection<QueryProjection<PARENT, ROOT>, ROOT> productDuplicateJob(
      String id) {
    ProductDuplicateJobProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductDuplicateJobProjection<>(this, getRoot());    
    getFields().put("productDuplicateJob", projection);
    getInputArguments().computeIfAbsent("productDuplicateJob", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("productDuplicateJob").add(idArg);
    return projection;
  }

  public ProductFeedProjection<QueryProjection<PARENT, ROOT>, ROOT> productFeed() {
     ProductFeedProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedProjection<>(this, getRoot());
     getFields().put("productFeed", projection);
     return projection;
  }

  public ProductFeedProjection<QueryProjection<PARENT, ROOT>, ROOT> productFeed(String id) {
    ProductFeedProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedProjection<>(this, getRoot());    
    getFields().put("productFeed", projection);
    getInputArguments().computeIfAbsent("productFeed", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("productFeed").add(idArg);
    return projection;
  }

  public ProductFeedConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productFeeds() {
     ProductFeedConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedConnectionProjection<>(this, getRoot());
     getFields().put("productFeeds", projection);
     return projection;
  }

  public ProductFeedConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productFeeds(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ProductFeedConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedConnectionProjection<>(this, getRoot());    
    getFields().put("productFeeds", projection);
    getInputArguments().computeIfAbsent("productFeeds", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productFeeds").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productFeeds").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productFeeds").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productFeeds").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productFeeds").add(reverseArg);
    return projection;
  }

  public ProductOperationProjection<QueryProjection<PARENT, ROOT>, ROOT> productOperation() {
     ProductOperationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductOperationProjection<>(this, getRoot());
     getFields().put("productOperation", projection);
     return projection;
  }

  public ProductOperationProjection<QueryProjection<PARENT, ROOT>, ROOT> productOperation(
      String id) {
    ProductOperationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductOperationProjection<>(this, getRoot());    
    getFields().put("productOperation", projection);
    getInputArguments().computeIfAbsent("productOperation", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("productOperation").add(idArg);
    return projection;
  }

  public ProductResourceFeedbackProjection<QueryProjection<PARENT, ROOT>, ROOT> productResourceFeedback(
      ) {
     ProductResourceFeedbackProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductResourceFeedbackProjection<>(this, getRoot());
     getFields().put("productResourceFeedback", projection);
     return projection;
  }

  public ProductResourceFeedbackProjection<QueryProjection<PARENT, ROOT>, ROOT> productResourceFeedback(
      String id) {
    ProductResourceFeedbackProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductResourceFeedbackProjection<>(this, getRoot());    
    getFields().put("productResourceFeedback", projection);
    getInputArguments().computeIfAbsent("productResourceFeedback", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("productResourceFeedback").add(idArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("productSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("productSavedSearches", projection);
    getInputArguments().computeIfAbsent("productSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productSavedSearches").add(reverseArg);
    return projection;
  }

  public StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productTags() {
     StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());
     getFields().put("productTags", projection);
     return projection;
  }

  public StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productTags(Integer first,
      String after, Integer last, String before, Boolean reverse) {
    StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());    
    getFields().put("productTags", projection);
    getInputArguments().computeIfAbsent("productTags", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productTags").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productTags").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productTags").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productTags").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productTags").add(reverseArg);
    return projection;
  }

  public StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productTypes() {
     StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());
     getFields().put("productTypes", projection);
     return projection;
  }

  public StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productTypes(Integer first,
      String after, Integer last, String before, Boolean reverse) {
    StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());    
    getFields().put("productTypes", projection);
    getInputArguments().computeIfAbsent("productTypes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productTypes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productTypes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productTypes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productTypes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productTypes").add(reverseArg);
    return projection;
  }

  public ProductVariantProjection<QueryProjection<PARENT, ROOT>, ROOT> productVariant() {
     ProductVariantProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("productVariant", projection);
     return projection;
  }

  public ProductVariantProjection<QueryProjection<PARENT, ROOT>, ROOT> productVariant(String id) {
    ProductVariantProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());    
    getFields().put("productVariant", projection);
    getInputArguments().computeIfAbsent("productVariant", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("productVariant").add(idArg);
    return projection;
  }

  public ProductVariantProjection<QueryProjection<PARENT, ROOT>, ROOT> productVariantByIdentifier(
      ) {
     ProductVariantProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("productVariantByIdentifier", projection);
     return projection;
  }

  public ProductVariantProjection<QueryProjection<PARENT, ROOT>, ROOT> productVariantByIdentifier(
      ProductVariantIdentifierInput identifier) {
    ProductVariantProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());    
    getFields().put("productVariantByIdentifier", projection);
    getInputArguments().computeIfAbsent("productVariantByIdentifier", k -> new ArrayList<>());                      
    InputArgument identifierArg = new InputArgument("identifier", identifier);
    getInputArguments().get("productVariantByIdentifier").add(identifierArg);
    return projection;
  }

  public ProductVariantConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productVariants() {
     ProductVariantConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());
     getFields().put("productVariants", projection);
     return projection;
  }

  public ProductVariantConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productVariants(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ProductVariantSortKeys sortKey, String query, String savedSearchId) {
    ProductVariantConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantConnectionProjection<>(this, getRoot());    
    getFields().put("productVariants", projection);
    getInputArguments().computeIfAbsent("productVariants", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productVariants").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productVariants").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productVariants").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productVariants").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productVariants").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("productVariants").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("productVariants").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("productVariants").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> productVariantsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("productVariantsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> productVariantsCount(String query,
      Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("productVariantsCount", projection);
    getInputArguments().computeIfAbsent("productVariantsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("productVariantsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("productVariantsCount").add(limitArg);
    return projection;
  }

  public StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productVendors() {
     StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());
     getFields().put("productVendors", projection);
     return projection;
  }

  public StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> productVendors(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    StringConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StringConnectionProjection<>(this, getRoot());    
    getFields().put("productVendors", projection);
    getInputArguments().computeIfAbsent("productVendors", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("productVendors").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("productVendors").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("productVendors").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("productVendors").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("productVendors").add(reverseArg);
    return projection;
  }

  public ProductConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> products() {
     ProductConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());
     getFields().put("products", projection);
     return projection;
  }

  public ProductConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> products(Integer first,
      String after, Integer last, String before, Boolean reverse, ProductSortKeys sortKey,
      String query, String savedSearchId) {
    ProductConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ProductConnectionProjection<>(this, getRoot());    
    getFields().put("products", projection);
    getInputArguments().computeIfAbsent("products", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("products").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("products").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("products").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("products").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("products").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("products").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("products").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("products").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> productsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("productsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> productsCount(String query,
      String savedSearchId, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("productsCount", projection);
    getInputArguments().computeIfAbsent("productsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("productsCount").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("productsCount").add(savedSearchIdArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("productsCount").add(limitArg);
    return projection;
  }

  public ApiVersionProjection<QueryProjection<PARENT, ROOT>, ROOT> publicApiVersions() {
     ApiVersionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ApiVersionProjection<>(this, getRoot());
     getFields().put("publicApiVersions", projection);
     return projection;
  }

  public PublicationProjection<QueryProjection<PARENT, ROOT>, ROOT> publication() {
     PublicationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public PublicationProjection<QueryProjection<PARENT, ROOT>, ROOT> publication(String id) {
    PublicationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());    
    getFields().put("publication", projection);
    getInputArguments().computeIfAbsent("publication", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("publication").add(idArg);
    return projection;
  }

  public PublicationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> publications() {
     PublicationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());
     getFields().put("publications", projection);
     return projection;
  }

  public PublicationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> publications(
      CatalogType catalogType, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    PublicationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new PublicationConnectionProjection<>(this, getRoot());    
    getFields().put("publications", projection);
    getInputArguments().computeIfAbsent("publications", k -> new ArrayList<>());                      
    InputArgument catalogTypeArg = new InputArgument("catalogType", catalogType);
    getInputArguments().get("publications").add(catalogTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("publications").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("publications").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("publications").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("publications").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("publications").add(reverseArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> publicationsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("publicationsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> publicationsCount(
      CatalogType catalogType, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("publicationsCount", projection);
    getInputArguments().computeIfAbsent("publicationsCount", k -> new ArrayList<>());                      
    InputArgument catalogTypeArg = new InputArgument("catalogType", catalogType);
    getInputArguments().get("publicationsCount").add(catalogTypeArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("publicationsCount").add(limitArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> publishedProductsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("publishedProductsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> publishedProductsCount(
      String publicationId, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("publishedProductsCount", projection);
    getInputArguments().computeIfAbsent("publishedProductsCount", k -> new ArrayList<>());                      
    InputArgument publicationIdArg = new InputArgument("publicationId", publicationId);
    getInputArguments().get("publishedProductsCount").add(publicationIdArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("publishedProductsCount").add(limitArg);
    return projection;
  }

  public RefundProjection<QueryProjection<PARENT, ROOT>, ROOT> refund() {
     RefundProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new RefundProjection<>(this, getRoot());
     getFields().put("refund", projection);
     return projection;
  }

  public RefundProjection<QueryProjection<PARENT, ROOT>, ROOT> refund(String id) {
    RefundProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new RefundProjection<>(this, getRoot());    
    getFields().put("refund", projection);
    getInputArguments().computeIfAbsent("refund", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("refund").add(idArg);
    return projection;
  }

  public ReturnProjection<QueryProjection<PARENT, ROOT>, ROOT> _return() {
     ReturnProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ReturnProjection<>(this, getRoot());
     getFields().put("return", projection);
     return projection;
  }

  public ReturnProjection<QueryProjection<PARENT, ROOT>, ROOT> _return(String id) {
    ReturnProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ReturnProjection<>(this, getRoot());    
    getFields().put("return", projection);
    getInputArguments().computeIfAbsent("return", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("return").add(idArg);
    return projection;
  }

  public CalculatedReturnProjection<QueryProjection<PARENT, ROOT>, ROOT> returnCalculate() {
     CalculatedReturnProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CalculatedReturnProjection<>(this, getRoot());
     getFields().put("returnCalculate", projection);
     return projection;
  }

  public CalculatedReturnProjection<QueryProjection<PARENT, ROOT>, ROOT> returnCalculate(
      CalculateReturnInput input) {
    CalculatedReturnProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CalculatedReturnProjection<>(this, getRoot());    
    getFields().put("returnCalculate", projection);
    getInputArguments().computeIfAbsent("returnCalculate", k -> new ArrayList<>());                      
    InputArgument inputArg = new InputArgument("input", input);
    getInputArguments().get("returnCalculate").add(inputArg);
    return projection;
  }

  public ReturnableFulfillmentProjection<QueryProjection<PARENT, ROOT>, ROOT> returnableFulfillment(
      ) {
     ReturnableFulfillmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentProjection<>(this, getRoot());
     getFields().put("returnableFulfillment", projection);
     return projection;
  }

  public ReturnableFulfillmentProjection<QueryProjection<PARENT, ROOT>, ROOT> returnableFulfillment(
      String id) {
    ReturnableFulfillmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentProjection<>(this, getRoot());    
    getFields().put("returnableFulfillment", projection);
    getInputArguments().computeIfAbsent("returnableFulfillment", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("returnableFulfillment").add(idArg);
    return projection;
  }

  public ReturnableFulfillmentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> returnableFulfillments(
      ) {
     ReturnableFulfillmentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentConnectionProjection<>(this, getRoot());
     getFields().put("returnableFulfillments", projection);
     return projection;
  }

  public ReturnableFulfillmentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> returnableFulfillments(
      String orderId, Integer first, String after, Integer last, String before, Boolean reverse) {
    ReturnableFulfillmentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentConnectionProjection<>(this, getRoot());    
    getFields().put("returnableFulfillments", projection);
    getInputArguments().computeIfAbsent("returnableFulfillments", k -> new ArrayList<>());                      
    InputArgument orderIdArg = new InputArgument("orderId", orderId);
    getInputArguments().get("returnableFulfillments").add(orderIdArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("returnableFulfillments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("returnableFulfillments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("returnableFulfillments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("returnableFulfillments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("returnableFulfillments").add(reverseArg);
    return projection;
  }

  public ReverseDeliveryProjection<QueryProjection<PARENT, ROOT>, ROOT> reverseDelivery() {
     ReverseDeliveryProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryProjection<>(this, getRoot());
     getFields().put("reverseDelivery", projection);
     return projection;
  }

  public ReverseDeliveryProjection<QueryProjection<PARENT, ROOT>, ROOT> reverseDelivery(String id) {
    ReverseDeliveryProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryProjection<>(this, getRoot());    
    getFields().put("reverseDelivery", projection);
    getInputArguments().computeIfAbsent("reverseDelivery", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("reverseDelivery").add(idArg);
    return projection;
  }

  public ReverseFulfillmentOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrder(
      ) {
     ReverseFulfillmentOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderProjection<>(this, getRoot());
     getFields().put("reverseFulfillmentOrder", projection);
     return projection;
  }

  public ReverseFulfillmentOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrder(
      String id) {
    ReverseFulfillmentOrderProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderProjection<>(this, getRoot());    
    getFields().put("reverseFulfillmentOrder", projection);
    getInputArguments().computeIfAbsent("reverseFulfillmentOrder", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("reverseFulfillmentOrder").add(idArg);
    return projection;
  }

  public ScriptTagProjection<QueryProjection<PARENT, ROOT>, ROOT> scriptTag() {
     ScriptTagProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagProjection<>(this, getRoot());
     getFields().put("scriptTag", projection);
     return projection;
  }

  public ScriptTagProjection<QueryProjection<PARENT, ROOT>, ROOT> scriptTag(String id) {
    ScriptTagProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagProjection<>(this, getRoot());    
    getFields().put("scriptTag", projection);
    getInputArguments().computeIfAbsent("scriptTag", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("scriptTag").add(idArg);
    return projection;
  }

  public ScriptTagConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> scriptTags() {
     ScriptTagConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagConnectionProjection<>(this, getRoot());
     getFields().put("scriptTags", projection);
     return projection;
  }

  public ScriptTagConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> scriptTags(
      Integer first, String after, Integer last, String before, Boolean reverse, String query,
      String src) {
    ScriptTagConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagConnectionProjection<>(this, getRoot());    
    getFields().put("scriptTags", projection);
    getInputArguments().computeIfAbsent("scriptTags", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("scriptTags").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("scriptTags").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("scriptTags").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("scriptTags").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("scriptTags").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("scriptTags").add(queryArg);
    InputArgument srcArg = new InputArgument("src", src);
    getInputArguments().get("scriptTags").add(srcArg);
    return projection;
  }

  public SegmentProjection<QueryProjection<PARENT, ROOT>, ROOT> segment() {
     SegmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentProjection<>(this, getRoot());
     getFields().put("segment", projection);
     return projection;
  }

  public SegmentProjection<QueryProjection<PARENT, ROOT>, ROOT> segment(String id) {
    SegmentProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentProjection<>(this, getRoot());    
    getFields().put("segment", projection);
    getInputArguments().computeIfAbsent("segment", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("segment").add(idArg);
    return projection;
  }

  public SegmentFilterConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> segmentFilterSuggestions(
      ) {
     SegmentFilterConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentFilterConnectionProjection<>(this, getRoot());
     getFields().put("segmentFilterSuggestions", projection);
     return projection;
  }

  public SegmentFilterConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> segmentFilterSuggestions(
      String search, int first, String after) {
    SegmentFilterConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentFilterConnectionProjection<>(this, getRoot());    
    getFields().put("segmentFilterSuggestions", projection);
    getInputArguments().computeIfAbsent("segmentFilterSuggestions", k -> new ArrayList<>());                      
    InputArgument searchArg = new InputArgument("search", search);
    getInputArguments().get("segmentFilterSuggestions").add(searchArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("segmentFilterSuggestions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("segmentFilterSuggestions").add(afterArg);
    return projection;
  }

  public SegmentFilterConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> segmentFilters() {
     SegmentFilterConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentFilterConnectionProjection<>(this, getRoot());
     getFields().put("segmentFilters", projection);
     return projection;
  }

  public SegmentFilterConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> segmentFilters(
      Integer first, String after, Integer last, String before) {
    SegmentFilterConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentFilterConnectionProjection<>(this, getRoot());    
    getFields().put("segmentFilters", projection);
    getInputArguments().computeIfAbsent("segmentFilters", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("segmentFilters").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("segmentFilters").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("segmentFilters").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("segmentFilters").add(beforeArg);
    return projection;
  }

  public SegmentMigrationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> segmentMigrations(
      ) {
     SegmentMigrationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentMigrationConnectionProjection<>(this, getRoot());
     getFields().put("segmentMigrations", projection);
     return projection;
  }

  public SegmentMigrationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> segmentMigrations(
      String savedSearchId, Integer first, String after, Integer last, String before) {
    SegmentMigrationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentMigrationConnectionProjection<>(this, getRoot());    
    getFields().put("segmentMigrations", projection);
    getInputArguments().computeIfAbsent("segmentMigrations", k -> new ArrayList<>());                      
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("segmentMigrations").add(savedSearchIdArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("segmentMigrations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("segmentMigrations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("segmentMigrations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("segmentMigrations").add(beforeArg);
    return projection;
  }

  public SegmentValueConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> segmentValueSuggestions(
      ) {
     SegmentValueConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentValueConnectionProjection<>(this, getRoot());
     getFields().put("segmentValueSuggestions", projection);
     return projection;
  }

  public SegmentValueConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> segmentValueSuggestions(
      String search, String filterQueryName, String functionParameterQueryName, Integer first,
      String after, Integer last, String before) {
    SegmentValueConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentValueConnectionProjection<>(this, getRoot());    
    getFields().put("segmentValueSuggestions", projection);
    getInputArguments().computeIfAbsent("segmentValueSuggestions", k -> new ArrayList<>());                      
    InputArgument searchArg = new InputArgument("search", search);
    getInputArguments().get("segmentValueSuggestions").add(searchArg);
    InputArgument filterQueryNameArg = new InputArgument("filterQueryName", filterQueryName);
    getInputArguments().get("segmentValueSuggestions").add(filterQueryNameArg);
    InputArgument functionParameterQueryNameArg = new InputArgument("functionParameterQueryName", functionParameterQueryName);
    getInputArguments().get("segmentValueSuggestions").add(functionParameterQueryNameArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("segmentValueSuggestions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("segmentValueSuggestions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("segmentValueSuggestions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("segmentValueSuggestions").add(beforeArg);
    return projection;
  }

  public SegmentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> segments() {
     SegmentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentConnectionProjection<>(this, getRoot());
     getFields().put("segments", projection);
     return projection;
  }

  public SegmentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> segments(Integer first,
      String after, Integer last, String before, Boolean reverse, SegmentSortKeys sortKey,
      String query) {
    SegmentConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SegmentConnectionProjection<>(this, getRoot());    
    getFields().put("segments", projection);
    getInputArguments().computeIfAbsent("segments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("segments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("segments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("segments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("segments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("segments").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("segments").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("segments").add(queryArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> segmentsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("segmentsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> segmentsCount(Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("segmentsCount", projection);
    getInputArguments().computeIfAbsent("segmentsCount", k -> new ArrayList<>());                      
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("segmentsCount").add(limitArg);
    return projection;
  }

  public SellingPlanGroupProjection<QueryProjection<PARENT, ROOT>, ROOT> sellingPlanGroup() {
     SellingPlanGroupProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupProjection<>(this, getRoot());
     getFields().put("sellingPlanGroup", projection);
     return projection;
  }

  public SellingPlanGroupProjection<QueryProjection<PARENT, ROOT>, ROOT> sellingPlanGroup(
      String id) {
    SellingPlanGroupProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupProjection<>(this, getRoot());    
    getFields().put("sellingPlanGroup", projection);
    getInputArguments().computeIfAbsent("sellingPlanGroup", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("sellingPlanGroup").add(idArg);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      ) {
     SellingPlanGroupConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlanGroups", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse,
      SellingPlanGroupSortKeys sortKey, String query) {
    SellingPlanGroupConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());    
    getFields().put("sellingPlanGroups", projection);
    getInputArguments().computeIfAbsent("sellingPlanGroups", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sellingPlanGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sellingPlanGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sellingPlanGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sellingPlanGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sellingPlanGroups").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("sellingPlanGroups").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("sellingPlanGroups").add(queryArg);
    return projection;
  }

  public ServerPixelProjection<QueryProjection<PARENT, ROOT>, ROOT> serverPixel() {
     ServerPixelProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ServerPixelProjection<>(this, getRoot());
     getFields().put("serverPixel", projection);
     return projection;
  }

  public ShopProjection<QueryProjection<PARENT, ROOT>, ROOT> shop() {
     ShopProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopProjection<>(this, getRoot());
     getFields().put("shop", projection);
     return projection;
  }

  public ShopBillingPreferencesProjection<QueryProjection<PARENT, ROOT>, ROOT> shopBillingPreferences(
      ) {
     ShopBillingPreferencesProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopBillingPreferencesProjection<>(this, getRoot());
     getFields().put("shopBillingPreferences", projection);
     return projection;
  }

  public ShopLocaleProjection<QueryProjection<PARENT, ROOT>, ROOT> shopLocales() {
     ShopLocaleProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopLocaleProjection<>(this, getRoot());
     getFields().put("shopLocales", projection);
     return projection;
  }

  public ShopLocaleProjection<QueryProjection<PARENT, ROOT>, ROOT> shopLocales(Boolean published) {
    ShopLocaleProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopLocaleProjection<>(this, getRoot());    
    getFields().put("shopLocales", projection);
    getInputArguments().computeIfAbsent("shopLocales", k -> new ArrayList<>());                      
    InputArgument publishedArg = new InputArgument("published", published);
    getInputArguments().get("shopLocales").add(publishedArg);
    return projection;
  }

  public ShopPayPaymentRequestReceiptProjection<QueryProjection<PARENT, ROOT>, ROOT> shopPayPaymentRequestReceipt(
      ) {
     ShopPayPaymentRequestReceiptProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestReceiptProjection<>(this, getRoot());
     getFields().put("shopPayPaymentRequestReceipt", projection);
     return projection;
  }

  public ShopPayPaymentRequestReceiptProjection<QueryProjection<PARENT, ROOT>, ROOT> shopPayPaymentRequestReceipt(
      String token) {
    ShopPayPaymentRequestReceiptProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestReceiptProjection<>(this, getRoot());    
    getFields().put("shopPayPaymentRequestReceipt", projection);
    getInputArguments().computeIfAbsent("shopPayPaymentRequestReceipt", k -> new ArrayList<>());                      
    InputArgument tokenArg = new InputArgument("token", token);
    getInputArguments().get("shopPayPaymentRequestReceipt").add(tokenArg);
    return projection;
  }

  public ShopPayPaymentRequestReceiptConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> shopPayPaymentRequestReceipts(
      ) {
     ShopPayPaymentRequestReceiptConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestReceiptConnectionProjection<>(this, getRoot());
     getFields().put("shopPayPaymentRequestReceipts", projection);
     return projection;
  }

  public ShopPayPaymentRequestReceiptConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> shopPayPaymentRequestReceipts(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ShopPayPaymentRequestReceiptsSortKeys sortKey, String query) {
    ShopPayPaymentRequestReceiptConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestReceiptConnectionProjection<>(this, getRoot());    
    getFields().put("shopPayPaymentRequestReceipts", projection);
    getInputArguments().computeIfAbsent("shopPayPaymentRequestReceipts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("shopPayPaymentRequestReceipts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("shopPayPaymentRequestReceipts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("shopPayPaymentRequestReceipts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("shopPayPaymentRequestReceipts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("shopPayPaymentRequestReceipts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("shopPayPaymentRequestReceipts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("shopPayPaymentRequestReceipts").add(queryArg);
    return projection;
  }

  public ShopifyFunctionProjection<QueryProjection<PARENT, ROOT>, ROOT> shopifyFunction() {
     ShopifyFunctionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionProjection<>(this, getRoot());
     getFields().put("shopifyFunction", projection);
     return projection;
  }

  public ShopifyFunctionProjection<QueryProjection<PARENT, ROOT>, ROOT> shopifyFunction(String id) {
    ShopifyFunctionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionProjection<>(this, getRoot());    
    getFields().put("shopifyFunction", projection);
    getInputArguments().computeIfAbsent("shopifyFunction", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("shopifyFunction").add(idArg);
    return projection;
  }

  public ShopifyFunctionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> shopifyFunctions(
      ) {
     ShopifyFunctionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionConnectionProjection<>(this, getRoot());
     getFields().put("shopifyFunctions", projection);
     return projection;
  }

  public ShopifyFunctionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> shopifyFunctions(
      String apiType, Boolean useCreationUi, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ShopifyFunctionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyFunctionConnectionProjection<>(this, getRoot());    
    getFields().put("shopifyFunctions", projection);
    getInputArguments().computeIfAbsent("shopifyFunctions", k -> new ArrayList<>());                      
    InputArgument apiTypeArg = new InputArgument("apiType", apiType);
    getInputArguments().get("shopifyFunctions").add(apiTypeArg);
    InputArgument useCreationUiArg = new InputArgument("useCreationUi", useCreationUi);
    getInputArguments().get("shopifyFunctions").add(useCreationUiArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("shopifyFunctions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("shopifyFunctions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("shopifyFunctions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("shopifyFunctions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("shopifyFunctions").add(reverseArg);
    return projection;
  }

  public ShopifyPaymentsAccountProjection<QueryProjection<PARENT, ROOT>, ROOT> shopifyPaymentsAccount(
      ) {
     ShopifyPaymentsAccountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsAccountProjection<>(this, getRoot());
     getFields().put("shopifyPaymentsAccount", projection);
     return projection;
  }

  public StaffMemberProjection<QueryProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public StaffMemberProjection<QueryProjection<PARENT, ROOT>, ROOT> staffMember(String id) {
    StaffMemberProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());    
    getFields().put("staffMember", projection);
    getInputArguments().computeIfAbsent("staffMember", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("staffMember").add(idArg);
    return projection;
  }

  public StaffMemberConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> staffMembers() {
     StaffMemberConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberConnectionProjection<>(this, getRoot());
     getFields().put("staffMembers", projection);
     return projection;
  }

  public StaffMemberConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> staffMembers(
      Integer first, String after, Integer last, String before, Boolean reverse,
      StaffMembersSortKeys sortKey, String query) {
    StaffMemberConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberConnectionProjection<>(this, getRoot());    
    getFields().put("staffMembers", projection);
    getInputArguments().computeIfAbsent("staffMembers", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("staffMembers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("staffMembers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("staffMembers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("staffMembers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("staffMembers").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("staffMembers").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("staffMembers").add(queryArg);
    return projection;
  }

  public StandardMetafieldDefinitionTemplateConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> standardMetafieldDefinitionTemplates(
      ) {
     StandardMetafieldDefinitionTemplateConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StandardMetafieldDefinitionTemplateConnectionProjection<>(this, getRoot());
     getFields().put("standardMetafieldDefinitionTemplates", projection);
     return projection;
  }

  public StandardMetafieldDefinitionTemplateConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> standardMetafieldDefinitionTemplates(
      MetafieldDefinitionConstraintSubtypeIdentifier constraintSubtype,
      MetafieldDefinitionConstraintStatus constraintStatus, Boolean excludeActivated, Integer first,
      String after, Integer last, String before, Boolean reverse) {
    StandardMetafieldDefinitionTemplateConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StandardMetafieldDefinitionTemplateConnectionProjection<>(this, getRoot());    
    getFields().put("standardMetafieldDefinitionTemplates", projection);
    getInputArguments().computeIfAbsent("standardMetafieldDefinitionTemplates", k -> new ArrayList<>());                      
    InputArgument constraintSubtypeArg = new InputArgument("constraintSubtype", constraintSubtype);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(constraintSubtypeArg);
    InputArgument constraintStatusArg = new InputArgument("constraintStatus", constraintStatus);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(constraintStatusArg);
    InputArgument excludeActivatedArg = new InputArgument("excludeActivated", excludeActivated);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(excludeActivatedArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("standardMetafieldDefinitionTemplates").add(reverseArg);
    return projection;
  }

  public StoreCreditAccountProjection<QueryProjection<PARENT, ROOT>, ROOT> storeCreditAccount() {
     StoreCreditAccountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountProjection<>(this, getRoot());
     getFields().put("storeCreditAccount", projection);
     return projection;
  }

  public StoreCreditAccountProjection<QueryProjection<PARENT, ROOT>, ROOT> storeCreditAccount(
      String id) {
    StoreCreditAccountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountProjection<>(this, getRoot());    
    getFields().put("storeCreditAccount", projection);
    getInputArguments().computeIfAbsent("storeCreditAccount", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("storeCreditAccount").add(idArg);
    return projection;
  }

  public SubscriptionBillingAttemptProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionBillingAttempt(
      ) {
     SubscriptionBillingAttemptProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptProjection<>(this, getRoot());
     getFields().put("subscriptionBillingAttempt", projection);
     return projection;
  }

  public SubscriptionBillingAttemptProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionBillingAttempt(
      String id) {
    SubscriptionBillingAttemptProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptProjection<>(this, getRoot());    
    getFields().put("subscriptionBillingAttempt", projection);
    getInputArguments().computeIfAbsent("subscriptionBillingAttempt", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("subscriptionBillingAttempt").add(idArg);
    return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionBillingAttempts(
      ) {
     SubscriptionBillingAttemptConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, getRoot());
     getFields().put("subscriptionBillingAttempts", projection);
     return projection;
  }

  public SubscriptionBillingAttemptConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionBillingAttempts(
      Integer first, String after, Integer last, String before, Boolean reverse,
      SubscriptionBillingAttemptsSortKeys sortKey, String query) {
    SubscriptionBillingAttemptConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptConnectionProjection<>(this, getRoot());    
    getFields().put("subscriptionBillingAttempts", projection);
    getInputArguments().computeIfAbsent("subscriptionBillingAttempts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("subscriptionBillingAttempts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("subscriptionBillingAttempts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("subscriptionBillingAttempts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("subscriptionBillingAttempts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("subscriptionBillingAttempts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("subscriptionBillingAttempts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("subscriptionBillingAttempts").add(queryArg);
    return projection;
  }

  public SubscriptionBillingCycleProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionBillingCycle(
      ) {
     SubscriptionBillingCycleProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleProjection<>(this, getRoot());
     getFields().put("subscriptionBillingCycle", projection);
     return projection;
  }

  public SubscriptionBillingCycleProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionBillingCycle(
      SubscriptionBillingCycleInput billingCycleInput) {
    SubscriptionBillingCycleProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleProjection<>(this, getRoot());    
    getFields().put("subscriptionBillingCycle", projection);
    getInputArguments().computeIfAbsent("subscriptionBillingCycle", k -> new ArrayList<>());                      
    InputArgument billingCycleInputArg = new InputArgument("billingCycleInput", billingCycleInput);
    getInputArguments().get("subscriptionBillingCycle").add(billingCycleInputArg);
    return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionBillingCycleBulkResults(
      ) {
     SubscriptionBillingCycleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());
     getFields().put("subscriptionBillingCycleBulkResults", projection);
     return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionBillingCycleBulkResults(
      String jobId, Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionBillingCycleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());    
    getFields().put("subscriptionBillingCycleBulkResults", projection);
    getInputArguments().computeIfAbsent("subscriptionBillingCycleBulkResults", k -> new ArrayList<>());                      
    InputArgument jobIdArg = new InputArgument("jobId", jobId);
    getInputArguments().get("subscriptionBillingCycleBulkResults").add(jobIdArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("subscriptionBillingCycleBulkResults").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("subscriptionBillingCycleBulkResults").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("subscriptionBillingCycleBulkResults").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("subscriptionBillingCycleBulkResults").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("subscriptionBillingCycleBulkResults").add(reverseArg);
    return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionBillingCycles(
      ) {
     SubscriptionBillingCycleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());
     getFields().put("subscriptionBillingCycles", projection);
     return projection;
  }

  public SubscriptionBillingCycleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionBillingCycles(
      String contractId, SubscriptionBillingCyclesDateRangeSelector billingCyclesDateRangeSelector,
      SubscriptionBillingCyclesIndexRangeSelector billingCyclesIndexRangeSelector, Integer first,
      String after, Integer last, String before, Boolean reverse,
      SubscriptionBillingCyclesSortKeys sortKey) {
    SubscriptionBillingCycleConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleConnectionProjection<>(this, getRoot());    
    getFields().put("subscriptionBillingCycles", projection);
    getInputArguments().computeIfAbsent("subscriptionBillingCycles", k -> new ArrayList<>());                      
    InputArgument contractIdArg = new InputArgument("contractId", contractId);
    getInputArguments().get("subscriptionBillingCycles").add(contractIdArg);
    InputArgument billingCyclesDateRangeSelectorArg = new InputArgument("billingCyclesDateRangeSelector", billingCyclesDateRangeSelector);
    getInputArguments().get("subscriptionBillingCycles").add(billingCyclesDateRangeSelectorArg);
    InputArgument billingCyclesIndexRangeSelectorArg = new InputArgument("billingCyclesIndexRangeSelector", billingCyclesIndexRangeSelector);
    getInputArguments().get("subscriptionBillingCycles").add(billingCyclesIndexRangeSelectorArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("subscriptionBillingCycles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("subscriptionBillingCycles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("subscriptionBillingCycles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("subscriptionBillingCycles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("subscriptionBillingCycles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("subscriptionBillingCycles").add(sortKeyArg);
    return projection;
  }

  public SubscriptionContractProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionContract(
      ) {
     SubscriptionContractProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());
     getFields().put("subscriptionContract", projection);
     return projection;
  }

  public SubscriptionContractProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionContract(
      String id) {
    SubscriptionContractProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractProjection<>(this, getRoot());    
    getFields().put("subscriptionContract", projection);
    getInputArguments().computeIfAbsent("subscriptionContract", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("subscriptionContract").add(idArg);
    return projection;
  }

  public SubscriptionContractConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      ) {
     SubscriptionContractConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());
     getFields().put("subscriptionContracts", projection);
     return projection;
  }

  public SubscriptionContractConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      Integer first, String after, Integer last, String before, Boolean reverse,
      SubscriptionContractsSortKeys sortKey, String query) {
    SubscriptionContractConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());    
    getFields().put("subscriptionContracts", projection);
    getInputArguments().computeIfAbsent("subscriptionContracts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("subscriptionContracts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("subscriptionContracts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("subscriptionContracts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("subscriptionContracts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("subscriptionContracts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("subscriptionContracts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("subscriptionContracts").add(queryArg);
    return projection;
  }

  public SubscriptionDraftProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionDraft() {
     SubscriptionDraftProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDraftProjection<>(this, getRoot());
     getFields().put("subscriptionDraft", projection);
     return projection;
  }

  public SubscriptionDraftProjection<QueryProjection<PARENT, ROOT>, ROOT> subscriptionDraft(
      String id) {
    SubscriptionDraftProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionDraftProjection<>(this, getRoot());    
    getFields().put("subscriptionDraft", projection);
    getInputArguments().computeIfAbsent("subscriptionDraft", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("subscriptionDraft").add(idArg);
    return projection;
  }

  public TaxonomyProjection<QueryProjection<PARENT, ROOT>, ROOT> taxonomy() {
     TaxonomyProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new TaxonomyProjection<>(this, getRoot());
     getFields().put("taxonomy", projection);
     return projection;
  }

  public TenderTransactionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> tenderTransactions(
      ) {
     TenderTransactionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new TenderTransactionConnectionProjection<>(this, getRoot());
     getFields().put("tenderTransactions", projection);
     return projection;
  }

  public TenderTransactionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> tenderTransactions(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    TenderTransactionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new TenderTransactionConnectionProjection<>(this, getRoot());    
    getFields().put("tenderTransactions", projection);
    getInputArguments().computeIfAbsent("tenderTransactions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("tenderTransactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("tenderTransactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("tenderTransactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("tenderTransactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("tenderTransactions").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("tenderTransactions").add(queryArg);
    return projection;
  }

  public OnlineStoreThemeProjection<QueryProjection<PARENT, ROOT>, ROOT> theme() {
     OnlineStoreThemeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeProjection<>(this, getRoot());
     getFields().put("theme", projection);
     return projection;
  }

  public OnlineStoreThemeProjection<QueryProjection<PARENT, ROOT>, ROOT> theme(String id) {
    OnlineStoreThemeProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeProjection<>(this, getRoot());    
    getFields().put("theme", projection);
    getInputArguments().computeIfAbsent("theme", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("theme").add(idArg);
    return projection;
  }

  public OnlineStoreThemeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> themes() {
     OnlineStoreThemeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeConnectionProjection<>(this, getRoot());
     getFields().put("themes", projection);
     return projection;
  }

  public OnlineStoreThemeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> themes(
      List<ThemeRole> roles, List<String> names, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    OnlineStoreThemeConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new OnlineStoreThemeConnectionProjection<>(this, getRoot());    
    getFields().put("themes", projection);
    getInputArguments().computeIfAbsent("themes", k -> new ArrayList<>());                      
    InputArgument rolesArg = new InputArgument("roles", roles);
    getInputArguments().get("themes").add(rolesArg);
    InputArgument namesArg = new InputArgument("names", names);
    getInputArguments().get("themes").add(namesArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("themes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("themes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("themes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("themes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("themes").add(reverseArg);
    return projection;
  }

  public TranslatableResourceProjection<QueryProjection<PARENT, ROOT>, ROOT> translatableResource(
      ) {
     TranslatableResourceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceProjection<>(this, getRoot());
     getFields().put("translatableResource", projection);
     return projection;
  }

  public TranslatableResourceProjection<QueryProjection<PARENT, ROOT>, ROOT> translatableResource(
      String resourceId) {
    TranslatableResourceProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceProjection<>(this, getRoot());    
    getFields().put("translatableResource", projection);
    getInputArguments().computeIfAbsent("translatableResource", k -> new ArrayList<>());                      
    InputArgument resourceIdArg = new InputArgument("resourceId", resourceId);
    getInputArguments().get("translatableResource").add(resourceIdArg);
    return projection;
  }

  public TranslatableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> translatableResources(
      ) {
     TranslatableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceConnectionProjection<>(this, getRoot());
     getFields().put("translatableResources", projection);
     return projection;
  }

  public TranslatableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> translatableResources(
      TranslatableResourceType resourceType, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    TranslatableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceConnectionProjection<>(this, getRoot());    
    getFields().put("translatableResources", projection);
    getInputArguments().computeIfAbsent("translatableResources", k -> new ArrayList<>());                      
    InputArgument resourceTypeArg = new InputArgument("resourceType", resourceType);
    getInputArguments().get("translatableResources").add(resourceTypeArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("translatableResources").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("translatableResources").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("translatableResources").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("translatableResources").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("translatableResources").add(reverseArg);
    return projection;
  }

  public TranslatableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> translatableResourcesByIds(
      ) {
     TranslatableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceConnectionProjection<>(this, getRoot());
     getFields().put("translatableResourcesByIds", projection);
     return projection;
  }

  public TranslatableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> translatableResourcesByIds(
      List<String> resourceIds, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    TranslatableResourceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceConnectionProjection<>(this, getRoot());    
    getFields().put("translatableResourcesByIds", projection);
    getInputArguments().computeIfAbsent("translatableResourcesByIds", k -> new ArrayList<>());                      
    InputArgument resourceIdsArg = new InputArgument("resourceIds", resourceIds);
    getInputArguments().get("translatableResourcesByIds").add(resourceIdsArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("translatableResourcesByIds").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("translatableResourcesByIds").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("translatableResourcesByIds").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("translatableResourcesByIds").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("translatableResourcesByIds").add(reverseArg);
    return projection;
  }

  public UrlRedirectProjection<QueryProjection<PARENT, ROOT>, ROOT> urlRedirect() {
     UrlRedirectProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectProjection<>(this, getRoot());
     getFields().put("urlRedirect", projection);
     return projection;
  }

  public UrlRedirectProjection<QueryProjection<PARENT, ROOT>, ROOT> urlRedirect(String id) {
    UrlRedirectProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectProjection<>(this, getRoot());    
    getFields().put("urlRedirect", projection);
    getInputArguments().computeIfAbsent("urlRedirect", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("urlRedirect").add(idArg);
    return projection;
  }

  public UrlRedirectImportProjection<QueryProjection<PARENT, ROOT>, ROOT> urlRedirectImport() {
     UrlRedirectImportProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectImportProjection<>(this, getRoot());
     getFields().put("urlRedirectImport", projection);
     return projection;
  }

  public UrlRedirectImportProjection<QueryProjection<PARENT, ROOT>, ROOT> urlRedirectImport(
      String id) {
    UrlRedirectImportProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectImportProjection<>(this, getRoot());    
    getFields().put("urlRedirectImport", projection);
    getInputArguments().computeIfAbsent("urlRedirectImport", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("urlRedirectImport").add(idArg);
    return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> urlRedirectSavedSearches(
      ) {
     SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());
     getFields().put("urlRedirectSavedSearches", projection);
     return projection;
  }

  public SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> urlRedirectSavedSearches(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SavedSearchConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new SavedSearchConnectionProjection<>(this, getRoot());    
    getFields().put("urlRedirectSavedSearches", projection);
    getInputArguments().computeIfAbsent("urlRedirectSavedSearches", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("urlRedirectSavedSearches").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("urlRedirectSavedSearches").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("urlRedirectSavedSearches").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("urlRedirectSavedSearches").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("urlRedirectSavedSearches").add(reverseArg);
    return projection;
  }

  public UrlRedirectConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> urlRedirects() {
     UrlRedirectConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectConnectionProjection<>(this, getRoot());
     getFields().put("urlRedirects", projection);
     return projection;
  }

  public UrlRedirectConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> urlRedirects(
      Integer first, String after, Integer last, String before, Boolean reverse,
      UrlRedirectSortKeys sortKey, String query, String savedSearchId) {
    UrlRedirectConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new UrlRedirectConnectionProjection<>(this, getRoot());    
    getFields().put("urlRedirects", projection);
    getInputArguments().computeIfAbsent("urlRedirects", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("urlRedirects").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("urlRedirects").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("urlRedirects").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("urlRedirects").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("urlRedirects").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("urlRedirects").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("urlRedirects").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("urlRedirects").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> urlRedirectsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("urlRedirectsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> urlRedirectsCount(String query,
      String savedSearchId, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("urlRedirectsCount", projection);
    getInputArguments().computeIfAbsent("urlRedirectsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("urlRedirectsCount").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("urlRedirectsCount").add(savedSearchIdArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("urlRedirectsCount").add(limitArg);
    return projection;
  }

  public ValidationProjection<QueryProjection<PARENT, ROOT>, ROOT> validation() {
     ValidationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ValidationProjection<>(this, getRoot());
     getFields().put("validation", projection);
     return projection;
  }

  public ValidationProjection<QueryProjection<PARENT, ROOT>, ROOT> validation(String id) {
    ValidationProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ValidationProjection<>(this, getRoot());    
    getFields().put("validation", projection);
    getInputArguments().computeIfAbsent("validation", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("validation").add(idArg);
    return projection;
  }

  public ValidationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> validations() {
     ValidationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ValidationConnectionProjection<>(this, getRoot());
     getFields().put("validations", projection);
     return projection;
  }

  public ValidationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> validations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ValidationSortKeys sortKey) {
    ValidationConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new ValidationConnectionProjection<>(this, getRoot());    
    getFields().put("validations", projection);
    getInputArguments().computeIfAbsent("validations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("validations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("validations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("validations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("validations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("validations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("validations").add(sortKeyArg);
    return projection;
  }

  public WebPixelProjection<QueryProjection<PARENT, ROOT>, ROOT> webPixel() {
     WebPixelProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new WebPixelProjection<>(this, getRoot());
     getFields().put("webPixel", projection);
     return projection;
  }

  public WebPixelProjection<QueryProjection<PARENT, ROOT>, ROOT> webPixel(String id) {
    WebPixelProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new WebPixelProjection<>(this, getRoot());    
    getFields().put("webPixel", projection);
    getInputArguments().computeIfAbsent("webPixel", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("webPixel").add(idArg);
    return projection;
  }

  public MarketWebPresenceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> webPresences() {
     MarketWebPresenceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceConnectionProjection<>(this, getRoot());
     getFields().put("webPresences", projection);
     return projection;
  }

  public MarketWebPresenceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> webPresences(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MarketWebPresenceConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new MarketWebPresenceConnectionProjection<>(this, getRoot());    
    getFields().put("webPresences", projection);
    getInputArguments().computeIfAbsent("webPresences", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("webPresences").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("webPresences").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("webPresences").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("webPresences").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("webPresences").add(reverseArg);
    return projection;
  }

  public WebhookSubscriptionProjection<QueryProjection<PARENT, ROOT>, ROOT> webhookSubscription() {
     WebhookSubscriptionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionProjection<>(this, getRoot());
     getFields().put("webhookSubscription", projection);
     return projection;
  }

  public WebhookSubscriptionProjection<QueryProjection<PARENT, ROOT>, ROOT> webhookSubscription(
      String id) {
    WebhookSubscriptionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionProjection<>(this, getRoot());    
    getFields().put("webhookSubscription", projection);
    getInputArguments().computeIfAbsent("webhookSubscription", k -> new ArrayList<>());                      
    InputArgument idArg = new InputArgument("id", id);
    getInputArguments().get("webhookSubscription").add(idArg);
    return projection;
  }

  public WebhookSubscriptionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> webhookSubscriptions(
      ) {
     WebhookSubscriptionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionConnectionProjection<>(this, getRoot());
     getFields().put("webhookSubscriptions", projection);
     return projection;
  }

  public WebhookSubscriptionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> webhookSubscriptions(
      Integer first, String after, Integer last, String before, Boolean reverse,
      WebhookSubscriptionSortKeys sortKey, String query, String callbackUrl,
      WebhookSubscriptionFormat format, List<WebhookSubscriptionTopic> topics) {
    WebhookSubscriptionConnectionProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new WebhookSubscriptionConnectionProjection<>(this, getRoot());    
    getFields().put("webhookSubscriptions", projection);
    getInputArguments().computeIfAbsent("webhookSubscriptions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("webhookSubscriptions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("webhookSubscriptions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("webhookSubscriptions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("webhookSubscriptions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("webhookSubscriptions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("webhookSubscriptions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("webhookSubscriptions").add(queryArg);
    InputArgument callbackUrlArg = new InputArgument("callbackUrl", callbackUrl);
    getInputArguments().get("webhookSubscriptions").add(callbackUrlArg);
    InputArgument formatArg = new InputArgument("format", format);
    getInputArguments().get("webhookSubscriptions").add(formatArg);
    InputArgument topicsArg = new InputArgument("topics", topics);
    getInputArguments().get("webhookSubscriptions").add(topicsArg);
    return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> webhookSubscriptionsCount() {
     CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("webhookSubscriptionsCount", projection);
     return projection;
  }

  public CountProjection<QueryProjection<PARENT, ROOT>, ROOT> webhookSubscriptionsCount(
      String query, Integer limit) {
    CountProjection<QueryProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("webhookSubscriptionsCount", projection);
    getInputArguments().computeIfAbsent("webhookSubscriptionsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("webhookSubscriptionsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("webhookSubscriptionsCount").add(limitArg);
    return projection;
  }

  public QueryProjection<PARENT, ROOT> articleTags() {
    getFields().put("articleTags", null);
    return this;
  }

  public QueryProjection articleTags(ArticleTagSort sort, int limit) {
    getFields().put("articleTags", null);
    getInputArguments().computeIfAbsent("articleTags", k -> new ArrayList<>());
    InputArgument sortArg = new InputArgument("sort", sort);
    getInputArguments().get("articleTags").add(sortArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("articleTags").add(limitArg);
    return this;
  }
}
