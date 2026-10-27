package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionGroupedLineProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionGroupedLineProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionGroupedLine"));
  }

  public SubscriptionGroupedLineProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionLineFragmentProjection<SubscriptionGroupedLineProjection<PARENT, ROOT>, ROOT> onSubscriptionLine(
      ) {
    SubscriptionLineFragmentProjection<SubscriptionGroupedLineProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionLineFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionParentLineFragmentProjection<SubscriptionGroupedLineProjection<PARENT, ROOT>, ROOT> onSubscriptionParentLine(
      ) {
    SubscriptionParentLineFragmentProjection<SubscriptionGroupedLineProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionParentLineFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
