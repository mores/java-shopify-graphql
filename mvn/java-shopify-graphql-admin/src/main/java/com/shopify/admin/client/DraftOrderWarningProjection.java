package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderWarningProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderWarningProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderWarning"));
  }

  public DraftOrderWarningProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderWarningProjection<PARENT, ROOT> errorCode() {
    getFields().put("errorCode", null);
    return this;
  }

  public DraftOrderWarningProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public DraftOrderWarningProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public DraftOrderBundleAddedWarningFragmentProjection<DraftOrderWarningProjection<PARENT, ROOT>, ROOT> onDraftOrderBundleAddedWarning(
      ) {
    DraftOrderBundleAddedWarningFragmentProjection<DraftOrderWarningProjection<PARENT, ROOT>, ROOT> fragment = new DraftOrderBundleAddedWarningFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DraftOrderDiscountNotAppliedWarningFragmentProjection<DraftOrderWarningProjection<PARENT, ROOT>, ROOT> onDraftOrderDiscountNotAppliedWarning(
      ) {
    DraftOrderDiscountNotAppliedWarningFragmentProjection<DraftOrderWarningProjection<PARENT, ROOT>, ROOT> fragment = new DraftOrderDiscountNotAppliedWarningFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
