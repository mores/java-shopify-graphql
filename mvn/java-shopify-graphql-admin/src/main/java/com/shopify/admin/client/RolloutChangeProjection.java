package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RolloutChangeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RolloutChangeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RolloutChange"));
  }

  public RolloutChangeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutChangeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RolloutCatalogActivateChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> onRolloutCatalogActivateChange(
      ) {
    RolloutCatalogActivateChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> fragment = new RolloutCatalogActivateChangeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public RolloutCatalogDraftChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> onRolloutCatalogDraftChange(
      ) {
    RolloutCatalogDraftChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> fragment = new RolloutCatalogDraftChangeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public RolloutCheckoutAndAccountsConfigurationPublishChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> onRolloutCheckoutAndAccountsConfigurationPublishChange(
      ) {
    RolloutCheckoutAndAccountsConfigurationPublishChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> fragment = new RolloutCheckoutAndAccountsConfigurationPublishChangeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public RolloutDiscountActivateChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> onRolloutDiscountActivateChange(
      ) {
    RolloutDiscountActivateChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> fragment = new RolloutDiscountActivateChangeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public RolloutDiscountExpireChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> onRolloutDiscountExpireChange(
      ) {
    RolloutDiscountExpireChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> fragment = new RolloutDiscountExpireChangeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public RolloutThemePublishChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> onRolloutThemePublishChange(
      ) {
    RolloutThemePublishChangeFragmentProjection<RolloutChangeProjection<PARENT, ROOT>, ROOT> fragment = new RolloutThemePublishChangeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
