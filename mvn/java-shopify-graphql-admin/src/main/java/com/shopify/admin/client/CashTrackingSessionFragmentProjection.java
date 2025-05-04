package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.AdjustmentsSortKeys;
import com.shopify.admin.types.CashTrackingSessionTransactionsSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class CashTrackingSessionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CashTrackingSessionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashTrackingSession"));
  }

  public CashTrackingSessionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashTrackingAdjustmentConnectionProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> adjustments(
      ) {
     CashTrackingAdjustmentConnectionProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingAdjustmentConnectionProjection<>(this, getRoot());
     getFields().put("adjustments", projection);
     return projection;
  }

  public CashTrackingAdjustmentConnectionProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> adjustments(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AdjustmentsSortKeys sortKey) {
    CashTrackingAdjustmentConnectionProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingAdjustmentConnectionProjection<>(this, getRoot());    
    getFields().put("adjustments", projection);
    getInputArguments().computeIfAbsent("adjustments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("adjustments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("adjustments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("adjustments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("adjustments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("adjustments").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("adjustments").add(sortKeyArg);
    return projection;
  }

  public OrderTransactionConnectionProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> cashTransactions(
      ) {
     OrderTransactionConnectionProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());
     getFields().put("cashTransactions", projection);
     return projection;
  }

  public OrderTransactionConnectionProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> cashTransactions(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CashTrackingSessionTransactionsSortKeys sortKey, String query) {
    OrderTransactionConnectionProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());    
    getFields().put("cashTransactions", projection);
    getInputArguments().computeIfAbsent("cashTransactions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("cashTransactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("cashTransactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("cashTransactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("cashTransactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("cashTransactions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("cashTransactions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("cashTransactions").add(queryArg);
    return projection;
  }

  public MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> closingBalance(
      ) {
     MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("closingBalance", projection);
     return projection;
  }

  public StaffMemberProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> closingStaffMember(
      ) {
     StaffMemberProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("closingStaffMember", projection);
     return projection;
  }

  public MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> expectedBalance(
      ) {
     MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("expectedBalance", projection);
     return projection;
  }

  public MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> expectedClosingBalance(
      ) {
     MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("expectedClosingBalance", projection);
     return projection;
  }

  public MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> expectedOpeningBalance(
      ) {
     MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("expectedOpeningBalance", projection);
     return projection;
  }

  public LocationProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> netCashSales(
      ) {
     MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("netCashSales", projection);
     return projection;
  }

  public MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> openingBalance(
      ) {
     MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("openingBalance", projection);
     return projection;
  }

  public StaffMemberProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> openingStaffMember(
      ) {
     StaffMemberProjection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("openingStaffMember", projection);
     return projection;
  }

  public MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> totalAdjustments(
      ) {
     MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalAdjustments", projection);
     return projection;
  }

  public MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> totalCashRefunds(
      ) {
     MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalCashRefunds", projection);
     return projection;
  }

  public MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> totalCashSales(
      ) {
     MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalCashSales", projection);
     return projection;
  }

  public MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> totalDiscrepancy(
      ) {
     MoneyV2Projection<CashTrackingSessionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalDiscrepancy", projection);
     return projection;
  }

  public CashTrackingSessionFragmentProjection<PARENT, ROOT> cashTrackingEnabled() {
    getFields().put("cashTrackingEnabled", null);
    return this;
  }

  public CashTrackingSessionFragmentProjection<PARENT, ROOT> closingNote() {
    getFields().put("closingNote", null);
    return this;
  }

  public CashTrackingSessionFragmentProjection<PARENT, ROOT> closingTime() {
    getFields().put("closingTime", null);
    return this;
  }

  public CashTrackingSessionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CashTrackingSessionFragmentProjection<PARENT, ROOT> openingNote() {
    getFields().put("openingNote", null);
    return this;
  }

  public CashTrackingSessionFragmentProjection<PARENT, ROOT> openingTime() {
    getFields().put("openingTime", null);
    return this;
  }

  public CashTrackingSessionFragmentProjection<PARENT, ROOT> registerName() {
    getFields().put("registerName", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CashTrackingSession {");
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
