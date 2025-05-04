package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryMethodDefinitionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryMethodDefinitionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryMethodDefinition"));
  }

  public DeliveryMethodDefinitionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryConditionProjection<DeliveryMethodDefinitionProjection<PARENT, ROOT>, ROOT> methodConditions(
      ) {
     DeliveryConditionProjection<DeliveryMethodDefinitionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryConditionProjection<>(this, getRoot());
     getFields().put("methodConditions", projection);
     return projection;
  }

  public DeliveryRateProviderProjection<DeliveryMethodDefinitionProjection<PARENT, ROOT>, ROOT> rateProvider(
      ) {
     DeliveryRateProviderProjection<DeliveryMethodDefinitionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryRateProviderProjection<>(this, getRoot());
     getFields().put("rateProvider", projection);
     return projection;
  }

  public DeliveryMethodDefinitionProjection<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public DeliveryMethodDefinitionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public DeliveryMethodDefinitionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryMethodDefinitionProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
