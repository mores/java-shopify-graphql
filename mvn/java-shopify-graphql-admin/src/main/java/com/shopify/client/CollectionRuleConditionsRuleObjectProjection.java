package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionRuleConditionsRuleObjectProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionRuleConditionsRuleObjectProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionRuleConditionsRuleObject"));
  }

  public CollectionRuleConditionsRuleObjectProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionRuleMetafieldConditionFragmentProjection<CollectionRuleConditionsRuleObjectProjection<PARENT, ROOT>, ROOT> onCollectionRuleMetafieldCondition(
      ) {
    CollectionRuleMetafieldConditionFragmentProjection<CollectionRuleConditionsRuleObjectProjection<PARENT, ROOT>, ROOT> fragment = new CollectionRuleMetafieldConditionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
