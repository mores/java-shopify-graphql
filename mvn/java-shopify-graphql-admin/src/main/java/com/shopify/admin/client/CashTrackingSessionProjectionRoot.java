package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.AdjustmentsSortKeys;
import com.shopify.admin.types.CashTrackingSessionTransactionsSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CashTrackingSessionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashTrackingSessionProjectionRoot() {
    super(null, null, java.util.Optional.of("CashTrackingSession"));
  }

  public CashTrackingSessionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashTrackingAdjustmentConnectionProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> adjustments(
      ) {
    CashTrackingAdjustmentConnectionProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new CashTrackingAdjustmentConnectionProjection<>(this, this);    
    getFields().put("adjustments", projection);
    return projection;
  }

  public CashTrackingAdjustmentConnectionProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> adjustments(
      Integer first, String after, Integer last, String before, Boolean reverse,
      AdjustmentsSortKeys sortKey) {
    CashTrackingAdjustmentConnectionProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new CashTrackingAdjustmentConnectionProjection<>(this, this);    
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

  public OrderTransactionConnectionProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> cashTransactions(
      ) {
    OrderTransactionConnectionProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionConnectionProjection<>(this, this);    
    getFields().put("cashTransactions", projection);
    return projection;
  }

  public OrderTransactionConnectionProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> cashTransactions(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CashTrackingSessionTransactionsSortKeys sortKey, String query) {
    OrderTransactionConnectionProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionConnectionProjection<>(this, this);    
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

  public MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> closingBalance(
      ) {
    MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("closingBalance", projection);
    return projection;
  }

  public StaffMemberProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> closingStaffMember(
      ) {
    StaffMemberProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("closingStaffMember", projection);
    return projection;
  }

  public MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> expectedBalance(
      ) {
    MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("expectedBalance", projection);
    return projection;
  }

  public MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> expectedClosingBalance(
      ) {
    MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("expectedClosingBalance", projection);
    return projection;
  }

  public MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> expectedOpeningBalance(
      ) {
    MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("expectedOpeningBalance", projection);
    return projection;
  }

  public LocationProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> netCashSales(
      ) {
    MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("netCashSales", projection);
    return projection;
  }

  public MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> openingBalance(
      ) {
    MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("openingBalance", projection);
    return projection;
  }

  public StaffMemberProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> openingStaffMember(
      ) {
    StaffMemberProjection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("openingStaffMember", projection);
    return projection;
  }

  public MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> totalAdjustments(
      ) {
    MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalAdjustments", projection);
    return projection;
  }

  public MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> totalCashRefunds(
      ) {
    MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalCashRefunds", projection);
    return projection;
  }

  public MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> totalCashSales(
      ) {
    MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalCashSales", projection);
    return projection;
  }

  public MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> totalDiscrepancy(
      ) {
    MoneyV2Projection<CashTrackingSessionProjectionRoot<PARENT, ROOT>, CashTrackingSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalDiscrepancy", projection);
    return projection;
  }

  public CashTrackingSessionProjectionRoot<PARENT, ROOT> cashTrackingEnabled() {
    getFields().put("cashTrackingEnabled", null);
    return this;
  }

  public CashTrackingSessionProjectionRoot<PARENT, ROOT> closingNote() {
    getFields().put("closingNote", null);
    return this;
  }

  public CashTrackingSessionProjectionRoot<PARENT, ROOT> closingTime() {
    getFields().put("closingTime", null);
    return this;
  }

  public CashTrackingSessionProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CashTrackingSessionProjectionRoot<PARENT, ROOT> openingNote() {
    getFields().put("openingNote", null);
    return this;
  }

  public CashTrackingSessionProjectionRoot<PARENT, ROOT> openingTime() {
    getFields().put("openingTime", null);
    return this;
  }

  public CashTrackingSessionProjectionRoot<PARENT, ROOT> registerName() {
    getFields().put("registerName", null);
    return this;
  }
}
