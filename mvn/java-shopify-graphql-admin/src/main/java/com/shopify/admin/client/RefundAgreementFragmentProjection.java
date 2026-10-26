package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class RefundAgreementFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RefundAgreementFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundAgreement"));
  }

  public RefundAgreementFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public OrderActionTypeProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> reason() {
     OrderActionTypeProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderActionTypeProjection<>(this, getRoot());
     getFields().put("reason", projection);
     return projection;
  }

  public RefundProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> refund() {
     RefundProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new RefundProjection<>(this, getRoot());
     getFields().put("refund", projection);
     return projection;
  }

  public SaleConnectionProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> sales() {
     SaleConnectionProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleConnectionProjection<>(this, getRoot());
     getFields().put("sales", projection);
     return projection;
  }

  public SaleConnectionProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> sales(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SaleConnectionProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleConnectionProjection<>(this, getRoot());    
    getFields().put("sales", projection);
    getInputArguments().computeIfAbsent("sales", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("sales").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("sales").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("sales").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("sales").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("sales").add(reverseArg);
    return projection;
  }

  public SaleConnectionProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> salesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SaleConnectionProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new SaleConnectionProjection<>(this, getRoot());    
    getFields().put("sales", projection);
    getInputArguments().computeIfAbsent("sales", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("sales").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("sales").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("sales").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("sales").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("sales").add(reverseArg);
    return projection;
  }

  public StaffMemberProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> user() {
     StaffMemberProjection<RefundAgreementFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("user", projection);
     return projection;
  }

  public RefundAgreementFragmentProjection<PARENT, ROOT> happenedAt() {
    getFields().put("happenedAt", null);
    return this;
  }

  public RefundAgreementFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on RefundAgreement {");
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
