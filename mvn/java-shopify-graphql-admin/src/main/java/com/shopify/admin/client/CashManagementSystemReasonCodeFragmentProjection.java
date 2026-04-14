package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CashManagementSystemReasonCodeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CashManagementSystemReasonCodeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementSystemReasonCode"));
  }

  public CashManagementSystemReasonCodeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementSystemReasonCodeEnumProjection<CashManagementSystemReasonCodeFragmentProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CashManagementSystemReasonCodeEnumProjection<CashManagementSystemReasonCodeFragmentProjection<PARENT, ROOT>, ROOT> projection = new CashManagementSystemReasonCodeEnumProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CashManagementSystemReasonCodeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CashManagementSystemReasonCode {");
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
