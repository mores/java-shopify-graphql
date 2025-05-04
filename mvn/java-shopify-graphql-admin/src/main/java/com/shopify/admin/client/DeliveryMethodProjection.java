package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryMethodProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryMethodProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryMethod"));
  }

  public DeliveryMethodProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryMethodAdditionalInformationProjection<DeliveryMethodProjection<PARENT, ROOT>, ROOT> additionalInformation(
      ) {
     DeliveryMethodAdditionalInformationProjection<DeliveryMethodProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodAdditionalInformationProjection<>(this, getRoot());
     getFields().put("additionalInformation", projection);
     return projection;
  }

  public DeliveryBrandedPromiseProjection<DeliveryMethodProjection<PARENT, ROOT>, ROOT> brandedPromise(
      ) {
     DeliveryBrandedPromiseProjection<DeliveryMethodProjection<PARENT, ROOT>, ROOT> projection = new DeliveryBrandedPromiseProjection<>(this, getRoot());
     getFields().put("brandedPromise", projection);
     return projection;
  }

  public DeliveryMethodTypeProjection<DeliveryMethodProjection<PARENT, ROOT>, ROOT> methodType() {
     DeliveryMethodTypeProjection<DeliveryMethodProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodTypeProjection<>(this, getRoot());
     getFields().put("methodType", projection);
     return projection;
  }

  public DeliveryMethodProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryMethodProjection<PARENT, ROOT> maxDeliveryDateTime() {
    getFields().put("maxDeliveryDateTime", null);
    return this;
  }

  public DeliveryMethodProjection<PARENT, ROOT> minDeliveryDateTime() {
    getFields().put("minDeliveryDateTime", null);
    return this;
  }

  public DeliveryMethodProjection<PARENT, ROOT> presentedName() {
    getFields().put("presentedName", null);
    return this;
  }

  public DeliveryMethodProjection<PARENT, ROOT> serviceCode() {
    getFields().put("serviceCode", null);
    return this;
  }

  public DeliveryMethodProjection<PARENT, ROOT> sourceReference() {
    getFields().put("sourceReference", null);
    return this;
  }
}
