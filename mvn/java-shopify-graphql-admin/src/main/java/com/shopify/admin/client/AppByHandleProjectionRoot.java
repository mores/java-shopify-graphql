package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppByHandleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppByHandleProjectionRoot() {
    super(null, null, java.util.Optional.of("App"));
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> availableAccessScopes(
      ) {
    AccessScopeProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("availableAccessScopes", projection);
    return projection;
  }

  public ImageProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> banner(
      ) {
    ImageProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("banner", projection);
    return projection;
  }

  public AppDeveloperTypeProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> developerType(
      ) {
    AppDeveloperTypeProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new AppDeveloperTypeProjection<>(this, this);    
    getFields().put("developerType", projection);
    return projection;
  }

  public FailedRequirementProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> failedRequirements(
      ) {
    FailedRequirementProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new FailedRequirementProjection<>(this, this);    
    getFields().put("failedRequirements", projection);
    return projection;
  }

  public AppFeedbackProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> feedback(
      ) {
    AppFeedbackProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new AppFeedbackProjection<>(this, this);    
    getFields().put("feedback", projection);
    return projection;
  }

  public ImageProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> icon(
      ) {
    ImageProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("icon", projection);
    return projection;
  }

  public AppInstallationProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> installation(
      ) {
    AppInstallationProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new AppInstallationProjection<>(this, this);    
    getFields().put("installation", projection);
    return projection;
  }

  public NavigationItemProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> navigationItems(
      ) {
    NavigationItemProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new NavigationItemProjection<>(this, this);    
    getFields().put("navigationItems", projection);
    return projection;
  }

  public AccessScopeProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> optionalAccessScopes(
      ) {
    AccessScopeProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("optionalAccessScopes", projection);
    return projection;
  }

  public AppPublicCategoryProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> publicCategory(
      ) {
    AppPublicCategoryProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new AppPublicCategoryProjection<>(this, this);    
    getFields().put("publicCategory", projection);
    return projection;
  }

  public AccessScopeProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> requestedAccessScopes(
      ) {
    AccessScopeProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("requestedAccessScopes", projection);
    return projection;
  }

  public ImageProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> screenshots(
      ) {
    ImageProjection<AppByHandleProjectionRoot<PARENT, ROOT>, AppByHandleProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("screenshots", projection);
    return projection;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> apiKey() {
    getFields().put("apiKey", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> appStoreAppUrl() {
    getFields().put("appStoreAppUrl", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> appStoreDeveloperUrl() {
    getFields().put("appStoreDeveloperUrl", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> developerName() {
    getFields().put("developerName", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> developerUrl() {
    getFields().put("developerUrl", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> embedded() {
    getFields().put("embedded", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> features() {
    getFields().put("features", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> installUrl() {
    getFields().put("installUrl", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> isPostPurchaseAppInUse() {
    getFields().put("isPostPurchaseAppInUse", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> launchUrl() {
    getFields().put("launchUrl", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> previouslyInstalled() {
    getFields().put("previouslyInstalled", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> pricingDetails() {
    getFields().put("pricingDetails", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> pricingDetailsSummary() {
    getFields().put("pricingDetailsSummary", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> privacyPolicyUrl() {
    getFields().put("privacyPolicyUrl", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> published() {
    getFields().put("published", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> shopifyDeveloped() {
    getFields().put("shopifyDeveloped", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> uninstallMessage() {
    getFields().put("uninstallMessage", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> uninstallUrl() {
    getFields().put("uninstallUrl", null);
    return this;
  }

  public AppByHandleProjectionRoot<PARENT, ROOT> webhookApiVersion() {
    getFields().put("webhookApiVersion", null);
    return this;
  }
}
