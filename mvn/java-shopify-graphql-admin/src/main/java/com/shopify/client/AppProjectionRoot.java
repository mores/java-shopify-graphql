package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppProjectionRoot() {
    super(null, null, java.util.Optional.of("App"));
  }

  public AppProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> availableAccessScopes(
      ) {
    AccessScopeProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("availableAccessScopes", projection);
    return projection;
  }

  public ImageProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> banner(
      ) {
    ImageProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("banner", projection);
    return projection;
  }

  public AppDeveloperTypeProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> developerType(
      ) {
    AppDeveloperTypeProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new AppDeveloperTypeProjection<>(this, this);    
    getFields().put("developerType", projection);
    return projection;
  }

  public FailedRequirementProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> failedRequirements(
      ) {
    FailedRequirementProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new FailedRequirementProjection<>(this, this);    
    getFields().put("failedRequirements", projection);
    return projection;
  }

  public AppFeedbackProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> feedback(
      ) {
    AppFeedbackProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new AppFeedbackProjection<>(this, this);    
    getFields().put("feedback", projection);
    return projection;
  }

  public ImageProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> icon() {
    ImageProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("icon", projection);
    return projection;
  }

  public AppInstallationProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> installation(
      ) {
    AppInstallationProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new AppInstallationProjection<>(this, this);    
    getFields().put("installation", projection);
    return projection;
  }

  public NavigationItemProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> navigationItems(
      ) {
    NavigationItemProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new NavigationItemProjection<>(this, this);    
    getFields().put("navigationItems", projection);
    return projection;
  }

  public AccessScopeProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> optionalAccessScopes(
      ) {
    AccessScopeProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("optionalAccessScopes", projection);
    return projection;
  }

  public AppPublicCategoryProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> publicCategory(
      ) {
    AppPublicCategoryProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new AppPublicCategoryProjection<>(this, this);    
    getFields().put("publicCategory", projection);
    return projection;
  }

  public AccessScopeProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> requestedAccessScopes(
      ) {
    AccessScopeProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("requestedAccessScopes", projection);
    return projection;
  }

  public ImageProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> screenshots(
      ) {
    ImageProjection<AppProjectionRoot<PARENT, ROOT>, AppProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("screenshots", projection);
    return projection;
  }

  public AppProjectionRoot<PARENT, ROOT> apiKey() {
    getFields().put("apiKey", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> appStoreAppUrl() {
    getFields().put("appStoreAppUrl", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> appStoreDeveloperUrl() {
    getFields().put("appStoreDeveloperUrl", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> developerName() {
    getFields().put("developerName", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> developerUrl() {
    getFields().put("developerUrl", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> embedded() {
    getFields().put("embedded", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> features() {
    getFields().put("features", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> installUrl() {
    getFields().put("installUrl", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> isPostPurchaseAppInUse() {
    getFields().put("isPostPurchaseAppInUse", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> launchUrl() {
    getFields().put("launchUrl", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> previouslyInstalled() {
    getFields().put("previouslyInstalled", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> pricingDetails() {
    getFields().put("pricingDetails", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> pricingDetailsSummary() {
    getFields().put("pricingDetailsSummary", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> privacyPolicyUrl() {
    getFields().put("privacyPolicyUrl", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> published() {
    getFields().put("published", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> shopifyDeveloped() {
    getFields().put("shopifyDeveloped", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> uninstallMessage() {
    getFields().put("uninstallMessage", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> uninstallUrl() {
    getFields().put("uninstallUrl", null);
    return this;
  }

  public AppProjectionRoot<PARENT, ROOT> webhookApiVersion() {
    getFields().put("webhookApiVersion", null);
    return this;
  }
}
