package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentTermsTemplatesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentTermsTemplatesProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentTermsTemplate"));
  }

  public PaymentTermsTemplatesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentTermsTypeProjection<PaymentTermsTemplatesProjectionRoot<PARENT, ROOT>, PaymentTermsTemplatesProjectionRoot<PARENT, ROOT>> paymentTermsType(
      ) {
    PaymentTermsTypeProjection<PaymentTermsTemplatesProjectionRoot<PARENT, ROOT>, PaymentTermsTemplatesProjectionRoot<PARENT, ROOT>> projection = new PaymentTermsTypeProjection<>(this, this);    
    getFields().put("paymentTermsType", projection);
    return projection;
  }

  public PaymentTermsTemplatesProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public PaymentTermsTemplatesProjectionRoot<PARENT, ROOT> dueInDays() {
    getFields().put("dueInDays", null);
    return this;
  }

  public PaymentTermsTemplatesProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PaymentTermsTemplatesProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public PaymentTermsTemplatesProjectionRoot<PARENT, ROOT> translatedName() {
    getFields().put("translatedName", null);
    return this;
  }
}
