package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionRulesConditionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionRulesConditionsProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionRuleConditions"));
  }

  public CollectionRulesConditionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionRuleRelationProjection<CollectionRulesConditionsProjectionRoot<PARENT, ROOT>, CollectionRulesConditionsProjectionRoot<PARENT, ROOT>> allowedRelations(
      ) {
    CollectionRuleRelationProjection<CollectionRulesConditionsProjectionRoot<PARENT, ROOT>, CollectionRulesConditionsProjectionRoot<PARENT, ROOT>> projection = new CollectionRuleRelationProjection<>(this, this);    
    getFields().put("allowedRelations", projection);
    return projection;
  }

  public CollectionRuleRelationProjection<CollectionRulesConditionsProjectionRoot<PARENT, ROOT>, CollectionRulesConditionsProjectionRoot<PARENT, ROOT>> defaultRelation(
      ) {
    CollectionRuleRelationProjection<CollectionRulesConditionsProjectionRoot<PARENT, ROOT>, CollectionRulesConditionsProjectionRoot<PARENT, ROOT>> projection = new CollectionRuleRelationProjection<>(this, this);    
    getFields().put("defaultRelation", projection);
    return projection;
  }

  public CollectionRuleConditionsRuleObjectProjection<CollectionRulesConditionsProjectionRoot<PARENT, ROOT>, CollectionRulesConditionsProjectionRoot<PARENT, ROOT>> ruleObject(
      ) {
    CollectionRuleConditionsRuleObjectProjection<CollectionRulesConditionsProjectionRoot<PARENT, ROOT>, CollectionRulesConditionsProjectionRoot<PARENT, ROOT>> projection = new CollectionRuleConditionsRuleObjectProjection<>(this, this);    
    getFields().put("ruleObject", projection);
    return projection;
  }

  public CollectionRuleColumnProjection<CollectionRulesConditionsProjectionRoot<PARENT, ROOT>, CollectionRulesConditionsProjectionRoot<PARENT, ROOT>> ruleType(
      ) {
    CollectionRuleColumnProjection<CollectionRulesConditionsProjectionRoot<PARENT, ROOT>, CollectionRulesConditionsProjectionRoot<PARENT, ROOT>> projection = new CollectionRuleColumnProjection<>(this, this);    
    getFields().put("ruleType", projection);
    return projection;
  }
}
