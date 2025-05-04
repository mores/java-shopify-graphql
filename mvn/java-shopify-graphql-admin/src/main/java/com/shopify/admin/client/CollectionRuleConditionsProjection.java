package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionRuleConditionsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionRuleConditionsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionRuleConditions"));
  }

  public CollectionRuleConditionsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionRuleRelationProjection<CollectionRuleConditionsProjection<PARENT, ROOT>, ROOT> allowedRelations(
      ) {
     CollectionRuleRelationProjection<CollectionRuleConditionsProjection<PARENT, ROOT>, ROOT> projection = new CollectionRuleRelationProjection<>(this, getRoot());
     getFields().put("allowedRelations", projection);
     return projection;
  }

  public CollectionRuleRelationProjection<CollectionRuleConditionsProjection<PARENT, ROOT>, ROOT> defaultRelation(
      ) {
     CollectionRuleRelationProjection<CollectionRuleConditionsProjection<PARENT, ROOT>, ROOT> projection = new CollectionRuleRelationProjection<>(this, getRoot());
     getFields().put("defaultRelation", projection);
     return projection;
  }

  public CollectionRuleConditionsRuleObjectProjection<CollectionRuleConditionsProjection<PARENT, ROOT>, ROOT> ruleObject(
      ) {
     CollectionRuleConditionsRuleObjectProjection<CollectionRuleConditionsProjection<PARENT, ROOT>, ROOT> projection = new CollectionRuleConditionsRuleObjectProjection<>(this, getRoot());
     getFields().put("ruleObject", projection);
     return projection;
  }

  public CollectionRuleColumnProjection<CollectionRuleConditionsProjection<PARENT, ROOT>, ROOT> ruleType(
      ) {
     CollectionRuleColumnProjection<CollectionRuleConditionsProjection<PARENT, ROOT>, ROOT> projection = new CollectionRuleColumnProjection<>(this, getRoot());
     getFields().put("ruleType", projection);
     return projection;
  }
}
