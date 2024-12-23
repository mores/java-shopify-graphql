package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.DiscountCodeSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class DiscountCodeAppFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DiscountCodeAppFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCodeApp"));
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppDiscountTypeProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> appDiscountType(
      ) {
     AppDiscountTypeProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppDiscountTypeProjection<>(this, getRoot());
     getFields().put("appDiscountType", projection);
     return projection;
  }

  public DiscountRedeemCodeConnectionProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> codes(
      ) {
     DiscountRedeemCodeConnectionProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeConnectionProjection<>(this, getRoot());
     getFields().put("codes", projection);
     return projection;
  }

  public DiscountRedeemCodeConnectionProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> codes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DiscountCodeSortKeys sortKey, String query, String savedSearchId) {
    DiscountRedeemCodeConnectionProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeConnectionProjection<>(this, getRoot());    
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

  public CountProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> codesCount() {
     CountProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("codesCount", projection);
     return projection;
  }

  public DiscountCombinesWithProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public DiscountCustomerSelectionProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> customerSelection(
      ) {
     DiscountCustomerSelectionProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCustomerSelectionProjection<>(this, getRoot());
     getFields().put("customerSelection", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> discountClass(
      ) {
     DiscountClassProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public FunctionsErrorHistoryProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> errorHistory(
      ) {
     FunctionsErrorHistoryProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new FunctionsErrorHistoryProjection<>(this, getRoot());
     getFields().put("errorHistory", projection);
     return projection;
  }

  public DiscountShareableUrlProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> shareableUrls(
      ) {
     DiscountShareableUrlProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountShareableUrlProjection<>(this, getRoot());
     getFields().put("shareableUrls", projection);
     return projection;
  }

  public DiscountStatusProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> status() {
     DiscountStatusProjection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MoneyV2Projection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> totalSales() {
     MoneyV2Projection<DiscountCodeAppFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalSales", projection);
     return projection;
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> appliesOncePerCustomer() {
    getFields().put("appliesOncePerCustomer", null);
    return this;
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> discountId() {
    getFields().put("discountId", null);
    return this;
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> recurringCycleLimit() {
    getFields().put("recurringCycleLimit", null);
    return this;
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public DiscountCodeAppFragmentProjection<PARENT, ROOT> usageLimit() {
    getFields().put("usageLimit", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DiscountCodeApp {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
