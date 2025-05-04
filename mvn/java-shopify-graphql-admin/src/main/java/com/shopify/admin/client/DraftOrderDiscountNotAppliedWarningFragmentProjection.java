package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DraftOrderDiscountNotAppliedWarningFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DraftOrderDiscountNotAppliedWarningFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderDiscountNotAppliedWarning"));
  }

  public DraftOrderDiscountNotAppliedWarningFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleProjection<DraftOrderDiscountNotAppliedWarningFragmentProjection<PARENT, ROOT>, ROOT> priceRule(
      ) {
     PriceRuleProjection<DraftOrderDiscountNotAppliedWarningFragmentProjection<PARENT, ROOT>, ROOT> projection = new PriceRuleProjection<>(this, getRoot());
     getFields().put("priceRule", projection);
     return projection;
  }

  public DraftOrderDiscountNotAppliedWarningFragmentProjection<PARENT, ROOT> discountCode() {
    getFields().put("discountCode", null);
    return this;
  }

  public DraftOrderDiscountNotAppliedWarningFragmentProjection<PARENT, ROOT> discountTitle() {
    getFields().put("discountTitle", null);
    return this;
  }

  public DraftOrderDiscountNotAppliedWarningFragmentProjection<PARENT, ROOT> errorCode() {
    getFields().put("errorCode", null);
    return this;
  }

  public DraftOrderDiscountNotAppliedWarningFragmentProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public DraftOrderDiscountNotAppliedWarningFragmentProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DraftOrderDiscountNotAppliedWarning {");
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
