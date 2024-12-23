package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentTermsTemplateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentTermsTemplateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentTermsTemplate"));
  }

  public PaymentTermsTemplateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentTermsTypeProjection<PaymentTermsTemplateProjection<PARENT, ROOT>, ROOT> paymentTermsType(
      ) {
     PaymentTermsTypeProjection<PaymentTermsTemplateProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsTypeProjection<>(this, getRoot());
     getFields().put("paymentTermsType", projection);
     return projection;
  }

  public PaymentTermsTemplateProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public PaymentTermsTemplateProjection<PARENT, ROOT> dueInDays() {
    getFields().put("dueInDays", null);
    return this;
  }

  public PaymentTermsTemplateProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PaymentTermsTemplateProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public PaymentTermsTemplateProjection<PARENT, ROOT> translatedName() {
    getFields().put("translatedName", null);
    return this;
  }
}
