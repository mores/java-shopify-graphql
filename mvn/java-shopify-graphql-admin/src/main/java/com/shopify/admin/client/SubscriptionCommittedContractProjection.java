package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionCommittedContractProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionCommittedContractProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionCommittedContract"));
  }

  public SubscriptionCommittedContractProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleEditedContractFragmentProjection<SubscriptionCommittedContractProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingCycleEditedContract(
      ) {
    SubscriptionBillingCycleEditedContractFragmentProjection<SubscriptionCommittedContractProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingCycleEditedContractFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionContractFragmentProjection<SubscriptionCommittedContractProjection<PARENT, ROOT>, ROOT> onSubscriptionContract(
      ) {
    SubscriptionContractFragmentProjection<SubscriptionCommittedContractProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionContractFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
