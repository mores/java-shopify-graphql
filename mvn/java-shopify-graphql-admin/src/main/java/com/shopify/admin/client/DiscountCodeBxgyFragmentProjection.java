package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.DiscountCodeSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class DiscountCodeBxgyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DiscountCodeBxgyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCodeBxgy"));
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountRedeemCodeConnectionProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> codes(
      ) {
     DiscountRedeemCodeConnectionProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeConnectionProjection<>(this, getRoot());
     getFields().put("codes", projection);
     return projection;
  }

  public DiscountRedeemCodeConnectionProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> codes(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DiscountCodeSortKeys sortKey, String query, String savedSearchId) {
    DiscountRedeemCodeConnectionProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountRedeemCodeConnectionProjection<>(this, getRoot());    
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

  public CountProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> codesCount() {
     CountProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("codesCount", projection);
     return projection;
  }

  public DiscountCombinesWithProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public DiscountCustomerBuysProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> customerBuys(
      ) {
     DiscountCustomerBuysProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCustomerBuysProjection<>(this, getRoot());
     getFields().put("customerBuys", projection);
     return projection;
  }

  public DiscountCustomerGetsProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> customerGets(
      ) {
     DiscountCustomerGetsProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCustomerGetsProjection<>(this, getRoot());
     getFields().put("customerGets", projection);
     return projection;
  }

  public DiscountCustomerSelectionProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> customerSelection(
      ) {
     DiscountCustomerSelectionProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCustomerSelectionProjection<>(this, getRoot());
     getFields().put("customerSelection", projection);
     return projection;
  }

  public MerchandiseDiscountClassProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> discountClass(
      ) {
     MerchandiseDiscountClassProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MerchandiseDiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> discountClasses(
      ) {
     DiscountClassProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClasses", projection);
     return projection;
  }

  public DiscountShareableUrlProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> shareableUrls(
      ) {
     DiscountShareableUrlProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountShareableUrlProjection<>(this, getRoot());
     getFields().put("shareableUrls", projection);
     return projection;
  }

  public DiscountStatusProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> status() {
     DiscountStatusProjection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MoneyV2Projection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> totalSales() {
     MoneyV2Projection<DiscountCodeBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalSales", projection);
     return projection;
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> appliesOncePerCustomer() {
    getFields().put("appliesOncePerCustomer", null);
    return this;
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> usageLimit() {
    getFields().put("usageLimit", null);
    return this;
  }

  public DiscountCodeBxgyFragmentProjection<PARENT, ROOT> usesPerOrderLimit() {
    getFields().put("usesPerOrderLimit", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DiscountCodeBxgy {");
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
