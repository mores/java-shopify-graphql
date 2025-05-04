package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.AppUsageRecordSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class AppSubscriptionLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppSubscriptionLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppSubscriptionLineItem"));
  }

  public AppSubscriptionLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppPlanV2Projection<AppSubscriptionLineItemProjection<PARENT, ROOT>, ROOT> plan() {
     AppPlanV2Projection<AppSubscriptionLineItemProjection<PARENT, ROOT>, ROOT> projection = new AppPlanV2Projection<>(this, getRoot());
     getFields().put("plan", projection);
     return projection;
  }

  public AppUsageRecordConnectionProjection<AppSubscriptionLineItemProjection<PARENT, ROOT>, ROOT> usageRecords(
      ) {
     AppUsageRecordConnectionProjection<AppSubscriptionLineItemProjection<PARENT, ROOT>, ROOT> projection = new AppUsageRecordConnectionProjection<>(this, getRoot());
     getFields().put("usageRecords", projection);
     return projection;
  }

  public AppUsageRecordConnectionProjection<AppSubscriptionLineItemProjection<PARENT, ROOT>, ROOT> usageRecords(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AppUsageRecordSortKeys sortKey) {
    AppUsageRecordConnectionProjection<AppSubscriptionLineItemProjection<PARENT, ROOT>, ROOT> projection = new AppUsageRecordConnectionProjection<>(this, getRoot());    
    getFields().put("usageRecords", projection);
    getInputArguments().computeIfAbsent("usageRecords", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("usageRecords").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("usageRecords").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("usageRecords").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("usageRecords").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("usageRecords").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("usageRecords").add(sortKeyArg);
    return projection;
  }

  public AppSubscriptionLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
