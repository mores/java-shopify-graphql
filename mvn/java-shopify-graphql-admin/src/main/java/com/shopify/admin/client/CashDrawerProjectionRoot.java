package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CashActivitiesSortKeys;
import com.shopify.admin.types.CashDrawerDateRangeInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CashDrawerProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashDrawerProjectionRoot() {
    super(null, null, java.util.Optional.of("CashDrawer"));
  }

  public CashDrawerProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashActivityConnectionProjection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> cashActivities(
      ) {
    CashActivityConnectionProjection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new CashActivityConnectionProjection<>(this, this);    
    getFields().put("cashActivities", projection);
    return projection;
  }

  public CashActivityConnectionProjection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> cashActivities(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CashActivitiesSortKeys sortKey, String query, String staffMemberId) {
    CashActivityConnectionProjection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new CashActivityConnectionProjection<>(this, this);    
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
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("cashActivities").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("cashActivities").add(queryArg);
    InputArgument staffMemberIdArg = new InputArgument("staffMemberId", staffMemberId);
    getInputArguments().get("cashActivities").add(staffMemberIdArg);
    return projection;
  }

  public LocationProjection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> netSales(
      ) {
    MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("netSales", projection);
    return projection;
  }

  public MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> netSales(
      CashDrawerDateRangeInput dateRange) {
    MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("netSales", projection);
    getInputArguments().computeIfAbsent("netSales", k -> new ArrayList<>());                      
    InputArgument dateRangeArg = new InputArgument("dateRange", dateRange);
    getInputArguments().get("netSales").add(dateRangeArg);
    return projection;
  }

  public PointOfSaleDeviceConnectionProjection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> pointOfSaleDevices(
      ) {
    PointOfSaleDeviceConnectionProjection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDeviceConnectionProjection<>(this, this);    
    getFields().put("pointOfSaleDevices", projection);
    return projection;
  }

  public PointOfSaleDeviceConnectionProjection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> pointOfSaleDevices(
      Integer first, String after, Integer last, String before) {
    PointOfSaleDeviceConnectionProjection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new PointOfSaleDeviceConnectionProjection<>(this, this);    
    getFields().put("pointOfSaleDevices", projection);
    getInputArguments().computeIfAbsent("pointOfSaleDevices", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("pointOfSaleDevices").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("pointOfSaleDevices").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("pointOfSaleDevices").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("pointOfSaleDevices").add(beforeArg);
    return projection;
  }

  public MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> totalAdjustments(
      ) {
    MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalAdjustments", projection);
    return projection;
  }

  public MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> totalAdjustments(
      CashDrawerDateRangeInput dateRange) {
    MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalAdjustments", projection);
    getInputArguments().computeIfAbsent("totalAdjustments", k -> new ArrayList<>());                      
    InputArgument dateRangeArg = new InputArgument("dateRange", dateRange);
    getInputArguments().get("totalAdjustments").add(dateRangeArg);
    return projection;
  }

  public MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> totalDiscrepancies(
      ) {
    MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalDiscrepancies", projection);
    return projection;
  }

  public MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> totalDiscrepancies(
      CashDrawerDateRangeInput dateRange) {
    MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalDiscrepancies", projection);
    getInputArguments().computeIfAbsent("totalDiscrepancies", k -> new ArrayList<>());                      
    InputArgument dateRangeArg = new InputArgument("dateRange", dateRange);
    getInputArguments().get("totalDiscrepancies").add(dateRangeArg);
    return projection;
  }

  public MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> totalRefunds(
      ) {
    MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalRefunds", projection);
    return projection;
  }

  public MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> totalRefunds(
      CashDrawerDateRangeInput dateRange) {
    MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalRefunds", projection);
    getInputArguments().computeIfAbsent("totalRefunds", k -> new ArrayList<>());                      
    InputArgument dateRangeArg = new InputArgument("dateRange", dateRange);
    getInputArguments().get("totalRefunds").add(dateRangeArg);
    return projection;
  }

  public MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> totalSales(
      ) {
    MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalSales", projection);
    return projection;
  }

  public MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> totalSales(
      CashDrawerDateRangeInput dateRange) {
    MoneyV2Projection<CashDrawerProjectionRoot<PARENT, ROOT>, CashDrawerProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalSales", projection);
    getInputArguments().computeIfAbsent("totalSales", k -> new ArrayList<>());                      
    InputArgument dateRangeArg = new InputArgument("dateRange", dateRange);
    getInputArguments().get("totalSales").add(dateRangeArg);
    return projection;
  }

  public CashDrawerProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CashDrawerProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
