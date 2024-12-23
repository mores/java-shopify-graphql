package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppByKeyProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppByKeyProjectionRoot() {
    super(null, null, java.util.Optional.of("App"));
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> availableAccessScopes(
      ) {
    AccessScopeProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("availableAccessScopes", projection);
    return projection;
  }

  public ImageProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> banner(
      ) {
    ImageProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("banner", projection);
    return projection;
  }

  public AppDeveloperTypeProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> developerType(
      ) {
    AppDeveloperTypeProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new AppDeveloperTypeProjection<>(this, this);    
    getFields().put("developerType", projection);
    return projection;
  }

  public FailedRequirementProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> failedRequirements(
      ) {
    FailedRequirementProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new FailedRequirementProjection<>(this, this);    
    getFields().put("failedRequirements", projection);
    return projection;
  }

  public AppFeedbackProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> feedback(
      ) {
    AppFeedbackProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new AppFeedbackProjection<>(this, this);    
    getFields().put("feedback", projection);
    return projection;
  }

  public ImageProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> icon(
      ) {
    ImageProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("icon", projection);
    return projection;
  }

  public AppInstallationProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> installation(
      ) {
    AppInstallationProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new AppInstallationProjection<>(this, this);    
    getFields().put("installation", projection);
    return projection;
  }

  public NavigationItemProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> navigationItems(
      ) {
    NavigationItemProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new NavigationItemProjection<>(this, this);    
    getFields().put("navigationItems", projection);
    return projection;
  }

  public AccessScopeProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> optionalAccessScopes(
      ) {
    AccessScopeProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("optionalAccessScopes", projection);
    return projection;
  }

  public AppPublicCategoryProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> publicCategory(
      ) {
    AppPublicCategoryProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new AppPublicCategoryProjection<>(this, this);    
    getFields().put("publicCategory", projection);
    return projection;
  }

  public AccessScopeProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> requestedAccessScopes(
      ) {
    AccessScopeProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new AccessScopeProjection<>(this, this);    
    getFields().put("requestedAccessScopes", projection);
    return projection;
  }

  public ImageProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> screenshots(
      ) {
    ImageProjection<AppByKeyProjectionRoot<PARENT, ROOT>, AppByKeyProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("screenshots", projection);
    return projection;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> apiKey() {
    getFields().put("apiKey", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> appStoreAppUrl() {
    getFields().put("appStoreAppUrl", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> appStoreDeveloperUrl() {
    getFields().put("appStoreDeveloperUrl", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> developerName() {
    getFields().put("developerName", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> developerUrl() {
    getFields().put("developerUrl", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> embedded() {
    getFields().put("embedded", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> features() {
    getFields().put("features", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> installUrl() {
    getFields().put("installUrl", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> isPostPurchaseAppInUse() {
    getFields().put("isPostPurchaseAppInUse", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> launchUrl() {
    getFields().put("launchUrl", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> previouslyInstalled() {
    getFields().put("previouslyInstalled", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> pricingDetails() {
    getFields().put("pricingDetails", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> pricingDetailsSummary() {
    getFields().put("pricingDetailsSummary", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> privacyPolicyUrl() {
    getFields().put("privacyPolicyUrl", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> published() {
    getFields().put("published", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> shopifyDeveloped() {
    getFields().put("shopifyDeveloped", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> uninstallMessage() {
    getFields().put("uninstallMessage", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> uninstallUrl() {
    getFields().put("uninstallUrl", null);
    return this;
  }

  public AppByKeyProjectionRoot<PARENT, ROOT> webhookApiVersion() {
    getFields().put("webhookApiVersion", null);
    return this;
  }
}
