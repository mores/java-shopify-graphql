package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryConditionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryConditionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCondition"));
  }

  public DeliveryConditionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryConditionCriteriaProjection<DeliveryConditionProjection<PARENT, ROOT>, ROOT> conditionCriteria(
      ) {
     DeliveryConditionCriteriaProjection<DeliveryConditionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryConditionCriteriaProjection<>(this, getRoot());
     getFields().put("conditionCriteria", projection);
     return projection;
  }

  public DeliveryConditionFieldProjection<DeliveryConditionProjection<PARENT, ROOT>, ROOT> field() {
     DeliveryConditionFieldProjection<DeliveryConditionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryConditionFieldProjection<>(this, getRoot());
     getFields().put("field", projection);
     return projection;
  }

  public DeliveryConditionOperatorProjection<DeliveryConditionProjection<PARENT, ROOT>, ROOT> operator(
      ) {
     DeliveryConditionOperatorProjection<DeliveryConditionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryConditionOperatorProjection<>(this, getRoot());
     getFields().put("operator", projection);
     return projection;
  }

  public DeliveryConditionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
