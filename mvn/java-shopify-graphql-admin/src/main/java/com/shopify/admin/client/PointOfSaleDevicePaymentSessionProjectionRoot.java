package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class PointOfSaleDevicePaymentSessionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionProjectionRoot() {
    super(null, null, java.util.Optional.of("PointOfSaleDevicePaymentSession"));
  }

  public PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashActivityConnectionProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> cashActivities(
      ) {
    CashActivityConnectionProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new CashActivityConnectionProjection<>(this, this);    
    getFields().put("cashActivities", projection);
    return projection;
  }

  public CashActivityConnectionProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> cashActivities(
      Integer first, String after, Integer last, String before, Boolean reverse, String query,
      String staffMemberId) {
    CashActivityConnectionProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new CashActivityConnectionProjection<>(this, this);    
    getFields().put("cashActivities", projection);
    getInputArguments().computeIfAbsent("cashActivities", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("cashActivities").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("cashActivities").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("cashActivities").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("cashActivities").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("cashActivities").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("cashActivities").add(queryArg);
    InputArgument staffMemberIdArg = new InputArgument("staffMemberId", staffMemberId);
    getInputArguments().get("cashActivities").add(staffMemberIdArg);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> cashCountedAtClose(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("cashCountedAtClose", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> cashCountedAtOpen(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("cashCountedAtOpen", projection);
    return projection;
  }

  public CashDrawerProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> cashDrawer(
      ) {
    CashDrawerProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new CashDrawerProjection<>(this, this);    
    getFields().put("cashDrawer", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> closingAdjustment(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("closingAdjustment", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> closingBalance(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("closingBalance", projection);
    return projection;
  }

  public StaffMemberProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> closingStaffMember(
      ) {
    StaffMemberProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("closingStaffMember", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> expectedCashAtClose(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("expectedCashAtClose", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> expectedCashAtOpen(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("expectedCashAtOpen", projection);
    return projection;
  }

  public LocationProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> netCashSales(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("netCashSales", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> netSales(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("netSales", projection);
    return projection;
  }

  public StaffMemberProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> openingStaffMember(
      ) {
    StaffMemberProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("openingStaffMember", projection);
    return projection;
  }

  public PointOfSaleDeviceProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> pointOfSaleDevice(
      ) {
    PointOfSaleDeviceProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDeviceProjection<>(this, this);    
    getFields().put("pointOfSaleDevice", projection);
    return projection;
  }

  public PointOfSaleDevicePaymentSessionStatusProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> status(
      ) {
    PointOfSaleDevicePaymentSessionStatusProjection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDevicePaymentSessionStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> totalAdjustments(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalAdjustments", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> totalCashRefunds(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalCashRefunds", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> totalCashSales(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalCashSales", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> totalDiscrepancy(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalDiscrepancy", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> totalRefunds(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalRefunds", projection);
    return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> totalSales(
      ) {
    MoneyV2Projection<PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>, PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalSales", projection);
    return projection;
  }

  public PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT> closingNote() {
    getFields().put("closingNote", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT> closingTime() {
    getFields().put("closingTime", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT> currency() {
    getFields().put("currency", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT> openingNote() {
    getFields().put("openingNote", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT> openingTime() {
    getFields().put("openingTime", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjectionRoot<PARENT, ROOT> totalsReady() {
    getFields().put("totalsReady", null);
    return this;
  }
}
