package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CashManagementCustomReasonCodeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CashManagementCustomReasonCodeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementCustomReasonCode"));
  }

  public CashManagementCustomReasonCodeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementCustomReasonCodeFragmentProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public CashManagementCustomReasonCodeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CashManagementCustomReasonCode {");
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
