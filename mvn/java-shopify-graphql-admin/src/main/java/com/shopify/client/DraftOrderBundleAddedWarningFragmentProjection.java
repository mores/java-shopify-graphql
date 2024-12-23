package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DraftOrderBundleAddedWarningFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DraftOrderBundleAddedWarningFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderBundleAddedWarning"));
  }

  public DraftOrderBundleAddedWarningFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderBundleAddedWarningFragmentProjection<PARENT, ROOT> errorCode() {
    getFields().put("errorCode", null);
    return this;
  }

  public DraftOrderBundleAddedWarningFragmentProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public DraftOrderBundleAddedWarningFragmentProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DraftOrderBundleAddedWarning {");
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
