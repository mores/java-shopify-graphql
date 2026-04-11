package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class PointOfSaleDevicePaymentSessionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PointOfSaleDevicePaymentSessionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PointOfSaleDevicePaymentSession"));
  }

  public PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashActivityConnectionProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> cashActivities(
      ) {
     CashActivityConnectionProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new CashActivityConnectionProjection<>(this, getRoot());
     getFields().put("cashActivities", projection);
     return projection;
  }

  public CashActivityConnectionProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> cashActivities(
      Integer first, String after, Integer last, String before, Boolean reverse, String query,
      String staffMemberId) {
    CashActivityConnectionProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new CashActivityConnectionProjection<>(this, getRoot());    
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

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> cashCountedAtClose(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cashCountedAtClose", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> cashCountedAtOpen(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cashCountedAtOpen", projection);
     return projection;
  }

  public CashDrawerProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> cashDrawer(
      ) {
     CashDrawerProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new CashDrawerProjection<>(this, getRoot());
     getFields().put("cashDrawer", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> closingAdjustment(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("closingAdjustment", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> closingBalance(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("closingBalance", projection);
     return projection;
  }

  public StaffMemberProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> closingStaffMember(
      ) {
     StaffMemberProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("closingStaffMember", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> expectedCashAtClose(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("expectedCashAtClose", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> expectedCashAtOpen(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("expectedCashAtOpen", projection);
     return projection;
  }

  public LocationProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> location(
      ) {
     LocationProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> netCashSales(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("netCashSales", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> netSales(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("netSales", projection);
     return projection;
  }

  public StaffMemberProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> openingStaffMember(
      ) {
     StaffMemberProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("openingStaffMember", projection);
     return projection;
  }

  public PointOfSaleDeviceProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> pointOfSaleDevice(
      ) {
     PointOfSaleDeviceProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDeviceProjection<>(this, getRoot());
     getFields().put("pointOfSaleDevice", projection);
     return projection;
  }

  public PointOfSaleDevicePaymentSessionStatusProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> status(
      ) {
     PointOfSaleDevicePaymentSessionStatusProjection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new PointOfSaleDevicePaymentSessionStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> totalAdjustments(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalAdjustments", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> totalCashRefunds(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalCashRefunds", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> totalCashSales(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalCashSales", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> totalDiscrepancy(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalDiscrepancy", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> totalRefunds(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalRefunds", projection);
     return projection;
  }

  public MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> totalSales(
      ) {
     MoneyV2Projection<PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalSales", projection);
     return projection;
  }

  public PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT> closingNote() {
    getFields().put("closingNote", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT> closingTime() {
    getFields().put("closingTime", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT> currency() {
    getFields().put("currency", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT> openingNote() {
    getFields().put("openingNote", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT> openingTime() {
    getFields().put("openingTime", null);
    return this;
  }

  public PointOfSaleDevicePaymentSessionProjection<PARENT, ROOT> totalsReady() {
    getFields().put("totalsReady", null);
    return this;
  }
}
