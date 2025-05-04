package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.EventSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class DiscountAutomaticBxgyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DiscountAutomaticBxgyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomaticBxgy"));
  }

  public DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCombinesWithProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> combinesWith(
      ) {
     DiscountCombinesWithProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCombinesWithProjection<>(this, getRoot());
     getFields().put("combinesWith", projection);
     return projection;
  }

  public DiscountCustomerBuysProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> customerBuys(
      ) {
     DiscountCustomerBuysProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCustomerBuysProjection<>(this, getRoot());
     getFields().put("customerBuys", projection);
     return projection;
  }

  public DiscountCustomerGetsProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> customerGets(
      ) {
     DiscountCustomerGetsProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountCustomerGetsProjection<>(this, getRoot());
     getFields().put("customerGets", projection);
     return projection;
  }

  public MerchandiseDiscountClassProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> discountClass(
      ) {
     MerchandiseDiscountClassProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MerchandiseDiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public DiscountClassProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> discountClasses(
      ) {
     DiscountClassProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClasses", projection);
     return projection;
  }

  public EventConnectionProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> events(
      ) {
     EventConnectionProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
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

  public DiscountStatusProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     DiscountStatusProjection<DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DiscountStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT> asyncUsageCount() {
    getFields().put("asyncUsageCount", null);
    return this;
  }

  public DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT> endsAt() {
    getFields().put("endsAt", null);
    return this;
  }

  public DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT> startsAt() {
    getFields().put("startsAt", null);
    return this;
  }

  public DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT> summary() {
    getFields().put("summary", null);
    return this;
  }

  public DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT> usageCount() {
    getFields().put("usageCount", null);
    return this;
  }

  public DiscountAutomaticBxgyFragmentProjection<PARENT, ROOT> usesPerOrderLimit() {
    getFields().put("usesPerOrderLimit", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DiscountAutomaticBxgy {");
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
