package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DeliveryMethodFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DeliveryMethodFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryMethod"));
  }

  public DeliveryMethodFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryMethodAdditionalInformationProjection<DeliveryMethodFragmentProjection<PARENT, ROOT>, ROOT> additionalInformation(
      ) {
     DeliveryMethodAdditionalInformationProjection<DeliveryMethodFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodAdditionalInformationProjection<>(this, getRoot());
     getFields().put("additionalInformation", projection);
     return projection;
  }

  public DeliveryBrandedPromiseProjection<DeliveryMethodFragmentProjection<PARENT, ROOT>, ROOT> brandedPromise(
      ) {
     DeliveryBrandedPromiseProjection<DeliveryMethodFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryBrandedPromiseProjection<>(this, getRoot());
     getFields().put("brandedPromise", projection);
     return projection;
  }

  public DeliveryMethodTypeProjection<DeliveryMethodFragmentProjection<PARENT, ROOT>, ROOT> methodType(
      ) {
     DeliveryMethodTypeProjection<DeliveryMethodFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodTypeProjection<>(this, getRoot());
     getFields().put("methodType", projection);
     return projection;
  }

  public DeliveryMethodFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryMethodFragmentProjection<PARENT, ROOT> maxDeliveryDateTime() {
    getFields().put("maxDeliveryDateTime", null);
    return this;
  }

  public DeliveryMethodFragmentProjection<PARENT, ROOT> minDeliveryDateTime() {
    getFields().put("minDeliveryDateTime", null);
    return this;
  }

  public DeliveryMethodFragmentProjection<PARENT, ROOT> presentedName() {
    getFields().put("presentedName", null);
    return this;
  }

  public DeliveryMethodFragmentProjection<PARENT, ROOT> serviceCode() {
    getFields().put("serviceCode", null);
    return this;
  }

  public DeliveryMethodFragmentProjection<PARENT, ROOT> sourceReference() {
    getFields().put("sourceReference", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DeliveryMethod {");
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
