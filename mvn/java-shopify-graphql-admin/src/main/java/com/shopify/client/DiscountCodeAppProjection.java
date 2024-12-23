package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.DiscountCodeSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DiscountCodeAppProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeAppProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCodeApp"));
  }

  public DiscountCodeAppProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppDiscountTypeProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> appDiscountType(
      ) {
     AppDiscountTypeProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("appDiscountType", projection);
     return projection;
  }

  public DiscountRedeemCodeConnectionProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> codes(
      ) {
     DiscountRedeemCodeConnectionProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeConnectionProjection<>(this, getRoot());
     getFields().put("codes", projection);
     return projection;
  }

  public DiscountRedeemCodeConnectionProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> codes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DiscountCodeSortKeys sortKey, String query, String savedSearchId) {
    DiscountRedeemCodeConnectionProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeConnectionProjection<>(this, getRoot());    
    getFields().put("codes", projection);
    getInputArguments().computeIfAbsent("codes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("codes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("codes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("codes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("codes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("codes").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("codes").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("codes").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("codes").add(savedSearchIdArg);
    return projection;
  }

  public CountProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> codesCount() {
     CountProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("codesCount", projection);
     return projection;
  }

  public DiscountCombinesWithProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public DiscountCustomerSelectionProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> customerSelection(
      ) {
     DiscountCustomerSelectionProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountCustomerSelectionProjection<>(this, getRoot());
     getFields().put("customerSelection", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> discountClass() {
     DiscountClassProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public FunctionsErrorHistoryProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> errorHistory(
      ) {
     FunctionsErrorHistoryProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> projection = new FunctionsErrorHistoryProjection<>(this, getRoot());
     getFields().put("errorHistory", projection);
     return projection;
  }

  public DiscountShareableUrlProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> shareableUrls(
      ) {
     DiscountShareableUrlProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountShareableUrlProjection<>(this, getRoot());
     getFields().put("shareableUrls", projection);
     return projection;
  }

  public DiscountStatusProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> status() {
     DiscountStatusProjection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> projection = new DiscountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MoneyV2Projection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> totalSales() {
     MoneyV2Projection<DiscountCodeAppProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalSales", projection);
     return projection;
  }

  public DiscountCodeAppProjection<PARENT, ROOT> appliesOncePerCustomer() {
    getFields().put("appliesOncePerCustomer", null);
    return this;
  }

  public DiscountCodeAppProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountCodeAppProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountCodeAppProjection<PARENT, ROOT> discountId() {
    getFields().put("discountId", null);
    return this;
  }

  public DiscountCodeAppProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public DiscountCodeAppProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public DiscountCodeAppProjection<PARENT, ROOT> recurringCycleLimit() {
    getFields().put("recurringCycleLimit", null);
    return this;
  }

  public DiscountCodeAppProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public DiscountCodeAppProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountCodeAppProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public DiscountCodeAppProjection<PARENT, ROOT> usageLimit() {
    getFields().put("usageLimit", null);
    return this;
  }
}
