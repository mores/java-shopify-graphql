package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryConditionCriteriaProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryConditionCriteriaProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryConditionCriteria"));
  }

  public DeliveryConditionCriteriaProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2FragmentProjection<DeliveryConditionCriteriaProjection<PARENT, ROOT>, ROOT> onMoneyV2(
      ) {
    MoneyV2FragmentProjection<DeliveryConditionCriteriaProjection<PARENT, ROOT>, ROOT> fragment = new MoneyV2FragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public WeightFragmentProjection<DeliveryConditionCriteriaProjection<PARENT, ROOT>, ROOT> onWeight(
      ) {
    WeightFragmentProjection<DeliveryConditionCriteriaProjection<PARENT, ROOT>, ROOT> fragment = new WeightFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
