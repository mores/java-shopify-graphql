package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CashManagementDefaultReasonCodeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CashManagementDefaultReasonCodeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementDefaultReasonCode"));
  }

  public CashManagementDefaultReasonCodeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementDefaultReasonCodeEnumProjection<CashManagementDefaultReasonCodeFragmentProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CashManagementDefaultReasonCodeEnumProjection<CashManagementDefaultReasonCodeFragmentProjection<PARENT, ROOT>, ROOT> projection = new CashManagementDefaultReasonCodeEnumProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CashManagementDefaultReasonCodeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CashManagementDefaultReasonCode {");
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
