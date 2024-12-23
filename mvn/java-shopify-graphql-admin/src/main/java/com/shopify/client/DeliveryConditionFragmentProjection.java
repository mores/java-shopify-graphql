package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DeliveryConditionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DeliveryConditionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCondition"));
  }

  public DeliveryConditionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryConditionCriteriaProjection<DeliveryConditionFragmentProjection<PARENT, ROOT>, ROOT> conditionCriteria(
      ) {
     DeliveryConditionCriteriaProjection<DeliveryConditionFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryConditionCriteriaProjection<>(this, getRoot());
     getFields().put("conditionCriteria", projection);
     return projection;
  }

  public DeliveryConditionFieldProjection<DeliveryConditionFragmentProjection<PARENT, ROOT>, ROOT> field(
      ) {
     DeliveryConditionFieldProjection<DeliveryConditionFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryConditionFieldProjection<>(this, getRoot());
     getFields().put("field", projection);
     return projection;
  }

  public DeliveryConditionOperatorProjection<DeliveryConditionFragmentProjection<PARENT, ROOT>, ROOT> operator(
      ) {
     DeliveryConditionOperatorProjection<DeliveryConditionFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryConditionOperatorProjection<>(this, getRoot());
     getFields().put("operator", projection);
     return projection;
  }

  public DeliveryConditionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DeliveryCondition {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
