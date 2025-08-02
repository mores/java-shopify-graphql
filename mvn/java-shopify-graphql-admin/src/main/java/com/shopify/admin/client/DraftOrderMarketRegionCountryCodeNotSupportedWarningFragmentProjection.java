package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class DraftOrderMarketRegionCountryCodeNotSupportedWarningFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DraftOrderMarketRegionCountryCodeNotSupportedWarningFragmentProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderMarketRegionCountryCodeNotSupportedWarning"));
  }

  public DraftOrderMarketRegionCountryCodeNotSupportedWarningFragmentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderMarketRegionCountryCodeNotSupportedWarningFragmentProjection<PARENT, ROOT> errorCode(
      ) {
    getFields().put("errorCode", null);
    return this;
  }

  public DraftOrderMarketRegionCountryCodeNotSupportedWarningFragmentProjection<PARENT, ROOT> field(
      ) {
    getFields().put("field", null);
    return this;
  }

  public DraftOrderMarketRegionCountryCodeNotSupportedWarningFragmentProjection<PARENT, ROOT> message(
      ) {
    getFields().put("message", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DraftOrderMarketRegionCountryCodeNotSupportedWarning {");
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
