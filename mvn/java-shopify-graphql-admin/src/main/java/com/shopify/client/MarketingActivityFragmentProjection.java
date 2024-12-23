package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class MarketingActivityFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MarketingActivityFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingActivity"));
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> adSpend() {
     MoneyV2Projection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("adSpend", projection);
     return projection;
  }

  public AppProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public MarketingActivityExtensionAppErrorsProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> appErrors(
      ) {
     MarketingActivityExtensionAppErrorsProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityExtensionAppErrorsProjection<>(this, getRoot());
     getFields().put("appErrors", projection);
     return projection;
  }

  public MarketingBudgetProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> budget(
      ) {
     MarketingBudgetProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingBudgetProjection<>(this, getRoot());
     getFields().put("budget", projection);
     return projection;
  }

  public MarketingActivityHierarchyLevelProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> hierarchyLevel(
      ) {
     MarketingActivityHierarchyLevelProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityHierarchyLevelProjection<>(this, getRoot());
     getFields().put("hierarchyLevel", projection);
     return projection;
  }

  public MarketingChannelProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> marketingChannel(
      ) {
     MarketingChannelProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingChannelProjection<>(this, getRoot());
     getFields().put("marketingChannel", projection);
     return projection;
  }

  public MarketingChannelProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> marketingChannelType(
      ) {
     MarketingChannelProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingChannelProjection<>(this, getRoot());
     getFields().put("marketingChannelType", projection);
     return projection;
  }

  public MarketingEventProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> marketingEvent(
      ) {
     MarketingEventProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventProjection<>(this, getRoot());
     getFields().put("marketingEvent", projection);
     return projection;
  }

  public MarketingActivityStatusProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     MarketingActivityStatusProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MarketingActivityStatusBadgeTypeProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> statusBadgeType(
      ) {
     MarketingActivityStatusBadgeTypeProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityStatusBadgeTypeProjection<>(this, getRoot());
     getFields().put("statusBadgeType", projection);
     return projection;
  }

  public BadgeTypeProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> statusBadgeTypeV2(
      ) {
     BadgeTypeProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new BadgeTypeProjection<>(this, getRoot());
     getFields().put("statusBadgeTypeV2", projection);
     return projection;
  }

  public MarketingTacticProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> tactic(
      ) {
     MarketingTacticProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingTacticProjection<>(this, getRoot());
     getFields().put("tactic", projection);
     return projection;
  }

  public MarketingActivityStatusProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> targetStatus(
      ) {
     MarketingActivityStatusProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityStatusProjection<>(this, getRoot());
     getFields().put("targetStatus", projection);
     return projection;
  }

  public UTMParametersProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> utmParameters(
      ) {
     UTMParametersProjection<MarketingActivityFragmentProjection<PARENT, ROOT>, ROOT> projection = new UTMParametersProjection<>(this, getRoot());
     getFields().put("utmParameters", projection);
     return projection;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> activityListUrl() {
    getFields().put("activityListUrl", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> formData() {
    getFields().put("formData", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> inMainWorkflowVersion() {
    getFields().put("inMainWorkflowVersion", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> isExternal() {
    getFields().put("isExternal", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> parentActivityId() {
    getFields().put("parentActivityId", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> parentRemoteId() {
    getFields().put("parentRemoteId", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> sourceAndMedium() {
    getFields().put("sourceAndMedium", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> statusLabel() {
    getFields().put("statusLabel", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> statusTransitionedAt() {
    getFields().put("statusTransitionedAt", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public MarketingActivityFragmentProjection<PARENT, ROOT> urlParameterValue() {
    getFields().put("urlParameterValue", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MarketingActivity {");
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
