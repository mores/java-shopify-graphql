package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryProductVariantsCountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProductVariantsCountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryProductVariantsCount"));
  }

  public DeliveryProductVariantsCountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryProductVariantsCountProjection<PARENT, ROOT> capped() {
    getFields().put("capped", null);
    return this;
  }

  public DeliveryProductVariantsCountProjection<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
