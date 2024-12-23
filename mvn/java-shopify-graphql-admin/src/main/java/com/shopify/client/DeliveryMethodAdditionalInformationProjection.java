package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryMethodAdditionalInformationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryMethodAdditionalInformationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryMethodAdditionalInformation"));
  }

  public DeliveryMethodAdditionalInformationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryMethodAdditionalInformationProjection<PARENT, ROOT> instructions() {
    getFields().put("instructions", null);
    return this;
  }

  public DeliveryMethodAdditionalInformationProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }
}
