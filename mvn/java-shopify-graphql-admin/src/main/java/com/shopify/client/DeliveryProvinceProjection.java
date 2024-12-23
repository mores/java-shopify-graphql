package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryProvinceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProvinceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryProvince"));
  }

  public DeliveryProvinceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryProvinceProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public DeliveryProvinceProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryProvinceProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DeliveryProvinceProjection<PARENT, ROOT> translatedName() {
    getFields().put("translatedName", null);
    return this;
  }
}
