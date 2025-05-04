package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("App"));
  }

  public AppProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<AppProjection<PARENT, ROOT>, ROOT> availableAccessScopes() {
     AccessScopeProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new AccessScopeProjection<>(this, getRoot());
     getFields().put("availableAccessScopes", projection);
     return projection;
  }

  public ImageProjection<AppProjection<PARENT, ROOT>, ROOT> banner() {
     ImageProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("banner", projection);
     return projection;
  }

  public AppDeveloperTypeProjection<AppProjection<PARENT, ROOT>, ROOT> developerType() {
     AppDeveloperTypeProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new AppDeveloperTypeProjection<>(this, getRoot());
     getFields().put("developerType", projection);
     return projection;
  }

  public FailedRequirementProjection<AppProjection<PARENT, ROOT>, ROOT> failedRequirements() {
     FailedRequirementProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new FailedRequirementProjection<>(this, getRoot());
     getFields().put("failedRequirements", projection);
     return projection;
  }

  public AppFeedbackProjection<AppProjection<PARENT, ROOT>, ROOT> feedback() {
     AppFeedbackProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new AppFeedbackProjection<>(this, getRoot());
     getFields().put("feedback", projection);
     return projection;
  }

  public ImageProjection<AppProjection<PARENT, ROOT>, ROOT> icon() {
     ImageProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("icon", projection);
     return projection;
  }

  public AppInstallationProjection<AppProjection<PARENT, ROOT>, ROOT> installation() {
     AppInstallationProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationProjection<>(this, getRoot());
     getFields().put("installation", projection);
     return projection;
  }

  public NavigationItemProjection<AppProjection<PARENT, ROOT>, ROOT> navigationItems() {
     NavigationItemProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new NavigationItemProjection<>(this, getRoot());
     getFields().put("navigationItems", projection);
     return projection;
  }

  public AccessScopeProjection<AppProjection<PARENT, ROOT>, ROOT> optionalAccessScopes() {
     AccessScopeProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new AccessScopeProjection<>(this, getRoot());
     getFields().put("optionalAccessScopes", projection);
     return projection;
  }

  public AppPublicCategoryProjection<AppProjection<PARENT, ROOT>, ROOT> publicCategory() {
     AppPublicCategoryProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new AppPublicCategoryProjection<>(this, getRoot());
     getFields().put("publicCategory", projection);
     return projection;
  }

  public AccessScopeProjection<AppProjection<PARENT, ROOT>, ROOT> requestedAccessScopes() {
     AccessScopeProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new AccessScopeProjection<>(this, getRoot());
     getFields().put("requestedAccessScopes", projection);
     return projection;
  }

  public ImageProjection<AppProjection<PARENT, ROOT>, ROOT> screenshots() {
     ImageProjection<AppProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("screenshots", projection);
     return projection;
  }

  public AppProjection<PARENT, ROOT> apiKey() {
    getFields().put("apiKey", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> appStoreAppUrl() {
    getFields().put("appStoreAppUrl", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> appStoreDeveloperUrl() {
    getFields().put("appStoreDeveloperUrl", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> developerName() {
    getFields().put("developerName", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> developerUrl() {
    getFields().put("developerUrl", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> embedded() {
    getFields().put("embedded", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> features() {
    getFields().put("features", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> installUrl() {
    getFields().put("installUrl", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> isPostPurchaseAppInUse() {
    getFields().put("isPostPurchaseAppInUse", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> launchUrl() {
    getFields().put("launchUrl", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> previouslyInstalled() {
    getFields().put("previouslyInstalled", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> pricingDetails() {
    getFields().put("pricingDetails", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> pricingDetailsSummary() {
    getFields().put("pricingDetailsSummary", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> privacyPolicyUrl() {
    getFields().put("privacyPolicyUrl", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> published() {
    getFields().put("published", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> shopifyDeveloped() {
    getFields().put("shopifyDeveloped", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> uninstallMessage() {
    getFields().put("uninstallMessage", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> uninstallUrl() {
    getFields().put("uninstallUrl", null);
    return this;
  }

  public AppProjection<PARENT, ROOT> webhookApiVersion() {
    getFields().put("webhookApiVersion", null);
    return this;
  }
}
