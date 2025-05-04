package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class AndroidApplicationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public AndroidApplicationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AndroidApplication"));
  }

  public AndroidApplicationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AndroidApplicationFragmentProjection<PARENT, ROOT> appLinksEnabled() {
    getFields().put("appLinksEnabled", null);
    return this;
  }

  public AndroidApplicationFragmentProjection<PARENT, ROOT> applicationId() {
    getFields().put("applicationId", null);
    return this;
  }

  public AndroidApplicationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AndroidApplicationFragmentProjection<PARENT, ROOT> sha256CertFingerprints() {
    getFields().put("sha256CertFingerprints", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on AndroidApplication {");
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
