package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionRuleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionRuleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionRule"));
  }

  public CollectionRuleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionRuleColumnProjection<CollectionRuleProjection<PARENT, ROOT>, ROOT> column() {
     CollectionRuleColumnProjection<CollectionRuleProjection<PARENT, ROOT>, ROOT> projection = new CollectionRuleColumnProjection<>(this, getRoot());
     getFields().put("column", projection);
     return projection;
  }

  public CollectionRuleConditionObjectProjection<CollectionRuleProjection<PARENT, ROOT>, ROOT> conditionObject(
      ) {
     CollectionRuleConditionObjectProjection<CollectionRuleProjection<PARENT, ROOT>, ROOT> projection = new CollectionRuleConditionObjectProjection<>(this, getRoot());
     getFields().put("conditionObject", projection);
     return projection;
  }

  public CollectionRuleRelationProjection<CollectionRuleProjection<PARENT, ROOT>, ROOT> relation() {
     CollectionRuleRelationProjection<CollectionRuleProjection<PARENT, ROOT>, ROOT> projection = new CollectionRuleRelationProjection<>(this, getRoot());
     getFields().put("relation", projection);
     return projection;
  }

  public CollectionRuleProjection<PARENT, ROOT> condition() {
    getFields().put("condition", null);
    return this;
  }
}
