package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DeliveryMethodDefinitionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DeliveryMethodDefinitionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryMethodDefinition"));
  }

  public DeliveryMethodDefinitionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryConditionProjection<DeliveryMethodDefinitionFragmentProjection<PARENT, ROOT>, ROOT> methodConditions(
      ) {
     DeliveryConditionProjection<DeliveryMethodDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryConditionProjection<>(this, getRoot());
     getFields().put("methodConditions", projection);
     return projection;
  }

  public DeliveryRateProviderProjection<DeliveryMethodDefinitionFragmentProjection<PARENT, ROOT>, ROOT> rateProvider(
      ) {
     DeliveryRateProviderProjection<DeliveryMethodDefinitionFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryRateProviderProjection<>(this, getRoot());
     getFields().put("rateProvider", projection);
     return projection;
  }

  public DeliveryMethodDefinitionFragmentProjection<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public DeliveryMethodDefinitionFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public DeliveryMethodDefinitionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryMethodDefinitionFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DeliveryMethodDefinition {");
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
