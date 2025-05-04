package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingActivity"));
  }

  public MarketingActivityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<MarketingActivityProjection<PARENT, ROOT>, ROOT> adSpend() {
     MoneyV2Projection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("adSpend", projection);
     return projection;
  }

  public AppProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public MarketingActivityExtensionAppErrorsProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> appErrors(
      ) {
     MarketingActivityExtensionAppErrorsProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityExtensionAppErrorsProjection<>(this, getRoot());
     getFields().put("appErrors", projection);
     return projection;
  }

  public MarketingBudgetProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> budget() {
     MarketingBudgetProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new MarketingBudgetProjection<>(this, getRoot());
     getFields().put("budget", projection);
     return projection;
  }

  public MarketingActivityHierarchyLevelProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> hierarchyLevel(
      ) {
     MarketingActivityHierarchyLevelProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityHierarchyLevelProjection<>(this, getRoot());
     getFields().put("hierarchyLevel", projection);
     return projection;
  }

  public MarketingChannelProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> marketingChannel(
      ) {
     MarketingChannelProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new MarketingChannelProjection<>(this, getRoot());
     getFields().put("marketingChannel", projection);
     return projection;
  }

  public MarketingChannelProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> marketingChannelType(
      ) {
     MarketingChannelProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new MarketingChannelProjection<>(this, getRoot());
     getFields().put("marketingChannelType", projection);
     return projection;
  }

  public MarketingEventProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> marketingEvent(
      ) {
     MarketingEventProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new MarketingEventProjection<>(this, getRoot());
     getFields().put("marketingEvent", projection);
     return projection;
  }

  public MarketingActivityStatusProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> status(
      ) {
     MarketingActivityStatusProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MarketingActivityStatusBadgeTypeProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> statusBadgeType(
      ) {
     MarketingActivityStatusBadgeTypeProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityStatusBadgeTypeProjection<>(this, getRoot());
     getFields().put("statusBadgeType", projection);
     return projection;
  }

  public BadgeTypeProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> statusBadgeTypeV2() {
     BadgeTypeProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new BadgeTypeProjection<>(this, getRoot());
     getFields().put("statusBadgeTypeV2", projection);
     return projection;
  }

  public MarketingTacticProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> tactic() {
     MarketingTacticProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new MarketingTacticProjection<>(this, getRoot());
     getFields().put("tactic", projection);
     return projection;
  }

  public MarketingActivityStatusProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> targetStatus(
      ) {
     MarketingActivityStatusProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityStatusProjection<>(this, getRoot());
     getFields().put("targetStatus", projection);
     return projection;
  }

  public UTMParametersProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> utmParameters() {
     UTMParametersProjection<MarketingActivityProjection<PARENT, ROOT>, ROOT> projection = new UTMParametersProjection<>(this, getRoot());
     getFields().put("utmParameters", projection);
     return projection;
  }

  public MarketingActivityProjection<PARENT, ROOT> activityListUrl() {
    getFields().put("activityListUrl", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> formData() {
    getFields().put("formData", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> inMainWorkflowVersion() {
    getFields().put("inMainWorkflowVersion", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> isExternal() {
    getFields().put("isExternal", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> parentActivityId() {
    getFields().put("parentActivityId", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> parentRemoteId() {
    getFields().put("parentRemoteId", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> sourceAndMedium() {
    getFields().put("sourceAndMedium", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> statusLabel() {
    getFields().put("statusLabel", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> statusTransitionedAt() {
    getFields().put("statusTransitionedAt", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public MarketingActivityProjection<PARENT, ROOT> urlParameterValue() {
    getFields().put("urlParameterValue", null);
    return this;
  }
}
