package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class FulfillmentHoldFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public FulfillmentHoldFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentHold"));
  }

  public FulfillmentHoldFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentHoldReasonProjection<FulfillmentHoldFragmentProjection<PARENT, ROOT>, ROOT> reason(
      ) {
     FulfillmentHoldReasonProjection<FulfillmentHoldFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentHoldReasonProjection<>(this, getRoot());
     getFields().put("reason", projection);
     return projection;
  }

  public FulfillmentHoldFragmentProjection<PARENT, ROOT> displayReason() {
    getFields().put("displayReason", null);
    return this;
  }

  public FulfillmentHoldFragmentProjection<PARENT, ROOT> heldBy() {
    getFields().put("heldBy", null);
    return this;
  }

  public FulfillmentHoldFragmentProjection<PARENT, ROOT> heldByRequestingApp() {
    getFields().put("heldByRequestingApp", null);
    return this;
  }

  public FulfillmentHoldFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentHoldFragmentProjection<PARENT, ROOT> reasonNotes() {
    getFields().put("reasonNotes", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on FulfillmentHold {");
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
