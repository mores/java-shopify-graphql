package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class SalesAgreementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SalesAgreementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SalesAgreement"));
  }

  public SalesAgreementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public OrderActionTypeProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> reason() {
     OrderActionTypeProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> projection = new OrderActionTypeProjection<>(this, getRoot());
     getFields().put("reason", projection);
     return projection;
  }

  public SaleConnectionProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> sales() {
     SaleConnectionProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> projection = new SaleConnectionProjection<>(this, getRoot());
     getFields().put("sales", projection);
     return projection;
  }

  public SaleConnectionProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> sales(Integer first,
      String after, Integer last, String before, Boolean reverse) {
    SaleConnectionProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> projection = new SaleConnectionProjection<>(this, getRoot());    
    getFields().put("sales", projection);
    getInputArguments().computeIfAbsent("sales", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sales").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sales").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sales").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sales").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sales").add(reverseArg);
    return projection;
  }

  public StaffMemberProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> user() {
     StaffMemberProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("user", projection);
     return projection;
  }

  public SalesAgreementProjection<PARENT, ROOT> happenedAt() {
    getFields().put("happenedAt", null);
    return this;
  }

  public SalesAgreementProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public OrderAgreementFragmentProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> onOrderAgreement(
      ) {
    OrderAgreementFragmentProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> fragment = new OrderAgreementFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public OrderEditAgreementFragmentProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> onOrderEditAgreement(
      ) {
    OrderEditAgreementFragmentProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> fragment = new OrderEditAgreementFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public RefundAgreementFragmentProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> onRefundAgreement(
      ) {
    RefundAgreementFragmentProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> fragment = new RefundAgreementFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public ReturnAgreementFragmentProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> onReturnAgreement(
      ) {
    ReturnAgreementFragmentProjection<SalesAgreementProjection<PARENT, ROOT>, ROOT> fragment = new ReturnAgreementFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
