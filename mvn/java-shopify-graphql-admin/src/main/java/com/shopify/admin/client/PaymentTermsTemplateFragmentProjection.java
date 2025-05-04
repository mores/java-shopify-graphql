package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class PaymentTermsTemplateFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PaymentTermsTemplateFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentTermsTemplate"));
  }

  public PaymentTermsTemplateFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentTermsTypeProjection<PaymentTermsTemplateFragmentProjection<PARENT, ROOT>, ROOT> paymentTermsType(
      ) {
     PaymentTermsTypeProjection<PaymentTermsTemplateFragmentProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsTypeProjection<>(this, getRoot());
     getFields().put("paymentTermsType", projection);
     return projection;
  }

  public PaymentTermsTemplateFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public PaymentTermsTemplateFragmentProjection<PARENT, ROOT> dueInDays() {
    getFields().put("dueInDays", null);
    return this;
  }

  public PaymentTermsTemplateFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PaymentTermsTemplateFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public PaymentTermsTemplateFragmentProjection<PARENT, ROOT> translatedName() {
    getFields().put("translatedName", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on PaymentTermsTemplate {");
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
