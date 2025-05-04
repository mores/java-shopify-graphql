package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionRuleConditionObjectProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionRuleConditionObjectProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionRuleConditionObject"));
  }

  public CollectionRuleConditionObjectProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionRuleCategoryConditionFragmentProjection<CollectionRuleConditionObjectProjection<PARENT, ROOT>, ROOT> onCollectionRuleCategoryCondition(
      ) {
    CollectionRuleCategoryConditionFragmentProjection<CollectionRuleConditionObjectProjection<PARENT, ROOT>, ROOT> fragment = new CollectionRuleCategoryConditionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionRuleMetafieldConditionFragmentProjection<CollectionRuleConditionObjectProjection<PARENT, ROOT>, ROOT> onCollectionRuleMetafieldCondition(
      ) {
    CollectionRuleMetafieldConditionFragmentProjection<CollectionRuleConditionObjectProjection<PARENT, ROOT>, ROOT> fragment = new CollectionRuleMetafieldConditionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionRuleProductCategoryConditionFragmentProjection<CollectionRuleConditionObjectProjection<PARENT, ROOT>, ROOT> onCollectionRuleProductCategoryCondition(
      ) {
    CollectionRuleProductCategoryConditionFragmentProjection<CollectionRuleConditionObjectProjection<PARENT, ROOT>, ROOT> fragment = new CollectionRuleProductCategoryConditionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CollectionRuleTextConditionFragmentProjection<CollectionRuleConditionObjectProjection<PARENT, ROOT>, ROOT> onCollectionRuleTextCondition(
      ) {
    CollectionRuleTextConditionFragmentProjection<CollectionRuleConditionObjectProjection<PARENT, ROOT>, ROOT> fragment = new CollectionRuleTextConditionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
