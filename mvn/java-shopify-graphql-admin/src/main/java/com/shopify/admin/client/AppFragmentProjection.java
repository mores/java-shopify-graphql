package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AppFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AppFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("App"));
  }

  public AppFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> availableAccessScopes() {
     AccessScopeProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new AccessScopeProjection<>(this, getRoot());
     getFields().put("availableAccessScopes", projection);
     return projection;
  }

  public ImageProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> banner() {
     ImageProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("banner", projection);
     return projection;
  }

  public AppDeveloperTypeProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> developerType() {
     AppDeveloperTypeProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppDeveloperTypeProjection<>(this, getRoot());
     getFields().put("developerType", projection);
     return projection;
  }

  public FailedRequirementProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> failedRequirements(
      ) {
     FailedRequirementProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new FailedRequirementProjection<>(this, getRoot());
     getFields().put("failedRequirements", projection);
     return projection;
  }

  public AppFeedbackProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> feedback() {
     AppFeedbackProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppFeedbackProjection<>(this, getRoot());
     getFields().put("feedback", projection);
     return projection;
  }

  public ImageProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> icon() {
     ImageProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("icon", projection);
     return projection;
  }

  public AppInstallationProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> installation() {
     AppInstallationProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppInstallationProjection<>(this, getRoot());
     getFields().put("installation", projection);
     return projection;
  }

  public NavigationItemProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> navigationItems() {
     NavigationItemProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new NavigationItemProjection<>(this, getRoot());
     getFields().put("navigationItems", projection);
     return projection;
  }

  public AccessScopeProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> optionalAccessScopes() {
     AccessScopeProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new AccessScopeProjection<>(this, getRoot());
     getFields().put("optionalAccessScopes", projection);
     return projection;
  }

  public AppPublicCategoryProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> publicCategory() {
     AppPublicCategoryProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppPublicCategoryProjection<>(this, getRoot());
     getFields().put("publicCategory", projection);
     return projection;
  }

  public AccessScopeProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> requestedAccessScopes() {
     AccessScopeProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new AccessScopeProjection<>(this, getRoot());
     getFields().put("requestedAccessScopes", projection);
     return projection;
  }

  public ImageProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> screenshots() {
     ImageProjection<AppFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("screenshots", projection);
     return projection;
  }

  public AppFragmentProjection<PARENT, ROOT> apiKey() {
    getFields().put("apiKey", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> appStoreAppUrl() {
    getFields().put("appStoreAppUrl", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> appStoreDeveloperUrl() {
    getFields().put("appStoreDeveloperUrl", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> developerName() {
    getFields().put("developerName", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> developerUrl() {
    getFields().put("developerUrl", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> embedded() {
    getFields().put("embedded", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> features() {
    getFields().put("features", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> installUrl() {
    getFields().put("installUrl", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> isPostPurchaseAppInUse() {
    getFields().put("isPostPurchaseAppInUse", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> launchUrl() {
    getFields().put("launchUrl", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> previouslyInstalled() {
    getFields().put("previouslyInstalled", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> pricingDetails() {
    getFields().put("pricingDetails", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> pricingDetailsSummary() {
    getFields().put("pricingDetailsSummary", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> privacyPolicyUrl() {
    getFields().put("privacyPolicyUrl", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> published() {
    getFields().put("published", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> shopifyDeveloped() {
    getFields().put("shopifyDeveloped", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> uninstallMessage() {
    getFields().put("uninstallMessage", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> uninstallUrl() {
    getFields().put("uninstallUrl", null);
    return this;
  }

  public AppFragmentProjection<PARENT, ROOT> webhookApiVersion() {
    getFields().put("webhookApiVersion", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on App {");
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
