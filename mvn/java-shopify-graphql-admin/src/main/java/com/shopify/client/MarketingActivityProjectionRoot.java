package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivityProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivityProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingActivity"));
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> adSpend(
      ) {
    MoneyV2Projection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("adSpend", projection);
    return projection;
  }

  public AppProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public MarketingActivityExtensionAppErrorsProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> appErrors(
      ) {
    MarketingActivityExtensionAppErrorsProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityExtensionAppErrorsProjection<>(this, this);    
    getFields().put("appErrors", projection);
    return projection;
  }

  public MarketingBudgetProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> budget(
      ) {
    MarketingBudgetProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new MarketingBudgetProjection<>(this, this);    
    getFields().put("budget", projection);
    return projection;
  }

  public MarketingActivityHierarchyLevelProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> hierarchyLevel(
      ) {
    MarketingActivityHierarchyLevelProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityHierarchyLevelProjection<>(this, this);    
    getFields().put("hierarchyLevel", projection);
    return projection;
  }

  public MarketingChannelProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> marketingChannel(
      ) {
    MarketingChannelProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new MarketingChannelProjection<>(this, this);    
    getFields().put("marketingChannel", projection);
    return projection;
  }

  public MarketingChannelProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> marketingChannelType(
      ) {
    MarketingChannelProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new MarketingChannelProjection<>(this, this);    
    getFields().put("marketingChannelType", projection);
    return projection;
  }

  public MarketingEventProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> marketingEvent(
      ) {
    MarketingEventProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new MarketingEventProjection<>(this, this);    
    getFields().put("marketingEvent", projection);
    return projection;
  }

  public MarketingActivityStatusProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> status(
      ) {
    MarketingActivityStatusProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public MarketingActivityStatusBadgeTypeProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> statusBadgeType(
      ) {
    MarketingActivityStatusBadgeTypeProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityStatusBadgeTypeProjection<>(this, this);    
    getFields().put("statusBadgeType", projection);
    return projection;
  }

  public BadgeTypeProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> statusBadgeTypeV2(
      ) {
    BadgeTypeProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new BadgeTypeProjection<>(this, this);    
    getFields().put("statusBadgeTypeV2", projection);
    return projection;
  }

  public MarketingTacticProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> tactic(
      ) {
    MarketingTacticProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new MarketingTacticProjection<>(this, this);    
    getFields().put("tactic", projection);
    return projection;
  }

  public MarketingActivityStatusProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> targetStatus(
      ) {
    MarketingActivityStatusProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityStatusProjection<>(this, this);    
    getFields().put("targetStatus", projection);
    return projection;
  }

  public UTMParametersProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> utmParameters(
      ) {
    UTMParametersProjection<MarketingActivityProjectionRoot<PARENT, ROOT>, MarketingActivityProjectionRoot<PARENT, ROOT>> projection = new UTMParametersProjection<>(this, this);    
    getFields().put("utmParameters", projection);
    return projection;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> activityListUrl() {
    getFields().put("activityListUrl", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> formData() {
    getFields().put("formData", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> inMainWorkflowVersion() {
    getFields().put("inMainWorkflowVersion", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> isExternal() {
    getFields().put("isExternal", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> parentActivityId() {
    getFields().put("parentActivityId", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> parentRemoteId() {
    getFields().put("parentRemoteId", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> sourceAndMedium() {
    getFields().put("sourceAndMedium", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> statusLabel() {
    getFields().put("statusLabel", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> statusTransitionedAt() {
    getFields().put("statusTransitionedAt", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public MarketingActivityProjectionRoot<PARENT, ROOT> urlParameterValue() {
    getFields().put("urlParameterValue", null);
    return this;
  }
}
