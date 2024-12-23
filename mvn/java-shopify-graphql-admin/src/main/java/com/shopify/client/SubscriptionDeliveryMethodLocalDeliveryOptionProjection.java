package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDeliveryMethodLocalDeliveryOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDeliveryMethodLocalDeliveryOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDeliveryMethodLocalDeliveryOption"));
  }

  public SubscriptionDeliveryMethodLocalDeliveryOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDeliveryMethodLocalDeliveryOptionProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public SubscriptionDeliveryMethodLocalDeliveryOptionProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public SubscriptionDeliveryMethodLocalDeliveryOptionProjection<PARENT, ROOT> instructions() {
    getFields().put("instructions", null);
    return this;
  }

  public SubscriptionDeliveryMethodLocalDeliveryOptionProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public SubscriptionDeliveryMethodLocalDeliveryOptionProjection<PARENT, ROOT> presentmentTitle() {
    getFields().put("presentmentTitle", null);
    return this;
  }

  public SubscriptionDeliveryMethodLocalDeliveryOptionProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
